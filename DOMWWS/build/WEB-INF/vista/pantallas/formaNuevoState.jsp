<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="/WEB-INF/vista/etiquetas/struts-html.tld" prefix="html" %>


<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>



<br>
<font size='5'><fmt:message key="formaNuevoState.titulo" /></font>

<form id="forma" action="procesarRegistroState.do" method="post" class="form-group">
    <table>
        <tr>
            <td colspan="2">
               <html:errors />
            </td>
        </tr>
        <tr>
            <td align="right">
                
                <label for="nombre">Nombre: &nbsp; </label>
            </td>
            <td align="left">
                <input type="text"
                       name="nombre"
                       size="50"
                       maxlength="100"
                       value="${FormaNuevoState.nombre}"
                       class="form-control" />
            </td>
        </tr>
        <tr>
            <td align="right">
                
                <label for="calidad">Calidad: &nbsp; </label>
            </td>
            <td align="left">
                <input type="number"
                       name="calidad"
                       size="50"
                       maxlength="100"
                       value="${formaNuevoState.calidad}"
                       class="form-control" />
            </td>
        </tr>
        <tr>
            <td align="right">
                
                <label for="habitantes">Habitantes: &nbsp; </label>
            </td>
            <td align="left">
                <input type="text"
                       name="habitantes"
                       size="50"
                       maxlength="100"
                       value="${formaNuevoState.habitantes}"
                       class="form-control" />
            </td>
        </tr>
        <tr>
            <td align="right">
                
                <label for="municipios">Municipios: &nbsp; </label>
            </td>
            <td align="left">
                <input type="text"
                       name="municipios"
                       size="50"
                       maxlength="100"
                       value="${formaNuevoState.municipios}"
                       class="form-control" />
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit"
                       name="submit"
                       value="Agregar y terminar"
                       class="btn btn-default"/>
                <input type="submit"
                       name="submit"
                       value="Agregar y volver"
                       class="btn btn-default"
                       onclick="forma.action='procesarRegistroState.do?volver=si'"/>
                <input type="button"
                       value="Reset"
                       class="btn btn-default"
                       onclick="location.href='solicitarRegistroState.do'" />
                <input type="submit"
                       name="org.apache.struts.taglib.html.CANCEL"
                       value="cancelar"
                       class="btn btn-default"
                       onclick="bCancel=true;">
            </td>
        </tr>
    </table>
</form>
