<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="/WEB-INF/vista/etiquetas/struts-html.tld" prefix="html" %>


<br>
<font size='5'><fmt:message key="formaNuevoEntidad.titulo" /></font>

<form id="forma" action="procesarRegistroEntidad.do" method="post">
    <table>
        <tr>
            <td colspan="2">
               <html:errors />
            </td>
        </tr>
        <tr>
            <td align="right">
                <fmt:message key="formaNuevoEntidad.etiqueta.nombre" />
            </td>
            <td align="left">
                <input type="text"
                       name="nombre"
                       size="50"
                       maxlength="100"
                       value="${FormaNuevoEntidad.nombre}" />
            </td>
        </tr>
        <tr>
            <td align="right">
                <fmt:message key="formaNuevoEntidad.etiqueta.apellidos" />
            </td>
            <td align="left">
                <input type="text"
                       name="apellidos"
                       size="50"
                       maxlength="100"
                       value="${formaNuevoEntidad.apellidos}" />
            </td>
        </tr>
        <tr>
            <td align="right">
                <fmt:message key="formaNuevoEntidad.etiqueta.edad" />
            </td>
            <td align="left">
                <input type="number"
                       name="edad"
                       size="50"
                       maxlength="100"
                       value="${formaNuevoEntidad.edad}" />
            </td>
        </tr>
        <tr>
            <td align="right">
                <fmt:message key="formaNuevoEntidad.etiqueta.sexo" />
            </td>
            <td align="left">
                <input type="text"
                       name="sexo"
                       size="50"
                       maxlength="100"
                       value="${formaNuevoEntidad.sexo}" />
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
                       onclick="forma.action='procesarRegistroEntidad.do?volver=si'"/>
                <input type="button"
                       value="Reset"
                       onclick="location.href='solicitarRegistroEntidad.do'" />
                <input type="submit"
                       name="org.apache.struts.taglib.html.CANCEL"
                       value="cancelar"
                       onclick="bCancel=true;">
            </td>
        </tr>
    </table>
</form>
