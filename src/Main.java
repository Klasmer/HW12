public class Main {
    public static void main(String[] args) {
        Author Ivanov = new Author("Oleg", "Ivanov");
        Author Popova = new Author("Света", "Попова");
        Book book1 = new Book("Жизнь", Ivanov, 2015);
        System.out.println("Название книги = " + book1.getNameBook());
        System.out.println("Автор книги = " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName());
        System.out.println("Год выпуска книги = " + book1.getYearOfPublication());
        book1.setYearOfPublication(2024);
        System.out.println("Год перевыпуска книги = " + book1.getYearOfPublication());
        Book book2 = new Book("Огонь", Popova, 2017);
        System.out.println("Название книги = " + book2.getNameBook());
        System.out.println("Автор книги = " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName());
        System.out.println("Год выпуска книги = " + book2.getYearOfPublication());
        book2.setYearOfPublication(2020);
        System.out.println("Год перевыпуска книги = " + book2.getYearOfPublication());

        System.out.println("Методы объектов");
        Author  Fantik = new Author("Света", "Фантик");
        Book book3= new Book("Конфетки", Fantik, 2025);
        System.out.println(book3);
        Author Kapusta = new Author("Максим", "Капуста");
        Book book4= new Book("Садовод", Kapusta, 2001);
        System.out.println(book4);
        System.out.println(book3.equals(book4));

    }
}