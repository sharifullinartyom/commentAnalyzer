package ru.tinkoff.bpm;

import java.util.ArrayList;
import java.util.List;

public class Tester {

    private StringBuilder sb = new StringBuilder();

    public String testTexts() {
        List<TextAnalyzer> textAnalyzers = new ArrayList<>();
        textAnalyzers.add(new SpamAnalyzer(SpamKeywordsFactory.build()));
        textAnalyzers.add(new NegativeTextAnalyzer(NegativeKeywordsFactory.build()));
        textAnalyzers.add(new TooLongTextAnalyzer(TooLongMaxLengthFactory.build()));

        for (String text : TextFactory.build()) {
            Label label = checkLabels(textAnalyzers, text);
            addCurrentString(text, label);
        }
        return sb.toString();
    }

    private void addCurrentString(String text, Label label) {
        sb.append(text)
            .append("\n")
            .append(label)
            .append("\n\n");
    }

    private Label checkLabels(List<TextAnalyzer> analyzers, String text) {
        for (TextAnalyzer analyzer : analyzers) {
            Label label = analyzer.processText(text);
            if (label != Label.OK) {
                return label;
            }
        }
        return Label.OK;
    }
}
