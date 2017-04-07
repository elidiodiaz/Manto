<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
    <%@ taglib uri="/WEB-INF/vista/etiquetas/struts-html.tld" prefix="html" %>


<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>




    
    <br>
    <font size='5'><fmt:message key="formaLogin.titulo" /></font>


    <form id="forma" action="procesarLogin.dd" method="post">
        <table>
            <tr>
                <td colspan="2">
                   <html:errors />
                </td>
            </tr>
            <tr>
                <td align="right">
                    <fmt:message key="formaLogin.etiqueta.Usuario" />
                </td>
                <td align="left">
                    <input type="text" 
                           name="user" 
                           size="50" 
                           maxlength="100" 
                           value="${formaLogin.user}"
                           class="form-control" />
                </td>
            </tr>
            <tr>
                <td align="right">
                    <fmt:message key="formaLogin.etiqueta.Contrasena" />
                </td>
                <td align="left">
                    <input type="password" 
                           name="password" 
                           size="50" 
                           maxlength="100" 
                           value="${formaLogin.password}"
                           class="form-control" />
                </td>
            </tr>
            
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" 
                           name="submit"
                           value="Login"
                           class="btn btn-default"/>
                     
                </td>
            </tr>

            <tr>
                <td colspan="2" align="center">
                   
                           <a href="solicitarRegistro.do"><input type="button" class="btn btn-default" value="Registrar"></a>
                     
                </td>
            </tr>

        </table>
    </form>
