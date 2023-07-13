package User;

import utils.FileChecker;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

//Data access class for users, we are going to store users using an array
public class UserFileDAO implements UserDaoInterface {
    private static final File file = FileChecker.createFile("/Users/mesomaokolocha/Desktop/CLI_Project/src/users.csv");
    private static List<User> users;

    static {
        users = new ArrayList<>();
        loadUsersFromFile(); // Call the method to load users from the file during initialization
    }

    private static void loadUsersFromFile() {
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String[] data = scanner.nextLine().split(",");
                users.add(new User(UUID.fromString(data[0]), data[1]));
            }
            scanner.close(); // Close the scanner after reading the file
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    //retrieve users from the database
    @Override
    public List<User> getUsers(){
        return users;
    }
}
