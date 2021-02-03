package part1.lessons11.task1;

import com.sun.source.tree.CaseTree;

import java.util.Scanner;

public class Main extends documents{


   public static void main(String[] args) {
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
             System.out.printf("Ваши данные- договор номер %d, описание -%s",b,c1);
             System.out.print("Записываю данные");


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
