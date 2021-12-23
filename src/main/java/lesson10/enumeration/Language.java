package lesson10.enumeration;

public enum Language {
    Russian(1), English(2), German(3), French(4);

    private int index;

    Language(int index) {
        this.index = index;
    }

    public static Language as(int index) {
        for (Language language : values()) {
            if (language.index == index) {
                return language;
            }
        }
        return Language.Russian;

    }

    public String asString(){
        return name().toLowerCase();
    }
}
