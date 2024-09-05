public class Main {
    public static void main(String[] args) {
        Author Ivanov = new Author("Oleg", "Ivanov");
        Author Popova = new Author("Света", "Попова");
        Book book1 = new Book("Жизнь", Ivanov, 2015);
        System.out.println("Название книги = " + book1.getNameBook());
        System.out.println("автор книги = " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName());
        System.out.println("Год выпуска книги = " + book1.getYearOfPublication());
        book1.setYearOfPublication(2024);
        System.out.println("Год перевыпуска книги = " + book1.getYearOfPublication());
        Book book2 = new Book("Огонь", Popova, 2017);
        System.out.println("Название книги = " + book2.getNameBook());
        System.out.println("автор книги = " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName());
        System.out.println("Год выпуска книги = " + book2.getYearOfPublication());
        book2.setYearOfPublication(2020);
    }
}