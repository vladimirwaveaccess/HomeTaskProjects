package com.company.lesson10.lesson10Task4;

public enum SizeOfClothes {
    XXS(32){
        public String getDescription() {
            return "Child size";
        }
    }, XS(34), S(36), M(38), L(40);

    private int euroSize;

    SizeOfClothes(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public String getDescription() {
        return "Adult size";
    }
}
