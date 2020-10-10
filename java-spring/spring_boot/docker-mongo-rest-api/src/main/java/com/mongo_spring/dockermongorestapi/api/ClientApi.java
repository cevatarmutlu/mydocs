package com.mongo_spring.dockermongorestapi.api;

import java.util.List;

import javax.annotation.PostConstruct;

import com.mongo_spring.dockermongorestapi.entity.Client;
import com.mongo_spring.dockermongorestapi.repository.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client")
public class ClientApi {
    
    @Autowired
    private ClientRepository clientRepository;

    @PostConstruct // Bu javadan geliyor
    // Bu kısım mongodb' ye veri eklemek için
    public void init() {
        Client client = new Client();
        client.setName("cevat");
        client.setSurname("armutlu");
        clientRepository.save(client);
    }

    // Bu kısım mongodb' ye veri eklemek için

    @PostMapping                        //@RequestBody, posttan gelen verinin Body kısmının client' a atanmasını söyler.
    public ResponseEntity<Client> add(@RequestBody Client client) {
        return ResponseEntity.ok(clientRepository.save(client));
        //ResponseEntity dönen cevaplarımızın bir düzende dönmesi için
        // doğru olan created motodu ile ResponseEntity' yi kullanmakmış
    }

    @GetMapping
    public ResponseEntity<List<Client>> all() {
        //Tüm veriyi listeler
        return ResponseEntity.ok(clientRepository.findAll());
    }

}
