package br.com.davi.api.services;


import br.com.davi.api.domain.User;

import java.util.List;

public interface UserService {
    User findByid(Integer id);
    List<User>findAll();
}
