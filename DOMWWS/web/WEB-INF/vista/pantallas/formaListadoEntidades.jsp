<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="/WEB-INF/vista/etiquetas/struts-html.tld" prefix="html" %>


<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>




<style>
.HipervinculoAdmon{
color:#000000;
text-decoration:none;
}

.HipervinculoAdmon:hover{
color:#006666;
text-decoration:underline;
}
</style>
<script language="javascript" type="text/javascript">
<!--
function EliminarEntidad(strEntidadName){
return confirm("¿Desea eliminar la entidad  '" + strEntidadName + "'?")
}
-->
</script>
<br>
<div class="col-md-8 col-md-offset-2">
<font size='5'><fmt:message key="formaListadoEntidades.titulo" /></font>
<table cellpadding="0" cellspacing="0" width="50%" border="0" class="table table-hover">
    <tr>
        <td colspan="4" style="padding-top:25px; padding-bottom:25px;">
            <a href="solicitarRegistroEntidad.do" class="HipervinculoAdmon">Agregar nuevo nombre...</a>
        </td>
    </tr>
    <tr>
        <td colspan="4">
           <html:errors />
        </td>
    </tr>
    <tr bgcolor="#CCCCCC">
     <td><b><fmt:message key="formaListadoEntidades.etiqueta.nombre" /></b></td>
     <td><b><fmt:message key="formaListadoEntidades.etiqueta.apellidos"/></b></td>
     <td><b><fmt:message key="formaListadoEntidades.etiqueta.edad"/></b></td>
     <td><b><fmt:message key="formaListadoEntidades.etiqueta.sexo"/></b></td>
     
     <td colspan="2"><b><fmt:message key="formaListadoEntidades.etiqueta.administracion" /></b></td>
    </tr>
    <c:forEach var="entidad" items="${formaListadoEntidades.entidades}">
        <tr>
            <td align="left" width="20%"><c:out value="${entidad.nombre}"/></td>
            <td align="left" width="40%"><c:out value="${entidad.apellidos}"/></td>
            <td align="left" width="20%"><c:out value="${entidad.edad}"/></td>
            <td align="left" width="20%"><c:out value="${entidad.sexo}"/></td>
            
            <td align="left" width="20%">
                <a href='solicitarModificarEntidad.do?id=<c:out value="${entidad.id}"/>'
                   class="HipervinculoAdmon">
                    <fmt:message key="formaListadoEntidades.etiqueta.modificar" />
                </a>
            </td>
            <td>
                <a href='procesarEliminarEntidad.do?id=<c:out value="${entidad.id}"/>'
                   onClick="javascript: return EliminarEntidad('<c:out value="${entidad.nombre}"/>')"
                   class="HipervinculoAdmon">
                    <fmt:message key="formaListadoEntidades.etiqueta.eliminar" />
                </a>
            </td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="4" align="right" style="padding-top:25px;"><b>Total:</b> ${formaListadoEntidades.contador}</td>
    </tr>
</table>
</div>
