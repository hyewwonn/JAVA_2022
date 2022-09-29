public class ThrowExam {
    public static void arrayMethod() throws ArrayIndexOutOfBoundsException
    //throws 뒤에 예외 종류 작성
    { //호출 -> 실행 -> 에러 -> throws(호출위치로)
        String[] irum = new String[3];
        irum[3] = "홍길동";
    }
    public static void main(String[] args) {
        ThrowExam ts = new ThrowExam();
        try {
            arrayMethod(); //호출, arrayMethod 에 throws 키워드 포함 -> try~catch 로 처리
        }catch (ArrayIndexOutOfBoundsException ae){ //배열범위 catch
            System.out.println("예외 발생"+ae.getMessage());
            System.out.println("예외 발생"+ae.toString());
            ae.printStackTrace(); //6 -> 11 (예외까지 메소드 호출순서 역순)
        }

    }
}
