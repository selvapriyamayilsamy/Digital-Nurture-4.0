public class Book implements Comparable<Book> {
    private int bookId;
    private String title;
    private String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title.toLowerCase(); // normalize for comparison
        this.author = author.toLowerCase();
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return "📘 Book ID: " + bookId + ", Title: " + title + ", Author: " + author;
    }

    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }
}
