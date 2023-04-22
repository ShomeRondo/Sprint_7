package data;

import model.Courier;

public class CourierData {

    public static Courier defaultCourier(){
        return new Courier("crazy_diamond_iroiroiroiro", "Morio_one_love", "Джоскеee");
    }

    public static Courier courierWithoutLogin(){
        return new Courier("", "killer_quen", "Кира");
    }

    public static Courier courierWithoutName(){
        return new Courier("thehand","Keicho","");
    }

    public static Courier courierWirhoutPassword(){
        return new Courier("lovedeluxe", "", "Юкако");
    }
}
