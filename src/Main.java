import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        System.out.println("password");
        int b = sc.nextInt();
        System.out.println("one more time");
        int a = sc.nextInt();
        while (b == a) {
            System.out.println("true");

        }
        if (b != a) {
            System.out.println("false");
        }

    }
}*/

    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int countre = 0;
        while(a>0){
                a/=10;
                countre++;
                }
                if(a==0){
                System.out.println(countre+" значный");
                }

                }
                }
       /*int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array.length; i++) {
            System.out.print((double) array[i] / 2+"|");
        }
    }
}*/


       /* int a=5;
        int b = 4;
        sum(a,b);
        //System.out.println(answer);
    }

    public static int sum(int a, int b){
        return (a+b);
}
      /*  Scanner sc = new Scanner(System.in);
        System.out.println("1)tomato=10som" + "\n" + "2)potato=11som" + "\n" + "3)apple=5som" + "\n" + "4)salt=2som" + "\n" + "5)sugar=5som");
        int a = sc.nextInt();
        switch (a) {
            case 5:
                System.out.println("сколько кг?");
                a = sc.nextInt();
                sugar(a);
                break;
            case 4:
                System.out.println("сколько кг?");
                a = sc.nextInt();
                salt(a);
                break;
            case 3:
                System.out.println("сколько кг?");
                a = sc.nextInt();
                apple(a);
                break;
            case 2:
                System.out.println("сколько кг?");
                a = sc.nextInt();
                potato(a);
                break;
            case 1:
                System.out.println("сколько кг?");
                a = sc.nextInt();
                tomato(a);
                break;

        }

    }

    public static void tomato(int b) {
        int p = 10;
        int sum = p * b;
        System.out.println("tomato " + sum + " som");
    }
    public static void potato(int b) {
        int p = 11;
        int sum = p * b;
        System.out.println("potato  " + sum + " som");
    }

    public static void apple(int b) {
        int p = 5;
        int sum = p * b;
        System.out.println("apple " + sum + " som");
    }

    public static void salt(int b) {
        int p = 2;
        int sum = p * b;
        System.out.println("salt " + sum + " som");
    }

    public static void sugar(int b) {
        int p = 5;
        int sum = p * b;
        System.out.println("sugar " + sum + " som");
    }
    }
        /*Scanner sc = new Scanner(System.in);
        System.out.println("1)tomato=10som" + "\n" + "2)potato=11som" + "\n" + "3)apple=5som" + "\n" + "4)salt=2som" + "\n" + "5)sugar=5som");
        int a = sc.nextInt();
        switch (a) {
            case 5:
                System.out.println("сколько кг?");
                a = sc.nextInt();
                sugar(a);
                break;
            case 4:
                System.out.println("сколько кг?");
                a = sc.nextInt();
                salt(a);
                break;
            case 3:
                System.out.println("сколько кг?");
                a = sc.nextInt();
                apple(a);
                break;
            case 2:
                System.out.println("сколько кг?");
                a = sc.nextInt();
                potato(a);
                break;
            case 1:
                System.out.println("сколько кг?");
                a = sc.nextInt();
                tomato(a);
                break;

        }

    }

    public static void tomato(int b) {
        int p = 10;
        int sum = p * b;
        System.out.println("tomato " + sum + " som");


    }

    public static void potato(int b) {
        int p = 11;
        int sum = p * b;
        System.out.println("potato  " + sum + " som");
    }

    public static void apple(int b) {
        int p = 5;
        int sum = p * b;
        System.out.println("apple " + sum + " som");
    }

    public static void salt(int b) {
        int p = 2;
        int sum = p * b;
        System.out.println("salt " + sum + " som");
    }

    public static void sugar(int b) {
        int p = 5;
        int sum = p * b;
        System.out.println("sugar " + sum + " som");
    }

 */

       /* int[] array ={2,2,8,4,8,2,4,2,2,6};
        int sum =0;
        int counter=0;
        for (int b:array) {
            sum+=b;
            counter++;
            System.out.print(b+" ");
        }
        System.out.println("\n"+sum+"\n"+(double)sum/counter+"\n"+(int)Math.pow(sum,3));


        }

        /*int[] array = {2, 2, 3, 4, 5, 6, 7, 8, 9, 4};
        int counter = 0;
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < array.length; i++) {
            sum1 = array[i];
            sum += array[i];
            counter++;
            System.out.print(sum1 + " ");
        }
        System.out.println("\n" + sum + "\n" + (double) sum / counter);
        System.out.println((int) Math.pow(sum, 4));
    }
   /* public static void array (int[] mass){
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i]+(" "));*/




