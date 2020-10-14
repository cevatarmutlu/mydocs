package com.springelasticsearch.repositorys;

import java.util.List;

import com.springelasticsearch.entity.Person;

import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PersonRepository extends ElasticsearchRepository<Person, String> {

    // bool' in query olarak örtüşmeli(match) name ile 0. (?0) örtüşsün
    //Sadece adı örtüşen gelsin
    @Query("{\"bool\": {\"must\": [{\"match\": {\"name\": \"?0\"}}]}}") // Bunlar elasticsearch queryleri
    // elasticsearch' un kendi sitesinden öğrenebilirsin.
    List<Person> getByCustomer(String search);
    
    // Spring' ın sağladığı Query' ler
    List<Person> findByNameLikeOrSurnameLike(String name, String surname); 
    //Spring' in bize sunduğu bir query. Başlangıcı name veya surname' e uyan sorguları getirecek
    
    List<Person> findByNameContainsOrSurnameContains(String name, String surnama);
    //Girilen değerleri içinde barından sorguyu getirecek sanırım. Adından öyle anlıyorum
    // Mesela cevat isim olsun at yazınca cevat adı ile eşlesen dokümanı getirecek

    List<Person> findAllByNameContainsOrSurnameContains(String name, String surnama);
    ////Girilen değerleri içinde barından sorguyları getirecek sanırım. Adından öyle anlıyorum
    // Mesela cevat isim olsun at yazınca cevat adı ile eşlesen dokümanları getirecek
}
