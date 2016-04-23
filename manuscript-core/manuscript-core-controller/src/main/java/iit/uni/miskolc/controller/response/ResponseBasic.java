package iit.uni.miskolc.controller.response;

import java.util.ArrayList;
import java.util.List;

public class ResponseBasic {
	private List<Messages> messages;
	private List<String> errorMessages;

	public List<Messages> getMessages() {
		return messages;
	}

	public void setMessages(List<Messages> messages) {
		this.messages = messages;
	}

	public List<String> getErrorMessages() {
		return errorMessages;
	}

	public void setErrorMessages(List<Exception> exceptions) {
		if (errorMessages == null) {
			errorMessages = new ArrayList<String>();
		}
		List<Exception> exc = exceptions;

		for (Exception exception : exc) {
			errorMessages.add(exception.getMessage());
		}
	}

}
