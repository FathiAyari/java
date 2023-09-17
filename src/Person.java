import java.util.Objects;

public class Person {

public int id;
public String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        Person person = (Person) o;
        if (this.id==person.id)
            return true;
            else{
                return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 0;
        for (int i = 0; i < name.length(); i++) {
            hash = 31 * hash + name.charAt(i);
        }
        return hash;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


}


