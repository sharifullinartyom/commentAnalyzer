package ru.tinkoff.bpm;

import java.util.ArrayList;
import java.util.List;

public class SpamKeywordsFactory {

    public static List<String> build() {
        List<String> spamKeywords = new ArrayList<String>();
        spamKeywords.add("spam");
        spamKeywords.add("bad");
        return spamKeywords;
    }
}
