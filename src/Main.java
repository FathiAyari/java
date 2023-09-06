import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntBinaryOperator;

public class Main {

    public static void main(String[] args) {
        // THIS BLOC IS DEDICATED FOR DATA TYPES AND VARIABLES
       // PRIMITIVE DATA TYPE
        int age= 24;
        System.out.println("my age is "+ age);
        float price= 24.5F;
        System.out.println(price);
        double price2=24.5;
        System.out.println(price2);
         //  PS : a double can represent much larger numbers than a float
        char letter='M'; // we need to put a single cote if we declare one letter
        System.out.println(letter);
        boolean valid= true;
        String output=(valid)?"its okay":"its not okay";
        System.out.println(output);
        long longNumber=123456789009876L;
        System.out.println(longNumber);
        // long is used to declare a long number
        short shortNumber=123;
        System.out.println(shortNumber);
        //short is used to declare a short number


        // REFERENCE DATA TYPE
        //These data types refer to objects in Java, including user-defined classes
        // and Java's built-in classes like String,Arrays,Set,Map,Classes...
        String name ="Mohamed";
        System.out.println("name");
        List<String> listName= new ArrayList<String>();
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
        if (note > 10){
            System.out.println("Accepted");}
        else {
            System.out.println("Not Accepted");
        }
        //3 : if else-if ... else ladder
        if (note > 10){
            System.out.println("Accepted");}
        else if (note >= 9 && note <10){
            System.out.println("you need to pass the control session");
        }else {
            System.out.println("refused");
        }
        //4 : nested if statement
        // Adding new test variable
        String subject="java";
        if (note>10){
            if (subject.equals("java")){
                System.out.println("You are accepted");
            }
        }
        //5 : using ternary operator
        String Result = (note>10)? "you are accepted":"you are not accepted";
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


    int x= addition(4,3);
        System.out.println(x);
        IntBinaryOperator add= (a,b) -> a+b;
        /*IntBinaryOperator is an interface that take
        two parameters type int and return an int result
        PS: she declare one abstract method "applyAsInt

         */
        int result=add.applyAsInt(4,5);
        System.out.println(result);

     // we have overriding and overloading methods
        // abstract method
       // final méthod that we can't overriding or overloading them

        // EXERCIE -----------> Calculatrice , j'ai utilisé L'interface fonctionelle BiFunction pour définir
        // avec les expressions lambda des opérations mathématiques personalisées
        Calculator calculator = new Calculator();
        int num1=10;
        int num2=2;
        int res= calculator.add(num1,num2);
        System.out.println(res);
        int res2 = calculator.substract(num1,num2);
        System.out.println(res2);
        int res3= calculator.multiply(num1 , num2);
        System.out.println(res3);
        double res4=calculator.divide(num1,num2);
        System.out.println(res4);
        // on crée une instance customOperation de l'interface fonctionnelle qui prend la logique définie
        // dans l'expression lambda
        // A noter qu'on peut instancier une interface fonctionnelle contrairement les interfaces normaux
        BiFunction<Integer,Integer,Integer> customOperation= (n,n1) -> n*n+n1*n1;
        BiFunction<Integer,Integer,Integer> customOperation1= (n,n1) -> n*n-n1*n1;
        // on applique via .apply la logique définie via l'expression lambda et on l'affecte dans une variable
        int result5=customOperation.apply(num1,num2);
        int result6=customOperation1.apply(num1,num2);
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
int[] a= new int [5];// declaration et instantiation  du tableau
        a[0]=5;
        a[1]=3;
        a[2]=4;
        a[3]=5;
        a[4]=6;
        for (int i:a){
            System.out.println(i);
        }
        // ou bien
        for (int j=0;j<a.length;j++){
            System.out.println(a[j]);
        }

        int tab[]= {3,4,4,6}; // declaration,instatiation et initialisation du tableau

        for (int i:tab){
            System.out.println(i);
        }
int ress= calculatrorEX2.sommetableau(tab);
        System.out.println(ress);
        // on peut passer aussi un anonymous array à une méthode
        int resss=calculatrorEX2.sommetableau(new int []{2,3,5,100});
        System.out.println(resss);


// si on a par exemple un array de taille 5 , et on veut parcourir la case 6
        // ArrayIndexOutOfBoundsException va etre declanché

        // les tableau multidimentionelles
        int [][]tab1= new int[2][2];// declaration and instantiation
        int [][] tab2 ={{4,4},{4,4}};// declaration and instantiation and initialisation
       for (int i=0;i<tab2.length;i++){
           for (int j=0;j< tab2.length;j++){
               System.out.println(tab2[i][j]);
           }
       }

       //Exemple pour un tableau irrégulier
        int [][]tabirr= new int[3][];
       tabirr[0]=new int [2];
       tabirr[1]= new int [1];
       tabirr[2]= new int [3];
       // remplissage du tableau
        for (int i=0;i<tabirr.length;i++){
            for (int j=0;j< tabirr[i].length;j++){
                tabirr[i][j]=1;
            }
        }
        // affichage du matrice avec boucle for each
        for (int[] ligne : tabirr){
            for (int contenu:ligne){
                System.out.print(contenu);
            }
            System.out.println();
        }
// savoir le class name d'un array

        Class c= tab.getClass();
        System.out.println(c);
        String namec=c.getName();
        System.out.println(namec);

        // pour copier d'un array à un autre voici le syntaxe
        // Object src, int srcPos,Object dest, int destPos, int length
        //System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        // fait la somme et la multiplication de deux matrice comme exercice d'application

















    }

    // static method is for the class , we can appel them with the name of the class
    public final static void showMessage(String message) {

        System.out.println(message);
    }

    public static int addition(int a ,int b){
        return a+b;
    }





}