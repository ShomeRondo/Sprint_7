package data;

import model.Order;

public class OrderData {
    public static Order scooterColourGrey(){
        return new Order("Коичи","Хиросе", "Морио", "1", "+79991112233", "2023-04-10", "3", new String[]{"GREY"}, "надо сбежать от Юкако, помогите");
    }

    public static Order scooterColourBlack(){
        return new Order("Коичи","Хиросе", "Морио", "1", "+79991112233", "2023-04-10", "3", new String[]{"BLACK"}, "надо сбежать от Юкако, помогите");

    }

    public static Order scooterNoColour(){
        return new Order("Коичи","Хиросе", "Морио", "1", "+79991112233", "2023-04-10", "3",null, "надо сбежать от Юкако, помогите");

    }

    public static Order scooterAllColor(){
        return new Order("Коичи","Хиросе", "Морио", "1", "+79991112233", "2023-04-10", "3", new String[]{"GREY","BLACK"}, "надо сбежать от Юкако, помогите");

    }
}
