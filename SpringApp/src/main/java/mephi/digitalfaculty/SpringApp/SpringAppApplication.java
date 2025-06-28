package mephi.digitalfaculty.SpringApp;

import mephi.digitalfaculty.SpringApp.model.Role;
import mephi.digitalfaculty.SpringApp.model.User;
import mephi.digitalfaculty.SpringApp.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import jakarta.persistence.*;
import java.util.List;
@SpringBootApplication
public class SpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAppApplication.class, args);
	}
	@Bean
	CommandLineRunner initDatabase(UserRepository userRepository) {
		return args -> {
			if (userRepository.count() == 0) {
				for (Role role : Role.values()) {
					userRepository.save(new User(null, role.name() + "First", role.name() + "Last", role));
				}
			}
		};
	}
}
