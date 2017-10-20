package com.example.magy.generatewords;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.*;

/**
 * Created by magy on 20.10.17.
 */

public class Permuntations {
    private TreeSet<String> words = new TreeSet<>(); // only unique

    public Permuntations(String word) {
        permuntation("", word);

    }

    public TreeSet<String> getWords() {
        return words;
    }
    
    private void permuntation(String start, String end) {

        if (end.length() < 1) {
            words.add(start + end);
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