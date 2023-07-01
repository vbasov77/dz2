package org.dz2.repositories;

import org.dz2.models.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UserRepository {
    private List<User> users;

    public UserRepository(List<User> users) {
        this.users = users;
    }

    public UserRepository() {
    }

    public List<User> usersArray() {
        users = new ArrayList<>(Arrays.asList(
                new User(1L, "Bob",  33, "man", 89110000000L),
                new User(2L, "Sahra", 30, "woman", 89110000001L)
        ));
        return users;
    }

    public User findById(Long id) {
        for (User user : usersArray()) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        throw new RuntimeException("User not found");
    }

    @Override
    public String toString() {
        return "UserRepository{" +
                "users=" + users +
                '}';
    }
}
