package ru.itsjava.iostreams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationPractice {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Man man = new Man("Vitalik");

//        try (ObjectOutputStream outputStream = new ObjectOutputStream(
//                new FileOutputStream("src/main/resources/man.out"))) {
//            outputStream.writeObject(man);
//        } catch (IOException exception) {
//            exception.printStackTrace();
//        }

//        try (ObjectInputStream inputStream = new ObjectInputStream(
//                new FileInputStream("src/main/resources/man.out"))) {
//
//            Object obj = inputStream.readObject();
//            Man man = (Man) obj;
//            System.out.println("man = " + man);
//        } catch (IOException | ClassNotFoundException) {
//            exception.printStackTrace();
//        }
//        User user = new User("svetlana", 123);
//        try (ObjectOutputStream outputStream = new ObjectOutputStream(
//                new FileOutputStream("src/main/resources/user.out"))) {
//            outputStream.writeObject(user);
//        } catch (IOException exception) {
//            exception.printStackTrace();
//        }
        try (ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("src/main/resources/user.out"))) {

            Object obj = inputStream.readObject();
            User user = (User) obj;
            System.out.println("user = " + user);
        } catch (IOException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}
