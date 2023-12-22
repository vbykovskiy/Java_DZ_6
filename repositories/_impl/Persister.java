package repositories._impl;

import repositories.Persistable;
import entities.User;

public class Persister implements Persistable<User> {

    public void save(User user){
        System.out.println("Save user: " + user.getName());
    }
}
