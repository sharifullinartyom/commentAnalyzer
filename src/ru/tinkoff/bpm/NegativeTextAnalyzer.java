package ru.tinkoff.bpm;

import java.util.List;

public class NegativeTextAnalyzer extends KeywordAnalyzer {

    private List<String> keywords;

    public NegativeTextAnalyzer(List<String> keywords) {
        this.keywords = keywords;
    }

    @Override
    protected List<String> getKeywords() {
        return this.keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
