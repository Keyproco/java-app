package com.keyprolab.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class PracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
	}



	@GetMapping("/")
	Restaurant restaurant() {
		return new Restaurant(1L, "Pizzio", "Den ROUDBA", "pizza");
	}

	class Restaurant {
		public Long getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public String getOwner() {
			return owner;
		}

		public String getSpeciality() {
			return speciality;
		}

		private final Long id;
		private final String name;
		private final String owner;
		private final String speciality;

		Restaurant(Long id, String name, String owner, String speciality) {
			this.id = id;
			this.name = name;
			this.owner = owner;
			this.speciality = speciality;
		}

	}
}
