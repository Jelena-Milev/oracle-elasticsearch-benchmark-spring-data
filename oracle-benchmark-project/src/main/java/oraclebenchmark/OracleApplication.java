package oraclebenchmark;

import oraclebenchmark.entity.Company;
import oraclebenchmark.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Duration;
import java.time.Instant;
import java.util.List;


@SpringBootApplication
public class OracleApplication implements CommandLineRunner {

	@Autowired
	private CompanyRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(OracleApplication.class, args);
	}

	public void run(String... args) throws Exception {
		Instant start = Instant.now();
//		List<Company> result = repository.findByCountry("Germany");
		List<Company> result = repository.findByCity("city");
		Instant end = Instant.now();
		System.out.println("Duration: " + Duration.between(start, end));
		System.out.println("result.size: " + result.size());
	}
}
