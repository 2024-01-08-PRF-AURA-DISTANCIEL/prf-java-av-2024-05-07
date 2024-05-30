package fr.maboite.correction.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

<<<<<<< HEAD:src/main/java/fr/maboite/correction/servlet/WelcomeServlet.java
@WebServlet(name = "Welcome2", displayName = "Welcome Servlet", urlPatterns = "/correction/welcome", loadOnStartup = 1)
public class WelcomeServlet extends HttpServlet {
=======
@WebServlet(name = "WelcomeCorrection", displayName = "Welcome Servlet", urlPatterns = "/correction/welcome", loadOnStartup = 1)
public class WelcomeCorrectionServlet extends HttpServlet {
>>>>>>> main:src/main/java/fr/maboite/correction/servlet/WelcomeCorrectionServlet.java

	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {

		if (request.getSession().getAttribute("monPanier") == null) {
			request.getSession().setAttribute("monPanier", new PanierAchat());
		}

		response.setContentType("text/html");
		response.setBufferSize(8192);
		response.setHeader("Language", "Klingon");
		response.setHeader("Mon-Header", "Truc");
		
		try (PrintWriter out = response.getWriter()) {
			out.println("<html>"
					+ "<head><title>Générée par une servlet</title></head>");
			out.println("<body  bgcolor=\"#ffffff\">"
					+ "<h2>Quelle belle page générée dynamiquement hein ?!!!</h2>");

			String username = request.getParameter("username");
			if (username != null && username.length() > 0) {
				out.println("Vous êtes : " + username);
			}
			String password = request.getParameter("password");
			if (password != null && password.length() > 0) {
				out.println("Votre mot de passe est : " + password);
			}
			String headerAcceptEncoding = request.getHeader("Accept-Encoding");

			PanierAchat monPanier = (PanierAchat) request.getSession().getAttribute("monPanier");
			monPanier.ajouteProduit();
			out.println("<br/> le panier d'achat contient  : " + monPanier.getNombreProduits());

			out.println("<br/> le header Accept-Encoding : " + headerAcceptEncoding);
			out.println("</body></html>");
		}
	}

	@Override
	public String getServletInfo() {
		return "La première servlet .";
	}

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("Init terminé");
	}

}