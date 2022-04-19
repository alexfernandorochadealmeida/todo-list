<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<% String textoTarefa = request.getParameter("textoTarefa"); %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<form action="editarTarefa" method="POST">
			<div class="card m-4">
			  <h5 class="card-header">Editando Tarefa</h5>
			  <div class="card-body">
			  	<input type="hidden" name="id" value="${id}">
			    <input class="form-control" type="text" name="texto" value="${textoTarefa}">
			   	<input type="submit" class="btn btn-success mt-3" value="Salvar">
			  </div>
			</div>
		</form>
	</div>
</body>
</html>