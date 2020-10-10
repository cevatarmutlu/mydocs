package com.mongo_spring.dockermongorestapi.entity;

import java.util.HashMap;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// MongoDb' nin collection' nuna karşılık gelecek class.
@Document
//mongodb' nin anno' su. Bu class' ın bir döküman olduğunu bize söylüyor
public class Client {

    @Id
    // Bu annotation ile id' nın bu olduğunu belli ediyoruz.
    private String id;
    private String name;
    private String surname;
    private HashMap property; // Yukarıdaki değerler sabit ama bu değerin ne olacağını kestiremiyoruz
    // o gibi durumlarda key, value tipinde olan HashMap.

    //Bilgimiz kadarını map' ledeki bilmediklerimi haspmap' in içine atıyoruz.

    // Bu field' lara repo' nun, servislerin erişebilmesi için getter, setter olmalı

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public HashMap getProperty() {
        return property;
    }

    public void setProperty(HashMap property) {
        this.property = property;
    }



    
    
}
