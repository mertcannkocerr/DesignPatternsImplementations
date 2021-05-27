package TemplateMethodPattern;

public class User extends Record{
    public int age;

    public User(int age) {
        this.age = age;
    }

    @Override
    public void validate() throws Exception {
        if(this.age<=18) {
            throw new Exception("User age must be bigger than 18.");
        }
    }

    @Override
    public void afterSave(){
        System.out.println("User is saved successfully.");
    }

    @Override
    public void failedSave(){
        System.out.println("User can not be saved!");
    }
}
