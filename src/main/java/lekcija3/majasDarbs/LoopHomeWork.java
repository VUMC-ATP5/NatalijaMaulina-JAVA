package lekcija3.majasDarbs;

import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {

    para();
    }
    public static void summa() {

        Scanner ievade = new Scanner(System.in);
        int summa = 0;
        while (summa < 100) {
            System.out.println("Ievadiet veselu skaitli");
            int x = ievade.nextInt();
            summa = summa + x;
            if (summa == 100 || summa > 100) {
                System.out.println("GATAVS");
        }

        }
    }

    public static void masivi() {
        String[] names = {"Olga", "Janis", "Katrīna", "Baiba"};
        int i = 0;
        while (i < names.length) {
            System.out.println(names);
            i++;
        }
        do {
            System.out.println(names);
            i++;
        }
        while (i<names.length);
        for (i = 0; i < names.length; i++) {
            System.out.println(names);
        }
        for (String vardi : names) {
            System.out.println(vardi);
        }
        int[] shoes = {35, 43, 32, 40, 41};
        int j = 0;
        for (j = 0; j < shoes.length; j++) {
            System.out.println(shoes);
        }

        char[] letter = {'A', 'L', 'E', 'X'};
        for (int burti : letter) {
            System.out.println(burti);
        }
        int q = 1;
        do {
            System.out.println(letter);
            q++;
        } while (q < letter.length);
    }
    public static void para (){
        int[] paraSkaitli=new int [100];
        for(int i=0;i<=paraSkaitli.length;i++){
            if(i%2==0){
                System.out.println(paraSkaitli[i] + " ");
            }
        }
    }
    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
