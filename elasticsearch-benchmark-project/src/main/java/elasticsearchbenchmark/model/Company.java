package elasticsearchbenchmark.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "company")
public class Company {
    @Id
    private Integer r_id;

    @Field(type = FieldType.Text, name = "name")
    private String name;

    @Field(type = FieldType.Text, name = "address")
    private String address;

    @Field(type = FieldType.Text, name = "postalcode")
    private String postalcode;

    @Field(type = FieldType.Keyword, name = "country")
    private String country;

    @Field(type = FieldType.Keyword, name = "city")
    private String city;

    @Field(type = FieldType.Keyword, name = "email")
    private String email;

    @Field(type = FieldType.Keyword, name = "phone")
    private String phone;
}
