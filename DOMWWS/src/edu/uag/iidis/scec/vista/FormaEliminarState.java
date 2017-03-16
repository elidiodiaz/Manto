package edu.uag.iidis.scec.vista;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;

/**
 * Form bean para el registro de un nuevo auto..
 *
 * @author Elidio Diaz
 */
public final class FormaEliminarState extends ValidatorForm {

    private Long id;
    private String nombre;
    private long calidad;
    private String habitantes;
    private String municipios;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return (this.id);
    }

    public String getNombre(){
        return (this.nombre);
    }

    public long getCalidad(){
        return (this.calidad);
    }

    public String getHabitantes(){
        return (this.habitantes);
    }

    public String getMunicipios(){
        return (this.municipios);
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setCalidad(long calidad){
        this.calidad=calidad;
    }

    public void setHabitantes(String habitantes){
        this.habitantes=habitantes;
    }

    public void setMunicipios(String municipios){
        this.municipios=municipios;
    }

    public void reset(ActionMapping mapping, HttpServletRequest request) {
        id= new Long(0);
        nombre=null;
        calidad=0;
        habitantes=null;
        municipios=null;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        // Ejecuta las validaciones proporcionadas por Struts-Validator
        ActionErrors errores = super.validate(mapping, request);
        // Validaciones no cubiertas por Struts-Validator
        return errores;
    }
}