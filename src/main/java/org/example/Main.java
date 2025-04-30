package org.example;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
//        String text = "Дніпровський районний у місті Києві відділ державної реєстрації актів цивільного стану ГТУЮ у місті Києві";
//        System.out.println(text);
//
//        String abbreviation = text.replaceAll("(?i)" + "Відділ державної реєстрації актів цивільного стану", "ВДРАЦС");
//        System.out.println(abbreviation);

        String text = "Дніпровський районний у місті Києві відділ державної реєстрації актів цивільного стану ГТУЮ у місті Києві";
        System.out.println(text);

        String abbreviation = text.replaceAll("(?iu)" + "Відділ державної реєстрації актів цивільного стану", "ВДРАЦС");
        System.out.println(abbreviation);

//        Map<String, String> map = new LinkedHashMap<>();
//        map.put("3", "three");
//        map.put("1", "one");
//        map.put("2", "two");
//
//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
    }

}