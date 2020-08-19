package dev.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import dev.entites.Collegue;
import dev.repository.CollegueRepository;

/**
 * @author Khalil HIMET
 *
 */
@Service
public class CollegueService {

	private CollegueRepository collegueRepository;

	/** Constructeur
	 * @param collegueRepository
	 */
	public CollegueService(CollegueRepository collegueRepository) {
		super();
		this.collegueRepository = collegueRepository;
	}
	
	public List<Collegue> getListMatricules(String nom) throws Exception {
		
		List<Collegue> collegues = collegueRepository.findByName(nom);
		
		if (nom == "") {
			collegues = collegueRepository.findAll();
		}
		return collegues;
	}
	
	public Collegue getByMatricule(UUID mat) throws Exception {
		
		Collegue collegue = collegueRepository.findbyMatricule(mat);
		return collegue;
	}
	
	
}
