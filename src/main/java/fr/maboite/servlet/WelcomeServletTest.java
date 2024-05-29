package fr.maboite.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="Welcome2", displayName="Welcome Servlet",
        urlPatterns = "/welcome2",
        loadOnStartup = 1)
public class WelcomeServletTest extends HttpServlet {

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
        response.setHeader("Java", "Jakarta EE");
        response.setHeader("C#", "Aso.Net");



        try (PrintWriter out = response.getWriter()) {
            out.println("<html>"
                    + "<head><title>Générée par une servlet</title></head>");
            out.println("<body  bgcolor=\"#ffffff\">"
                    + "<h2>Java, mais quel langage ?!!!</h2>");

            String username = request.getParameter("username");
            if (username != null && username.length() > 0) {
                out.println("Vous êtes : "+ username);
            }
            out.println("</body></html>");


            PanierAchat monPanier = (PanierAchat) request.getSession().getAttribute("monPanier");
            monPanier.ajouterProduit();
            out.println("<br/>Le panier d'achat contient : " + monPanier.getNombreProduits());


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

