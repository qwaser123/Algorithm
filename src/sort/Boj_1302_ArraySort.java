package sort;

import java.util.Arrays;
import java.util.Scanner;

public class Boj_1302_ArraySort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String[] titles = new String[N];

        for (int i = 0; i < N; i++) {
            titles[i] = sc.next();
        }

        Arrays.sort(titles);

        // 처음 max는 첫번째 값
        String maxTitle = titles[0];
        int maxCount = 1;
        int currentCount = 1;

        for (int i = 1; i < N; i++) {
            // 그 전 제목과 같지 않다면 -> count는 0이 되고, 같다면 중복이니 count++
            if (!titles[i].equals(titles[i - 1])) {
                currentCount = 0;
            }
            currentCount++;

            // max보다 클 때, 또는 같으면서 사전순으로 앞설 때 갱신
            if (maxCount < currentCount ||
                    (maxCount == currentCount && titles[i].compareTo(titles[i - 1]) < 0)) {
                maxTitle = titles[i];
                maxCount = currentCount;
            }
        }

        System.out.println(maxTitle);
    }
}
