package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.domain.Fruita;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.repository.FruitaRepository;

@Service
public class FruitaService implements IFruitaService{

	@Autowired
	FruitaRepository fruitaRepository;

	
	@Override
	public void add(Fruita fruita) {
		// add fruita
		fruitaRepository.save(fruita);
	}

	
	@Override
	public void update(Fruita fruita) {
		// update fruita
		fruitaRepository.save(fruita);
	}

	
	@Override
	public void delete(Long id) {
		// delete fruita
		fruitaRepository.deleteById(id);
	}

	@Override
	//@GetMapping("/fruita/getOne/{id}")
	public Optional<Fruita> getOne(Long id) {
		return fruitaRepository.findById(id);
	}

	
	@Override
	public List<Fruita> getAll() {
		// getAll Fruites
		return fruitaRepository.findAll();
	}

}
