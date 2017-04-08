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


public class MunicipioDAOTest extends TestCase {

    private static StateDAO dao = null;


    protected void setUp() throws Exception {
        dao = new StateDAO();
    }

    protected void tearDown() {
        dao = null;
    }

    /*public void testBuscarAtraccion() throws Exception {
        Atraccion atraccion = new Atraccion(1,1,"Parque de la marimba");
        HibernateUtil.beginTransaction();
        try {
            Collection result = dao.buscarAtraccion(atraccion.getNombreAtraccion());
            HibernateUtil.commitTransaction();

            assertTrue(result.size() > 0);

        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }


    public void testBuscarAtraccionInvalido() throws Exception {
        Atraccion atraccionError = new Atraccion(1,1,"Parque Central");
        FormaAtraccion forma = new FormaAtraccion();

        HibernateUtil.beginTransaction();
        try {
            Collection result = dao.buscarAtraccion(atraccionError.getNombreAtraccion());

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
*/
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


    public static Test suite() {

       TestSetup suite = new TestSetup(new TestSuite(MunicipioDAOTest.class)) {

            protected void setUp(  ) throws Exception {
                // Se ejecuta al inicio de la suite de pruebas
                dao = new StateDAO();
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
