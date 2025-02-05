package filtre;

import jakarta.servlet.DispatcherType;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet Filter implementation class ConnexionFiltre
 */
@WebFilter(
		dispatcherTypes = {
				DispatcherType.REQUEST,
				DispatcherType.FORWARD,
				DispatcherType.INCLUDE,
				DispatcherType.ERROR
		},
		urlPatterns = {"/*"}
)

public class ConnexionFiltre extends HttpFilter implements Filter {
	private static final long serialVersionUID = 1L;

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		
		// Vérifier si l'URL demandée est la page de connexion (connexion.jsp)
        String requestURI = httpRequest.getRequestURI();
        
        // Exclure la page de connexion (connexion.jsp) et autres pages publiques (css, inscription)
        if (requestURI.endsWith("connexion.jsp") || requestURI.endsWith("/connexion")) {
            chain.doFilter(request, response);  // Autorise l'accès à connexion.jsp
            return;  // Ne bloque pas l'exécution
        }
		
     // Vérifier si l'utilisateur est connecté en vérifiant la session
        HttpSession session = httpRequest.getSession(false);
        if (session != null && session.getAttribute("username") != null) {
            // Si l'utilisateur est connecté, on laisse passer la requête
            chain.doFilter(request, response);
        } else {
            // Si l'utilisateur n'est pas connecté, on redirige vers la page de connexion
            httpResponse.sendRedirect("connexion");
        }

	}
}
