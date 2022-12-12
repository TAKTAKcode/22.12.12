package com.tak.study;

import java.util.Arrays;

public class Study {

    public static void main(String[] args) {

        //6자리 배열 선언
        int[] lotto = new int[6];

        //6자리 배열 안에 1~45까지의 랜덤 값
        lotto[0] = (int)(Math.random() * 45 + 1);

        for (int i = 1; i < 6; i++) {

            lotto[i] = (int)(Math.random() * 45 + 1);

            for (int j = 0; j < i; j++) {

                while (true) {

                    if (lotto[i] == lotto[j]) {  //i에서 뽑힌 수와 j에서 뽑힌 수가 같으면 다시 뽑음

                        lotto[i] = (int)(Math.random() * 45 + 1);
                    } else {
                        break;
                    }

                }
                
            }

        }

        /*
        * 배열안에 저장된 순서를 보기 좋게 오름차순으로 정렬합니다.
        * JAVA에서 sort메소드를 지원합니다.
        * Arrays메소드는 오름차순만 지원합니다.
        * */
        Arrays.sort(lotto);

        //값을 출력합니다.
        for (int j = 0; j < 6; j++) {
            System.out.println(lotto[j]);
        }

    }

}
