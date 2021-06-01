package FactoryMethodPattern;

public class MobilePhoneFactory implements IFactory{

    @Override
    public IMobilePhone getInstance(String type) throws Exception {
        if (type.equals("GalaxyS8")){
            return new GalaxyS8();
        }
        else if(type.equals("Note8")) {
            return new Note8();
        }
        else{
            throw new Exception("There is no model as " + type);
        }
    }
}
