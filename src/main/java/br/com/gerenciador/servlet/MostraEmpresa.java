package br.com.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mostra-empresa")
public class MostraEmpresa extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		
		Banco banco = new Banco();
		Empresa empresa = banco.getEmpresa(id);
		
		RequestDispatcher rd = req.getRequestDispatcher("/editar-empresa.jsp");
		req.setAttribute("empresa", empresa);
		rd.forward(req, resp);
	}
}
