package org.example.SymplifyingMethodCalls.PreserveWholeObject;

public class ProcessPerson {
    public void process(Person person){
        System.out.println("Name: " + person.getName() +
                           "Age: " + person.getAge() +
                            "Address: " + person.getAddress());
    }
}
