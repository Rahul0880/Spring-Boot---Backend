package com.example.demo3.Services;

import com.example.demo3.entities.Users;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Service //add service annotation
public class UsersDAOService {

    private static List<Users> users = new ArrayList<>();
    static{
        users.add(new Users(1,"Rahul", LocalDate.now().minusYears(37)));
        users.add(new Users(2,"Aryan", LocalDate.now().minusYears(37)));
        users.add(new Users(3,"Harsha", LocalDate.now().minusYears(37)));
    }

    public Users add(Users user) {
        users.add(user);
        return user;
    }

    public List<Users> getAllUsers() {
        return users;
    }

    public Users getUser(long id)
    {
        for(Users user:users)
        {
            if(user.getId()==id)
            {
                return user;
            }
        }
        return null;
    }

    public Users deleting(long id)
    {
        Iterator<Users> iter= users.listIterator();
        while(iter.hasNext())
        {
            Users user=iter.next();
            if(user.getId()==id)
            {
                iter.remove();
                return user;
            }

        }
        return null;
    }

    public boolean updateUser(long id, String newName, LocalDate newDob) {
        for(Users user : users) {
            if(user.getId() == id) {
                user.setName(newName);
                user.setDob(newDob);
                return true;
            }
        }
        return false;
       }



}
