package org.example.SymplifyingMethodCalls.IntroduceParameterObject;

public class User {
    private String name;
    private int age;
    private String email;

    public User(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.email = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
