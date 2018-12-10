package com.company.lesson7;

/**
 * Определить класс Reader, хранящий такую информацию о пользователе библиотеки: ФИО, номер читательского билета,
 * факультет, дата рождения, телефон. Методы takeBook(), returnBook().
 */
public class Reader {
    String fio;
    int libraryID;
    String faculty;
    String dateOfBirth;
    String phoneNumber;

    public Reader(String fio, int libraryID, String faculty, String dateOfBirth, String phoneNumber) {
        this.fio = fio;
        this.libraryID = libraryID;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    /**
     * - takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги"
     *
     * @param countTakeBook - количество взятых книг
     */
    void takeBook(int countTakeBook) {
        System.out.println(fio + " взял " + countTakeBook + " книги");
    }

    /**
     * takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение
     * "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
     *
     * @param nameOfBook - переменное количество названий книг
     */
    void takeBook(String... nameOfBook) {
        System.out.println(fio + " взял книги:");
        for (String name : nameOfBook) {
            System.out.println(name);
        }
    }

    /**
     * takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс, содержащий
     * имя и автора книги). Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия"
     *
     * @param nameFromBook - переменное количество объектов класса Book
     */
    void takeBook(Book... nameFromBook) {
        System.out.println(fio + " взял книги:");
        for (Book book : nameFromBook) {
            System.out.println(book.nameOfBook);
        }
    }

    /**
     * - returnBook, который будет принимать количество возвращенных книг. Выводит на консоль сообщение
     * "Петров В. В. вернул 3 книги"
     *
     * @param countReturnBook - количество возвращенных книг
     */
    void returnBook(int countReturnBook) {
        System.out.println(fio + " вернул " + countReturnBook + " книги");
    }

    /**
     * returnBook, который будет принимать переменное количество объектов класса Book (создать новый класс, содержащий
     * имя и автора книги). Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия"
     *
     * @param nameOfBook - переменное количество названий книг
     */
    void returnBook(String... nameOfBook) {
        System.out.println(fio + " вернул книги:");
        for (String name : nameOfBook) {
            System.out.println(name);
        }
    }

    /**
     * returnBook, который будет принимать переменное количество объектов класса Book (создать новый класс, содержащий
     * имя и автора книги). Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия"
     *
     * @param nameFromBook - переменное количество объектов класса Book
     */
    void returnBook(Book... nameFromBook) {
        System.out.println(fio + " вернул книги:");
        for (Book book : nameFromBook) {
            System.out.println(book.nameOfBook);
        }
    }

}
