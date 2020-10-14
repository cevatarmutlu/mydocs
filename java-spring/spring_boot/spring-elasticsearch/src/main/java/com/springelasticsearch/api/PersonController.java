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

    // Ne işe yarıyor. Bu class başlatıkdıktan sonra personRepository referer ya da pointer' ina PersonRepository nesnesi atıyor.
    private final PersonRepository personRepository; // burada final ve yukarıdaki
    //RequiredArgsCon.. bir nesne oluşturmak için. büyük ihtimalle default olarak kendisi
    // Buradaki gibi bir şey oluşturuyor contructer parametresi olarak. Biz başka bir şey yazarsak
    //çalışmıyor.

    // Bu javadan geliyor
    // Bu kısım elastic' e veri eklemek için var.
    // Yapmasını söylediği şey şu. Bu class' tan bir nesne üretildikten sonra yana contructor çalıştıktan sonra bu init çalışsın demek oluyor.
    @PostConstruct 
    public void init() {
        Person person = new Person();
        person.setName("cevat");
        person.setSurname("armutlu");
        person.setBurndate("asdfasdf");
        person.setId("P0001");
        personRepository.save(person); // Bu kısım ile elastic' e veri ekliyoruz
    }

    @GetMapping("/{search}") // GetMapping içine verdiğimiz ifade ile /person yoluna /cevat gibi bir şey yazdığımızda
    // bu metot çalışacak ve yazılan cevat değerini metoduna atayacak. Arama işini ise @PathVariable anno' su yapacak.
    public ResponseEntity<List<Person>> getPerson(@PathVariable String search) {
        List<Person> people = personRepository.findByNameContainsOrSurnameContains(search, search);
        return ResponseEntity.ok(people);
    }

}