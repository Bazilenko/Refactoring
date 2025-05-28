package org.example.MovingFeaturesBetweenObjects.HideDelegate;

public class Department {
    private String name;
    private Employee manager;

    public Department(String name, Employee manager) {
        this.name = name;
        this.manager = manager;
    }

    public Employee getManager() {
        return manager;
    }

    public String getEmployeeName(){
            return getManager().getName();
    }


}
