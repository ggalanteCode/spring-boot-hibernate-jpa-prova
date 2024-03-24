package com.ggalantecode.springboothibernatejpaprova;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootHibernateJpaProvaApplication {

	//https://docs.spring.io/spring-boot/docs/2.1.x/reference/html/howto-data-access.html
	//https://docs.spring.io/spring-data/data-commons/docs/1.6.1.RELEASE/reference/html/repositories.html
	//https://docs.spring.io/spring-data/jpa/docs/current/api/org/springframework/data/jpa/repository/JpaRepository.html
	//https://docs.spring.io/spring-boot/docs/1.5.16.RELEASE/reference/html/using-boot-devtools.html

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateJpaProvaApplication.class, args);
	}

}
