package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns ="/jogServlet")
public class JogoServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ArrayList<Integer> pares = new ArrayList<>();
		ArrayList<Integer> impares = new ArrayList<>();
		
		for (int i = 1; i <= 5; i++) {
			int num = Integer.parseInt(req.getParameter("numero" + i));
			if (num % 2 == 0) {
				pares.add(num);
			} else {
				impares.add(num);
			}
		}
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head><title>Jogo Ímpar-Par!</title>");
		out.println("<meta charset=\\\"UTF-8\\\"></head>");
		out.println("<body>");
		out.println("<p>Aqui estão os numeros pares: </p>");
		for (Integer num : pares) {
			out.print("<p>" + num + "</p>");
		}
		out.println("<p>Aqui estão os numeros ímpares: </p>");
		for (Integer num : impares) {
			out.print("<p>" + num + "</p>");
		}
		out.println("<a href=\"index.html\">Página Principal</a>");
        out.println("</body>");
        out.println("</html>");
	
	}
}

