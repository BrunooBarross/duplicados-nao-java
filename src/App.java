import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Escreva um código que encontre os elementos em comum que existem em dois arrays e imprima os nomes dos itens em comum! */

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        List<String> list1 = new ArrayList<>();

        List<String> list2 = new ArrayList<>();

        // Populando os arrays
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 0) {
                    System.out.printf("Digite uma palavra para o array %d array: \n", i + 1);
                } else {
                    System.out.printf("Digite + uma palavra para o array %d array: \n", i + 1);
                }
                if (i == 0) {
                    list1.add(j, sc.nextLine());
                } else {
                    list2.add(j, sc.nextLine());
                }
            }
        }

        System.out.println(" ---------- Itens em comum ---------- ");
        for (int i = 0; i < 4; i++) {
            if (list2.contains(list1.get(i))) {
                System.out.println(list1.get(i));
            }
        }

        sc.close();

    }
}
