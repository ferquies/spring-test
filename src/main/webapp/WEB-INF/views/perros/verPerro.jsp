<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false" %>
<html>
	<head>
		<title>Home</title>
		<jsp:include page="../head.jsp" />
	</head>
	<body role="document">
		<jsp:include page="../nav.jsp" />
	    <div class="container theme-showcase" role="main">
	    	<div class="page-header">
	    		<h1>Listado</h1>
	    	</div>
	    	<div class="col-sm-12">
		    	<table id="perrosTable" class="display" cellspacing="0" width="100%">
					<thead>
						<tr>
							<th>Nombre</th>
							<th>Raza</th>
							<th>Sexo</th>
							<th>Color</th>
							<th>Tamaño</th>
							<th>Edad</th>
							<th>Adoptado</th>
							<th class="no-sort">Acciones</th>
						</tr>
					</thead>
					<tfoot>
						<tr>
							<th>Nombre</th>
							<th>Raza</th>
							<th>Sexo</th>
							<th>Color</th>
							<th>Tamaño</th>
							<th>Edad</th>
							<th>Adoptado</th>
							<th>Acciones</th>
						</tr>
					</tfoot>
					<tbody>
						<c:choose>
							<c:when test="${perros != null}">
								<c:forEach items="${perros}" var="perro">
									<tr>
										<td>${perro.nombre} </td>
										<td>${perro.raza}</td>
										<td>${perro.sexo}</td>
										<td>${perro.color}</td>
										<td>${perro.tamano}</td>
										<td>${perro.edad}</td>
										<td>${perro.adoptado}</td>
										<td align="right">
											<div class="dropdown">
											  <a class="dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
											    Acciones
											    <span class="caret"></span>
											  </a>
											  <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
											    <li><a href="/gaascan/editar/${perro.id}">Editar</a></li>
											    <li><a class="eliminarBtn" data-toggle="modal" data-id="${perro.id}" data-target="#eliminarModal">Eliminar</a></li>
											  </ul>
											</div>
										</td>
									</tr>
								</c:forEach>
							</c:when>
							<c:otherwise>
								<tr>
									<td colspan="8">No hay nada para mostrar</td>
								</tr>
							</c:otherwise>
						</c:choose>
					</tbody>
				</table>
				<form:form method="get" action="/gaascan/insertar" class="form-horizontal">
					<div class="form-group" align="right">
						<br/><br/>
						<button type="submit" class="btn btn-default">Nuevo</button>
			  		</div>
				</form:form>
			</div>
		</div>
		
		<!-- Modal -->
		<div id="eliminarModal" class="modal fade" role="dialog">
		  <div class="modal-dialog">
		
		    <!-- Modal content-->
		    <div class="modal-content">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal">&times;</button>
		        <h4 class="modal-title">Eliminar</h4>
		      </div>
		      <div class="modal-body">
		        <p>Se va a eliminar el registro</p>
		      </div>
		      <div class="modal-footer">
		      	<form action="/gaascan/eliminar" method="post">
		      		<input type="hidden" name="eliminarId" id="eliminarId" value="" />
		        	<button type="submit" class="btn btn-default">Aceptar</button>
		        	<button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
		        </form>
		      </div>
		    </div>
		
		  </div>
		</div>
		
		<jsp:include page="../footer.jsp" />
	</body>
</html>
