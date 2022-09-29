package attachments;

import javax.sound.sampled.Line;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PhoneWriter {
    public static void main(String[] args) {
        FileWriter fw = null;
        File f = new File("Phone.txt");
        try{
            fw = new FileWriter(f);
            Scanner scanner = new Scanner(System.in);
            System.out.println("전화번호 입력 프로그램입니다.");
            while (true){
                System.out.print("name PhoneNumber>>");
                String line = scanner.nextLine(); //한 줄 읽기
                if(line.contentEquals("꺼져"))
                    break;
                fw.write(line+"\r\n");//한 줄 띄어 저장하기
            }
            System.out.println(f.getPath()+"저장");
            scanner.close();
            fw.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
