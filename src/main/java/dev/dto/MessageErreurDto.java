package dev.dto;

import dev.exception.CodeErreur;

/**
 * @author Khalil HIMET
 *
 */
public class MessageErreurDto {
	
	private CodeErreur code;
	private String message;
	
	/** Constructeur
	 * @param code
	 * @param message
	 */
	public MessageErreurDto(CodeErreur code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	/** Getter
	 * @return code
	 */
	public CodeErreur getCode() {
		return code;
	}

	/** Setter
	 * @param code code
	 */
	public void setCode(CodeErreur code) {
		this.code = code;
	}

	/** Getter
	 * @return message
	 */
	public String getMessage() {
		return message;
	}

	/** Setter
	 * @param message message
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	

}
