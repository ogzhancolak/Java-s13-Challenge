package employeeApp;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private int giro;
    private String[] developerNames;

    public Company(int id, String name, int giro, String[] developerNames) {
        this.id= id;
        this.name = name;
        this.giro = Math.max(giro, 0);
        this.developerNames = developerNames;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGiro() {
        return giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGiro(int giro) {
        this.giro = giro;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name) {
        if(index >= 0 && index == developerNames.length) {
            if(developerNames == null) {
                developerNames[index] = name;
                System.out.println("Employee names added " + index);
            }else {
                System.out.println("Index " + index + " is already occupied");
            }
        }else {
            System.out.println("Invalid index: " + index);
        }
    }

    public String toString() {
        return "Company [id:" + id + ", name: " + name + ", giro: " + giro + ", developerNames: " + Arrays.toString(developerNames) + "]";
    }
}
