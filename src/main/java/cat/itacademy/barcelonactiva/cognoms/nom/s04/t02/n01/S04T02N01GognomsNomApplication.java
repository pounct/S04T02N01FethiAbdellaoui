package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.domain.Fruita;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.services.FruitaService;

@SpringBootApplication
public class S04T02N01GognomsNomApplication implements CommandLineRunner{
	
	@Autowired
	FruitaService fruitaService;
	

	public static void main(String[] args) {
		SpringApplication.run(S04T02N01GognomsNomApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		fruitaService.add(new Fruita(null,"fruita1",250));
		fruitaService.add(new Fruita(null,"fruita2",150));
		fruitaService.add(new Fruita(null,"fruita3",3500));
		List<Fruita> frts= fruitaService.getAll();
		frts.forEach((f)->System.out.println(f));
	}

}
