package ru.tinkoff.bpm;

public class Tester {

    private String[] spamKeywords;
    private int commentMaxLength;
    private String[] texts;

    public Tester(String[] spamKeywords, int commentMaxLengt, String[] texts) {
        this.spamKeywords = spamKeywords;
        this.commentMaxLength = commentMaxLengt;
        this.texts = texts;
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

    public String testTexts() {
        TextAnalyzer[] textAnalyzers = {
            new SpamAnalyzer(spamKeywords),
            new NegativeTextAnalyzer(),
            new TooLongTextAnalyzer(commentMaxLength)
        };
        StringBuilder sb = new StringBuilder();
        int testNumber = 1;
        for (String text : texts) {
            sb.append("test #").append(testNumber).append(": ").append(text).append("\n")
                .append(checkLabels(textAnalyzers, text)).append("\n\n");
            testNumber++;
        }
        return sb.toString();
    }
}
