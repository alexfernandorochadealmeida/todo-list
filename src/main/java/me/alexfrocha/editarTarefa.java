package me.alexfrocha;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class editarTarefa
 */
@WebServlet("/editarTarefa")
public class editarTarefa extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String texto = req.getParameter("texto");
		BancoDeDados bd = new BancoDeDados();
		bd.alterarTarefa(id, texto);
		resp.sendRedirect("home");
	}
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		new BancoDeDados();
		Map<Integer, String> mapa = BancoDeDados.getTarefasMap();
		
		if(mapa.containsKey(id)) {
			String textoDaTarefa = mapa.get(id);
			request.setAttribute("textoTarefa", textoDaTarefa);
			request.setAttribute("id", id);
			request.getRequestDispatcher("editandoTarefa.jsp").forward(request, response);;
		}
		
		
		
		
	}

}
