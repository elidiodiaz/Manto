package edu.uag.iidis.scec.servicios;

import java.util.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import edu.uag.iidis.scec.modelo.Entidad;
import edu.uag.iidis.scec.excepciones.*;
import edu.uag.iidis.scec.persistencia.EntidadDAO;
import edu.uag.iidis.scec.persistencia.hibernate.*;

public class ManejadorEntidades {
    private Log log = LogFactory.getLog(ManejadorEntidades.class);
    private EntidadDAO dao;

    public ManejadorEntidades() {
        dao = new EntidadDAO();
    }

    public Collection listarEntidades() {
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

	public Collection listarEntidadPorNombre(String nombre) {
        Collection resultado;

        if (log.isDebugEnabled()) {
            log.debug(">guardarUsuario(usuario)");
        }

        try {
            HibernateUtil.beginTransaction();
            resultado = dao.buscaEntidad(nombre);
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

    public void eliminarEntidad(Long id) {
        if (log.isDebugEnabled()) {
            log.debug(">eliminarEntidad(entidad)");
        }
        try {
            HibernateUtil.beginTransaction();
            Entidad entidad = dao.buscarPorId(id, true);
            if (entidad != null) {
                dao.hazTransitorio(entidad);
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

    public int crearEntidad(Entidad entidad) {

        int resultado;

        if (log.isDebugEnabled()) {
            log.debug(">guardarEntidad(entidad)");
        }

        try {
            HibernateUtil.beginTransaction();

            if (dao.existeEntidad(entidad.getNombre())) {
                resultado = 1; // Excepción. El nombre de ciudad ya existe
            } else {
                dao.hazPersistente(entidad);
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

    public void modificarEntidad(Long id) {
        if (log.isDebugEnabled()) {
            log.debug(">modificarEntidad(entidad)");
        }
        try {
            HibernateUtil.beginTransaction();
            Entidad entidad = dao.buscarPorId(id, true);
            if (entidad != null) {
                dao.hazModificar(entidad);
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
}
