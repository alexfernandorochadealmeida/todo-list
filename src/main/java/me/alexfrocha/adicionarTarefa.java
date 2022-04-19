package me.alexfrocha;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/adicionarTarefa")
public class adicionarTarefa extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String textoDaTarefa = request.getParameter("tarefa");
		
		if(!textoDaTarefa.isEmpty()) {
			Tarefas tarefa = new Tarefas(textoDaTarefa);
			BancoDeDados bd = new BancoDeDados();
			bd.novaTarefa(tarefa);
		}
		
		response.sendRedirect("home");
	}

}
