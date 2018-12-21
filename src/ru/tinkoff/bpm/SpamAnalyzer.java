package ru.tinkoff.bpm;

import java.util.List;

public class SpamAnalyzer extends KeywordAnalyzer {

    private List<String> keywords;

    public SpamAnalyzer(List<String> keywords) {
        this.keywords = keywords;
    }

    @Override
    protected List<String> getKeywords() {
        return this.keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }
}
