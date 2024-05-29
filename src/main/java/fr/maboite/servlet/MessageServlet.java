package fr.maboite.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="MessageServlet", displayName="Message Servlet", urlPatterns = "/message", loadOnStartup = 1)
public class MessageServlet  extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	public static final Logger LOGGER= LoggerFactory.getLogger(MessageServlet.class);
	
	@Override
	public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
		LOGGER.info("Start of the methode doGet");
		
        response.setContentType("text/html");
        response.setBufferSize(8192);
        String myFirstSession="";
        int i=0;
        try (PrintWriter out = response.getWriter()) {
        
        	LOGGER.info("Dans le try catch");
            out.println("<html>"
                    + "<head><title>MessageServlet</title></head>");
            out.println("<body  bgcolor=\"#ffffff\">"
                    + "<h2>Exercice nouvelle servlet</h2>");
            if(request.getSession().getAttribute("MaFirstSession")!="MaFirstSession") {
            	request.getSession().setAttribute("MafirstSession" , "Ma première session");
            }else {
            	myFirstSession = (String) request.getSession().getAttribute("MaFirstSession");
            	LOGGER.debug("Si ma session exist mon paramètre vaut {} : ", myFirstSession);
            	i++;
            }
            
            response.setHeader("Key1", "Salut");
            response.setHeader("key2", "Je fais une formation CDA");
            
            String username = request.getParameter("username");
            String firstname= request.getParameter("firstname");
            
            if (username != null && username.length() > 0) {
                out.println("Vous êtes : "+ username+" et votre prénom est : "+firstname);
                out.println("<p>"+myFirstSession+i+"</p>");
            }
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
