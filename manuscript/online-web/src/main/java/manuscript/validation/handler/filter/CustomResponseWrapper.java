package manuscript.validation.handler.filter;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

/**
 * 
 * @author bkovacs2
 *
 */
public class CustomResponseWrapper extends HttpServletResponseWrapper {
	FilterServletOutputStream filterOutput;
	OutputStream os;

	public CustomResponseWrapper(HttpServletResponse response) {
		super(response);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ServletOutputStream getOutputStream() throws IOException {
//		if (filterOutput == null) {
//			os.w
//			filterOutput = new FilterServletOutputStream();
//		}
		return super.getOutputStream();
	}

}
