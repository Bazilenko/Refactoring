package org.example.SymplifyingMethodCalls.IntroduceParameterObject;

public class UserManager {
    public void processUser(User user){
        System.out.println("Name: " + user.getName() +
                "Age: " + user.getAge() +
                "Address: " + user.getEmail());
    }
}
