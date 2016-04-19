package iit.uni.miskolc.controller.response;

/**
 * Represent a simple message with a message type. 
 * @author Balazs Kovacs
 *
 */
public class Messages {
	private String message;
	private MessageType type;

	public Messages() {
		super();
	}

	public Messages(MessageType type, String message) {
		super();
		this.message = message;
		this.type = type;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public MessageType getType() {
		return type;
	}

	public void setType(MessageType type) {
		this.type = type;
	}

}
