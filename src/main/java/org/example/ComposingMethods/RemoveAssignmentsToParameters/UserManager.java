package org.example.ComposingMethods.RemoveAssignmentsToParameters;

import java.util.List;

public class UserManager {
    private List<User> users;
    public UserManager(List<User> users){
        this.users = users;
    }

    public void addUser(User user){
        if(user != null){
            User registeredUser = new User(user);
            user.setRegistered(true);
            users.add(registeredUser);
        }
    }

}
