import javax.management.AttributeList;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.IntBinaryOperator;
import javax.management.Attribute;
public class Main {

    public static void main(String[] args) {
        // THIS BLOC IS DEDICATED FOR DATA TYPES AND VARIABLES
        // PRIMITIVE DATA TYPE
        int age = 24;
        System.out.println("my age is " + age);
        float price = 24.5F;
        System.out.println(price);
        double price2 = 24.5;
        System.out.println(price2);
        //  PS : a double can represent much larger numbers than a float
        char letter = 'M'; // we need to put a single cote if we declare one letter
        System.out.println(letter);
        boolean valid = true;
        String output = (valid) ? "its okay" : "its not okay";
        System.out.println(output);
        long longNumber = 123456789009876L;
        System.out.println(longNumber);
        // long is used to declare a long number
        short shortNumber = 123;
        System.out.println(shortNumber);
        //short is used to declare a short number


        // REFERENCE DATA TYPE
        //These data types refer to objects in Java, including user-defined classes
        // and Java's built-in classes like String,Arrays,Set,Map,Classes...
        String name = "Mohamed";
        System.out.println("name");
        List<String> listName = new ArrayList<String>();
        System.out.println(listName);

        /* I invite you to take a look on the file in discrod ( difference between
         primitive and reference data types)
         PS: All reference types are a subclass of type java.lang.Object It contains
         the address (or reference) of dynamically created objects
         */

        //CONDITIONALS
        /*
        in this state , we have 4 types of consitionals that we need to learn
        1 : if statement
        2 : if-else statement
        3 : if else-if ... else ladder
        4 : nested if statement
        5 : using ternary operator
        */

        // 1 : if statement Example:
        int note = 15;
        if (note > 10)
            System.out.println("Accepted");
        //2 : if-else statement
        if (note > 10) {
            System.out.println("Accepted");
        } else {
            System.out.println("Not Accepted");
        }
        //3 : if else-if ... else ladder
        if (note > 10) {
            System.out.println("Accepted");
        } else if (note >= 9 && note < 10) {
            System.out.println("you need to pass the control session");
        } else {
            System.out.println("refused");
        }
        //4 : nested if statement
        // Adding new test variable
        String subject = "java";
        if (note > 10) {
            if (subject.equals("java")) {
                System.out.println("You are accepted");
            }
        }
        //5 : using ternary operator
        String Result = (note > 10) ? "you are accepted" : "you are not accepted";
        System.out.println(Result);
        // switch is used when we have a lot of conditionals test
        Scanner s = new Scanner(System.in);
       /* System.out.println("donnes moi une saison");
        String saison ;
        saison= s.next();
        switch (saison){
            case "ETE" :
                System.out.println("il fait chaud");
                break;
            case "automne":
                System.out.println("il fait peu froid");
                break;
            case "printemps":
                System.out.println("il fait beau");
                break;
            case "hiver":
                System.out.println("il fait froid");
                break;
            default:
                System.out.println("il y'a pas un saison avec ce terme");
        }*/

        // functions
        //1: Void methods , ( no return value)

        String message = "hello world!";
        showMessage(message);

// Methodes with return value


        int x = addition(4, 3);
        System.out.println(x);
        IntBinaryOperator add = (a, b) -> a + b;
        /*IntBinaryOperator is an interface that take
        two parameters type int and return an int result
        PS: she declare one abstract method "applyAsInt

         */
        int result = add.applyAsInt(4, 5);
        System.out.println(result);

        // we have overriding and overloading methods
        // abstract method
        // final méthod that we can't overriding or overloading them

        // EXERCIE -----------> Calculatrice , j'ai utilisé L'interface fonctionelle BiFunction pour définir
        // avec les expressions lambda des opérations mathématiques personalisées
        Calculator calculator = new Calculator();
        int num1 = 10;
        int num2 = 2;
        int res = calculator.add(num1, num2);
        System.out.println(res);
        int res2 = calculator.substract(num1, num2);
        System.out.println(res2);
        int res3 = calculator.multiply(num1, num2);
        System.out.println(res3);
        double res4 = calculator.divide(num1, num2);
        System.out.println(res4);
        // on crée une instance customOperation de l'interface fonctionnelle qui prend la logique définie
        // dans l'expression lambda
        // A noter qu'on peut instancier une interface fonctionnelle contrairement les interfaces normaux
        BiFunction<Integer, Integer, Integer> customOperation = (n, n1) -> n * n + n1 * n1;
        BiFunction<Integer, Integer, Integer> customOperation1 = (n, n1) -> n * n - n1 * n1;
        // on applique via .apply la logique définie via l'expression lambda et on l'affecte dans une variable
        int result5 = customOperation.apply(num1, num2);
        int result6 = customOperation1.apply(num1, num2);
        System.out.println(result5);
        System.out.println(result6);
// il faut faire un programme
        int xx = 5;
//calculatrorEX2 c=new calculatrorEX2();
        /*int numberr =5;
        IntToDoubleFunction<Integer> test= number -> number;
        double xxxx= test.apply(numberr);
        System.out.println(xxxx);*/
        // Exercice calculatrice
        /*System.out.println("donne moi le premier num");
        int numberone=s.nextInt();
        System.out.println("donne moi le deuxieme num");
        int numbertwo=s.nextInt();*/
        //System.out.println("choisir une opération , 1+,  2*,  3-,  4/,  5carré,  6racine carré, 7+*/,  8carré*carré");
       /* int choix = s.nextInt();
        switch (choix){
            case 1 :
                BinaryOperator <Integer,Integer,Integer> operation= (numtest1,numtest2) -> numtest1+numtest2;
                int resultat=operation.execute(numberone,numbertwo);
                System.out.println(resultat);
                break;
            case 2 :
                BinaryOperator<Integer,Integer,Integer> operation1=(numtest1,numtest2) -> numtest1*numtest2;
                int resultat1=operation1.execute(numberone,numbertwo);
                System.out.println(resultat1);
                break;
            case 3 :
                BinaryOperator<Integer,Integer,Integer> operation2=(numtest1,numtest2) -> numtest1-numtest2;
                int resultat2=operation2.execute(numberone,numbertwo);
                System.out.println(resultat2);
                break;
            case 4 :
                BiFunction<Integer,Integer,Double> operation3 = (numtest1,numtest2)-> (double) (numtest1/numtest2);
                double resultat3=operation3.apply(numberone,numbertwo);
                System.out.println(resultat3);
                break;
            case 5:
                UnaryOperator<Double> operation4= numtest1 -> Math.pow((double) numtest1,2);
                double resultat4=operation4.execute((double)numberone);
                System.out.println(resultat4);
                break;
            case 6:
                UnaryOperator<Double> operation5= numtest1 -> Math.sqrt((double) numtest1);
                double resultat5=operation5.execute((double)numberone);
                System.out.println(resultat5);
                break;
            case 7:
                BiFunction<Integer,Integer,Double> operation6= (numtest1,numtest2) -> (double)numtest1+numtest2*numtest1/numtest2;
                double resultat6= operation6.apply(numberone,numbertwo);
                System.out.println(resultat6);
                break;
            case 8:
                BinaryOperator<Double,Double,Double> operation7= (numtest1,numtest2) -> (double)(Math.pow(numtest1,2)*Math.pow(numtest2,2));
                double resultat7= operation7.execute((double)numberone,(double)numbertwo);
                System.out.println(resultat7);
                break;
            default:
                System.out.println("saisie invalide");
        }*/
        //FIN DE L'EXERCIE

        //ARRAYS : les tableaux uni et multidimentionelles

/*
Advantages
Code Optimization: It makes the code optimized, we can retrieve or sort the data efficiently.
Random access: We can get any data located at an index position.
Disadvantages
Size Limit: We can store only the fixed size of elements in the array. It doesn't grow its size at runtime.
To solve this problem, collection framework is used in Java which grows automatically.

 */
        // les tableau unidimentionelles
        int[] a = new int[5];// declaration et instantiation  du tableau
        a[0] = 5;
        a[1] = 3;
        a[2] = 4;
        a[3] = 5;
        a[4] = 6;
        for (int i : a) {
            System.out.println(i);
        }
        // ou bien
        for (int j = 0; j < a.length; j++) {
            System.out.println(a[j]);
        }

        int tab[] = {3, 4, 4, 6}; // declaration,instatiation et initialisation du tableau

        for (int i : tab) {
            System.out.println(i);
        }
        int ress = calculatrorEX2.sommetableau(tab);
        System.out.println(ress);
        // on peut passer aussi un anonymous array à une méthode
        int resss = calculatrorEX2.sommetableau(new int[]{2, 3, 5, 100});
        System.out.println(resss);


// si on a par exemple un array de taille 5 , et on veut parcourir la case 6
        // ArrayIndexOutOfBoundsException va etre declanché

        // les tableau multidimentionelles
        int[][] tab1 = new int[2][2];// declaration and instantiation
        int[][] tab2 = {{4, 4}, {4, 4}};// declaration and instantiation and initialisation
        for (int i = 0; i < tab2.length; i++) {
            for (int j = 0; j < tab2.length; j++) {
                System.out.println(tab2[i][j]);
            }
        }


        //Exemple pour un tableau irrégulier
        int[][] tabirr = new int[3][];
        tabirr[0] = new int[2];
        tabirr[1] = new int[1];
        tabirr[2] = new int[3];
        // remplissage du tableau
        for (int i = 0; i < tabirr.length; i++) {
            for (int j = 0; j < tabirr[i].length; j++) {
                tabirr[i][j] = 1;
            }
        }
        // affichage du matrice avec boucle for each
        for (int[] ligne : tabirr) {
            for (int contenu : ligne) {
                System.out.print(contenu);
            }
            System.out.println();
        }
// savoir le class name d'un array

        Class c = tab.getClass();
        System.out.println(c);
        String namec = c.getName();
        System.out.println(namec);

        // pour copier d'un array à un autre voici le syntaxe
        // Object src, int srcPos,Object dest, int destPos, int length
        //System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        // fait la somme et la multiplication de deux matrice comme exercice d'application
        int[][] mat1 = new int[3][3];
        int[][] mat2 = new int[3][3];
        int[][] mat3 = new int[3][3];
        int count = 1;
        for (int[] ligne : mat1) {
            for (int i = 0; i < ligne.length; i++) {
                ligne[i] = 2;
            }
        }
        for (int[] ligne : mat2) {
            for (int i = 0; i < ligne.length; i++) {
                ligne[i] = 2;
            }
        }

        BinaryOperator<Integer, Integer, Integer> operation1 = (numtest1, numtest2) -> numtest1 * numtest2;

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                mat3[i][j] = operation1.execute(mat1[i][j], mat2[i][j]);
            }
        }

        for (int[] ligne : mat1) {

            for (int element : ligne) {
                System.out.print(element);
            }

        }
        System.out.println();
        for (int[] ligne : mat2) {

            for (int element : ligne) {
                System.out.print(element);
            }

        }
        System.out.println();
        for (int[] ligne : mat3) {

            for (int element : ligne) {
                System.out.print(element);
            }

        }




      /*  ArrayList liste = new ArrayList<>();
        liste.add("Premier élément");
        liste.add(8);
        liste.add("Deuxième élément");
        for (Object str : liste){
            System.out.println(str);
        }
        AbstractSet<Integer> abs_set
                = new TreeSet<Integer>();


        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Ajouter des clés à la carte
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
       ConcurrentHashMap.KeySetView<String, Integer> keys = map.keySet();
        for (String key : keys) {
            System.out.println("Clé : " + key);
        }
        AbstractList<String> list = new ArrayList<String>();
        Map<String,String> test=new HashMap<String,String>();
        AbstractSequentialList<String> absSequential = new LinkedList<>();
*/


        AbstractSet<Integer> abs_set
                = new TreeSet<Integer>();
        Vector<String> vector = new Vector<String>();


        ArrayList liste = new ArrayList<>();


        LinkedList<String> absSequential = new LinkedList<>();
        var employees = new ArrayList<>();
        employees.add(3);
        employees.add("a");
        employees.forEach(element -> System.out.println(element));
        CopyOnWriteArrayList<String> ss = new CopyOnWriteArrayList<>();

        //Des exercices d'application pour Array List :
        /*
       1 Ajout d'éléments :

        Exercice : Créez une liste vide, puis ajoutez les éléments "Rouge", "Vert" et "Bleu"
         à la fin de la liste en utilisant la méthode add(E e).

        ArrayList<String> colors= new ArrayList<String>();
        colors.add("Rouge");
        colors.add("Vert");
        colors.add("Bleu");

        colors.add(1,"blanc");
        colors.forEach(color-> System.out.println(color));*/
        /*
        2 Lecture d'éléments :

Exercice : Créez une liste contenant les éléments "Pomme", "Banane", "Orange" et "Pomme",
 puis utilisez la méthode indexOf(Object o) pour trouver l'indice de la première occurrence de "Pomme".

        var fruits= new ArrayList<String>();
        fruits.add("Pomme");
        fruits.add("Banane");
        fruits.add("Orange");
        fruits.add("Pomme");
        System.out.println(fruits.indexOf("Pomme"));
        System.out.println(fruits.get(1));
*/
        /*
       3 Suppression d'éléments :

Exercice : Créez une liste contenant les éléments "Chien", "Chat", "Chien", "Lapin",
puis utilisez la méthode remove(Object o) pour supprimer la première occurrence de "Chien".

        ArrayList <String> pets= new ArrayList<String>();
        // ajouter toujours au début de liste
        pets.add(0,"Chien");
        pets.add(0,"Chat");
        pets.add(0,"Chien");
        pets.add(0,"Lapin");
        for (String element:pets){
            System.out.println(element);
        }
        System.out.println("--------------");
        //removeIf utilisée avec un filter , dans cet exemple j'ai supprimé les chiens
        pets.removeIf(element -> element.equals("Chien"));
        pets.forEach(element -> System.out.println(element));
        // on peut supprimer soit un objet soit en utilisant l'index de cet objet
        pets.remove("Chat");
        pets.forEach(element -> System.out.println(element));*/

        /*
        4 Taille et capacité :

Exercice : Créez une liste vide, puis utilisez les méthodes size() et isEmpty()
 pour vérifier sa taille et si elle est vide.
        ArrayList <String> pets= new ArrayList<String>();
        System.out.println(pets.size());
        System.out.println(pets.isEmpty());*/

        /*
        5 Vérification d'existence :

Exercice : Créez une liste contenant les éléments "A", "B", "C" et "D", puis utilisez la méthode
contains(Object o) pour vérifier si "B" est présent dans la liste.

        var caracteres= new ArrayList<Character>();
        caracteres.add('A');
        caracteres.add('B');
        caracteres.add('C');
        caracteres.add('D');
        System.out.println(caracteres.contains('B'));*/

        /*
        6 Modification d'éléments :

Exercice : Créez une liste contenant les éléments "Un", "Deux", "Trois" et "Quatre", puis utilisez la méthode set(int index, E element)
pour remplacer "Trois" par "Trois et demi"

        List nombres= new ArrayList<String>();
        nombres.add("Un");
        nombres.add("Deux");
        nombres.add("Trois");
        nombres.add("Quatre");
        nombres.forEach(element -> System.out.println(element));
        nombres.set(2,"Trois et demi");
        nombres.forEach(element -> System.out.println(element));*/

        /*
        7 Itération :

Exercice : Créez une liste contenant les éléments "Lundi", "Mardi", "Mercredi" et "Jeudi",
puis utilisez un itérateur pour parcourir la liste et afficher chaque jour.

        var jours= new ArrayList<String>();
        jours.add("Lundi");
        jours.add("Mardi");
        jours.add("Mercredi");
        jours.add("Jeud");
        Iterator<String> iterator= jours.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
        /*
        8 Sous-listes :

Exercice : Créez une liste contenant les éléments "1", "2", "3", "4", "5", puis utilisez la
méthode subList(int fromIndex, int toIndex) pour obtenir
une sous-liste des éléments de l'indice 2 (inclus) à l'indice 4 (exclus) et affichez-la.

        var nombres = new ArrayList<Integer>();
        nombres.add(1);
        nombres.add(2);
        nombres.add(3);
        nombres.add(4);
        nombres.add(5);
        var nbr=nombres.subList(2,4);
        nbr.forEach(e -> System.out.println(e));/*

         */
        /*
        9 Conversion vers un tableau :

Exercice : Créez une liste contenant les éléments "A", "B", "C", puis utilisez la méthode toArray() pour
convertir la liste en un tableau et affichez le contenu du tableau.

        List<Character> caracteres= new ArrayList<>();
        caracteres.add('A');
        caracteres.add('B');
        caracteres.add('C');
        System.out.println(caracteres);
        Character[] car= new Character[3];
         caracteres.toArray(car);
        System.out.println(Arrays.toString(car));*/

