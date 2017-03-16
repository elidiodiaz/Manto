package edu.uag.iidis.scec.modelo;

import java.io.Serializable;
import java.util.*;


/**
 * Esta clase es usada para representar un rol de un
 * usuario.
 *
 * <p><a href="Entidad.java.html"><i>Ver código fuente</i></a></p>
 *
 * @author <a href="mailto:vramos@uag.mx"></a>
 * @version 1.0
 */
public class Entidad extends ClaseBase
        implements Serializable {

    private Long id;
    private String nombre;
    private String apellidos;
    private long edad;
    private String sexo;
    

    public Entidad() {
    }

    public Entidad(Long id){
        this.id = id;
    }

    public Entidad(String nombre, String apellidos, long edad, String sexo){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad = edad;
        this.sexo = sexo;
        
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
    public String getApellidos() {
        return this.apellidos;
    }

    /**
     * Establece la descripción del rol.
     * @return void
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Regresa la cantidad del rol.
     * @return long
     */
    public long getEdad() {
        return this.edad;
    }

    /**
     * Establece la cantidad del rol.
     * @return void
     */
    public void setEdad(long edad) {
        this.edad = edad;
    }


    /**
     * Regresa la ganancia del rol.
     * @return String
     */
    public String getSexo() {
        return this.sexo;
    }

    /**
     * Establece la ganancia del rol.
     * @return void
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


   
}
