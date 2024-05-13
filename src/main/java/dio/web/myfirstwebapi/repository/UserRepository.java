package dio.web.myfirstwebapi.repository;

import dio.web.myfirstwebapi.handler.RequiredFieldException;
import dio.web.myfirstwebapi.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(User user){
        if (user.getLogin() == null) {
            throw new RequiredFieldException("login");
        }

        if (user.getPassword() == null) {
            throw new RequiredFieldException("password");
        }

        if(user.getId()==null)
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");

        System.out.println(user);
    }
    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<User> findAll(){
        System.out.println("LIST - Listando os usários do sistema");
        List<User> Users = new ArrayList<>();
        Users.add(new User("gleyson","password"));
        Users.add(new User("frank","masterpass"));
        return Users;
    }
    public User findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new User("gleyson","password");
    }
    public User findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o usernamae: %s para localizar um usuário", username));
        return new User(username,"password");
    }
}
