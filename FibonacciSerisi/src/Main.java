import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberofdigits, number1=0,number2=1,total=0;


        System.out.print("Lütfen isteginiz eleman sayısını giriniz : ");
        numberofdigits = scan.nextInt();
        System.out.print(number1+" " + number2);
       for(int i=2; i<numberofdigits;i++){
           total=number1+number2;
           System.out.print(" "+total);
           number1=number2;
           number2=total;
       }

    }
}