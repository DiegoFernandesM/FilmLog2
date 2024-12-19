package br.com.Filmlog.Filmlog;


import br.com.Filmlog.Filmlog.Principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FilmlogApplication implements CommandLineRunner {
	public FilmlogApplication() {
	}

	public static void main(String[] args) {
		SpringApplication.run(FilmlogApplication.class, args);
	}


	public void run(String... args) {
		Principal principal = new Principal();
		principal.exibeMenu();
	}}