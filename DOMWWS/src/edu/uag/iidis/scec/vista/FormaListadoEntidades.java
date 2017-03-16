package edu.uag.iidis.scec.vista;

import java.util.Collection;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;


/**
 * Form bean para el registro de una nueva persona.
 *
 * @author
 */
public final class FormaListadoEntidades
        extends ValidatorForm {

    private Collection entidades;
    private int contador;
	private String nombre;
    private String apellidos;
    private long edad;
    private String sexo;

    public void setEntidades(Collection entidades) {
        this.entidades = entidades;
        if (entidades != null) {
          this.contador = entidades.size();
        } else
          this.contador = -1;
    }

    public Collection getEntidades() {
        return (this.entidades);
    }

    public int getContador(){
        return (this.contador);
    }
	public String getNombre(){
		return (this.nombre);
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}

    public String getApellidos(){
        return (this.apellidos);
    }

    public String getSexo(){
        return (this.sexo);
    }

    public Long getEdad(){
        return (this.edad);
    }

   

    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public void setEdad(Long edad){
        this.edad = edad;
    }

   

    public void reset(ActionMapping mapping,
                      HttpServletRequest request) {
        contador=0;
        entidades =null;
        nombre = null;
        apellidos = null;
        edad = 0;
        sexo = null;
    }


    public ActionErrors validate(ActionMapping mapping,
                                 HttpServletRequest request) {

        // Ejecuta las validaciones proporcionadas por Struts-Validator
        ActionErrors errores = super.validate(mapping, request);

        // Validaciones no cubiertas por Struts-Validator

        return errores;

    }

}
