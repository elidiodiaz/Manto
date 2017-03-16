package edu.uag.iidis.scec.vista;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;

/**
 * Form bean para el registro de un nuevo auto..
 *
 * @author 
 */
public final class FormaModificarEntidad extends ValidatorForm {

    private Long id;
    private String nombre;
    private String apellidos;
    private long edad;
    private String sexo;
    

    public void setId(Long id) { this.id = id;}

    public Long getId() {
        return (this.id);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return (this.nombre);
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getApellidos() {
        return (this.apellidos);
    }

    public long getEdad(){
        return (this.edad);
    }

    public void setEdad(long edad){
        this.edad = edad;
    }

    public String getSexo(){
        return (this.sexo);
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

   

    public void reset(ActionMapping mapping, HttpServletRequest request) {
        id= new Long(0);
        nombre=null;
        apellidos=null;
        edad=0;
        sexo=null;
        
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        // Ejecuta las validaciones proporcionadas por Struts-Validator
        ActionErrors errores = super.validate(mapping, request);
        // Validaciones no cubiertas por Struts-Validator
        return errores;
    }

}