/*
Exercice : Créez deux listes contenant les mêmes éléments (par exemple, "Rouge", "Vert", "Bleu") et utilisez la méthode
equals(Object o) pour comparer les deux listes. Affichez le résultat.


        List<Character> caracteres= new ArrayList<>();
        caracteres.add('A');
        caracteres.add('B');
        caracteres.add('C');
        List<Character> caracteres1= new ArrayList<>();
        caracteres1.add('A');
        caracteres1.add('B');
        caracteres1.add('C');
        System.out.println(caracteres.equals(caracteres1));
        int hashcode1= caracteres.hashCode();
        int hashcode2= caracteres1.hashCode();
        System.out.println(hashcode1);
        System.out.println(hashcode2);*/
        /*
        Exercice : Créez une liste contenant les éléments "1" et "2", puis utilisez la méthode
        addAll(Collection<? extends E> c)
        pour ajouter tous les éléments d'une autre liste contenant "3" et "4".

        List<Character> caracteres1= new ArrayList<>();
        List<Character> caracteres2= new ArrayList<>();
        caracteres1.add('1');
        caracteres1.add('2');
        caracteres2.add('3');
        caracteres2.add('4');
        caracteres1.addAll(caracteres2);
        caracteres1.forEach(e-> System.out.println(e));
        ListIterator<Character> iterator= caracteres1.listIterator(1);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
   */
        /*
        Exercice : Créez une liste contenant les éléments "A", "B", "C", "D" et "E", puis utilisez
        la méthode removeAll(Collection<?> c) pour supprimer tous les éléments de la liste qui
        sont également présents dans une
        autre liste contenant "B", "D" et "F".


        List<Character> caracteres1= new ArrayList<>();
        caracteres1.add('A');
        caracteres1.add('B');
        caracteres1.add('C');
        caracteres1.add('D');
        caracteres1.add('E');
        List<Character> caracteres2= new ArrayList<>();
        caracteres2.add('B');
        caracteres2.add('D');
        caracteres2.add('F');
        caracteres1.removeAll(caracteres2);
        caracteres1.forEach(e-> System.out.println(e));

        List<Character> caracteres1= new ArrayList<>();
        caracteres1.add('A');
        caracteres1.add('B');
        caracteres1.add('C');
        caracteres1.add('D');
        caracteres1.add('E');
        List<Character> caracteres2= new ArrayList<>();
        caracteres2.add('B');
        caracteres2.add('D');
        caracteres2.add('F');
        caracteres1.retainAll(caracteres2);
        caracteres1.forEach(e-> System.out.println(e));

        ArrayList<Character> caracteres1= new ArrayList<>();
        caracteres1.add('A');
        caracteres1.add('B');
        caracteres1.add('C');
        caracteres1.add('D');
        caracteres1.add('E');
        List<Character> caracteres2= new ArrayList<>();
        caracteres2.add('B');
        caracteres2.add('D');

        System.out.println(caracteres1.containsAll(caracteres2));
        System.out.println(caracteres1.size());
        caracteres1.trimToSize();
        System.out.println(caracteres1.size());*/


        //Des exercices d'application sur LinkedList

        /*
        addFirst(E e) : Créez une LinkedList vide, puis ajoutez les éléments "A", "B", et "C" au début de la liste en utilisant
         addFirst. Ensuite, affichez la liste pour vérifier le résultat.

        LinkedList<String> fruits= new LinkedList<>();
        fruits.addFirst("Pomme");
        fruits.addFirst("Citron");
        fruits.addFirst("Fraise");
        fruits.addFirst("Cerise");
        ListIterator<String> iterator= fruits.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        } */
        /*
        addLast(E e) : Créez une LinkedList vide, puis ajoutez les éléments "X", "Y", et "Z" à la fin de la liste
         en utilisant addLast. Ensuite, affichez la liste pour vérifier le résultat.

        LinkedList<Integer> numbers= new LinkedList<>();
        numbers.addLast(1);
        numbers.addLast(2);
        numbers.addLast(3);
        numbers.addLast(4);
        numbers.forEach(e -> System.out.println(e));

        numbers.add(2,199);
        numbers.forEach(e -> System.out.println(e));

        System.out.println(numbers.getFirst());
        System.out.println(numbers.getLast());
        numbers.removeFirst();
        System.out.println(numbers);
        numbers.removeLast();
        System.out.println(numbers);*/
