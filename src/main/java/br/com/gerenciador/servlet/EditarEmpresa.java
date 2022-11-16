package br.com.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/editar-empresa")
public class EditarEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		String nome = req.getParameter("nome");
		String dataNaoFormatada = req.getParameter("data");
		
		Date dataAbertura = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(dataNaoFormatada);
		} catch (ParseException e) {
			throw new ServletException();
		}
		
		Banco banco = new Banco();
		Empresa empresa = banco.getEmpresa(id);
		
		empresa.setNome(nome);
		empresa.setDataAbertura(dataAbertura);
		
		resp.sendRedirect("empresas");
	}
}
