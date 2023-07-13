package User;

import utils.FileChecker;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

//Service class for User
public class UserService {

    private UserFileDAO userFileDAO;
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
        //create default user if the user does not exist
        User expectedUser = null;
        try{
            for (User user:users){
                if (user.getUserId().equals(userId)){
                    expectedUser = user;
                    break;
                }
            }
            return expectedUser;
        }catch(NullPointerException e){
            throw new NullPointerException();
        }
//        //check if the user exists and return them otherwise we return the default
//        for (User user:users){
//            if (user.getUserId().equals(userId)){
//                expectedUser = user;
//                return expectedUser;
//            }
//        }
//        
//        return expectedUser;
    }
}
