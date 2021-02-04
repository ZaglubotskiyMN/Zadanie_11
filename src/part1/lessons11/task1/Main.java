package part1.lessons11.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


   public static void main(String[] args) {
       //String[] doc =new String[2];
       documents[] doc=new documents[5];
       char a;
       int b,f;
       int i = 0;
       String c1,j1;
       System.out.print("Введите тип документа (a-Договор/b-Акт/q-Выход/s-Всего):");
       Scanner sc= new Scanner(System.in);
       do {
           a = sc.next().charAt(0);

           switch (a) {
               case 'a':
                   System.out.print("Введите номер договора :");
                   b = sc.nextInt();
                   System.out.print("Введите описание договора :");
                   c1 = sc.next();
                   System.out.printf("Ваши данные- договор номер %d, описание -%s \n", b, c1);
                   System.out.print("Записываю данные \n");
                   doc[i]=new dogovor(b,"Договор",c1);
                   //doc[i] = (new dogovor(b, "Договор", c1)).toString();
                   System.out.print(doc[i].toString()+"\n");
                   i++;
                   System.out.print("Введите тип документа (a-Договор/b-Акт/q-Выход/s-Всего):");
                   break;
               case 'b':
                   System.out.print("Введите номер акта :");
                   f = sc.nextInt();
                   System.out.print("Введите описание акт :");
                   j1 = sc.next();
                   System.out.printf("Ваши данные- договор номер %d, описание -%s \n", f, j1);
                   System.out.print("Записываю данные \n");
                   doc[i]= new akt(f,"Акт",j1);
                   //doc[i] = (new akt(f, "Акт", j1)).toString();
                   System.out.print(doc[i]+"\n");
                   i++;
                   System.out.print("Введите тип документа (a-Договор/b-Акт/q-Выход/s-Всего):");
                   break;
               case 's':
                   for (int j = 0; j < i + 1; j++) {
                       //System.out.print(doc[j]);
                       System.out.print(Arrays.toString(doc));
                   }
                   System.out.printf("Всего введено документов %s \n: ", i);
                   System.out.print("Введите тип документа (a-Договор/b-Акт/q-Выход/s-Всего):");
                   break;
               case 'q':
                   System.out.print("Программа завершена");
                   sc.close();
                   break;


               default:
                   System.out.print("Вы выбрали не правильный вариант (испоьзуйте символы a, b, s или q) \n");
                   System.out.print("Введите тип документа (a-Договор/b-Акт/q-Выход/s-Всего):");
                   break;
           }
       } while (a!='q');

       }



    }

