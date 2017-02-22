package manuscript.system.logback.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.MDC;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public class LogbackConfigFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;

		if (req.getSession() != null) {
			try {
				MDC.put("sessionId", req.getSession().getId());
				chain.doFilter(request, response);
			} finally {
				MDC.remove("sessionId");
			}
		}

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
