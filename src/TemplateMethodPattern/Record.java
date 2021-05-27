package TemplateMethodPattern;

public abstract class Record {

    public void save(){
        try{
            this.validate();
            this.beforeSave();
            // DB save code snippet
            this.afterSave();
        }
        catch (Exception e){
            this.failedSave();
        }
    }

    // Function that must be implemented in subclasses
    public abstract void validate() throws Exception;

    // Optional Hooks for subclasses that have no implementations
    public void beforeSave(){

    }

    public void afterSave(){

    }

    public void failedSave(){

    }
}
