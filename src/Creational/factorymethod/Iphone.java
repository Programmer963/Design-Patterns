package creational.factorymethod;

public class Iphone extends SmartPhone {
    private String modelName;

    public Iphone(String modelname){
        this.modelName= modelname;
    }

    public String getModel(){
        return  this.modelName;
    }
}