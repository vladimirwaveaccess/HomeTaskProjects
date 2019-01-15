package com.company.lesson13.lesson13Task3;

import java.io.UnsupportedEncodingException;
import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Создать класс FullReport, который выводит ту же информацию, что и Report, и добавляет дату выдачи зарплаты. Использовать класс NumberFormat.
 */
public class FullReport {
    public static void generateReport(Employee employee, Locale locale) throws UnsupportedEncodingException {

        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        ResourceBundle rb = ResourceBundle.getBundle("title", locale);
        String[] titles = new String[rb.keySet().size()];
        titles = getTitle(rb);
        System.out.printf("%s %s %s %s, %s - %s%n", titles[1], employee.getFullname(), titles[2], numberFormat.format(employee.getSalary()), titles[3], dateFormat.format(employee.getSalaryDate()));
    }

    /**
     * Метод приводит ключи в читаемую кодировку
     *
     * @param rb - список исходных ключей
     * @return - список декодированных ключей
     * @throws UnsupportedEncodingException
     */
    private static String[] getTitle(ResourceBundle rb) throws UnsupportedEncodingException {
        String[] titles = new String[rb.keySet().size()];
        int i = 0;
        for (String key : rb.keySet()) {
            String value = rb.getString(key);
            titles[i] = new String(value.getBytes("ISO-8859-1"), "UTF-8");
            i++;
        }
        return titles;
    }
}
