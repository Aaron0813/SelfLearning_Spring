package com.in28minutes.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class UserDAOService {
    private static List<User> userList = new ArrayList<>();
    private static int count = 3;

    static {
        userList.add(new User(1, "Aaron", new Date()));
        userList.add(new User(2, "Eva", new Date()));
        userList.add(new User(3, "Adam", new Date()));
    }

    public List<User> findAll(){
        return userList;
    }

    public User save(User user){
        if(user.getId() == null) {
            user.setId(++count);
        }
        userList.add(user);
        return user;
    }

    public User findOne(int id){
        for(User u : userList){
            if(u.getId().equals(id)){
                return u;
            }
        }
        return null;
    }

    public User deleteById(int id){
        Iterator iterator = userList.iterator();
        while (iterator.hasNext()){
            User user = (User)iterator.next();
            if(user.getId().equals(id)){
                iterator.remove();
                return user;
            }
        }
        return null;
    }
}
