package com.springelasticsearch.api;
import java.util.Calendar;
import java.util.List;

import javax.annotation.PostConstruct;

import com.springelasticsearch.entity.Person;
import com.springelasticsearch.repositorys.PersonRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("person")
public class PersonController {

    //@Autowired
    private final PersonRepository personRepository; // burada final ve yukarıdaki
    //RequiredArgsCon.. bir nesne oluşturmak için. büyük ihtimalle default olarak kendisi
    // Buradaki gibi bir şey oluşturuyor contructer parametresi olarak. Biz başka bir şey yazarsak
    //çalışmıyor.

    // Bu javadan geliyor
    // Bu kısım mongodb' ye veri eklemek için
    @PostConstruct 
    public void init() {
        Person person = new Person();
        person.setName("cevat");
        person.setSurname("armutlu");
        person.setBurndate("asdfasdf");
        person.setId("P0001");
        personRepository.save(person);
    }

    @GetMapping("/{search}")
    public ResponseEntity<List<Person>> getPerson(@PathVariable String search) {
        List<Person> people = personRepository.findByNameContainsOrSurnameContains(search, search);
        System.out.println(people);
        System.out.println(personRepository.findByNameLikeOrSurnameLike(search, search));
        return ResponseEntity.ok(people);
    }

}