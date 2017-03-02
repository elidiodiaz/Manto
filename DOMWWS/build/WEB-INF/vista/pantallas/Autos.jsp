   
    <br>
    <font size='5'> Autos</font>

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
							name="state" 
							value="${formaLogin.user}" 
					>
						<option value="Puebla">Puebla</option>
						<option value="Chiapas">Chiapas</option>
						<option value="Veracruz">Veracruz</option>
						<option value="Sinaloa">Sinaloa</option>
					</Select>
                </td>
            </tr>
            <tr>
                <td align="right">
                    <fmt:message key="formaLogin.etiqueta.Contrasena" />
                </td>
                <td align="left">
					Auto:<br>
                    <input type="text" 
                           name="auto" 
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
					Cantidad de Autos vendidos:<br>
                    <input type="text" 
                           name="number" 
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
					Ganancias Obtenidas:<br>
                    <input type="text" 
                           name="ganancia" 
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
					Anio:<br>
                    <Select type="date" 
							name="anio" 
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
                    <input 
						type="submit" 
                        name="delete"
                        value="Eliminar"
					/> 
                </td>
				<td colspan="2" align="center">
                    <input 
						type="submit" 
                        name="edit"
                        value="Editar"
					/>
                </td>
				<td colspan="2" align="center">
                    <input 
						type="submit" 
                        name="submit"
                        value="Aceptar"
					/>
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