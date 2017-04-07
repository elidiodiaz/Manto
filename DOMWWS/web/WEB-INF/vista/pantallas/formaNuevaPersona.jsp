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
    <font size='5'><fmt:message key="formaNuevaPersona.titulo" /></font>

    <form id="forma" action="procesarRegistro.do" method="post" class="form-group">
        <table>
            <tr>
                <td colspan="2">
                   <html:errors />
                </td>
            </tr>
            <tr>
                <td align="right">
                    <fmt:message key="formaNuevaPersona.etiqueta.prefijo" />
                </td>
                <td align="left">
                    <input type="text" 
                           name="prefijo" 
                           size="12" 
                           maxlength="12" 
                           value="${formaNuevaPersona.prefijo}"
                           class="form-control" />
                </td>
            </tr>
            <tr>
                <td align="right">
                    <fmt:message key="formaNuevaPersona.etiqueta.nombre" />
                </td>
                <td align="left">
                    <input type="text" 
                           name="nombre" 
                           size="50" 
                           maxlength="100" 
                           value="${formaNuevaPersona.nombre}"
                           class="form-control" />
                </td>
            </tr>
            <tr>
                <td align="right">
                    <fmt:message key="formaNuevaPersona.etiqueta.apellidoPaterno" />
                </td>
                <td align="left">
                    <input type="text" 
                           name="apellidoPaterno" 
                           size="50" 
                           maxlength="100" 
                           value="${formaNuevaPersona.apellidoPaterno}" 
                           class="form-control"/>
                </td>
            </tr>
            <tr>
                <td align="right">
                    <fmt:message key="formaNuevaPersona.etiqueta.apellidoMaterno" />
                </td>
                <td align="left">
                    <input type="text" 
                           name="apellidoMaterno" 
                           size="50" 
                           maxlength="100" 
                           value="${formaNuevaPersona.apellidoMaterno}" 
                           class="form-control"/>
                </td>
            </tr>
            
            <tr>
                <td align="right">
                    <fmt:message key="formaNuevaPersona.etiqueta.ciudades" />
                </td>
                <td align="left">
       				<select name="ciudad">
                        <c:forEach var="rol" items="${formaNuevaPersona.ciudades}">
    		            <option value="${rol.nombre}">"${rol.descripcion}"</option>
            			</c:forEach>
                     </select>
                </td>
            </tr>
            
            
            
            
            <tr>
                <td align="right">
                    <fmt:message key="formaNuevaPersona.etiqueta.nombreUsuario" />
                </td>
                <td align="left">
                    <input type="text" 
                           name="nombreUsuario" 
                           size="50" 
                           maxlength="100" 
                           value="${formaNuevaPersona.nombreUsuario}" 
                           class="form-control"/>
                </td>
            </tr>
            <tr>
                <td align="right">
                    <fmt:message key="formaNuevaPersona.etiqueta.claveAcceso" />
                </td>
                <td align="left">
                    <input type="text" 
                           name="claveAcceso" 
                           size="50" 
                           maxlength="100" 
                           value="${formaNuevaPersona.claveAcceso}"
                           class="form-control" />
                </td>
            </tr>
            <tr>
                <td align="right">
                    <fmt:message key="formaNuevaPersona.etiqueta.claveAccesoConfirmacion" />
                </td>
                <td align="left">
                    <input type="text" 
                           name="claveAccesoConfirmacion" 
                           size="50" 
                           maxlength="100" 
                           value="${formaNuevaPersona.claveAccesoConfirmacion}" 
                           class="form-control"/>
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
                           onclick="forma.action='procesarRegistro.do?volver=si'"
                           class="btn btn-default"/>
                    <input type="button"
                           value="Reset"
                           onclick="location.href='solicitarRegistro.do'" 
                           class="btn btn-default"/>
                    <input type="submit" 
                           name="org.apache.struts.taglib.html.CANCEL" 
                           value="Cancelar" 
                           onclick="bCancel=true;"
                           class="btn btn-default">    
                </td>
            </tr>
        </table>
    </form>



