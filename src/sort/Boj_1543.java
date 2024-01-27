package sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Boj_1543 {

    static class Member {
        int age;
        String name;
        int idx;

        public Member(int age, String name, int idx) {
            this.age = age;
            this.name = name;
            this.idx = idx;
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Member[] members = new Member[N];

        for (int i = 0; i < N; i++) {
            members[i] = new Member(sc.nextInt(), sc.nextLine(), i);
        }

        Arrays.sort(members, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                    return o1.age - o2.age;
            }
        });

        for (Member member : members) {
            System.out.println(member.age + member.name);
        }
    }
}
