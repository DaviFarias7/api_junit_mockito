package br.com.davi.api.services.impl;

import br.com.davi.api.domain.User;
import br.com.davi.api.repositories.UserRepository;
import br.com.davi.api.services.UserService;
import br.com.davi.api.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findByid(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<User>findAll(){
        return repository.findAll();
    }
}
