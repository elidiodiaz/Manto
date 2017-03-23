<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="/WEB-INF/vista/etiquetas/struts-html.tld" prefix="html" %>


<option value="" disabled selected hidden>Seleccione un Estado</option>

<c:forEach var="states" items="${formaListadoStates.states}">
	<option value='${state.nombre}'>${state.nombre}</option>
</c:forEach>
