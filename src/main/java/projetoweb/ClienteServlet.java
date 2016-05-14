package projetoweb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.fcrs.edu.model.Cliente;

@WebServlet(urlPatterns={"/cliente.do", "/qualquercoisa", "/fcrs"})
public class ClienteServlet extends HttpServlet {
	
	List<Cliente> lista = new ArrayList<Cliente>();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// System.out.println("Entrou no GET");
		//super.doGet(req, resp);
		resp.getWriter().println("Entrou no GET");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nome = req.getParameter("nome");
		//super.doPost(req, resp);
		
		Cliente cli = new Cliente();
		cli.setNome(nome);
		lista.add(cli);
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// System.out.println("Entrou no PUT");
		resp.getWriter().println("Entrou no PUT");
		// super.doPut(req, resp);
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// System.out.println("Entrou no DELETE");
		resp.getWriter().println("Entrou no DELETE");
		// super.doDelete(req, resp);
	}
	

}
