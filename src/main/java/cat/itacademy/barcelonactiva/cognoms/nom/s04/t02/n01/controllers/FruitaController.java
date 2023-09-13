package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.entities.Fruita;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.repository.FruitaRepository;

@RestController

public class FruitaController {
	FruitaRepository fruitaRepository;
	@PostMapping("/fruita/add")
	void addFruita(Fruita fruita) {
		fruitaRepository.save(fruita);
	}
	@PutMapping("/fruita/update")
	void updateFruita(Fruita fruita) {
		fruitaRepository.save(fruita);
	}
	@DeleteMapping("/fruita/delete/{id}")
	void deleteFruita(Long id) {
		//Optional<Fruita> fruita=fruitaRepository.findById(null);
		fruitaRepository.deleteById(id);
	}
	@SuppressWarnings("deprecation")
	@GetMapping("/fruita/getOne/{id}")
	public void getOneFruita(Long id) {
		Fruita fruita = fruitaRepository.getById(id);
	} 
	
	@GetMapping("/fruita/getAll")
	public void getAllFruitas() {
		List<Fruita> fruitas= fruitaRepository.findAll();
	}

}
