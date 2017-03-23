<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="/WEB-INF/vista/etiquetas/struts-html.tld" prefix="html" %>


<br>
<font size='5'><fmt:message key="formaModificarAuto.titulo" /></font>

<form id="forma" action="procesarModificarAuto.do" method="post">
    <table>
        <tr>
            <td colspan="2">
               <html:errors />
            </td>
        </tr>
        <tr>
            <td align="right">
                <fmt:message key="formaModificarAuto.etiqueta.nombre" />
            </td>
            <td align="left">
                <input type="text"
                       name="nombre"
                       size="50"
                       maxlength="100"
                       value="${FormaModificarAuto.getNombre()}" />
            </td>
        </tr>
        <tr>
            <td align="right">
                <fmt:message key="formaModificarAuto.etiqueta.descripcion" />
            </td>
            <td align="left">
                <input type="text"
                       name="descripcion"
                       size="50"
                       maxlength="100"
                       value="${formaModificarAuto.descripcion}" />
            </td>
        </tr>
        <tr>
            <td align="right">
                <fmt:message key="formaModificarAuto.etiqueta.cantidad" />
            </td>
            <td align="left">
                <input type="number"
                       name="cantidad"
                       size="50"
                       maxlength="100"
                       value="${formaModificarAuto.cantidad}" />
            </td>
        </tr>
        <tr>
            <td align="right">
                <fmt:message key="formaModificarAuto.etiqueta.ganancias" />
            </td>
            <td align="left">
                <input type="text"
                       name="ganancias"
                       size="50"
                       maxlength="100"
                       value="${formaModificarAuto.ganancias}" />
            </td>
        </tr>
        <tr>
            <td align="right">
                <fmt:message key="formaModificarAuto.etiqueta.anio" />
            </td>
            <td align="left">
                <input type="text"
                       name="anio"
                       size="50"
                       maxlength="100"
                       value="${formaModificarAuto.anio}" />
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit"
                       name="submit"
                       value="Agregar y terminar"/>
                <input type="submit"
                       name="submit"
                       value="Agregar y volver"
                       onclick="forma.action='procesarModificarAuto.do?volver=si'"/>
                <input type="button"
                       value="Reset"
                       onclick="location.href='solicitarModificarAuto.do'" />
                <input type="submit"
                       name="org.apache.struts.taglib.html.CANCEL"
                       value="cancelar"
                       onclick="bCancel=true;">
            </td>
        </tr>
    </table>
</form>
