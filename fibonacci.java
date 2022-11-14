package Giris;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);

        System.out.print("Fibonacci sayısı kaç elemanlı olsun :");
        int n= inp.nextInt();
        int n1=0,n2=1;

        for (int i=0;i<=n;i++){
            System.out.println(n1+ " ");
            n2+= n1;
            n1=n2-n1;

        }
    }
}
