package com.company.lesson10.lesson10Task4;

public class ClothesDemo {
    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[]{
                new Tshirt(SizeOfClothes.S, 563.32, "red"),
                new Pants(SizeOfClothes.M, 845, "black"),
                new Skirt(SizeOfClothes.M, 951, "blue"),
                new Tie(SizeOfClothes.L, 258, "khaki")
        };

        System.out.println("Clothes for women:");
        Atelier.dressWoman(clothes);
        System.out.println("Clothes for men:");
        Atelier.dressMen(clothes);
    }
}
