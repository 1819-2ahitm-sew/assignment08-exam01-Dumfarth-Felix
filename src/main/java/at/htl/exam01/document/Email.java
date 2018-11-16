package at.htl.exam01.document;

import javax.print.DocFlavor;

public class Email extends Document {
    public Email(String title, String from, String to) {
        super(title, from);
        System.out.println("Email: '"+ title +"' von '"+from+"' an '"+to+"'");
    }
}
