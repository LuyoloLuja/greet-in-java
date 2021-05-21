package net.greet;

public enum AvailableLanguages {
    ENGLISH("Hello "),
    ISIXHOSA("Molo "),
    AFRIKAANS("More ");

    private final String availableLanguage;

    AvailableLanguages(String availableLanguage) {
        this.availableLanguage = availableLanguage;
    }

    public String getAvailableLanguage(){
        return availableLanguage;
    }
}
