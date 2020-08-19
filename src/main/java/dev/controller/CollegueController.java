package dev.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.exception.CodeErreur;
import dev.dto.MessageErreurDto;
import dev.entites.Collegue;
import dev.exception.CollegueException;
import dev.service.CollegueService;

/** Class controller de la web API collegues
 * @author Khalil HIMET
 *
 */
@RestController
@RequestMapping("collegues")
public class CollegueController {
	
	private CollegueService collegueService;

	/** Constructeur
	 * @param collegueService
	 */
	public CollegueController(CollegueService collegueService) {
		super();
		this.collegueService = collegueService;
	}
	
	@GetMapping
	public List<String> getMatricules(@RequestParam("nom") String nom) throws Exception{
		List<Collegue> matricules = collegueService.getListMatricules(nom);
		List<String> list = new ArrayList<>();
		if(!matricules.isEmpty()) {
			for(Collegue col : matricules) {
				list.add(col.getMatricule().toString());
			}
		}
		if(matricules.isEmpty()) {
			throw new CollegueException(new MessageErreurDto(CodeErreur.VALIDATION, "Pas de personne de ce nom"));
		}
		return list;
	}
	
	@GetMapping("{mat}")
	public Collegue getByMatricule(@PathVariable UUID mat) throws Exception {
		Collegue collegue = collegueService.getByMatricule(mat);
		if(collegue == null) {
			throw new CollegueException(new MessageErreurDto(CodeErreur.VALIDATION, "Pas de personne ayant ce matricule"));
		}
		return collegue;
	}

}
