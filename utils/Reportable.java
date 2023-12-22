package utils;

import entities.User;

public interface Reportable<T extends User> {

    void report(T user);
}
