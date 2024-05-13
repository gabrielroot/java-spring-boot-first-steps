package dio.web.myfirstwebapi.controller;

import dio.web.myfirstwebapi.model.User;
import dio.web.myfirstwebapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping()
    public List<User> index() {
        return userRepository.findAll();
    }

    @GetMapping("/{username}")
    public User findByUsername(@PathVariable("username") String username) {
        return userRepository.findByUsername(username);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        userRepository.deleteById(id);
    }

    @PostMapping()
    public void create(@RequestBody User user) {
        userRepository.save(user);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") Integer id, @RequestBody User user) {
        userRepository.save(user);
    }
}
