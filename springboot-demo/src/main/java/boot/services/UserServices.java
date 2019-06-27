package boot.services;

import boot.domain.UsersDTO;

import java.util.List;

public interface UserServices {

    List<UsersDTO> findAllUsers();

    String saveUser(UsersDTO userdata);

    String updateUser(UsersDTO newUserdata);

    UsersDTO findById(Integer id);
}
