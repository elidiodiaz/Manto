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
function EliminarState(strStateName){
return confirm("¿Desea eliminar el state '" + strStateName + "'?")
}
-->
</script>
<br>
<div class="col-md-8 col-md-offset-2">
<font size='5'><fmt:message key="formaListadoStates.titulo" /></font>
<table cellpadding="0" cellspacing="0" width="60%" border="0" class="table table-hover">
    <tr>
        <td colspan="4" style="padding-top:25px; padding-bottom:25px;">
            <a href="solicitarRegistroState.do" class="HipervinculoAdmon">Agregar nueva calidad de vida...</a>
        </td>
    </tr>
    <tr>
        <td colspan="4">
           <html:errors />
        </td>
    </tr>
    <tr bgcolor="#CCCCCC">
     <td><b><fmt:message key="formaListadoStates.etiqueta.nombre" /></b></td>
     <td><b><fmt:message key="formaListadoStates.etiqueta.calidad"/></b></td>
     <td><b><fmt:message key="formaListadoStates.etiqueta.habitantes"/></b></td>
     <td><b><fmt:message key="formaListadoStates.etiqueta.municipios"/></b></td>
     <td colspan="2"><b><fmt:message key="formaListadoStates.etiqueta.administracion" /></b></td>
    </tr>
    <c:forEach var="state" items="${formaListadoStates.states}">
        <tr>
            <td align="left" width="20%"><c:out value="${state.nombre}"/></td>
            <td align="left" width="40%"><c:out value="${state.calidad}"/></td>
            <td align="left" width="20%"><c:out value="${state.habitantes}"/></td>
            <td align="left" width="20%"><c:out value="${state.municipios}"/></td>
            <td align="left" width="20%">
                <a href='solicitarModificarState.do?id=<c:out value="${state.id}"/>'
                   class="HipervinculoAdmon">
                    <fmt:message key="formaListadoStates.etiqueta.modificar" />
                </a>
            </td>
            <td>
                <a href='procesarEliminarState.do?id=<c:out value="${state.id}"/>'
                   onClick="javascript: return EliminarState('<c:out value="${state.nombre}"/>')"
                   class="HipervinculoAdmon">
                    <fmt:message key="formaListadoStates.etiqueta.eliminar" />
                </a>
            </td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="4" align="right" style="padding-top:25px;"><b>Total:</b> ${formaListadoStates.contador}</td>
    </tr>
</table>
</div>