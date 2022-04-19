<%@page import="me.alexfrocha.Tarefas"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<% List<Tarefas> lista = (List<Tarefas>) request.getAttribute("listaDeTarefas"); %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>


<div class="container">
	<div class="row">
		<div class="col-md-4">
			<div class="mt-5">
				<form action="adicionarTarefa" class="form-inline" method="POST">
				  <div class="form-group">
				  	<input type="text" name="tarefa" class="form-control" placeholder="Tarefa">
				  </div>
				  <button type="submit" class="btn btn-primary mt-2">Adicionar</button>
				</form>
			</div>
		</div>
		<div class="col-md-8">
			<div class="d-flex mt-5" style="height: 200px;">
				<div class="vr d-sm-none"></div>
				<div class="container">
					
					<% if(!lista.isEmpty())  {%>
					<p align="center">Você tem um total de <span class="badge bg-primary"><%= lista.size() %></span> tarefas pendentes</p>
					<ul style="align-items: center;">
					<%for(Tarefas t : lista) { %>
						
						
						<div class="card m-3" align="center" style="width: 18rem;">
						  <div class="card-body">
						    <p class="card-text"><%= t.getTarefa() %></p>
						    <a href="editarTarefa?id=<%= t.getId() %>" class="card-link btn btn-success">Editar</a>
						    <a href="removerTarefa?id=<%= t.getId() %>" class="card-link btn btn-danger">Excluir</a>
						  </div>
						</div>
						
						
					<%} %>
					</ul>
					<%} else { %>
						<p align="center">Nenhuma tarefa pendente! :)</p>
					<%} %>
				</div>
			</div>
		</div>
	</div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
</body>
</html>