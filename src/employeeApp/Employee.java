package employeeApp;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Employee {

    private int id;
    private String fullname;
    private String email;
    private String password;
    private String[] healthplans;

    public Employee(int id, String fullname, String email, String password, String[] healthplans) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.healthplans = healthplans;
    }

    public int getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String[] getHealthplans() {
        return healthplans;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setHealthplans(String[] healthplans) {
        this.healthplans = healthplans;
    }

    public void addHealtplan(int index, String name) {
        if(index >= 0 && index == healthplans.length) {
            if(healthplans == null) {
                healthplans[index] = name;
                System.out.println("Healtplan added at index " + index);
            }else {
                System.out.println("Index " + index + " is already occupied.");
            }
        }else {
            System.out.println("Invalid index: " + index);
        }
    }

    public String toString() {
        return "Employee [id: " + id + ", fullname: " + fullname + ", email: " + email + ", healthplans: " + Arrays.toString(healthplans) + "]";
    }
}
