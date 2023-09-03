import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

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




    }











}