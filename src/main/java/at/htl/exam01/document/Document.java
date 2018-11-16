package at.htl.exam01.document;

abstract class Document {
    private String title;
    private String from;

    public Document(String title, String from) {
        this.title = title;
        this.from = from;
    }
    public Document(){
    }
}
