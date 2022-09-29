import java.io.*; //java.io 클래스의 모든 모듈 import

public class FileExam {
    public static void main(String[] args) {
//        에러
//        FileReader fr = new FileReader("datar.txt"); //FileNotFoundException
//        FileWriter fw = new FileWriter("dataw.txt"); //IOException
//        int c;
//        while((c= fr.read())!=-1){ //IOException
//            fw.write(c); //IOException
//        }

//        수정
        try{
            FileReader fr = new FileReader("datar.txt"); //FileNotFoundException
            FileWriter fw = new FileWriter("dataw.txt"); //IOException
            int c;
            while((c= fr.read())!=-1){ //IOException
                fw.write(c); //IOException
            }
        }
        catch(Exception e){
            System.out.println(e.toString()); //toString => 예외클래스, 해당객체 메시지
            System.out.println(e.getMessage()); //getMessage => 해당객체
            e.printStackTrace(); //printStackTrace => 메소드 호출 순서 출력
        }

    }
}
