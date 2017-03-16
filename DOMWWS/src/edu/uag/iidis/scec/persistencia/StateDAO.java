package edu.uag.iidis.scec.persistencia;

import org.hibernate.*;
import org.hibernate.type.*;
import org.hibernate.criterion.Example;
//import org.hibernate.classic.*;


import edu.uag.iidis.scec.excepciones.ExcepcionInfraestructura;
import edu.uag.iidis.scec.modelo.State;
import edu.uag.iidis.scec.persistencia.hibernate.HibernateUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Collection;
import java.util.List;


public class StateDAO {

    private Log log = LogFactory.getLog(StateDAO.class);

    public StateDAO() {
    }

    public State buscarPorId(Long idState, boolean bloquear)
            throws ExcepcionInfraestructura {

        State state = null;

        if (log.isDebugEnabled()) {
            log.debug(">buscarPorID(" + idState + ", " + bloquear + ")");
        }

        try {
            if (bloquear) {
                state = (State)HibernateUtil.getSession()
                                                .load(State.class,
                                                      idState,
                                                      LockMode.UPGRADE);
            } else {
                state = (State)HibernateUtil.getSession()
                                                .load(State.class,
                                                      idState);
            }
        } catch (HibernateException ex) {
            if (log.isWarnEnabled()) {
                log.warn("<HibernateException");
            }

            throw new ExcepcionInfraestructura(ex);
        }
        return state;
    }

    public Collection buscarTodos()
            throws ExcepcionInfraestructura {

        Collection states;

        if (log.isDebugEnabled()) {
            log.debug(">buscarTodos()");
        }

        try {
            states = HibernateUtil.getSession()
                                    .createCriteria(State.class)
                                    .list();

              log.debug(">buscarTodos() ---- list " + states);
        } catch (HibernateException e) {
            if (log.isWarnEnabled()) {
                log.warn("<HibernateException");
            }
            throw new ExcepcionInfraestructura(e);
        }
        return states;
    }

    public Collection buscarPorEjemplo(State state)
            throws ExcepcionInfraestructura {


        Collection states;

        if (log.isDebugEnabled()) {
            log.debug(">buscarPorEjemplo()");
        }

        try {
            Criteria criteria = HibernateUtil.getSession()
                                             .createCriteria(State.class);
            states = criteria.add(Example.create(state)).list();
        } catch (HibernateException e) {
            if (log.isWarnEnabled()) {
                log.warn("<HibernateException");
            }
            throw new ExcepcionInfraestructura(e);
        }
        return states;
    }

    public void hazPersistente(State state)
            throws ExcepcionInfraestructura {

        if (log.isDebugEnabled()) {
            log.debug(">hazPersistente(state)");
        }

        try {
            HibernateUtil.getSession().saveOrUpdate(state);
        } catch (HibernateException e) {
            if (log.isWarnEnabled()) {
                log.warn("<HibernateException");
            }
            throw new ExcepcionInfraestructura(e);
        }
    }

    public void hazTransitorio(State state)
            throws ExcepcionInfraestructura {

        if (log.isDebugEnabled()) {
            log.debug(">hazTransitorio(state)");
        }

        try {
            HibernateUtil.getSession().delete(state);
        } catch (HibernateException e) {
            if (log.isWarnEnabled()) {
                log.warn("<HibernateException");
            }
            throw new ExcepcionInfraestructura(e);
        }
    }

    public boolean existeState(String nombreState) throws ExcepcionInfraestructura {

        if (log.isDebugEnabled()) {
            log.debug(">existeRol(nombreRol)");
        }

        try {

    /* String consultaCuentaRoles =
            "select count(*) from Ciudad r where r.nombre=?";

            int resultado =
            ((Integer) HibernateUtil.getSession()
                           .find(consultaCuentaRoles,
                                 nombreRol,
                               StringType.INSTANCE)
                           .iterator()
                           .next()).intValue();
// de acuerdo al nuevo formato*/

            String hql = "select nombre from State where nombre = :nombre";

             if (log.isDebugEnabled()) {
                 log.debug(hql + nombreState);
            }

            Query query = HibernateUtil.getSession()
                                        .createQuery(hql);
            if (log.isDebugEnabled()) {
                 log.debug("<<<<<<<<< create query ok " );
            }
			query.setParameter("nombre", nombreState);
            if (log.isDebugEnabled()) {
                 log.debug("<<<<<<<<< set Parameter ok antes del query list >>>>>");
            }
            List results = query.list();
            int resultado = results.size();
            if (log.isDebugEnabled()) {
                 log.debug("<<<<<<<<< Result size " + resultado);
            }
            if (resultado == 0) {
               return false;
            }

            return true;

        } catch (HibernateException ex) {
            if (log.isWarnEnabled()) {
                log.warn("<HibernateException *******************");
            }
            throw new ExcepcionInfraestructura(ex);
        }
    }

	public Collection buscaState(String nombreState)
            throws ExcepcionInfraestructura {

		if (log.isDebugEnabled()) {
            log.debug(">existeRol(nombreRol)");
        }

        try {
            String hql = "from State where nombre like '"+nombreState+"%'";

             if (log.isDebugEnabled()) {
                 log.debug(hql + nombreState);
            }

            Query query = HibernateUtil.getSession()
                                        .createQuery(hql);
            if (log.isDebugEnabled()) {
                 log.debug("<<<<<<<<< create query ok " );
            }


            if (log.isDebugEnabled()) {
                 log.debug("<<<<<<<<< set Parameter ok antes del query list >>>>>");
            }
            List results = query.list();
            int resultado = results.size();
            if (log.isDebugEnabled()) {
                 log.debug("<<<<<<<<< Result size " + resultado);
            }
            if (resultado == 0) {
               return results;
            }

            return results;

        } catch (HibernateException ex) {
            if (log.isWarnEnabled()) {
                log.warn("<HibernateException *******************");
            }
            throw new ExcepcionInfraestructura(ex);
        }
    }

}
