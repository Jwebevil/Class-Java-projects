import java.util.Scanner;
public class Numbers { //begin class
    public static void main(String[] args){

        Scanner a = new Scanner(System.in);

               int one =  ;
        int two = 23;

 //Use methods to pass integers
        Sum(one,two);
        Difference(one,two);
        Product(one,two);
        System.out.println("The product is: " + Product(one,two) );

}//end main

    //First method display one integer
    public static void Sum(int number1, int number2){
        System.out.println("The sum of the numbers is: ");
        System.out.println(number1 + number2);

    }
    //Second method displays two integers multiplied by two
    public static void Difference(int number1, int number2){

        System.out.println("The difference between numbers is ");
        System.out.println(number1 - number2);
    }
    public static int Product(int number1, int number2){
        int product = number1 * number2;
        return product;
    }


}//end class