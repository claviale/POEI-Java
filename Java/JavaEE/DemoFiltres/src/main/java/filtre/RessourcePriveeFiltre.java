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

import java.io.IOException;

/**
 * Servlet Filter implementation class RessourcePriveeFiltre
 */
@WebFilter(
		dispatcherTypes = {
				DispatcherType.REQUEST,
				DispatcherType.FORWARD,
				DispatcherType.INCLUDE,
				DispatcherType.ERROR
		},
		urlPatterns = {"/prive/*"}
)

public class RessourcePriveeFiltre extends HttpFilter implements Filter {

	private static final long serialVersionUID = 1L;

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		
		String username = (String) httpRequest.getSession().getAttribute("username");
		if (username != null && !username.isBlank()) {
			if("Etienne".equals(username)) {
				chain.doFilter(request, response);
				return;
			}
		}
		
		httpResponse.sendRedirect("index");
	}

}
