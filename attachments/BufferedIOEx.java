package attachments;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferedIOEx {
    public static void main(String[] args) {
        FileReader fin = null;
        int c;
        try {
            fin = new FileReader("text2.txt");
            BufferedOutputStream out =
                    new BufferedOutputStream(System.out,5);
            while ((c = fin.read())!=-1){
                out.write(c);
            }
            //파일 데이터가 모두 출력된 상태
            //new Scanner(System.in).nextLine();//엔터키 입력 대기
            out.flush();//버퍼 안에 데이터 출력
            out.close();//출력 스트림 종료
            fin.close();//입력 스트림 종료
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
