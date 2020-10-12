package com.springelasticsearch.api;
import java.util.Calendar;
import java.util.List;

import javax.annotation.PostConstruct;

import com.springelasticsearch.entity.Person;
import com.springelasticsearch.repositorys.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
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
    private final PersonRepository repositoryPersonRepository; // burada final ve yukarıdaki
    //RequiredArgsCon.. bir nesne oluşturmak için. büyük ihtimalle default olarak kendisi
    // Buradaki gibi bir şey oluşturuyor contructer parametresi olarak. Biz başka bir şey yazarsak
    //çalışmıyor.

    @PostConstruct // Bu javadan geliyor
    // Bu kısım mongodb' ye veri eklemek için
    public void init() {
        Person person = new Person();
        person.setName("cevat");
        person.setSurname("armutlu");
        person.setBurndate(Calendar.getInstance().getTime());
        person.setId("P0001");
        repositoryPersonRepository.save(person);
    }

    @GetMapping("/{search}")
    public ResponseEntity<List<Person>> getPerson(@PathVariable String search) {
        List<Person> people = repositoryPersonRepository.getByCustomer(search);
        return ResponseEntity.ok(people);
    }

}