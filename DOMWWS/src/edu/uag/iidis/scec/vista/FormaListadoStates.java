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
 * @author Victor Ramos
 */
public final class FormaListadoStates
        extends ValidatorForm {

    private Collection states;
    private int contador;
	private String nombre;

    public void setStates(Collection states) {
        this.states = states;
        if (states != null) {
          this.contador = states.size();
        } else
          this.contador = -1;
    }

    public Collection getStates() {
        return (this.states);
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

    public void reset(ActionMapping mapping,
                      HttpServletRequest request) {
        contador=0;
        states =null;
        nombre=null;
    }


    public ActionErrors validate(ActionMapping mapping,
                                 HttpServletRequest request) {

        // Ejecuta las validaciones proporcionadas por Struts-Validator
        ActionErrors errores = super.validate(mapping, request);

        // Validaciones no cubiertas por Struts-Validator

        return errores;

    }

}
