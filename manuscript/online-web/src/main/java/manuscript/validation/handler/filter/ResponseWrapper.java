package manuscript.validation.handler.filter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

import com.google.gson.Gson;

public class ResponseWrapper extends HttpServletResponseWrapper {

	ByteArrayOutputStream output;
	FilterServletOutputStream filterOutput;
	Gson gson;

	public ResponseWrapper(HttpServletResponse response) {
		super(response);
		output = new ByteArrayOutputStream();
		gson = new Gson();
	}

	@Override
	public ServletOutputStream getOutputStream() throws IOException {
		if (filterOutput == null) {
			filterOutput = new FilterServletOutputStream(output);
		}
		return filterOutput;
	}

	public byte[] getDataStream() {
		return output.toByteArray();
	}

	public Object getResponseObject() {
		return gson.fromJson(convertDataStremToString(), Object.class);
	}

	private String convertDataStremToString() {
		return new String(getDataStream());
	}
}