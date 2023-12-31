package br.com.davi.api.services;


import br.com.davi.api.domain.User;
import br.com.davi.api.domain.dto.UserDTO;

import java.util.List;

public interface UserService {
    User findByid(Integer id);
    List<User>findAll();
    User create(UserDTO obj);
    User update(UserDTO obj);
    void delete(Integer id);
}
