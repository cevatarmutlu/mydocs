package com.springelasticsearch.entity;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
// elasticsearch document base bir veritabanıymış. Bu yüzden class' ı doküman diye belirtmemiz gerekiyor
@Document(indexName = "people", type = "person")
 // lombok eklemesinin sebebi işte bu. Eğer lombok
// içinden getter anno' sunun class üstüne eklersen bütün field' lar
// için getter oluşturuyor. Sadece bir değişkene eklersen o değişken için getter oluşturuyor.
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    
    @Id
    private String id;

    @Field(name = "name", type = FieldType.Text)
    private String name;

    @Field(name = "surname", type = FieldType.Text)
    private String surname;
    
    @Field(name = "burndate", type = FieldType.Date)
    private Date burndate;

}
