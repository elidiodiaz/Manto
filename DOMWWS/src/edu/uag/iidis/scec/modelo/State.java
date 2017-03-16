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
public class State extends ClaseBase
        implements Serializable {

    private Long id;
    private String nombre;
    private long calidad;
    private String habitantes;
    private String municipios;

    public State() {
    }

    public State(Long id){
        this.id = id;
    }

    public State(String nombre, long calidad, String habitantes, String municipios){
        this.nombre=nombre;
        this.calidad=calidad;
        this.habitantes=habitantes;
        this.municipios=municipios;
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
        this.nombre=nombre;
    }


    /**
     * Regresa la descripción del rol.
     * @return String
     */
    public long getCalidad() {
        return this.calidad;
    }

    /**
     * Establece la descripción del rol.
     * @return void
     */
    public void setCalidad(long calidad) {
        this.calidad=calidad;
    }

    /**
     * Regresa la cantidad del rol.
     * @return long
     */
    public String getHabitantes() {
        return this.habitantes;
    }

    /**
     * Establece la cantidad del rol.
     * @return void
     */
    public void setHabitantes(String habitantes) {
        this.habitantes=habitantes;
    }


    /**
     * Regresa la ganancia del rol.
     * @return String
     */
    public String getMunicipios() {
        return this.municipios;
    }

    /**
     * Establece la ganancia del rol.
     * @return void
     */
    public void setMunicipios(String municipios) {
        this.municipios=municipios;
    }
}