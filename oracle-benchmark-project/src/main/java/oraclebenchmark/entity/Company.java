package oraclebenchmark.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company {
    @Id
    private Integer r_id;
    private String name;
    private String address;
    private String postalcode;
    private String country;
    private String city;
    private String email;
    private String phone;
}
