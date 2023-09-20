package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.services;

import java.util.List;
import java.util.Optional;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.domain.Fruita;

public interface IFruitaService {
	
	void add(Fruita fruita);
	void update(Fruita fruita);
	void delete(Long id);
	Optional<Fruita> getOne(Long id);
	List<Fruita> getAll();

}
