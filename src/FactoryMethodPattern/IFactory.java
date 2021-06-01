package FactoryMethodPattern;

public interface IFactory {
    IMobilePhone getInstance(String type) throws Exception;
}
