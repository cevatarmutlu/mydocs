package com.mongo_spring.dockermongorestapi.repository;

import com.mongo_spring.dockermongorestapi.entity.Client;

import org.springframework.data.mongodb.repository.MongoRepository;

// Veri ekleme ve veri çekme işlemlerini yapacak olan class
public interface ClientRepository  extends MongoRepository<Client, String>{
                                                            // ilki mongodan gelecek olan verinin(collection(
                                                            // eşleneceği class
                                                            //ikinicisi o collection' un id' si

}
