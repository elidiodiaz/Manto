package edu.uag.iidis.scec.persistencia;

import org.hibernate.*;
import org.hibernate.type.*;
import org.hibernate.criterion.Example;
//import org.hibernate.classic.*;


import edu.uag.iidis.scec.excepciones.ExcepcionInfraestructura;
import edu.uag.iidis.scec.modelo.Entidad;
import edu.uag.iidis.scec.persistencia.hibernate.HibernateUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Collection;
import java.util.List;


public class EntidadDAO {

    private Log log = LogFactory.getLog(EntidadDAO.class);

    public EntidadDAO() {

    }

    public Entidad buscarPorId(Long idEntidad, boolean bloquear) throws ExcepcionInfraestructura {

        Entidad entidad = null;

        if (log.isDebugEnabled()) {
            log.debug(">buscarPorID(" + idEntidad + ", " + bloquear + ")");
        }

        try {
            if (bloquear) {
                entidad = (Entidad)HibernateUtil.getSession().load(Entidad.class, idEntidad, LockMode.UPGRADE);
            } else {
                entidad = (Entidad)HibernateUtil.getSession().load(Entidad.class, idEntidad);
            }
        } catch (HibernateException ex) {
            if (log.isWarnEnabled()) {
                log.warn("<HibernateException");
            }

            throw new ExcepcionInfraestructura(ex);
        }
        return entidad;
    }

    public Collection buscarTodos() throws ExcepcionInfraestructura {

        Collection entidades;

        if (log.isDebugEnabled()) {
            log.debug(">buscarTodos()");
        }

        try {
            entidades = HibernateUtil.getSession().createCriteria(Entidad.class).list();
            log.debug(">buscarTodos() ---- list " + entidades);
        } catch (HibernateException e) {
            if (log.isWarnEnabled()) {
                log.warn("<HibernateException");
            }
            throw new ExcepcionInfraestructura(e);
        }
        return entidades;
    }

    public Collection buscarPorEjemplo(Entidad entidad) throws ExcepcionInfraestructura {

        Collection entidades;

        if (log.isDebugEnabled()) {
            log.debug(">buscarPorEjemplo()");
        }

        try {
            Criteria criteria = HibernateUtil.getSession().createCriteria(Entidad.class);
            entidades = criteria.add(Example.create(entidad)).list();
        } catch (HibernateException e) {
            if (log.isWarnEnabled()) {
                log.warn("<HibernateException");
            }
            throw new ExcepcionInfraestructura(e);
        }
        return entidades;
    }

    public void hazPersistente(Entidad entidad) throws ExcepcionInfraestructura {

        if (log.isDebugEnabled()) {
            log.debug(">hazPersistente(entidad)");
        }

        try {
            HibernateUtil.getSession().saveOrUpdate(entidad);
        } catch (HibernateException e) {
            if (log.isWarnEnabled()) {
                log.warn("<HibernateException");
            }
            throw new ExcepcionInfraestructura(e);
        }
    }

    public void hazTransitorio(Entidad entidad) throws ExcepcionInfraestructura {

        if (log.isDebugEnabled()) {
            log.debug(">hazTransitorio(entidad)");
        }

        try {
            HibernateUtil.getSession().delete(entidad);
        } catch (HibernateException e) {
            if (log.isWarnEnabled()) {
                log.warn("<HibernateException");
            }
            throw new ExcepcionInfraestructura(e);
        }
    }

    public boolean existeEntidad(String nombreEntidad) throws ExcepcionInfraestructura {

        if (log.isDebugEnabled()) {
            log.debug(">existeRol(nombreRol)");
        }

        try {
//            String consultaCuentaRoles =
//            "select count(*) from Ciudad r where r.nombre=?";
//
 //           int resultado =
 //           ((Integer) HibernateUtil.getSession()
 //                          .find(consultaCuentaRoles,
 //                                nombreRol,
 //                                StringType.INSTANCE)
 //                          .iterator()
 //                          .next()).intValue();
// de acuerdo al nuevo formato

            String hql = "select nombre from Entidad where nombre = :nombre";

            if (log.isDebugEnabled()) {
                log.debug(hql + nombreEntidad);
            }

            Query query = HibernateUtil.getSession().createQuery(hql);
            if (log.isDebugEnabled()) {
                log.debug("<<<<<<<<< create query ok " );
            }
			query.setParameter("nombre", nombreEntidad);
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

	public Collection buscaEntidad(String nombreEntidad) throws ExcepcionInfraestructura {

		if (log.isDebugEnabled()) {
            log.debug(">existeRol(nombreRol)");
        }

        try {
            String hql = "from Entidad where nombre like '"+nombreEntidad+"%'";

            if (log.isDebugEnabled()) {
                 log.debug(hql + nombreEntidad);
            }

            Query query = HibernateUtil.getSession().createQuery(hql);
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

    public boolean existeEntidadModificar(String nombreEntidad ) throws ExcepcionInfraestructura {

        if (log.isDebugEnabled()) {
            log.debug(">existeRol(nombreRol)");
        }

        try {
            String hql = "select * from Entidad where nombre = :nombre";

            if (log.isDebugEnabled()) {
                log.debug(hql + nombreEntidad);
            }

            Query query = HibernateUtil.getSession().createQuery(hql);
            if (log.isDebugEnabled()) {
                log.debug("<<<<<<<<< create query ok " );
            }
			query.setParameter("nombre", nombreEntidad);
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

    public void hazModificar(Entidad entidad) throws ExcepcionInfraestructura {

        if (log.isDebugEnabled()) {
            log.debug(">hazModificar(entidad)");
        }
        try {
            HibernateUtil.getSession().delete(entidad);
        } catch (HibernateException e) {
            if (log.isWarnEnabled()) {
                log.warn("<HibernateException");
            }
            throw new ExcepcionInfraestructura(e);
        }
    }
}
