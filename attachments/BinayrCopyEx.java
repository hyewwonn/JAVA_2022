package attachments;

import java.io.*;

public class BinayrCopyEx {
    public static void main(String[] args) {
        File src = new File("C:\\Windows\\Web\\Wallpaper\\Theme1\\img2.jpg");
        File dst = new File("copyimge.jpg");
        int c;
        try{
            FileInputStream fi = new FileInputStream(src);
            FileOutputStream fo = new FileOutputStream(dst);
            byte [] buf = new byte[1024*10]; //버퍼 크기가 10KB

            while (true){
                int n = fi.read(buf);//버퍼 크기 만큼 읽는다.
                fo.write(buf, 0,n);//buf[0]부터 n바이트 쓰기
                if(n<buf.length)
                    break;//버퍼 크기보다 작게 읽었기 때문에 파일 끝에 도달.
            }
            fi.close();
            fo.close();
            System.out.println(src.getPath()+"물"+dst.getPath()+"로 복사");
        }catch (IOException e){
            System.out.println("파일 복사 오류");
        }

    }
}
