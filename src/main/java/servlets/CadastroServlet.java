package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Carros;

@WebServlet(urlPatterns ="/cadServlet")
public class CadastroServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		Carros car = new Carros();
		car.setModelo(req.getParameter("modeloC"));
		car.setMarca(req.getParameter("marcaC"));
		car.setAnoFabricacao(Integer.parseInt(req.getParameter("anoC")));
		 
		PrintWriter writer = resp.getWriter();
		writer.write("<html>");
		writer.write("<head><title>Carros cadastrados</title>");
		writer.write("<meta charset=\\\"UTF-8\\\"></head>");
		writer.write("<body>");
		writer.write("<label>Cadastro realizado</label></br>");
		writer.write("<label>Modelo: " + car.getModelo() + "</label></br>");
		writer.write("<label>Marca: " + car.getMarca() + "</label></br>");
		writer.write("<label>Ano: " + car.getAnoFabricacao() + "</label></br>");
		writer.write("<a href=\"index.html\">Voltar</a>");
		writer.write("</body>");
		writer.write("</html>");
	}
}
