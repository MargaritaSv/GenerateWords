package com.example.magy.generatewords;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.*;

/**
 * Created by magy on 20.10.17.
 */

public class Permuntations {
    private static TreeSet<String> words = new TreeSet<>(); // only unique

    public static void main(String[] args) {
        permuntation("", "кслно");// 1*2*3*4 =24 /with repeating for four letters/
        Iterator<String> output = words.iterator();
        while (output.hasNext()) {
            System.out.println(output.next());

        }
    }

    private static void permuntation(String start, String end) {

        if (end.length() < 1) {
            words.add(start+end);
        } else {

            for (int i = 0; i < end.length(); i++) {
                try {
                    String newStr = end.substring(0, i) + end.substring(i + 1);
                    permuntation(start + end.charAt(i), newStr);
                } catch (StringIndexOutOfBoundsException e) {
                    // TODO: handle exception
                }
            }
        }
    }
}