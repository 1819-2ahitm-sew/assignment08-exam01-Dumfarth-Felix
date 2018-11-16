package at.htl.exam01.document;

public class Main {

    /**
     *
     * Führen Sie hier folgendes durch:
     *
     * 1. Erstellen Sie 2 Bücher und ein email
     *    Buch: "Rowlings", "Harry Potter und der Stein der Weisen"
     *    Email: "Susi", "Bewerbung", "CoolCompany"
     *    Buch: "Tolkien", "lordOfTheRings"
     *
     * 2. Erstellen Sie ein Document-Array und speichern Sie obige Dokumente in diesem Array.
     *
     * 3. Geben Sir die Inhalte dieser Documente wie folgt aus.
     *    Nutzen Sie dabei die Mechanismen der Vererbung.
     *    Erstellen Sie außerdem geeignete toString-Methoden
     *
     * 4. Zählen Sie die Bücher und emails im Array und geben Sie die jeweilige Anzahl aus.
     *
     * @param args
     */
    public static void main(String[] args) {
        int books = 0;
        int emails = 0;
        Document[] doc = new Document[3];
        doc[0] = new Book("Harry Potter und der Stein der Weisen","Rowlings");
        doc[1] = new Email("Bewerbung", "Susi", "CoolCompany");
        doc[2] = new Book( "lordOfTheRings", "Tolkien");
        System.out.println();
        for (int i = 0; i < doc.length; i++) {
            if (doc[i] instanceof Book){
                books++;
            }  else if (doc[i] instanceof Email){
                emails++;
            }
        }
        System.out.println("Anzahl Books:  "+books);
        System.out.println("Anzahl Emails: "+emails);
    }


}
