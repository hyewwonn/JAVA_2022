package attachments;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //System.in --> 운영체제 인풋값
        FileWriter fout = null;
        int c;
        try {
            fout = new FileWriter("test.txt",true); //파일 생성 하겠다는 뜻.
            while (true){
                String line = scanner.nextLine();
                if(line.length() == 0) //0은 엔터 한 줄에 <Enter> 키만 입력한 경우 즉 엔터를 두 번 입력하면 종료
                    break;
                fout.write(line, 0, line.length());
                fout.write("\r\n", 0,2);
            }
            fout.close();
        }catch (IOException e){
            System.out.println("입출력 오류");
        }
        scanner.close();
    }
}
