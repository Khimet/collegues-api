package dev.entites;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

/**
 * @author Khalil HIMET
 *
 */
@Entity
public class Collegue {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Type(type="uuid-char")
	private UUID matricule;
	
	private String nom;
	
	private String prenoms;
	
	private String email;
	
	@Column(name = "date_de_naissance")
	private LocalDate dateDeNaissance;
	
	@Column(name = "photoURL")
	private String photoUrl;
	
	public Collegue() {}

	/** Constructeur
	 * @param nom
	 * @param prenoms
	 * @param email
	 * @param dateDeNaissance
	 * @param photoUrl
	 */
	public Collegue(String nom, String prenoms, String email, LocalDate dateDeNaissance, 
			String photoUrl) {
		super();
		this.matricule = UUID.randomUUID();
		this.nom = nom;
		this.prenoms = prenoms;
		this.email = email;
		this.dateDeNaissance = dateDeNaissance;
		this.photoUrl = photoUrl;
	}

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

	/** Getter
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter
	 * @return prenoms
	 */
	public String getPrenoms() {
		return prenoms;
	}

	/** Setter
	 * @param prenoms prenoms
	 */
	public void setPrenoms(String prenoms) {
		this.prenoms = prenoms;
	}

	/** Getter
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/** Setter
	 * @param email email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/** Getter
	 * @return dateDeNaissance
	 */
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}

	/** Setter
	 * @param dateDeNaissance dateDeNaissance
	 */
	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	/** Getter
	 * @return photoUrl
	 */
	public String getPhotoUrl() {
		return photoUrl;
	}

	/** Setter
	 * @param photoUrl photoUrl
	 */
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	
	
	
	
	
	
}
