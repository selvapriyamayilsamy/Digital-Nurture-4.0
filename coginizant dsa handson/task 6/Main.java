public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add sample books
        library.addBook(new Book(1, "The Alchemist", "Paulo Coelho"));
        library.addBook(new Book(2, "Java Programming", "Herbert Schildt"));
        library.addBook(new Book(3, "Data Structures", "Narasimha Karumanchi"));
        library.addBook(new Book(4, "Clean Code", "Robert Martin"));

        // Display all books
        library.displayBooks();

        // Linear Search
        library.linearSearch("Clean Code");

        // Binary Search
        library.binarySearch("Clean Code");
    }
}
