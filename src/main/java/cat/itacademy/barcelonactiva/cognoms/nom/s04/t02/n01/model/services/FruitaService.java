package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.domain.Fruita;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.repository.FruitaRepository;

@Service
public class FruitaService implements IFruitaService {

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
	public Optional<Fruita> getOne(Long id) {
		return fruitaRepository.findById(id);
	}

	@Override
	public List<Fruita> getAll() {
		// getAll Fruites
		return fruitaRepository.findAll();
	}

}
