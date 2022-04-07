package com.learningjava;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        //could also have used java.util.Map instead of refactoring Map to MapDemo in class name
        languages.put("Java", "compiled, high level, object-oriented, platform independent language");
        languages.put("Python", "interpreted, high level, object-oriented, dynamic semantics");
        languages.put("Algol", "algorithmic");
        languages.put("BASIC", "Beginners All Purpose Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness");

        System.out.println(languages.get("Java"));

        if (languages.containsKey("Java")) {
            System.out.println("Java already in map");
        } else {
            languages.put("Java", "this is Java");
        }

        if (languages.containsKey("JavaScript")) {
            System.out.println("JavaScript already in map");
        } else {
            languages.put("JavaScript", "Web master JS");
        }

        for (String key :
                languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }

        System.out.println("================");

        languages.remove("Lisp");
        if (languages.remove("Algol", "a family of algorithmic languages")) { // will not remove, because value doesn't match
            System.out.println("Algol, removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }

        System.out.println(languages.replace("Algol", "algol replaced value"));
        System.out.println(languages.replace("Scala", "this will not be added because Scala doesn't exist"));
        for (String key :
                languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
