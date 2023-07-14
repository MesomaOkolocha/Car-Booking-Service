package User;

import java.util.List;
import java.util.UUID;

//Service class for User
public class UserService {

    private final UserFileDAO userFileDAO;
    public UserService(UserFileDAO userFileDAO) {
        this.userFileDAO = userFileDAO;
    }

    //retrieve All Users from database
    public List<User> getUsers(){
        return (userFileDAO.getUsers());
    }

    //retrieve a specific user from database
    public User getUserById(UUID userId){
        List<User> users = userFileDAO.getUsers();
        try{
            //used java streams for functional programming for fast processing
            return users.stream().filter(user -> user.getUserId().equals(userId)).findFirst().orElse(null);
        }catch(NullPointerException e){
            throw new NullPointerException();
        }
    }
}
