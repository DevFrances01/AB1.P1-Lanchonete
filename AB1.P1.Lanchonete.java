import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);

        int hamburguer = sc.nextInt();
        int cheeseburger = sc.nextInt();
        int fritas = sc.nextInt();
        int refrigerante = sc.nextInt();
        int milkshake = sc.nextInt();

        double conta = hamburguer * 3.00
                + cheeseburger * 2.50
                + fritas * 2.50
                + refrigerante * 1.00
                + milkshake * 3.00;

        System.out.printf("Conta final: %.2f%n", conta);
    }
}