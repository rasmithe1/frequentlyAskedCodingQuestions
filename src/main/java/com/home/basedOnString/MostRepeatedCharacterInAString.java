package com.home.basedOnString;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MostRepeatedCharacterInAString {

    public static void main(String[] args) {
        String str = "Search strings";
        char[] chararr = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : chararr) {
            map.merge(ch, 1, (x, y) -> x + y);
        }
        Map.Entry<Character, Integer> output = null;
        int previous = 0;
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (previous < entry.getValue()) {
                output = new AbstractMap.SimpleEntry<>(entry.getKey(), entry.getValue());
                previous = entry.getValue();
            }
        }
        if (output != null) {
            System.out.println(" Max repeated character is : " + output.getKey() + ", repeatation number is : " + output.getValue());
        } else {
            System.out.println("Invalid string");
        }

    }
}
