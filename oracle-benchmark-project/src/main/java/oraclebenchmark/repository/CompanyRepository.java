package oraclebenchmark.repository;

import oraclebenchmark.entity.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends CrudRepository<Company, Integer> {

    @Query(value = "SELECT * FROM COMPANY WHERE CITY LIKE :city ", nativeQuery = true)
    List<Company> findByCity(@Param("city") String city);

    @Query(value = "SELECT * FROM COMPANY WHERE COUNTRY = :country ", nativeQuery = true)
    List<Company> findByCountry(@Param("country") String country);

}
