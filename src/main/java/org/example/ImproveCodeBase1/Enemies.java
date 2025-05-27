package org.example.ImproveCodeBase1;

import java.util.List;

public class Enemies {
    private List<String> enemyList;

    public Enemies(List<String> enemies){
        this.enemyList = enemies;
    }

    public void addEnemy(String enemy){
        this.enemyList.add(enemy);
    }

    public void removeEnemy(String enemy){
        this.enemyList.remove(enemy);
    }
}
