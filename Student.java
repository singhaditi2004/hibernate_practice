package sample.sample_project;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
public class Student {
    @Id
    private int sid;
    private String name;
    private String city;

    // Getters and setters
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student [sid=" + sid + ", name=" + name + ", city=" + city + "]";
    }
}
