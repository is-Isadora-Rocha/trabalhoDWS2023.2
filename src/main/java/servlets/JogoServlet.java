package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/jogServlet")
public class JogoServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int num1 = Integer.parseInt(req.getParameter("numero1"));
		int num2 = Integer.parseInt(req.getParameter("numero2"));
		int num3 = Integer.parseInt(req.getParameter("numero3"));
		int num4 = Integer.parseInt(req.getParameter("numero4"));
		int num5 = Integer.parseInt(req.getParameter("numero5"));
		
		
		Integer[] parOuImpar = new Integer[5];
		
	
		
		PrintWriter writer = resp.getWriter();
		writer.write("<html>");
		writer.write("<head><title>Jogo Ímpar-Par!</title>");
		writer.write("<meta charset=\\\"UTF-8\\\"></head>");
		writer.write("<body>");
		writer.write("<li>Número 1: " + num1 + "</li>");
	
		writer.write("<a href=\"index.html\">Página Principal</a>");
		writer.write("</body>");
		writer.write("</html>");
	}
}
