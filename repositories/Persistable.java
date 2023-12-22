package repositories;

import entities.User;

public interface Persistable<T extends User> {
    
    void save(T user);
    
}
