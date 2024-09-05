public class Book {
    private String nameBook;
    private Author author;
    private int yearOfPublication;

    public Book(String nameBook, Author author, int yearOfPublication) {
        this.nameBook = nameBook;
        this.author = author;
        this.yearOfPublication = yearOfPublication;

    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getAuthor() {
        return this.author;
    }


    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
