package io;

import java.io.*;
import java.util.StringTokenizer;

class MDatasExam{
        public void readingData(String fname) throws IOException{
            try{
                FileReader fr = new FileReader(new File(fname));//메인스트림
                BufferedReader br = new BufferedReader(fr);//메인스트림을 받는 보조스트림
                String csvStr = "";
                String tmpStr = "";
                do{
                    tmpStr = br.readLine();
                    if(tmpStr != null){
                        csvStr += tmpStr + "\t";
                    }
                }while (tmpStr != null);
                StringTokenizer parse = new StringTokenizer(csvStr, "\t");
                int length = parse.countTokens()/4;//토큰의 개수만큼 할당
                String[] name = new String[length];
                String[] address = new String[length];
                double[] math = new double[length];
                double[] english = new double[length];
                double[] total = new double[length];
                double[] avg = new double[length];

                for (int i = 0; i < length; i++) {
                    name[i] = parse.nextToken();
                    address[i] = parse.nextToken();
                    math[i] = Double.valueOf(parse.nextToken()).doubleValue();
                    english[i] = Double.valueOf(parse.nextToken()).doubleValue();
                    total[i] = math[i] + english[i];
                    avg[i] = total[i]/2.0;

                }
                for (int i = 0; i < length; i++) {
                    System.out.println(name[i] + "\t" + address[i] + "\t" + math[i] + "\t" + english[i] + "\t" + total[i] + "\t" + avg[i] + "\t");
                }
            }catch (FileNotFoundException e) {
                System.out.println("잘못된 파일 이름을 입력했습니다.");
            }
        }
}

public class MDatasMain {
    public static void main(String[] args) {
        MDatasExam md = new MDatasExam();
        try {
            md.readingData("writed.txt");
        }catch (IOException e){
         e.printStackTrace();
        }


    }
}
