package com.example.demo3.entities;
import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.time.LocalDate;
@Valid
public class Users {
//    @Size(min=2,message = "Please enter user ID")
    private long id;

    @Size(min=2,message = "Minimum three characters required")
    private String name;

    private LocalDate dob;

    public Users(long id, String name, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                '}';
    }
}