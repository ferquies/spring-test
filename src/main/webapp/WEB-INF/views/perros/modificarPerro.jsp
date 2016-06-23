<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false" %>
<html>
	<head>
		<title>Editar ${perro.nombre}</title>
		<jsp:include page="../head.jsp" />
	</head>
	<body role="document">
		<jsp:include page="../nav.jsp" />
	    <div class="container theme-showcase" role="main">
	    	<div class="page-header">
	    		<h1>Editar ${perro.nombre}</h1>
	    	</div>
	    	<div class="col-md-6 col-sm-12">
				<form:form method="post" action="/gaascan//editar" modelAttribute="perro" class="form-horizontal">
					<form:hidden path="id"/>
					<div class="form-group">
						<form:label path="nombre">Nombre</form:label>
						<form:input path="nombre" value="${perro.nombre}" class="form-control" type="text"/>
					</div>
					<div class="form-group">
						<form:label path="nombre">Raza</form:label>
						<form:input path="raza" value="${perro.raza}" class="form-control" type="text"/>
					</div>
					<div class="form-group">
						<form:label path="nombre">Sexo</form:label>
						<form:input path="sexo" value="${perro.sexo}" class="form-control" type="text"/>
					</div>
					<div class="form-group">
						<form:label path="nombre">Color</form:label>
						<form:input path="color" value="${perro.color}" class="form-control" type="text"/>
					</div>
					<div class="form-group">
						<form:label path="nombre">Tamaño</form:label>
						<form:input path="tamano" value="${perro.tamano}" class="form-control" type="text"/>
					</div>
					<div class="form-group">
						<form:label path="nombre">Edad</form:label>
						<form:input path="edad" value="${perro.edad}" class="form-control" type="text"/>
					</div>
					<div class="form-group">
						<form:label path="nombre">Adoptado</form:label>
						<form:select path="adoptado" class="form-control">
							<form:options items="${adoptadoCombo.options}" itemValue="value" itemLabel="label"/>
						</form:select>
					</div>
					<br/>
					<div class="form-group">
	       				<button type="submit" class="btn btn-default">Guardar</button>
	       			</div>
				</form:form>
			</div>
		</div>
		
		<jsp:include page="../footer.jsp" />
	</body>
</html>
