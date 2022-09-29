public class NullPointerExam {
    public static void main(String[] args) {
//      에러
//        String str = null;
//        System.out.println("문자열 : "+str.length()); //오류

//      수정
        try {
            String str = null;
            System.out.println("문자열 : "+str.length());
        }
        catch  (NullPointerException npe) { //참조값없을시
            System.out.println(npe.toString());; //오류 출력(toString => 예외클래스, 해당객체 에러메시지
        }
        finally { //무조건실행
            System.out.println("무조건 실행");
        }
    }
}
