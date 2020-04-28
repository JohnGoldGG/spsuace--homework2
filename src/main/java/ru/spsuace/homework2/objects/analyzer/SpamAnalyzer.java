package ru.spsuace.homework2.objects.analyzer;

public class SpamAnalyzer implements TextAnalyzer {
    private final String[] allSpam;

    public SpamAnalyzer(String[] spam) {
        this.allSpam = spam;
    }

    @Override
    public boolean checkText(String text) {
        for (String spam : allSpam) {
            if (text.contains(spam)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public FilterType getFilterType() {
        return FilterType.SPAM;
    }

    @Override
    public FilterType analyze(String text) {
        return null;
    }
}
