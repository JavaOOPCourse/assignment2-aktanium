public class Library {

    private Book[] books;
    private int count;

    public Library(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    // TODO: Add book to array
    public void addBook(Book book) {
        // implement
        if (count < books.length){
            books[count] = book;
            count++;
            System.out.println("Book added successfully");
        }else {
            System.out.println("Library is full");
        }
    }

    // TODO: Display all books
    public void displayBooks() {
        // implement
        if (count == 0) {
            System.out.println("No books in the library");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(books[i].toString());
        }
    }

    // TODO: Search book by title
    public Book searchByTitle(String title) {
        for (int i = 0; i <count; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        } return  null;
    }

    // TODO: Borrow book by title
    public void borrowBook(String title) {
        // implement
        Book book = searchByTitle(title);

        if (book != null) {
            System.out.println("Book not found");
            return;
        }

        if (book.isAvailable()){
            book.borrowBook();
            System.out.println("Book borrowed successfully");
        }else {
            System.out.println("Book is already borrowed");
        }
    }

    // TODO: Return book by title
    public void returnBook(String title) {
        // implement
        Book book = searchByTitle(title);

        if (book != null) {
            System.out.println("Book not found");
            return;
        }

        book.returnBook();
        System.out.println("Book returned successfully");
    }
}
