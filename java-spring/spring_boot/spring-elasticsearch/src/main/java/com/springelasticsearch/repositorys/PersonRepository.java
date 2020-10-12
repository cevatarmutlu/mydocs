package com.springelasticsearch.repositorys;

import java.util.List;

import com.springelasticsearch.entity.Person;

import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PersonRepository extends ElasticsearchRepository<Person, String>{

    @Query("{\"bool\": {\"must\"}: [{\"match\": {\"name\": \"?0\"}}]}")
    // bool' in query olarak örtüşmeli (match) name ile 0. (?0) örtüşsün
    //Sadece adı örtüşen gelsin
	List<Person> getByCustomer(String search);
    
}
