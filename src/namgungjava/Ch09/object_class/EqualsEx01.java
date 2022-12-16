package namgungjava.Ch09.object_class;
/*
 * Object 클래스
 * 모든 클래스의 최고 조상이다.
 * 오직 11개의 메서드만 가지고 있다.
 * notify(), wait() 등은 쓰레드와 관련된 메서드이다.
 *
 * protected Obejct clone()
 * public boolean equals(Object obj)
 * protected void finalize()
 * public Class getClass()
 *   객체 자신의 클래스 정보를 담고 있는 클래스인스턴스를 반환한다.
 *       1. 객체생성
 *       2. 객체정보
 *       리플렉션 API--> 고급과정??
 *
 *
 *
 * public int hashcode()
 * public String toString()
 * public void notify()
 * public void nofifyAll()
 * public void wait()
 * public void wait(long timeout)
 * public void wait(long timeout,int nanos)
 *
 *
 * 위의 protected로 설정된 2개는
 *   첫째, 오버라이딩해야 사용가능하다.
 *   둘째, public로 설정해야함.
 *
 * */

public class EqualsEx01 {
    public static void main(String[] args) {

        /*
         * equals(Object obj)
         * 객체 자신(this)과 주어진 객체(obj)를 비교한다.
         * 같으면 true, 다르면 false.
         * public boolean equals(Object obj){   // 주소 비교
         * return (this==obj);
         * }
         *
         *  */
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if (v1.equals(v2)) {
            System.out.println("equals 비교에서 v1과 v2는 같습니다.");
        } else {
            System.out.println("equals 비교에서 v1과 v2는 다릅니다.");
        }

        if (v1 == v2) {
            System.out.println("== 비교에서 v1과 v2는 같습니다.");
        } else {
            System.out.println("== 비교에서 v1과 v2는 다릅니다.");
        }


    }
}

class Value {
    int value;

    Value(int value) {
        this.value = value;
    }
// equals 비교는 원래 주소를 비교한다.
//    public boolean equals(Object obj){
//        return this==obj;
//    }
// 값을 비교하도록 오버라이딩해서 주로 사용한다.
// 참조변수의 형변환 전에는 반드시 instanceof로 확인해야함...

    public boolean equals(Object obj){
        if (!(obj instanceof Value)) return false;
        Value v = (Value) obj;
        return this.value == v.value;

    }


}




