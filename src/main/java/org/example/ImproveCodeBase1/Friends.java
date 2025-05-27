package org.example.ImproveCodeBase1;

import java.util.List;

public class Friends {
    private List<String> friendsList;

    public Friends(List<String> friends){
        this.friendsList = friends;
    }

    public void addFriend(String friend){
        this.friendsList.add(friend);
    }

    public void removeFriend(String friend){
        this.friendsList.remove(friend);
    }
}
