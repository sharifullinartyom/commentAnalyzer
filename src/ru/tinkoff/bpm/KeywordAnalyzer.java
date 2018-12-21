package ru.tinkoff.bpm;

import java.util.List;

public abstract class KeywordAnalyzer implements TextAnalyzer {

    protected abstract List<String> getKeywords();

    protected abstract Label getLabel();

    public Label processText(String text) {
        List<String> keywords = getKeywords();
        for (String keyword : keywords) {
            if (text.contains(keyword)) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}
