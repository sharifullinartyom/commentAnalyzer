package ru.tinkoff.bpm;

import java.util.ArrayList;
import java.util.List;

public class NegativeKeywordsFactory {

    public static List<String> build() {
        List<String> negativeKeywords = new ArrayList<>();
        negativeKeywords.add(":(");
        negativeKeywords.add("=(");
        negativeKeywords.add(":|");
        return negativeKeywords;
    }
}
