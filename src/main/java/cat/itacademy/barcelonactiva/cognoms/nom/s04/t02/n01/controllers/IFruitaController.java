package com.ITAcademy.controllers;

import java.util.List;
import java.util.Optional;

import com.ITAcademy.entities.Fruita;

public interface IFruitaController {
	void add(Fruita fruita);
	void update(Fruita fruita);
	void delete(Long id);
	Optional<Fruita> getOne(Long id);
	List<Fruita> getAll();
}
