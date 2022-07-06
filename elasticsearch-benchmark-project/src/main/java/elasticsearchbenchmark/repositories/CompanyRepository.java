package elasticsearchbenchmark.repositories;

import elasticsearchbenchmark.model.Company;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface CompanyRepository extends ElasticsearchRepository<Company, Integer> {

    @Query("{\"match\":{\"city\":\"?0\"}}")
    List<Company> findAllByCity(final String city);

    @Query("{\"match\":{\"r_id\":\"?0\"}}")
    List<Company> findAllById(final Integer id);

    @Query("{\n" +
            "    \"query\": {\n" +
            "        \"match_all\": {}\n" +
            "    }\n" +
            "}")
    List<Company> findAll();
}
