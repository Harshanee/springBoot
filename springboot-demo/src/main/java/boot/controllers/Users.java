package boot.controllers;

import boot.domain.UsersDTO;
import boot.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")

public class Users {

    @Autowired
    private UserServices userservices;

    @GetMapping("/all")
    public List<UsersDTO> allUsers(){
        return userservices.findAllUsers();
    }

    @PostMapping("/add")
    public String addUser(@RequestBody UsersDTO userdata){
        return userservices.saveUser(userdata);

    }

    @PutMapping("/update")
    public String updateUser(@RequestBody UsersDTO newUserdata){
        return userservices.updateUser(newUserdata);
    }

    @GetMapping("/find/{id}")
    public UsersDTO getUserById(@PathVariable Integer id){
        return userservices.findById(id);
    }
}
