import java.io.*;
public class Echo2Exam {
    public static void main(String[] args) {
//        에러
//        InputStream is = System.in;
//        while(true){
//            int i = is.read();
//            if(i == -1) break;
//            System.out.println((char)i);
//        }

//        수정
        try { //오류발생가능성
            InputStream is = System.in;
            while(true){
                int i = is.read(); //오류
                if(i == -1) break;
                System.out.println((char)i);
            }
        }
        catch (IOException e){ //입출력 오류나면 catch
            e.printStackTrace(); //오류출력
        }

    }
}
