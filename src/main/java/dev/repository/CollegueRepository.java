package dev.repository;

import dev.entites.Collegue;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author Khalil HIMET
 *
 */
public interface CollegueRepository extends JpaRepository<Collegue, Integer>{
	
	@Query("select c from Collegue c where c.nom = ?1")
	List<Collegue> findByName(String nom);
	
	@Query("select c from Collegue c where c.matricule = ?1")
	Collegue findbyMatricule(UUID mat);

}
