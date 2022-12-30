package Udemy.Arrays;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {

        Map <Integer, String> users = new HashMap<>();

        users.put(1, "Ricardo");
        users.put(2, "Roberto");
        users.put(3, "Rafaela");
        users.put(4, "Rebeca");
        System.out.println(users.size());
        System.out.println(users.isEmpty());


        System.out.println(users.keySet());
        System.out.println(users.values());
        System.out.println(users.entrySet());

        System.out.println(users.containsKey(2));
        System.out.println(users.containsValue("Rebeca"));

        System.out.println(users.get(2));

        for(int key1: users.keySet()){
            System.out.println(key1);
        }

        for (String values1: users.values()){
            System.out.println(values1);
        }

        for(Map.Entry<Integer, String> register: users.entrySet()){
            System.out.println(register.getKey() + "");
            System.out.println(register.getValue());
        }

    }
}
