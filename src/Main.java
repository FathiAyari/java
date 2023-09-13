import java.time.Year;

public class Main {
    /************************************ Functions ****************************************/

    void myFirstMethod(int x ){
        System.out.println("here is the value of X"+x);
    }
    public int myAge(long dateOfBirth){
        return (int) (Year.now().getValue()-dateOfBirth);
    }
// this part belongs to exceptions bloc

    public static  void buy(double balance,double price) throws NoMoneyException {
        // you can throw multiple exceptions NoMoneyException,...
        if(balance-price<0){
            throw new NoMoneyException();
        }else
        System.out.println("the new balance  is : "+(balance-price));
    }

    public static void main(String[] args)  {

    /************************************ Data Types ****************************************/
    //Primitive data type :
    // Bytes :  8-bit integer from -128 to 127
     byte myByteVariable=2;
     // short: 16-bit integer from -32,768 to 32,767
     short myShortVariable=5;
     // int: 32-bit integer from -2147483648 to 2147483647
     int myIntVariable =5;
     long myLongVariable=30;
     // you have to use the f after Initializing the variable
     //float  is a 32-bit floating-point data type
     float myFloatVariable=5.7f;
     //double is a 64-bit floating-point data type
     double myDoubleVariable=3;
     char myCharVariable='c';

     /************************************ Reference Data Types ****************************************/
     // Classes
     class  myFirstClass{}
     // Interfaces()
     //  interface myFirstInterface{}
      // Enums
      // enum myFirstEnum{

     String myStringVariable="hello";
     // arrays
     int [] codes=new int [5];

     /************************************ Conditionals ****************************************/
        // If else  statements
        if (codes.length!=0){}else if(codes.length==3){}else {}
        // switch statement
        switch(myCharVariable){
            case 'A':
                System.out.println("It A");
                break;
            case 'B' :
                System.out.println("It's B");break;
            default:
                System.out.println("None");
        }
        // Ternary Operator
        System.out.println(myCharVariable=='A'?"It's A here ":"It's not A");


    /************************************ Loops ****************************************/
    // For loop
        for (int i = 0; i < 5; i++) {
            // Code to be executed repeatedly
        }
        // while loop
        int i = 0;
        while (i < 5) {
            // Code to be executed repeatedly
            i++;
        }

        // do while loop

        int j = 0;
        do {
            // Code to be executed repeatedly
            j++;
        } while (j < 5);

        // for each loop
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            // Code to be executed for each element in the array
        }
        // Break and Continue Statements
        for (int k = 0; k < 10; k++) {
            if (k == 3) {
                break; // Exit the loop when i equals 3
            }
            if (k == 5) {
                continue; // Skip the iteration when i equals 5
            }
            // Code to be executed
        }
        /************************************ Exceptions handling ****************************************/
        int[] values={1,2,3,4};
        try {
           // System.out.println(values[6]);
           // System.out.println(values.length/0);
        }catch (ArrayIndexOutOfBoundsException|ArithmeticException e){

        e.printStackTrace();
        }finally {
            System.out.println("Finally is used to Ensure that resources like files, database connections, or network connections are properly closed or released.");
        }
        // Custom exception


        try{
            buy(100,400);
        }catch (Exception e){
            e.printStackTrace();
        }
    }











}