package edu.uag.iidis.scec.servicios;

import java.util.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import edu.uag.iidis.scec.modelo.State;
import edu.uag.iidis.scec.excepciones.*;
import edu.uag.iidis.scec.persistencia.StateDAO;
import edu.uag.iidis.scec.persistencia.hibernate.*;

public class ManejadorStates {
    private Log log = LogFactory.getLog(ManejadorStates.class);
    private StateDAO dao;

    public ManejadorStates() {
        dao = new StateDAO();
    }

    public Collection listarStates() {
        Collection resultado;

        if (log.isDebugEnabled()) {
            log.debug(">guardarUsuario(usuario)");
        }

        try {
            HibernateUtil.beginTransaction();
            resultado = dao.buscarTodos();
            HibernateUtil.commitTransaction();
            return resultado;
        } catch (ExcepcionInfraestructura e) {
            HibernateUtil.rollbackTransaction();
            return null;
        } finally {
            HibernateUtil.closeSession();
        }
    }

	public Collection listarStatePorNombre(String nombre) {
        Collection resultado;

        if (log.isDebugEnabled()) {
            log.debug(">guardarUsuario(usuario)");
        }

        try {
            HibernateUtil.beginTransaction();
            resultado = dao.buscaState(nombre);
            log.debug("Consulta "+resultado);
			HibernateUtil.commitTransaction();
            return resultado;
        } catch (ExcepcionInfraestructura e) {
            HibernateUtil.rollbackTransaction();
            return null;
        } finally {
            HibernateUtil.closeSession();
        }
    }

    public void eliminarState(Long id) {
        if (log.isDebugEnabled()) {
            log.debug(">eliminarState(state)");
        }
        try {
            HibernateUtil.beginTransaction();
            State state = dao.buscarPorId(id, true);
            if (state != null) {
              dao.hazTransitorio(state);
            }
            HibernateUtil.commitTransaction();
        } catch (ExcepcionInfraestructura e) {
            HibernateUtil.rollbackTransaction();
            if (log.isWarnEnabled()) {
                log.warn("<ExcepcionInfraestructura");
            }
        } finally {
            HibernateUtil.closeSession();
        }

    }

    public int crearState(State state) {

        int resultado;

        if (log.isDebugEnabled()) {
            log.debug(">guardarState(state)");
        }

        try {
            HibernateUtil.beginTransaction();

            if (dao.existeState(state.getNombre())) {
               resultado = 1; // Excepción. El nombre de ciudad ya existe
            } else {

               dao.hazPersistente(state);

               resultado = 0; // Exito. El ciudad se creo satisfactoriamente.
            }

            HibernateUtil.commitTransaction();

        } catch (ExcepcionInfraestructura e) {
            HibernateUtil.rollbackTransaction();

            if (log.isWarnEnabled()) {
                log.warn("<ExcepcionInfraestructura");
            }
            resultado = 2;    // Excepción. Falla en la infraestructura
        } finally {
            HibernateUtil.closeSession();
        }
        return resultado;
    }
}