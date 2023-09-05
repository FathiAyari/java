public class calculatrorEX2 {


}
// cette interface UnaryOperator<T> à pour role faire une opération sur un seul élement et retourne cette élement
interface UnaryOperator<T>{
T execute (T t);
}
// binaryOperator impose le retour est de meme type que les deux autres paramétres
interface BinaryOperator<T,U,V>{

    V execute (T t , U u);
}
interface IntToDoubleFunction<T>
{
    T apply (T t);

}/*
Ces interfaces font partie de l'API des fonctions Java Java.util.functions et sont largement utilisées dans la
programmation fonctionnelle en Java, en particulier lors de l'utilisation de flux (Streams)
pour effectuer des opérations sur des collections de données. Elles offrent une manière élégante
 de représenter des opérations sur deux arguments tout en profitant de la vérification des types et
 de la concision du code offertes par les lambdas en Java.
 */


