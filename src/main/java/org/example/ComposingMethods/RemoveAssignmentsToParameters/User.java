package org.example.ComposingMethods.RemoveAssignmentsToParameters;

public class User {
    private boolean isRegistered;

    public User(User user){
        this.isRegistered = user.isRegistered;
    }

    public void setRegistered(boolean registered) {
        isRegistered = registered;
    }
}
