package at.htl.exam01.document;

public class Book extends Document {
    public Book(String title, String from) {
        super(title, from);
    }

    public String toString() {
        return toSting();
    }
}
