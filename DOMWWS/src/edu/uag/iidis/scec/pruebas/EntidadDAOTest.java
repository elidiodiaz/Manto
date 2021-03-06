package edu.uag.iidis.scec.pruebas;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.extensions.TestSetup;
import junit.textui.TestRunner;

import org.hibernate.cfg.Environment;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import edu.uag.iidis.scec.modelo.*;
import edu.uag.iidis.scec.persistencia.*;
import edu.uag.iidis.scec.persistencia.hibernate.HibernateUtil;

import java.util.*;


public class EntidadDAOTest extends TestCase {

    private static EntidadDAO dao = null;


    protected void setUp() throws Exception {
        dao = new EntidadDAO();
    }

    protected void tearDown() {
        dao = null;
    }




    public void testCrearEntidad() throws Exception {
        Entidad entidad = new Entidad("Jose Alberto","Juarez", 23, "Masculino");

        HibernateUtil.beginTransaction();
        try {
            dao.hazPersistente(entidad);
            HibernateUtil.commitTransaction();

            assertTrue(entidad.getId() != null);
            assertTrue(entidad.getNombre().equals("Jose Alberto"));
        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }


    public void testCrearEntidadInvalido() throws Exception {
        Entidad entidad = new Entidad("Jose Alberto","Juarez", 23, "Masculino");

        HibernateUtil.beginTransaction();
        try {
            dao.hazPersistente(entidad);
            HibernateUtil.commitTransaction();

            assertTrue(entidad.getId() != null);
            //assertTrue(entidad.getNombre().equals("Jose Esteban"));
            assertTrue(entidad.getEdad() == 30);
        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }




   /* public void testBuscarAtraccion() throws Exception {
        Entidad entidad = new Entidad("Jose Alberto","Lopez",22, "Masculino");
        HibernateUtil.beginTransaction();
        try {
            Collection result = dao.buscarAtraccion(entidad.getNombre());
            HibernateUtil.commitTransaction();

            assertTrue(result.size() > 0);

        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }


    public void testBuscarEntidadInvalido() throws Exception {
        Entidad entidad = new Entidad("Jose Alberto","Lopez",22, "Masculino");
        FormaEntidad forma = new FormaEntidad();

        HibernateUtil.beginTransaction();
        try {
            Collection result = dao.buscarEntidad(entidadError.getNombre());

            HibernateUtil.commitTransaction();

            assertTrue(result.size() == 0);

        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }


    public void testbuscarAtraccionPorMunicipio() throws Exception {

        HibernateUtil.beginTransaction();
        try {
            Collection result = dao.buscarAtraccionPorMunicipio("1"); //Id existente

            HibernateUtil.commitTransaction();

            assertTrue(result.size() > 0);

        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }


    public void testbuscarAtraccionPorMunicipioInvalido() throws Exception {
        HibernateUtil.beginTransaction();
        try {
            Collection result = dao.buscarAtraccionPorMunicipio("500");

            HibernateUtil.commitTransaction();

            assertTrue(result.size() == 0);

        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }


    public void testBuscarTodos() throws Exception {
        
        HibernateUtil.beginTransaction();
        try {
            Collection resultado = dao.buscarTodos();
            HibernateUtil.commitTransaction();

            assertTrue(resultado.size() > 0);
        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }

    public void testBuscarTodosInvalido() throws Exception {

        HibernateUtil.beginTransaction();
        try {
            Collection resultado = dao.buscarTodos();
            HibernateUtil.commitTransaction();

            assertTrue("la busqueda fallo",resultado.size() == 0);
        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }
*/

    public static Test suite() {

       TestSetup suite = new TestSetup(new TestSuite(EntidadDAOTest.class)) {

            protected void setUp(  ) throws Exception {
                // Se ejecuta al inicio de la suite de pruebas
                dao = new EntidadDAO();
            }

            protected void tearDown(  ) throws Exception {
                // se ejecuta al final de la suite
                dao = null;
            }
        };

        return suite;    
    }

    public static void main(String[] args) throws Exception {
        TestRunner.run(suite());
    }

}
