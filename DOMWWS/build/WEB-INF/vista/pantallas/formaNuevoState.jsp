<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="/WEB-INF/vista/etiquetas/struts-html.tld" prefix="html" %>


<br>
<font size='5'><fmt:message key="formaNuevoState.titulo" /></font>

<form id="forma" action="procesarRegistroState.do" method="post">
    <table>
        <tr>
            <td colspan="2">
               <html:errors />
            </td>
        </tr>
        <tr>
            <td align="right">
                <fmt:message key="formaNuevoState.etiqueta.nombre" />
            </td>
            <td align="left">
                <input type="text"
                       name="nombre"
                       size="50"
                       maxlength="100"
                       value="${FormaNuevoState.nombre}" />
            </td>
        </tr>
        <tr>
            <td align="right">
                <fmt:message key="formaNuevoState.etiqueta.calidad" />
            </td>
            <td align="left">
                <input type="number"
                       name="calidad"
                       size="50"
                       maxlength="100"
                       value="${formaNuevoState.calidad}" />
            </td>
        </tr>
        <tr>
            <td align="right">
                <fmt:message key="formaNuevoState.etiqueta.habitantes" />
            </td>
            <td align="left">
                <input type="text"
                       name="habitantes"
                       size="50"
                       maxlength="100"
                       value="${formaNuevoState.habitantes}" />
            </td>
        </tr>
        <tr>
            <td align="right">
                <fmt:message key="formaNuevoState.etiqueta.municipios" />
            </td>
            <td align="left">
                <input type="text"
                       name="municipios"
                       size="50"
                       maxlength="100"
                       value="${formaNuevoState.municipios}" />
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
                       onclick="forma.action='procesarRegistroState.do?volver=si'"/>
                <input type="button"
                       value="Reset"
                       onclick="location.href='solicitarRegistroState.do'" />
                <input type="submit"
                       name="org.apache.struts.taglib.html.CANCEL"
                       value="cancelar"
                       onclick="bCancel=true;">
            </td>
        </tr>
    </table>
</form>
