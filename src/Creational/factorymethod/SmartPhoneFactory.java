package creational.factorymethod;

public abstract class SmartPhoneFactory {
    public static SmartPhone getInstance(String name, String modelName){
        if (name=="Iphone"){
            return new Iphone(modelName);
        }
        else if(name=="Samsung")
        {
            return new Samsung(modelName);
        }
        return null;
    }
}