package boot.services.impl;

import boot.domain.UsersDTO;
import boot.repositories.UserRepository;
import boot.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserServices {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UsersDTO> findAllUsers() {
        List<UsersDTO> allusers = userRepository.findAll();
        return allusers;
    }

    @Override
    public String saveUser(UsersDTO userdata) {
        userRepository.save(userdata);
        return "data saved";
    }

    @Override
    public String updateUser(UsersDTO newUserdata) {
        String msg =null;

        if(newUserdata.getId() != null){
            userRepository.save(newUserdata);
            msg ="updated";
        }else{
            msg ="Error";
        }
        return msg;
    }

    @Override
    public UsersDTO findById(Integer id) {
        return userRepository.findOne(id);
    }
}
