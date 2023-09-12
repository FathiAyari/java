import java.util.Objects;

public class Book {
    public String Titre;

    public Book(String titre) {
        Titre = titre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(Titre, book.Titre);
    }

    /*@Override
    public int hashCode() {
        return Titre != null ? Titre.hashCode() : 0;
    }*/
}
