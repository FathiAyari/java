public class Calculator {
    public int add(int a , int b){
        return a+b;
    }
    public int substract(int a , int b){
        return a-b;
    }
    public int multiply(int a , int b){
        return a*b;
    }
    public double divide(int a , int b ){
        return (b!=0)? (double)a/b:  Double.NaN;
    }




}
// c'est une interface fonctionnelle qui accepte 3 parametres T: parametre1,U:parametre2,V:le resultat de la
// methode apply
interface BiFunction<T, U, V> {
    V apply(T t, U u);
    // apply est une méthode fonctionnelle de la classe fonctionnelle BiFunction
    // qui prends deux paramétres générique T et U et renvoi un résultat V
}

