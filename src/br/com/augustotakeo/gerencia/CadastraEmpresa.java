package br.com.augustotakeo.gerencia;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cadastro")
public class CadastraEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("nome");
		String date = request.getParameter("data");
		String owner = request.getParameter("proprietario");
		String cnpj = request.getParameter("cnpj");
		Integer numCollaborator = Integer.parseInt(request.getParameter("numCollaborator"));
		
		Date openingDate = null;
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			openingDate = sdf.parse(date);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Company company = new Company(name, openingDate, owner, cnpj, numCollaborator);

		
	}

}
