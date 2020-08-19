package dev.exception;

import dev.dto.MessageErreurDto;

/**
 * @author Khalil HIMET
 *
 */
public class CollegueException extends RuntimeException {
	
	private MessageErreurDto messageErreur;

	/** Constructeur
	 * @param messageErreur
	 */
	public CollegueException(MessageErreurDto messageErreur) {
		super(messageErreur.getMessage());
		this.messageErreur = messageErreur;
	}

	/** Getter
	 * @return messageErreur
	 */
	public MessageErreurDto getMessageErreur() {
		return messageErreur;
	}

	/** Setter
	 * @param messageErreur messageErreur
	 */
	public void setMessageErreur(MessageErreurDto messageErreur) {
		this.messageErreur = messageErreur;
	}
	
	
	
	
	

}
