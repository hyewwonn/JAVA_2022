package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExam {
    public static void main(String[] args) {//P135
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader b = new BufferedReader(isr);

        try{
            String aa = br.readLine();//readLine 한 줄 읽는다. 근데 엔터는 줄의 끝을 의미
            System.out.println(aa);
        }catch (IOException e){

        }
    }
}

