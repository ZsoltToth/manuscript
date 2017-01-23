package manuscript.validation.handler.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * 
 * @author bkovacs2
 *
 */
public class ValidationHandlerFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		ResponseWrapper responseWrapper = new ResponseWrapper((HttpServletResponse) response);

		chain.doFilter(request, responseWrapper);
		
		Object obj = responseWrapper.getResponseObject();
		RestResponse fullResponse = new RestResponse();
		fullResponse.setData(obj);
		response.getOutputStream().write(restResponseBytes(fullResponse));

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	private byte[] restResponseBytes(RestResponse response) throws IOException {
		Gson gson = new Gson();
		return gson.toJson(response).getBytes();
	}
}
