package com.company.lesson12.lesson12Task11;

public class VariousCharacters {
    public static void main(String[] args) {
        String strExample = "fFfff abc f 1234 jkjk";
        System.out.printf("Исходная строка - %s%n", strExample);
        System.out.printf("Результат с учетом регистра символов - %s%n", findMinimumVariousCharactersFillRegistr(strExample));
        System.out.printf("Результат без учета регистра символов - %s%n", findMinimumVariousCharactersNotFillRegistr(strExample));
    }

    /**
     * Метод выводящий слово в котором число различных символов минимально. Слово может содержать буквы и цифры.
     *
     * @param sourceString - входящая строка
     * @return - слово в котором число различных символов минимально
     */
    public static String findMinimumVariousCharactersFillRegistr(String sourceString) {
        String[] strings = sourceString.split(" ");
        String currentStr = "";
        int length = 100;
        int currentLength;

        for (String str : strings) {
            currentLength = countUniqueCharactersFillRegistr(str);
            if (currentLength < length) {
                currentStr = str;
                length = currentLength;
            }
        }
        return currentStr;
    }

    /**
     * Метод выводящий слово в котором число различных символов минимально. Слово может содержать буквы и цифры.
     *
     * @param sourceString - входящая строка
     * @return - слово в котором число различных символов минимально
     */
    public static String findMinimumVariousCharactersNotFillRegistr(String sourceString) {
        String[] strings = sourceString.split(" ");
        String currentStr = "";
        int length = 100;
        int currentLength;

        for (String str : strings) {
            currentLength = countUniqueCharactersNotFillRegistr(str);
            if (currentLength < length) {
                currentStr = str;
                length = currentLength;
            }
        }
        return currentStr;
    }

    /**
     * Метод подсчитывает количество уникальных символов в строке с учетом регистра
     *
     * @param input - входящая строка
     * @return - количество уникальных символов в строке
     */
    private static int countUniqueCharactersFillRegistr(String input) {
        String unique = input.replaceAll("(.)(?=.*?\\1)", "");
        return unique.length();
    }

    /**
     * Метод подсчитывает количество уникальных символов в строке без учета регистра
     *
     * @param input - входящая строка
     * @return - количество уникальных символов в строке
     */
    private static int countUniqueCharactersNotFillRegistr(String input) {
        String unique = input.replaceAll("(?i)(.)(?=.*?\\1)", "");
        return unique.length();
    }
}
/*------------------------- Описание регулярного выражения ------------------------
    . соответствует любому символу
    (...) создает группу захвата, на которую будут ссылаться позже
    (?=...) создает внешний вид, чтобы смотреть вперед во входе
    .*? соответствует любому символу и его совпадению (нежелательное соответствие)
    \\1 соответствует первой группе захвата
    (?i) устанавливает флаг без учета регистра
-----------------------------------------------------------------------------------*/