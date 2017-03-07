 <br>
    <!--<font size='5'><fmt:message key="formaLogin.titulo" /></font>-->

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
                
                <td align="left"><br><br>
                   Estado:<br>
                    <select 
                          style="width:320"
                           name="estado" 
                           maxlength="100"                            
                           value="${formaLogin.user}" >
                               
                            <option  value="Chiapas">Chiapas</option>
                               
                    </select>
                </td>
            </tr>
            <tr>
                <td align="right">
                    <fmt:message key="formaLogin.etiqueta.Contrasena" />
                </td>
                <td align="left"><br><br>
                   Nombre:<br>
                    <input type="text" 
                           name="nombre" 
                           size="50" 
                           maxlength="100" />
                </td>
            </tr>
            
             <tr>
                <td align="right">
                    <fmt:message key="formaLogin.etiqueta.Contrasena" />
                </td>
                <td align="left"><br><br>
                   Apellidos:<br>
                    <input type="text" 
                           name="apellidos" 
                           size="50" 
                           maxlength="100" />
                </td>
            </tr>
            
             <tr>
                <td align="right">
                    <fmt:message key="formaLogin.etiqueta.Contrasena" />
                </td>
                <td align="left"><br><br>
                   Edad:<br>
                    <input type="text" 
                           name="edad" 
                           size="50" 
                           maxlength="100"  />
                </td>
            </tr>
            
              <tr>
                <td align="right">
                    <fmt:message key="formaLogin.etiqueta.Usuario" />
                </td>
                
                <td align="left"><br><br>
                   Sexo:<br>
                    <select 
                          style="width:320"
                           name="sexo" 
                           maxlength="100"                            
                           value="${formaLogin.user}" >
                               
                            <option  value="masculino">Masculino</option>
                            <option  value="femenino">Femenino</option>
                               
                    </select>
                </td>
            </tr>
            
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" 
                           name="submit"
                           value="Login"/>
                     
                </td>
            </tr>
        </table>
    </form>