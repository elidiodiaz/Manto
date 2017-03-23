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
public final class FormaModificarAuto extends ValidatorForm {

    private Long id;
    private String nombre;
    private String descripcion;
    private long cantidad;
    private String ganancias;
    private String anio;

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

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return (this.descripcion);
    }

    public long getCantidad(){
        return (this.cantidad);
    }

    public void setCantidad(long cantidad){
        this.cantidad = cantidad;
    }

    public String getGanancias(){
        return (this.ganancias);
    }

    public void setGanancias(String ganancias){
        this.ganancias = ganancias;
    }

    public String getAnio(){
        return (this.anio);
    }

    public void setAnio(String anio){
        this.anio = anio;
    }

    public void reset(ActionMapping mapping, HttpServletRequest request) {
        id= getId();
        nombre=getNombre();
        descripcion=getDescripcion();
        cantidad=getCantidad();
        ganancias=getGanancias();
        anio=getAnio();
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        // Ejecuta las validaciones proporcionadas por Struts-Validator
        ActionErrors errores = super.validate(mapping, request);
        // Validaciones no cubiertas por Struts-Validator
        return errores;
    }

}
