package br.com.alura.graphpai.demo.mutations;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.alura.graphpai.demo.models.User;
import br.com.alura.graphpai.demo.repositories.UserRepository;

@Component
public class UserMutation implements GraphQLMutationResolver{
   
    @Autowired
    UserRepository userRepository;

    public User createUser(String name, String email, String description){

        /**
         * Ideal: Criar um UserInput
         * e no `index.graphqls` criar um 
         * input UserInput
         */
        User usr = new User();
        usr.setName(name);
        usr.setEmail(email);
        usr.setDescription(description);

        User createdUser = userRepository.save(usr);

        return createdUser;
    }
}