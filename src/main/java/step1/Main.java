package step1;

import java.util.ArrayList;
import java.util.*;


public class Main {

    public static void main(String[] args) {

        baek2480();

    }

    private static void baek2480() {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int[] array = {x,y,z};
        Arrays.sort(array);

        if(array[0]==array[1]) {
            if(array[0]==array[2]) {
                System.out.println(10000+1000*array[0]);
            } else {
                System.out.println(1000+100*array[0]);
            }
        } else {
            if(array[1]==array[2]) {
                System.out.println(1000+100*array[1]);
            } else {
                System.out.println(array[2]*100);
            }
        }
    }

    /**
     * 2022 1206 백준 3003 문제
     * String을 받아와 int형으로 변환 후
     * 간단한 사칙연산 후에 String으로 재 변환 후 리턴
     * Java Stream 기능 복습 하게 됨
     */
    private static void baek3003() {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] list = input.split(" ");

        int[] array = Arrays.stream(list).mapToInt(Integer::parseInt).toArray();

        int[] chess = {1,1,2,2,2,8};

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(chess[i]-array[i]+" ");
        }

        System.out.println(sb.toString());
    }

    /**
     * 2022 1206 백준 2588 문제
     * 가벼운 사칙연산 문제이나, 연산기호 간 우선순위를 체크하게 됨
     */
    private static void baek2588() {

        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();
        int input2 = sc.nextInt();

        int answer1 = 0;
        int answer2 = 0;
        int answer3 = 0;
        int answer4 = 0;

        answer1 = input1 * (input2%10);
        answer2 = input1 * ((input2/10)%10);
        answer3 = input1 * (input2/100);
        answer4 = answer1 + answer2*10 + answer3*100;
        System.out.println(answer1+"\n"+answer2+"\n"+answer3+"\n"+answer4);
    }

}
