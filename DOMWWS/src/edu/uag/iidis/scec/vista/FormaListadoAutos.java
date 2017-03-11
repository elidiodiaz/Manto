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
 * @author Elidio Diaz
 */
public final class FormaListadoAutos
        extends ValidatorForm {

    private Collection autos;
    private int contador;
	private String nombre;
    private String descripcion;
    private String ganancias;
    private long cantidad;
    private String anio;

    public void setAutos(Collection autos) {
        this.autos = autos;
        if (autos != null) {
          this.contador = autos.size();
        } else
          this.contador = -1;
    }

    public Collection getAutos() {
        return (this.autos);
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

    public String getDescripcion(){
        return (this.descripcion);
    }

    public String getGanancias(){
        return (this.ganancias);
    }

    public Long getCantidad(){
        return (this.cantidad);
    }

    public String getAnio(){
        return (this.anio);
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public void setGanancias(String ganancias){
        this.ganancias = ganancias;
    }

    public void setCantidad(Long cantidad){
        this.cantidad = cantidad;
    }

    public void setAnio(String anio){
        this.anio = anio;
    }

    public void reset(ActionMapping mapping,
                      HttpServletRequest request) {
        contador=0;
        autos =null;
        nombre = null;
        descripcion = null;
        ganancias = null;
        cantidad = 0;
        anio = null;
    }


    public ActionErrors validate(ActionMapping mapping,
                                 HttpServletRequest request) {

        // Ejecuta las validaciones proporcionadas por Struts-Validator
        ActionErrors errores = super.validate(mapping, request);

        // Validaciones no cubiertas por Struts-Validator

        return errores;

    }

}
