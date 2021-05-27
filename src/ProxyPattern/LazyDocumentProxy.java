package ProxyPattern;

public class LazyDocumentProxy implements IDocument{
    private Document document;
    private String documentContent;

    public LazyDocumentProxy(String documentContent) {
        this.documentContent = documentContent;
    }

    @Override
    public int getNumberOfCharacters() throws InterruptedException {
        if(this.document == null){
            System.out.println("Document is initializing now...");
            this.document = new Document(this.documentContent);
            return this.document.getNumberOfCharacters();
        }
        System.out.println("Document already exists! Returning number of characters...");
        return this.document.getNumberOfCharacters();
    }

}
