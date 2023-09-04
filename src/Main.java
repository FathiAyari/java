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







    }

    // static method is for the class , we can appel them with the name of the class
    public final static void showMessage(String message) {

        System.out.println(message);
    }

    public static int addition(int a ,int b){
        return a+b;
    }





}