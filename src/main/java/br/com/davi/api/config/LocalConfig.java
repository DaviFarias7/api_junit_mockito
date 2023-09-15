package br.com.davi.api.config;

import br.com.davi.api.domain.User;
import br.com.davi.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public void startDB(){
        User u1 = new User(null, "Davi", "davi@gmail.com", "1234");
        User u2 = new User(null, "Kessia", "kessia@gmail.com", "1234");

        repository.saveAll(List.of(u1,u2));
    }
}
