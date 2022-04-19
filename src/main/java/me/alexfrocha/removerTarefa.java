package me.alexfrocha;

import java.io.IOException;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class removerTarefa
 */
@WebServlet("/removerTarefa")
public class removerTarefa extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Iterator<Tarefas> it = new BancoDeDados().getTarefas().iterator();
		while(it.hasNext()) {
			Tarefas tarefa = it.next();
			if(tarefa.getId() == id) {
				it.remove();
			}
		}
		response.sendRedirect("home");
	}

}
