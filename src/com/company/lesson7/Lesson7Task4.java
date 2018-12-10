package com.company.lesson7;

/**
 * Определить класс Reader, хранящий такую информацию о пользователе библиотеки: ФИО, номер читательского билета, факультет, дата рождения, телефон. Методы takeBook(), returnBook().
 * Разработать программу, в которой создается массив объектов данного класса. Перегрузить методы takeBook(), returnBook():
 * - takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
 * - takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
 * - takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс, содержащий имя и автора книги). Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
 * Аналогичным образом перегрузить метод returnBook(). Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия". Или  "Петров В. В. вернул 3 книги".
 */
public class Lesson7Task4 {

    public static void main(String[] args) {
        Reader students[] = new Reader[]{
                new Reader("Adam", 11111, "FVTI", "12/15/2000", "+13240987654"),
                new Reader("Hellen", 11112, "FVTI", "12/02/1999", "+13240987654"),
                new Reader("Holly", 11113, "FVTI", "10/25/2000", "+13240987654"),
                new Reader("Lincoln", 11114, "FVTI", "08/15/2000", "+13240987654"),
        };

        Book[] book = new Book[]{
                new Book("Дэн Браун", "Ангелы и демоны"),
                new Book("В.В. Пак", "Высшая математика"),
                new Book("Ерик Берн", "Игры в которые играют люди"),
                new Book("Стив Макконел", "Совершенный код")
        };

        String[] arrayBook = new String[]{"Приключения", "Словарь", "Энциклопедия", "Математика"};

        for (int i = 0; i < students.length; i++) {

            String[] arrayBook1 = new String[i + 1];
            for (int j = 0; j <= i; j++) {
                arrayBook1[j] = arrayBook[j];
            }

            Book[] book1 = new Book[i + 1];
            for (int j = 0; j <= i; j++) {
                book1[j] = book[j];
            }

            students[i].returnBook(i + 1);
            students[i].returnBook(arrayBook1);
            students[i].returnBook(book1);

            students[i].takeBook(i + 1);
            students[i].takeBook(arrayBook1);
            students[i].takeBook(book1);
            System.out.println("\n");

        }
    }
}
