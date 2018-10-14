package edu.test.losowanko;

import java.util.Random;

public class Losowanie {

    public static void main(String[] args) {

        for(int j=0; j<1000000; j++) {
            Random rn = new Random();
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<4; i++) {
                sb.append(rn.nextInt(10));
            }
            System.out.println(sb.toString());
        }

    }

}
