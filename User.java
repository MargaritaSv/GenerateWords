package com.example.magy.generatewords;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by magy on 20.10.17.
 */

public class User {
    private int mLengthWord;
    private Permuntations mPermuntations;
    private TreeSet<String> mWords = new TreeSet<>();

    public User(int mLengthWord, Permuntations permuntations) {
        this.mLengthWord = mLengthWord;
        this.mPermuntations = permuntations;
    }

    public void getPermuntationsForUser() {
        TreeSet<String> permuntations = mPermuntations.getWords();

        Iterator<String> output = permuntations.iterator();
        while (output.hasNext()) {
            mWords.add(output.next().substring(0, mLengthWord + 1));
        }
    }
}
