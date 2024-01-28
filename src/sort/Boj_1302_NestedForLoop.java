package sort;

import java.util.Arrays;
import java.util.Scanner;

public class Boj_1302_NestedForLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] titles = new String[N];
        int[] titleCount = new int[N];

        for (int i = 0; i < N; i++) {
            titles[i] = sc.next();
        }
        Arrays.sort(titles);

        // 모든 배열을 돌며 같은 제목이 있나 검색.
        // 이중포문을 쓰지 않으면 바로 다음 제목만 검색 가능하기 때문에 불가
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (titles[i].equals(titles[j])) {
                    titleCount[i]++;
                }
            }
        }

        String maxTitle = "";
        int maxCount = 0;

        for (int i = 0; i < N; i++) {
            // maxCount보다 클 경우 || 같은 경우에 사전순으로 앞에 있다면
            // max 갱신
            if (maxCount < titleCount[i] ||
                    (maxCount == titleCount[i] && titles[i].compareTo(maxTitle) < 0)) {
                maxTitle = titles[i];
                maxCount = titleCount[i];
            }
        }
        System.out.println(maxTitle);
    }
}
