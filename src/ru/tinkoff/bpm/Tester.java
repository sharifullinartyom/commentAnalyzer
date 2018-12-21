package ru.tinkoff.bpm;

public class Tester {

    private StringBuilder sb = new StringBuilder();

    public String testTexts() {
        TextAnalyzer[] textAnalyzers = {
            new SpamAnalyzer(SpamKeywordsFactory.build()),
            new NegativeTextAnalyzer(NegativeKeywordsFactory.build()),
            new TooLongTextAnalyzer(TooLongMaxLengthFactory.build())
        };
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

    private Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer analyzer : analyzers) {
            Label label = analyzer.processText(text);
            if (label != Label.OK) {
                return label;
            }
        }
        return Label.OK;
    }
}
