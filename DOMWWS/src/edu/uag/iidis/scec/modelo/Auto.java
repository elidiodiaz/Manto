package edu.uag.iidis.scec.modelo;

import java.io.Serializable;
import java.util.*;


/**
 * Esta clase es usada para representar un rol de un
 * usuario.
 *
 * <p><a href="Estado.java.html"><i>Ver código fuente</i></a></p>
 *
 * @author <a href="mailto:vramos@uag.mx">Elidio Diaz</a>
 * @version 1.0
 */
public class Auto extends ClaseBase
        implements Serializable {

    private Long id;
    private String nombre;
    private String descripcion;
    private long cantidad;
    private String ganancias;
    private int anio;


    public Auto() {
    }

    public Auto(Long id){
        this.id = id;
    }

    public Auto(String nombre, String descripcion, long cantidad, String ganancias, int anio){
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.cantidad = cantidad;
        this.ganancias = ganancias;
        this.anio = anio;
    }

    /**
     * Regresa el id del rol.
     * @return Long
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Establece el id del rol.
     * @return void
     */
    public void setId(Long id) {
        this.id = id;
    }


    /**
     * Regresa el nombre del rol.
     * @return String
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Establece el nombre del rol.
     * @return void
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    /**
     * Regresa la descripción del rol.
     * @return String
     */
    public String getDescripcion() {
        return this.descripcion;
    }

    /**
     * Establece la descripción del rol.
     * @return void
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Regresa la cantidad del rol.
     * @return long
     */
    public long getCantidad() {
        return this.cantidad;
    }

    /**
     * Establece la cantidad del rol.
     * @return void
     */
    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }


    /**
     * Regresa la ganancia del rol.
     * @return String
     */
    public String getGanancias() {
        return this.ganancias;
    }

    /**
     * Establece la ganancia del rol.
     * @return void
     */
    public void setGanancias(String ganancias) {
        this.ganancias = ganancias;
    }


    /**
     * Regresa el año del rol.
     * @return int
     */
    public int getAnio() {
        return this.anio;
    }

    /**
     * Establece el año del rol.
     * @return void
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }
}
