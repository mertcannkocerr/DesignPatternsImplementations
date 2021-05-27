package ProxyPattern;

import java.util.concurrent.TimeUnit;

public class Document implements IDocument{
    public int numberOfCharacters;
    public String content;

    public Document(String documentContent) throws InterruptedException {
        // Some heavy stuff here!
        TimeUnit.SECONDS.sleep(5);
        this.content = documentContent;
        this.numberOfCharacters = documentContent.length();
    }

    @Override
    public int getNumberOfCharacters() {
        return this.numberOfCharacters;
    }
}
