package dev.dto;

import java.util.UUID;

/**
 * @author Khalil HIMET
 *
 */
public class CollegueDto {

	private int id;
	private UUID matricule;
	/** Getter
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/** Setter
	 * @param id id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/** Getter
	 * @return matricule
	 */
	public UUID getMatricule() {
		return matricule;
	}
	/** Setter
	 * @param matricule matricule
	 */
	public void setMatricule(UUID matricule) {
		this.matricule = matricule;
	}
	
	
}
