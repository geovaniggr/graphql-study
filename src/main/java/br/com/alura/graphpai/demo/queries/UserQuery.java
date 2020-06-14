package br.com.alura.graphpai.demo.queries;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.alura.graphpai.demo.models.User;
import br.com.alura.graphpai.demo.repositories.UserRepository;

@Component
public class UserQuery implements GraphQLQueryResolver{
   
    @Autowired
    private UserRepository usrRepository;

    public List<User> getUsers(){
        return usrRepository.findAll();
    }

    public User getUser(String id){
        return usrRepository.findById(id).get();
    }
}