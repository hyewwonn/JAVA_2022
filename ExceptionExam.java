public class ExceptionExam {
    public static void main(String[] args) {
        try {
            int data[] = new int[]{10,20,30,40,50};
            for(int i= 0; i<=data.length; i++ ){
                System.out.println("data["+i+"]=" + data[i]); //ArrayIndexOutOFBoundsException
            }
        }
//        catch (ArrayIndexOutOfBoundsException aie) {
//            System.out.println("aie.toString : "+aie.toString());
//        }//주석 해제하면 exception대신 여기서 에러처리
        catch (NullPointerException ne) {
            System.out.println("ne.toString : "+ne.toString());
        }
        catch (Exception e) { //Exception e = ArrayIndexOutOFBoundsException 업캐스팅
            System.out.println("위 경우 이외의 에러 처리");
        }
    }
}
