package sort;

import java.util.*;

public class Boj_7785_usingArrays {
    public static void main(String[] args) {

        // 입력
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[][] entered = new String[N][2];

        for (int i = 0; i < N; i++) {
            entered[i][0] = sc.next();
            entered[i][1] = sc.next();
        }

        // 이름을 사전의 역순으로 정렬
        Arrays.sort(entered, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o2[0].compareTo(o1[0]);
            }
        });

        // 최종상태가 'enter' -> 출력
        for (int i = 0; i < N - 1; i++) {
            if (entered[i][1].equals("enter") && !entered[i][0].equals(entered[i + 1][0])) {
                System.out.println(entered[i][0]);
            }
        }

        if (entered[N - 1][1].equals("enter")) {
            System.out.println(entered[N - 1][0]);
        }

    }
}
