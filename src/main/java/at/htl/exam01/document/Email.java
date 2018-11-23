package at.htl.exam01.document;

import javax.print.DocFlavor;

public class Email extends Document {
    String to;

    public Email(String title, String from, String to) {
        super(title, from);

    }

    public String toString() {
        return toSting() + " an '" + to + "'";
    }
}
