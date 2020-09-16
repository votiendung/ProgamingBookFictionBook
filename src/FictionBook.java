public class FictionBook extends Book {
    String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public FictionBook(String name, String author, double bookCode, long price, String category) {
        super(name, author, bookCode, price);
        this.category = this.category;
    }
}
