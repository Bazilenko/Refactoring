package org.example.ImproveCodeBase1;

public class LargeClass {
    private String name;
    private int age;
    private String gender;
    private Enemies enemies;
    private Friends friends;
    private Tasks tasks;

    public LargeClass(String name, int age, String gender, Enemies enemiesList, Friends friendsList, Tasks tasksList){
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.enemies = enemiesList;
        this.friends = friendsList;
        this.tasks = tasksList;
    }

    @Override
    public String toString(){
        return "Name: " + this.name + "/n" +
                "Age: " + this.age + "/n" +
                "Gender: " + this.gender + "/n" +
                "Enemies: " + this.enemies + "/n" +
                "Friends: " + this.friends + "/n" +
                "Tasks: " + this.tasks + "/n";
    }
    public void displayInfo(){
        System.out.println(this.toString());
    }



}
