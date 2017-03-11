<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="/WEB-INF/vista/etiquetas/struts-html.tld" prefix="html" %>
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
function EliminarAuto(strAutoName){
return confirm("¿Desea eliminar el auto '" + strAutoName + "'?")
}
-->
</script>
<br>
<font size='5'><fmt:message key="formaListadoAutos.titulo" /></font>
<table cellpadding="0" cellspacing="0" width="60%" border="0">
    <tr>
        <td colspan="4" style="padding-top:25px; padding-bottom:25px;">
            <a href="solicitarRegistroAuto.do" class="HipervinculoAdmon">Agregar nuevo auto...</a>
        </td>
    </tr>
    <tr>
        <td colspan="4">
           <html:errors />
        </td>
    </tr>
    <tr bgcolor="#CCCCCC">
     <td><b><fmt:message key="formaListadoAutos.etiqueta.nombre" /></b></td>
     <td><b><fmt:message key="formaListadoAutos.etiqueta.descripcion"/></b></td>
     <td><b><fmt:message key="formaListadoAutos.etiqueta.cantidad"/></b></td>
     <td><b><fmt:message key="formaListadoAutos.etiqueta.ganancias"/></b></td>
     <td><b><fmt:message key="formaListadoAutos.etiqueta.anio"/></b></td>
    </tr>
    <c:forEach var="auto" items="${formaListadoAutos.autos}">
        <tr>
            <td align="left" width="20%"><c:out value="${auto.nombre}"/></td>
            <td align="left" width="40%"><c:out value="${auto.descripcion}"/></td>
            <td align="left" width="20%"><c:out value="${auto.cantidad}"/></td>
            <td align="left" width="20%"><c:out value="${auto.ganancias}"/></td>
            <td align="left" width="20%"><c:out value="${auto.anio}"/></td>
            <td align="left" width="20%">
                <a href='solicitarModificarAuto.do?id=<c:out value="${auto.id}"/>'
                   class="HipervinculoAdmon">
                    <fmt:message key="formaListadoAutos.etiqueta.modificar" />
                </a>
            </td>
            <td>
                <a href='procesarEliminarAuto.do?id=<c:out value="${auto.id}"/>'
                   onClick="javascript: return EliminarAuto('<c:out value="${auto.nombre}"/>')"
                   class="HipervinculoAdmon">
                    <fmt:message key="formaListadoAutos.etiqueta.eliminar" />
                </a>
            </td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="4" align="right" style="padding-top:25px;"><b>Total:</b> ${formaListadoAutos.contador}</td>
    </tr>
</table>
