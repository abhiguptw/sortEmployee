package com.test;

public class Employee {

    private String name;
    private String dep;
    private String id;
    private Integer salary;


    public Employee(String name, String dep, String id, Integer salary) {
        this.name = name;
        this.dep = dep;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
