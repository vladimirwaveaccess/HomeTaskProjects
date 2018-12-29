package com.company.lesson12.lesson12Task3;

/**
 * Напишите метод, заменяющий в строке каждое второе вхождение «object-oriented programming» (не учитываем регистр символов) на «OOP».
 */
public class ChangeString {
    public static void main(String[] args) {
        String strExample = "Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla. Object-oriented programming bla.";
        String strFind = "Object-oriented programming";
        String strReplace = "OOP";

        System.out.printf("Исходная строка:%n%s", strExample);
        System.out.println();
        String rez = replaceEverySecond(strExample, strFind, strReplace);
        System.out.printf("Результирующая строка:%n%s", rez);
    }

    /**
     * Метод заменяющий в строке каждое второе вхождение «string_name» (не учитываем регистр символов) на «string_name»
     *
     * @param sourceString  - исходная строка
     * @param findString    - подстрока которую нужно заменить
     * @param replaceString - подстрока на которую происходит замена
     * @return - результирующая строка
     */
    public static String replaceEverySecond(String sourceString, String findString, String replaceString) {
        String resultStr = sourceString;

        int counter = 0;
        int position = findPosition(resultStr.toLowerCase(), findString.toLowerCase(), 0);
        while (position != -1) {
            if ((counter % 2) != 0) {
                resultStr = resultStr.substring(0, position) + replaceString + resultStr.substring(position + findString.length());
            }
            position = findPosition(resultStr.toLowerCase(), findString.toLowerCase(), position + 1);
            counter++;
        }
        return resultStr;
    }

    /**
     * Метод возвращает индекс первого вхождения указанной подстроки в данной строке, начиная с указанного индекса.
     *
     * @param str1 - исходная строка
     * @param str2 - искомая подстрока
     * @param pos  - позиция с которой необходимо искать
     * @return - номер позиции
     */
    private static int findPosition(String str1, String str2, int pos) {
        return str1.indexOf(str2, pos);
    }
}
