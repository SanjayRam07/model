package ai.elimu.model.enums;

/**
 * This list represents the currently supported languages.
 */
public enum Locale {
    
    EN("en"),
//    EN_US("en", "US"),
    ES("es"),
    HI("hi"),
    SW("sw");
    
    private String language;
    
    private String country;
    
    private Locale(String language) {
        this.language = language;
    }
    
    private Locale(String language, String country) {
        this.language = language;
        this.country = country;
    }
    
    public String getLanguage() {
        return language;
    }
    
    public String getCountry() {
        return country;
    }
}
