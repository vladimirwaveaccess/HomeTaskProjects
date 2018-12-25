package com.company.lesson11.lesson11Task2;

public class Main {
    public static void main(String[] args) {

        System.out.println("                             | Boolean| Byte | Character | Double | Float | Integer | Long | Short | isStatic");
        System.out.println("_____________________________|________|______|___________|________|_______|_________|______|_______|___________");
        System.out.println("  byteValue                  |        |      |           |        |       |         |      |       |            ");
        System.out.println("_____________________________|________|______|___________|________|_______|_________|______|_______|____________");
        System.out.println("  doubleValue                |        |      |           |        |       |         |      |       |            ");
        System.out.println("_____________________________|________|______|___________|________|_______|_________|______|_______|_____________");
        System.out.println("  floatValue                 |        |      |           |        |       |         |      |       |            ");
        System.out.println("_____________________________|________|______|___________|________|_______|_________|______|_______|_____________");
        System.out.println("  intValue                   |        |      |           |        |       |         |      |       |            ");
        System.out.println("_____________________________|________|______|___________|________|_______|_________|______|_______|_____________");
        System.out.println("  longValue                  |        |      |           |        |       |         |      |       |            ");
        System.out.println("_____________________________|________|______|___________|________|_______|_________|______|_______|_____________");
        System.out.println("  shortValue                 |        |      |           |        |       |         |      |       |            ");
        System.out.println("_____________________________|________|______|___________|________|_______|_________|______|_______|_____________");
        System.out.println("  parseXxx                   |        |      |           |        |       |         |      |       |            ");
        System.out.println("_____________________________|________|______|___________|________|_______|_________|______|_______|_____________");
        System.out.println("  parseXxx with radix        |        |      |           |        |       |         |      |       |            ");
        System.out.println("_____________________________|________|______|___________|________|_______|_________|______|_______|_____________");
        System.out.println("  valueOf with radix         |        |      |           |        |       |         |      |       |            ");
        System.out.println("_____________________________|________|______|___________|________|_______|_________|______|_______|_____________");
        System.out.println("  toString                   |   +     |      |           |        |       |         |      |       |     +       ");
        System.out.println("_____________________________|________|______|___________|________|_______|_________|______|_______|_____________");
        System.out.println("  toString(primitive)        |        |      |           |        |       |         |      |       |            ");
        System.out.println("_____________________________|________|______|___________|________|_______|_________|______|_______|_____________");
        System.out.println("  toString(primitive,radix)  |        |      |           |        |       |         |      |       |            ");
        System.out.println("_____________________________|________|______|___________|________|_______|_________|______|_______|_____________");

    }

    public static void example() {
        String str;

        Boolean bool = true;
        bool.toString();
        bool = Boolean.parseBoolean("false");
        str = Boolean.toString(true);


        Byte byte1 = 7;
        byte1.byteValue();
        byte1.doubleValue();
        byte1.floatValue();
        byte1.intValue();
        byte1.longValue();
        byte1.shortValue();
        byte1.toString();
        byte1 = Byte.parseByte("2");
        byte1 = Byte.parseByte("101011", 2);
        byte1 = Byte.valueOf("101011", 2);
        str = Byte.toString(byte1);


        Character ch = 'x';
        ch.toString();



        Double db = 2.2;
        db.byteValue();
        db.doubleValue();
        db.floatValue();
        db.intValue();
        db.longValue();
        db.shortValue();
        db.toString();
    }
}
