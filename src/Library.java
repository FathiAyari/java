import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Library {
    ArrayList<Book> livresDispo= new ArrayList<>();
    LinkedList<Book> livresEmp= new LinkedList<>();
    public void addBook (Book book){
        livresDispo.add(book);
    }
    public void borrowBook (String isbn){
        Iterator<Book> iterator= livresDispo.iterator();
        boolean find= false;
        while(iterator.hasNext() && !find){
            if(iterator.next().Isbn==isbn){
                find=true;
                iterator.next().Status=false;
                livresEmp.addLast(iterator.next());
                livresDispo.remove(iterator.next());
                System.out.println("Vous avez empreintez votre livre avec cette ISBN "+ isbn);
                //livresDispo.removeIf(e -> e.Isbn==isbn);
            }
        }
        if (!find){
            System.out.println("ISBN non trouvée");
        }
    }
    public void returnBook(String isbn){
        boolean find=false;
        for (Book e : livresEmp) {
            if (e.Isbn.equals(isbn)) {
                e.Status=true;
                livresDispo.add(e);
                livresEmp.remove(e);
                System.out.println("Le livre est de retour");
                find = true;
            }
        }
        if (!find){
            System.out.println("Le livre est introuvable");
        }

    }
    public LinkedList<Book> searchByTitle(String title){

        LinkedList<Book> tempLinkedList= new LinkedList<>();
        livresDispo.forEach(e ->{
            if (e.Titre.equals(title)){
                tempLinkedList.addLast(e);
            }
        });
       return tempLinkedList;
    }
    public LinkedList<Book> searchByAutor(String autor){

        LinkedList<Book> tempLinkedList= new LinkedList<>();
        livresDispo.forEach(e ->{
            if (e.Auteur.equals(autor)){
                tempLinkedList.addLast(e);
            }
        });
        return tempLinkedList;
    }
    public void  listAvailableBooks(){
        System.out.println(" La liste des livres disponibles");
        livresDispo.forEach(e -> {

            System.out.println("Titre : "+ e.Titre);
            System.out.println("Auteur : "+ e.Auteur);
            System.out.println("Isbn : "+ e.Isbn);


        });
    }
    public void  listBorrowedBooks(){
        livresEmp.forEach(e -> {
            System.out.println(" La liste des livres empruntés");
            System.out.println("Titre : "+ e.Titre);
            System.out.println("Auteur : "+ e.Auteur);
            System.out.println("Isbn : "+ e.Isbn);


        });
    }
}