/*
        offer(E e) : Créez une LinkedList vide, puis ajoutez les éléments "Red", "Green", et "Blue"
        à la fin de la liste en utilisant offer. Ensuite, affichez la liste pour vérifier le résultat.

        LinkedList<String> colors = new LinkedList<>();
        colors.offer("Red");
        colors.offer("Green");
        colors.offer("Blue");
        colors.offerFirst("Grey");
        colors.offerLast("white");
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("----------------");
        System.out.println(colors.peek());
        System.out.println("----------------");
        System.out.println(colors.poll());
        System.out.println("----------------");*/

        // Des exercices d'application sur Vector
        /*
        addElement(Object obj) : Créez un Vector, ajoutez quelques éléments à
        l'aide de la méthode addElement, puis affichez le contenu du Vector.

        Vector<String> colors=new Vector<>();
        colors.addElement("White");
        colors.addElement("Bleu");
        colors.addElement("Green");
        colors.addElement("Red");
        colors.forEach(e -> System.out.println(e));
        System.out.println(colors.capacity());
        String[] copy= new String[4];
        colors.copyInto(copy);
        for (String e:copy){
            System.out.println(e);
        }
        System.out.println("----------------");
        // affichage d'un array avec lambda expression!
        Arrays.stream(copy).forEach(e -> System.out.println(e));
        // recuperer un element avec un index défini
        System.out.println(colors.elementAt(0));
        System.out.println("----------------");
        System.out.println("----------------");
        // recuperer le premier element
        System.out.println(colors.firstElement());
        // recuperer le dernier element
        System.out.println(colors.lastElement());
        // inserer un element dans le vector dans un index bien défini
        colors.insertElementAt("yellow",2);
        colors.forEach(e -> System.out.println(e));
        System.out.println("----------------");
        System.out.println("----------------");
        // supprimer un élement si l'expression lambda retourne vrai
        colors.removeIf(e->e.equals("White"));
        colors.forEach(e -> System.out.println(e));
        // supprimer un objet
        colors.remove("Red");
        colors.forEach(e -> System.out.println(e));
        //supprimer un objet en donnant son index
        colors.removeElementAt(2);
        // modifier un objet dans le Vector
        colors.set(1,"Yellow");
        colors.forEach(e -> System.out.println(e));
        System.out.println(colors.size());
        // réduire la capacité interne du Vector pour qu'elle corresponde exactement au nombre d'éléments
      colors.trimToSize();

        System.out.println(colors.size());
        // supprimer tous les elements
        colors.removeAllElements();
        System.out.println("----------------");
        System.out.println("----------------");
        System.out.println(colors.isEmpty());
        colors.forEach(e-> System.out.println(e));*/

        // Des exercices d'applications sur CopyOnWriteArrayList
        /*
        addAllAbsent(Collection<? extends E> c) : Créez une CopyOnWriteArrayList et une autre collection
        (par exemple, une ArrayList). Ajoutez quelques éléments à la liste de départ. Ensuite, utilisez
         la méthode addAllAbsent pour ajouter tous les éléments de la deuxième collection à la liste,
         en vous assurant que seuls les éléments qui n'existent pas déjà dans la liste sont ajoutés.

        CopyOnWriteArrayList<String> colors= new CopyOnWriteArrayList<>();
        colors.add("White");
        colors.add("Yello");
        colors.add("Green");
        colors.add("Bleu");
        List<String> colors1= new ArrayList<>();
        colors1.add("White");
        colors1.add("Yello");
        colors1.add("Green");
        colors1.add("Bleu");
        colors1.add("Red");
        colors.addAllAbsent(colors1);
        colors.forEach(e -> System.out.println(e)); */
        /*
        addIfAbsent(E e) : Créez une CopyOnWriteArrayList et ajoutez quelques éléments. Ensuite, utilisez
        la méthode addIfAbsent pour tenter d'ajouter un élément à la liste. Vérifiez si la méthode
         renvoie true si l'élément a été ajouté (car il n'existait pas déjà) ou false s'il existe déjà.

        CopyOnWriteArrayList<String> colors= new CopyOnWriteArrayList<>();
        colors.add("White");
        colors.add("Yello");
        colors.add("Green");
        colors.add("Bleu");
        colors.forEach(e -> System.out.println(e));
        System.out.println(colors.addIfAbsent("Red"));
        colors.forEach(e -> System.out.println(e));*/
        /*
        getSnapshot() : Créez une CopyOnWriteArrayList et ajoutez quelques éléments. Utilisez la
        méthode getSnapshot pour obtenir un instantané de la liste sous forme d'un tableau.
        Assurez-vous que les modifications ultérieures de la liste ne sont pas reflétées dans cet instantané.


        CopyOnWriteArrayList<String> colors= new CopyOnWriteArrayList<>();
        colors.add("White");
        colors.add("Yello");
        colors.add("Green");
        colors.add("Bleu");
        String[] tableau= new String[5];*/

        /*
        iterator() et listIterator() : Créez une CopyOnWriteArrayList et ajoutez quelques éléments. Obtenez un itérateur
         en utilisant iterator() ou listIterator(), puis parcourez la liste en lecture.
         En parallèle, essayez d'ajouter ou de supprimer des éléments de la liste.
         Vérifiez que l'itérateur ne voit pas les modifications concurrentes.

        CopyOnWriteArrayList<String> colors= new CopyOnWriteArrayList<>();
        colors.add("White");
        colors.add("Yello");
        colors.add("Green");
        colors.add("Bleu");
        Iterator<String> iterator= colors.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        colors.add("Red");
        }*/
        /*
        replaceAll(UnaryOperator<E> operator) : Créez une CopyOnWriteArrayList et
        ajoutez quelques éléments. Utilisez la méthode replaceAll pour appliquer une opération de
        remplacement à tous les éléments de la liste. Par exemple, vous pourriez multiplier tous
        les éléments par deux.

CopyOnWriteArrayList<Integer> numbers= new CopyOnWriteArrayList<>();
numbers.addIfAbsent(4);
numbers.addIfAbsent(2);
numbers.addIfAbsent(3);
numbers.addIfAbsent(5);
// interface fonctionelle de type UnaryOperator qui prend un parametre et renvoi un resultat
UnaryOperator<Integer>op= num -> num*2;
// pour chaque element de la liste :: execute la fonction anonyme dans op
numbers.replaceAll(op::execute);
numbers.forEach(e-> System.out.println(e));*/
        /*
        removeIf(Predicate<? super E> filter) : Créez une CopyOnWriteArrayList et ajoutez quelques éléments.
         Utilisez la méthode removeIf pour supprimer sélectivement des éléments de la liste en fonction d'un
         prédicat. Par exemple, supprimez tous les éléments pairs.

        CopyOnWriteArrayList<Integer> numbers= new CopyOnWriteArrayList<>();
        numbers.addIfAbsent(4);
        numbers.addIfAbsent(2);
        numbers.addIfAbsent(3);
        numbers.addIfAbsent(5);
        numbers.removeIf(e-> e%2==0);
        numbers.forEach(e -> System.out.println(e)); */
        /*
        set(int index, E element) : Créez une CopyOnWriteArrayList et ajoutez quelques éléments.
        Utilisez la méthode set pour remplacer un élément à un indice spécifié par un nouvel élément.

        CopyOnWriteArrayList<Integer> numbers= new CopyOnWriteArrayList<>();
        numbers.addIfAbsent(4);
        numbers.addIfAbsent(2);
        numbers.addIfAbsent(3);
        numbers.addIfAbsent(5);
        numbers.set(0,8);
        numbers.forEach(e -> System.out.println(e));*/
        /*
        toArray(Class<T> type) : Créez une CopyOnWriteArrayList avec des éléments de différents types.
        Utilisez la méthode toArray en spécifiant
        le type souhaité pour le tableau résultant. Assurez-vous que le tableau renvoyé est du type spécifié.

         */
        CopyOnWriteArrayList<Object> numbers= new CopyOnWriteArrayList<>();
        numbers.addIfAbsent(4);
        numbers.addIfAbsent(2);
        numbers.addIfAbsent("Mohamed");
        numbers.addIfAbsent("Fathi");
        numbers.addIfAbsent(3.14);
        String[] stringArray = numbers.toArray(new String[0]);
        for (String item : stringArray) {
            System.out.println(item);
        }
    }




    // static method is for the class , we can appel them with the name of the class
    public final static void showMessage(String message) {

        System.out.println(message);
    }

    public static int addition(int a ,int b){
        return a+b;
    }





}