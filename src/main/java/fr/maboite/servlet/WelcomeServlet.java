package fr.maboite.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="Welcome", displayName="Welcome Servlet", urlPatterns = "/welcome", loadOnStartup = 1)
public class WelcomeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        response.setBufferSize(8192);
       
     
        try (PrintWriter out = response.getWriter()) {
            out.println("<html>"
                    + "<head><title>Générée par une servlet</title></head>");
            out.println("<body  bgcolor=\"#ffffff\">"
                    + "<h2>Quelle belle page générée dynamiquement hein ?!!!</h2>");
            
            String username = request.getParameter("username");
            if (username != null && username.length() > 0) {
                out.println("Vous êtes : "+ username);
            }
            
            String password = request.getParameter("password");
            if (password != null && password.length() > 0) {
                out.println("Vtre mot de passe est  : "+ password);
            }
            
            PanierAchat monPanier = (PanierAchat) request.getSession().getAttribute("monPanier");
            monPanier.ajouteProduit();
            out.println("<br/> le panier d'achat contient :" + monPanier.getNombreProduits());
            
            String headerAcceptEncoding = request.getHeader("Accept-Encoding");
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