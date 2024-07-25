public class Main {
        public static void main(String[] args) {
                Library library = new Library();

                Book book1 = new Book("Mee kasa zalo", "P.K.Atre");
                Book book2 = new Book("Vyasparva", "Durga Bhagwat");
                Book book3 = new Book("Partner", "V.P.kale");
                Book book4 = new Book("Chetkeen", "Narayan Dharap");

                library.addBook(book1);
                library.addBook(book2);
                library.addBook(book3);
                library.addBook(book4);

                System.out.println("Books in the library:");
                for (Book book: library.getBooks()) {
                        System.out.println(book.getTitle() + " by " + book.getAuthor());

                }

                library.removeBook(book2);
                System.out.println("\nBooks in the library after removing " + book2.getTitle() + ":");
                for (Book book: library.getBooks()) {
                        System.out.println(book.getTitle() + " by " + book.getAuthor());

                }

        }
}

