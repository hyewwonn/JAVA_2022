public class ArrayExam {
    public static void main(String[] args) {
//        에러
//        int data[] = new int[]{10,20,30,40,50};
//        for(int i = 0; i<=data.length; i++){
//            System.out.println("data["+i+"]="+data[i]);
//        }

//        수정
//        try{
//            int data[] = new int[]{10,20,30,40,50};
//            for(int i = 0; i<=data.length; i++){ //오류
//                System.out.println("data["+i+"]="+data[i]);
//            }
//        }
//        catch (ArrayIndexOutOfBoundsException aie) { //배열인덱스 벗어나면
//            System.out.println("aie.toString() : "+aie.toString()); //에러출력
//        }
//        finally { //무조건실행
//            System.out.println("이곳은 반드시 거친다.");
//        }

//        에러x
        try{
            int data[] = new int[]{10,20,30,40,50};
            for(int i = 0; i<data.length; i++){ //오류수정( <= -> < )
                System.out.println("data["+i+"]="+data[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException aie) { //배열인덱스 벗어나면
            System.out.println("aie.toString() : "+aie.toString()); //에러출력
        }
        finally { //무조건실행
            System.out.println("이곳은 반드시 거친다.");
        }
    }
}
