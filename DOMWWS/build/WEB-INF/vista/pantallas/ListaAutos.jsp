<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="/WEB-INF/vista/etiquetas/struts-html.tld" prefix="html" %>


<option value="" disabled selected hidden>Seleccione un auto</option>

<c:forEach var="auto" items="${formaListadoAutos.autos}">
	<option value='${auto.nombre}'>${auto.nombre}</option>
</c:forEach>
