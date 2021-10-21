package com.kodluyoruzTubaAcar;
//menu
public class Menu {
    private CategoryType getCategoryType(String type){
        switch (type.toUpperCase()){
            case "FRUIT&VEGETABLE":
                return CategoryType.FRUIT&VEGETABLE;
            case "SNACK":
                return CategoryType.SNACK;
            case "BREAKFAST":
                return CategoryType.BREAKFAST;
            default:
                return CategoryType.OTHER;
        }
    }
    private SubCategoryType getSubCategoryType(String type){
        switch (type.toUpperCase()){
            case "FRUIT":
                return SubCategoryType.FRUIT;
            case "VEGETABLE":
                return SubCategoryType.VEGETABLE;
            case "CHIPS":
                return SubCategoryType.CHIPS;
            case "CHOCOLATE":
                return SubCategoryType.CHOCOLATE;
            case "MILK":
                return SubCategoryType.MILK;
            case "DELICATESSEN":
                return SubCategoryType.DELICATESSEN;
            default:
                return SubCategoryType.OTHER;
        }
        private ProductType ProductType(String type){
            switch (type.toUpperCase()) {
                case "FRUIT":
                    return ProductType.APPLE;
                return ProductType.PEAR;
                return ProductType.GRAPE;
                case "VEGETABLE":
                    return ProductType.TOMATO;
                return ProductType.PEPPER;
                return ProductType.EGGPLANT;
                case "CHIPS":
                    return ProductType.LAYS;
                return ProductType.DORITOS;
                return ProductType.RUFFLES;
                case "CHOCOLATE
                    return ProductType.TADELLE;
                return ProductType.ALBENI;
                return ProductType.METRO;
                return ProductType.HOBBY;
                case "MILK":
                    return ProductType.FUL-FAT;
                return ProductType.LOW-FAT;
                return ProductType.LACTO-FREE;
                case "DELICATESSEN":
                    return ProductType.CHEDDAR;
                return ProductType.CHEESE;
                return ProductType.SALAMI;
                return ProductType.SUSAGE;
                return ProductType.OLIVE;
            }
        }
    }




