package elasticsearchbenchmark;

import elasticsearchbenchmark.model.Company;
import elasticsearchbenchmark.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

@SpringBootApplication
public class ElasticsearchApplication implements CommandLineRunner {

	@Autowired
	private CompanyRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(ElasticsearchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Instant start = Instant.now();
		List<Company> result = repository.findAllByCity("city");
//		List<Company> result = repository.findAll();
//		List<Company> result = repository.findAllById(3);
		Instant end = Instant.now();
		System.out.println("Duration: " + Duration.between(start, end));
		System.out.println("result.size: " + result.size());
	}
}
