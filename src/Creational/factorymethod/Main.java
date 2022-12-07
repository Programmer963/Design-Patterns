package creational.factorymethod;

public class Main {
    public static void main (String [] args){
        SmartPhone iPhone = SmartPhoneFactory.getInstance("Iphone", "Iphone 14 Pro Model");
        System.out.println(iPhone);

        SmartPhone samsung = SmartPhoneFactory.getInstance("Samsung",  "Samsung S70");
        System.out.println(samsung);
    }
}