package utils._impl;

import entities.User;
import utils.Reportable;

public class UserReport implements Reportable<User> {

    @Override
    public void report(User user) {
        System.out.println("Report for user: " + user.getName());
    }
}
