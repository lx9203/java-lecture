package selfPrectice;

import java.util.Scanner;

public class Q_11721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        for (int i = 0; i<text.length(); i++) {
            if (i % 10 == 0 && i != 0)
                System.out.println();
            System.out.print(text.charAt(i));
        }
        sc.close();
    }
}