import java.util.Scanner;

public class js220914_2 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i<5; i++){
            System.out.print(i+"번 방 숫자 입력 : ");
            arr[i] = scan.nextInt();
        }
        for(int i = 0; i<5; i++){
            System.out.print(arr[i]+ "\t");
        }
    }
}
