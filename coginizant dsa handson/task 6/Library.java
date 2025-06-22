import java.util.*;

public class Library {
    private List<Book> books = new ArrayList<>();

    // Add book
    public void addBook(Book book) {
        books.add(book);
    }

    // Linear search by title
    public void linearSearch(String title) {
        System.out.println("🔍 Linear Search Result:");
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) System.out.println("❌ Book not found.");
    }

    // Binary search by title (sorted list)
    public void binarySearch(String title) {
        System.out.println("🔍 Binary Search Result:");
        Collections.sort(books); // Sort before binary search
        int low = 0, high = books.size() - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            Book midBook = books.get(mid);
            int cmp = midBook.getTitle().compareToIgnoreCase(title);

            if (cmp == 0) {
                System.out.println(midBook);
                found = true;
                break;
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (!found) System.out.println("❌ Book not found.");
    }

    // Display all books
    public void displayBooks() {
        System.out.println("\n📚 Book Collection:");
        for (Book b : books) System.out.println(b);
    }
}
