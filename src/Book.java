public class Book {
    String name;
    String author;
    double bookCode;
    long price;

    public Book(String name, String author, double bookCode, long price) {
        this.name = name;
        this.author = author;
        this.bookCode = bookCode;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getBookCode() {
        return bookCode;
    }

    public void setBookCode(double bookCode) {
        this.bookCode = bookCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", bookCode=" + bookCode +
                ", price=" + price +
                '}';
    }
}
