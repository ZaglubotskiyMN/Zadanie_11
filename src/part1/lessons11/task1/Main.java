package part1.lessons11.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Main extends documents{


   public static void main(String[] args) {
       String[] doc =new String[10];
       char a;
       int b;
       String c1;
       int f;
       String j1;
       System.out.print("Введите тип документа (a-Договор/b-Акт):");
       Scanner sc= new Scanner(System.in);
       a= sc.next().charAt(0);
       switch (a){
          case 'a':
             System.out.print("Введите номер договора :");
             b=sc.nextInt();
             System.out.print("Введите описание договора :");
             c1=sc.next();
             System.out.printf("Ваши данные- договор номер %d, описание -%s \n",b,c1);
             System.out.print("Записываю данные \n");
             doc[1]= String.valueOf(new dogovor(b,"Договор",c1));
             System.out.print(Arrays.toString(doc));
             break;

          case 'b':
             System.out.print("Введите номер акта :");
             f=sc.nextInt();
             System.out.print("Введите описание договора :");
             j1=sc.next();
             System.out.printf("Ваши данные- договор номер %d, описание -%s",f,j1);
             System.out.print("Записываю данные");
             break;
          default:
             System.out.print("Programm finished");
             sc.close();
       }



    }
}
