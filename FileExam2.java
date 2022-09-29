import java.io.*; //java.io 클래스의 모든 모듈 import

public class FileExam2 {
    public static void main(String[] args) {
//        에러
//        FileReader file = new FileReader("test.java"); //FileNotFoundException

//        수정
        try{
            FileReader file = new FileReader("test.java"); //FileNotFoundException
        }
        catch(FileNotFoundException fe){ //파일이 없으면
            System.out.println("fe.toString : " + fe.toString()); //오류출력
        }

    }
}
