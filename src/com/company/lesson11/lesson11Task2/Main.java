package com.company.lesson11.lesson11Task2;

public class Main {
    public static void main(String[] args) {

        System.out.println("                             | Boolean| Byte | Character | Double | Float | Integer | Long | Short | isStatic");
        System.out.println("_____________________________|________|______|___________|________|_______|_________|______|_______|_____________");
        System.out.println("  byteValue                  |   -    |   +  |     -     |    +   |   +   |    +    |   +  |   +   |     -       ");
        System.out.println("_____________________________|________|______|___________|________|_______|_________|______|_______|_____________");
        System.out.println("  doubleValue                |   -    |   +  |     -     |    +   |   +   |    +    |   +  |   +   |     -       ");
        System.out.println("_____________________________|________|______|___________|________|_______|_________|______|_______|_____________");
        System.out.println("  floatValue                 |   -    |   +  |     -     |    +   |   +   |    +    |   +  |   +   |     -       ");
        System.out.println("_____________________________|________|______|___________|________|_______|_________|______|_______|_____________");
        System.out.println("  intValue                   |   -    |   +  |     -     |    +   |   +   |    +    |   +  |   +   |     -       ");
        System.out.println("_____________________________|________|______|___________|________|_______|_________|______|_______|_____________");
        System.out.println("  longValue                  |   -    |   +  |     -     |    +   |   +   |    +    |   +  |   +   |     -       ");
        System.out.println("_____________________________|________|______|___________|________|_______|_________|______|_______|_____________");
        System.out.println("  shortValue                 |   -    |   +  |     -     |    +   |   +   |    +    |   +  |   +   |     -       ");
        System.out.println("_____________________________|________|______|___________|________|_______|_________|______|_______|_____________");
        System.out.println("  parseXxx                   |   +    |   +  |     -     |    +   |   +   |    +    |   +  |   +   |     +       ");
        System.out.println("_____________________________|________|______|___________|________|_______|_________|______|_______|_____________");
        System.out.println("  parseXxx with radix        |   -    |   +  |     -     |    -   |   -   |    +    |   +  |   +   |     +       ");
        System.out.println("_____________________________|________|______|___________|________|_______|_________|______|_______|_____________");
        System.out.println("  valueOf with radix         |   -    |   +  |     -     |    -   |   -   |    +    |   +  |   +   |     +       ");
        System.out.println("_____________________________|________|______|___________|________|_______|_________|______|_______|_____________");
        System.out.println("  toString                   |   +    |   +  |     +     |    +   |   +   |    +    |   +  |   +   |     -       ");
        System.out.println("_____________________________|________|______|___________|________|_______|_________|______|_______|_____________");
        System.out.println("  toString(primitive)        |   +    |   +  |     +     |    +   |   +   |    +    |   +  |   +   |     +       ");
        System.out.println("_____________________________|________|______|___________|________|_______|_________|______|_______|_____________");
        System.out.println("  toString(primitive,radix)  |   -    |   -  |     -     |    -   |   -   |    +    |   +  |   -   |     +       ");
        System.out.println("_____________________________|________|______|___________|________|_______|_________|______|_______|_____________");

    }

    public static void example() {
        String str;

        Boolean bool = true;
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
        str = Character.toString('w');


        Double db = 2.2;
        db.byteValue();
        db.doubleValue();
        db.floatValue();
        db.intValue();
        db.longValue();
        db.shortValue();
        db = Double.parseDouble("234");
        str = Double.toString(3.3);

        Float fl = 213f;
        fl.byteValue();
        fl.doubleValue();
        fl.floatValue();
        fl.intValue();
        fl.longValue();
        fl.shortValue();
        fl = Float.parseFloat("234");
        str = Float.toString(213f);

        Integer intgr = 123;
        intgr.byteValue();
        intgr.doubleValue();
        intgr.floatValue();
        intgr.intValue();
        intgr.longValue();
        intgr.shortValue();
        intgr = Integer.parseInt("543");
        intgr = Integer.parseInt("101011", 2);
        intgr = Integer.valueOf("111110", 2);
        str = Integer.toString(919);
        str = Integer.toString(23, 16);

        Long lng = 23L;
        lng.byteValue();
        lng.doubleValue();
        lng.floatValue();
        lng.intValue();
        lng.longValue();
        lng.shortValue();
        lng = Long.parseLong("4321");
        lng = Long.parseLong("2AED", 16);
        lng = Long.valueOf("AAAA", 16);
        str = Long.toString(254);
        str = Long.toString(245, 16);

        Short sh = 2;
        sh.byteValue();
        sh.doubleValue();
        sh.floatValue();
        sh.intValue();
        sh.longValue();
        sh.shortValue();
        sh = Short.parseShort("120");
        sh = Short.parseShort("2A", 16);
        sh = Short.valueOf("101010", 2);
        str = Short.toString(sh);
    }
}
