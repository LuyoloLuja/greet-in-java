package net.greet;

public enum AvailableLanguages {
    AFRIKAANS("More "),
    ENGLISH("Hello "),
    ISIXHOSA("Molo ");

    private final String availableLanguage;

    AvailableLanguages(String availableLanguage) {
        this.availableLanguage = availableLanguage;
    }

    public String getAvailableLanguage() {
        return availableLanguage;
    }
}
