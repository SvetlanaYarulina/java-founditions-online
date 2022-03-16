package ru.itsjava.iostreams;

import java.io.Serializable;

public class User implements Serializable {
   private String login;
   transient int password;

    public User(String svetlana, int i) {
    }
}
