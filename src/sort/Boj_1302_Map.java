package sort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Boj_1302_Map {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // Map으로 입력 받음, 키와 밸류로 이루어짐
        Map<String, Integer> titles = new HashMap<String, Integer>();

        for (int i = 0; i < N; i++) {
            String title = sc.next();
            // titles.put(title, titles.getOrDefault(title, 0) + 1);
            if (titles.containsKey(title)) {
                titles.put(title, titles.get(title) + 1);
            } else titles.put(title, 1);
        }


        // 처음 max는 첫번째 값
        String maxTitle = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> title : titles.entrySet()) {

            // max보다 클 때 또는 같으면서 사전순으로 앞설 때 갱신
            if (maxCount < title.getValue() ||
                    (maxCount == title.getValue()  && title.getKey().compareTo(maxTitle) < 0)) {
                maxTitle = title.getKey();
                maxCount = title.getValue() ;
            }
        }

        System.out.println(maxTitle);
    }
}
