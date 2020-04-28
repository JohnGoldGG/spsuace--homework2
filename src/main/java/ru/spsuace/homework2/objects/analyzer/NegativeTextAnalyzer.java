package ru.spsuace.homework2.objects.analyzer;

public class NegativeTextAnalyzer extends SpamAnalyzer {
    private static final String[] NEGATIVE_EMOJS = new String[]{"=(", ":(", ":|"};

    public NegativeTextAnalyzer() {
        super(NEGATIVE_EMOJS);
    }

    @Override
    public FilterType analyze(String text) {
        return null;
    }

    @Override
    public FilterType getFilterType() {
        return FilterType.NEGATIVE_TEXT;
    }
}
