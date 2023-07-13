package User;

import utils.FileChecker;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

//Data access class for users, we are going to store users using an array
public class UserFileDAO implements UserDaoInterface {
    private static final File FILE = FileChecker.createFile("/Users/mesomaokolocha/Desktop/CLI_Project/src/users.csv");

    //retrieve users from the database
    @Override
    public List<User> getUsers(){
        List<User> users = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(FILE);
            while (scanner.hasNext()) {
                String[] data = scanner.nextLine().split(",");
                users.add(new User(UUID.fromString(data[0]), data[1]));
            }
            scanner.close(); // Close the scanner after reading the file
            return users;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
