package sort;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Boj_7785_usingSet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Set<String> entered = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            String isEnter = sc.next();

            if (isEnter.equals("enter")) {
                entered.add(name);
            } else if (isEnter.equals("leave")) {
                entered.remove(name);
            }
        }

        String[] enteredName = entered.toArray(new String[entered.size()]);
        for (int i = enteredName.length - 1; i >= 0; i--) {
            System.out.println(enteredName[i]);
        }
    }
}
