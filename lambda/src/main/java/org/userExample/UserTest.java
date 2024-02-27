package org.userExample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Emre", "Cihanbeyoglu"));
        users.add(new User("Yusuf", "Cihanbeyoglu"));
        users.add(new User("Mehmet", "Cihanbeyoglu"));
        users.add(new User("Sumeyye", "Cihanbeyoglu"));
        users.add(new User("Emma", "Cihanbeyoglu"));



        // print all users
        printUsers(users, user -> true);

        // print only users with name of starting with E
        System.out.println("printing users with name of starting with E");
        printUsers(users, user -> user.getFirstName().startsWith("E"));
    }

    public static void printUsers(List<User> users, Predicate<User> predicate) {
        for (User user : users) {
            if(predicate.test(user)) {
                System.out.println(user.toString());
            }
        }
    }

}
