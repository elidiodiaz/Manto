   
    <br>
    <font size='5'> Estados</font>

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
					Estado:<br>
                    <Select type="text" 
                           name="user" 
                           
                           value="${formaLogin.user}" 
					>
					<option value="Jalisco">Jalisco</option>
					<option value="Chiapas">Chiapas</option>
					</Select>
                </td>
            </tr>
            <tr>
                <td align="right">
                    <fmt:message key="formaLogin.etiqueta.Contrasena" />
                </td>
                <td align="left">
					Calidad de vida:<br>
                    <input type="password" 
                           name="password" 
                           size="50" 
                           maxlength="100" 
                           value="${formaLogin.password}" />
                </td>
            </tr>

            <tr>
                <td align="right">
                    <fmt:message key="formaLogin.etiqueta.Contrasena" />
                </td>
                <td align="left">
					Numero de habitantes:<br>
                    <input type="password" 
                           name="password" 
                           size="50" 
                           maxlength="100" 
                           value="${formaLogin.password}" />
                </td>
            </tr>

            <tr>
                <td align="right">
                    <fmt:message key="formaLogin.etiqueta.Contrasena" />
                </td>
                <td align="left">
					Numero de Municipios:<br>
                    <input type="password" 
                           name="password" 
                           size="50" 
                           maxlength="100" 
                           value="${formaLogin.password}" />
                </td>
            </tr>

            <tr>
                <td align="right">
                    <fmt:message key="formaLogin.etiqueta.Contrasena" />
                </td>
                <td align="left">
					Año:<br>
                    <Select type="password" 
                           name="password" 
                           
                           value="${formaLogin.password}"
					>
					<option value="2015">2015</option>
					<option value="2016">2016</option>
					<option value="2017">2017</option>
					</Select>
                </td>
            </tr>
            
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" 
                           name="submit"
                           value="Aceptar"/>
                     
                </td>
            </tr>
			<!--
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" 
                           name="submit"
                           value="Editar"/>
                     
                </td>
            </tr>
			
            <tr>
                <td colspan="2" align="center">
                    <input 
						type="submit" 
                        name="submit"
                        value="Aceptar"/>
                </td>
            </tr>	-->		
        </table>
    </form>