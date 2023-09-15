package br.com.davi.api.services;


import br.com.davi.api.domain.User;

public interface UserService {
    User findByid(Integer id);
}
