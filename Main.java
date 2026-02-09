import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner input= new Scanner(System.in);


    System.out.println("First Number:  ");
    int sayi1= input.nextInt();
    System.out.println("Second Number:  ");
    int sayi2= input.nextInt();

    System.out.println("Which mathamatical operation would you like to perform?");

    char operation =input.next().charAt(0); 
    switch(operation) {
        case '+' :
            System.out.println("result= " + (sayi1+sayi2 ));

        break;
        case '-':
            System.out.println("result= " + (sayi1-sayi2 ));

        break;
        case '*':
            System.out.println("result= " + (sayi1*sayi2 ));

        break;
        case '/':
            System.out.println("result= " + (sayi1/sayi2 ));

        break;
    }

return;



    } 
     

}
