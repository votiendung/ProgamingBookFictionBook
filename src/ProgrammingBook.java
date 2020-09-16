public class ProgrammingBook extends Book {
    String language;
    String framework;

    public ProgrammingBook(String name, String author, double bookCode, long price, String language, String framework) {
        super(name, author, bookCode, price);
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }
}
