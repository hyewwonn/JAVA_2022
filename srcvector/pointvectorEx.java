package srcvector;

import java.util.Vector;

class Point{
    private int x,y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
}

public class pointvectorEx {
    public static void main(String[] args) {
        //Point객체를 요소로 갖는 백터 생성
        Vector<Point> pv = new Vector<Point>();

        pv.add(new Point(2,3)); //인덱스0
        pv.add(new Point(-5,20)); //인덱스1
        pv.add(new Point(30,-8)); //인덱스2

        pv.remove(1); //인덱스 1의 Point객체 값 삭제

        //백터값 출력
        for (int i=0; i<pv.size(); i++){
            Point p = pv.get(i);
            System.out.println(p);//p.toString()을 이용하여 출력
        }
    }
}
