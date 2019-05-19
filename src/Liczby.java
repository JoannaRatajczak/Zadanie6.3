import java.util.Scanner;

public class Liczby {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] liczby = new int[5];
        System.out.println("Podaj 5 liczb naturalnych:");
        liczby[0] = scan.nextInt();
        liczby[1] = scan.nextInt();
        liczby[2] = scan.nextInt();
        liczby[3] = scan.nextInt();
        liczby[4] = scan.nextInt();

        System.out.println("Dodawanie liczby 1,3 i 5 = " + (liczby[0] + liczby[2] + liczby[4]));

    }
}
