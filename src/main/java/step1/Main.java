package step1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        baek2588();


    }

    private static void baek2588() {
        /*
        *
        * 2022 1206 백준 2588 문제
        가벼운 사칙연산 문제이나, 연산기호 간 우선순위를 체크하게 됨*/

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
