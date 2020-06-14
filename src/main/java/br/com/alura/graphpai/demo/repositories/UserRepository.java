package br.com.alura.graphpai.demo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.alura.graphpai.demo.models.User;

public interface UserRepository extends MongoRepository<User, String>{
    
}