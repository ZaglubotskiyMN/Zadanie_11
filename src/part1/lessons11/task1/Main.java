package part1.lessons11.task1;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
       System.out.print("Введите тип документа(акт или договор):");
       Scanner sc= new Scanner(System.in);
       String a = sc.nextLine();
       System.out.printf("Вы ввели : %s ",a);
       System.out.println();
       System.out.print("Введите  номер документа:");
       int b= sc.nextInt();
       System.out.printf("Вы ввели : %d, тип документа %s ",b,a);
       System.out.println();
       System.out.print("Введите описание:");
       String c = sc.nextLine();
       System.out.println();
       System.out.printf("Вы ввели : %s, тип документа %s ",c,a);




    }
}
