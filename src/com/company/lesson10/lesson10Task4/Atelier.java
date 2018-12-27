package com.company.lesson10.lesson10Task4;

public class Atelier {
    public static void dressWoman(Clothes[] clothes) {
        for (Clothes clothe : clothes) {
            if (clothe instanceof WomenClothes) {
                System.out.println(clothe);
            }
        }
    }

    public static void dressMen(Clothes[] clothes) {
        for (Clothes clothe : clothes) {
            if (clothe instanceof MenClothes) {
                System.out.println(clothe);
            }
        }
    }
}
