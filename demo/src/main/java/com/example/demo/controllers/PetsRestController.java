package com.example.demo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.entity.Pets;
import com.example.demo.models.repository.IPetsRepository;

@CrossOrigin(origins = {"https://localhost:4200"})
@RestController
@EnableAutoConfiguration
@RequestMapping("/api")
public class PetsRestController {

	
	@Autowired
	private IPetsRepository petsDao;
	

	@GetMapping("/pets")
	public List<Pets> getAllPets(){
		return petsDao.findAll();
	}
	
	@GetMapping("/pets/{id}")
	public Pets getPetById(@PathVariable("id") ObjectId id) {
		return petsDao.findBy_id(id);
	}
	
	@PutMapping("/pets/{id}")
	public Pets modifyPets(@PathVariable("id") ObjectId id, @Valid @RequestBody Pets pet) {
		pet.set_id(id);
		petsDao.save(pet);
		return pet;
	}
	
	@PostMapping("/pets")
	public Pets createPet(@Valid @RequestBody Pets pet) {
		pet.set_id(ObjectId.get());
		petsDao.save(pet);
		return pet;
	}
	
	@DeleteMapping("/pets/{id}")
	public void deletePet(@PathVariable ObjectId id) {
		petsDao.delete(petsDao.findBy_id(id));
	}
	
	
}
