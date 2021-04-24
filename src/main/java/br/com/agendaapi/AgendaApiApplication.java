package br.com.agendaapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.agendaapi.model.entity.Contato;
import br.com.agendaapi.model.repository.Contatorepository;

@SpringBootApplication
public class AgendaApiApplication {
	
	@Bean
	public CommandLineRunner commandLineRunner(@Autowired Contatorepository repo) {
		return args -> {
			Contato c = new Contato();
			c.setNome("Lucas");
			c.setEmail("lucas@email.com");
			c.setFavorito(false);
			repo.save(c);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(AgendaApiApplication.class, args);
	}

}
