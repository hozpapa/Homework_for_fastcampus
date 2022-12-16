package namgungjava.Ch09.object_class;

/*
 * 인스턴스 변수(iv)의 값을 비교하도록 equals()를 오버라이딩 한다.
 * cv는 객체가 공통으로...(값이 같다)
 * iv는 객체마다 다름...
 *
 *
 * */


class Person {
    long id;

    public boolean equals(Object obj) {

        if (!(obj instanceof Person)) return false;

        return id == ((Person) obj).id;
    }

//        if (obj instanceof Person) {
//
//            return id == ((Person) obj).id;
//        } else return false;


    Person(long id) {
        this.id = id;
    }

}

public class EqualsEx02 {
    public static void main(String[] args) {

        Person p1 = new Person(80110911);
        Person p2 = new Person(80110911);

        if (p1==p2) System.out.println("==에서 p1과 p2는 같은 사람입니다.");
        else System.out.println("==에서 p1과 p2는 다른 사람입니다.");

        if(p1.equals(p2)) System.out.println("equals에서 p1과 p2는 같은 사람입니다.");



    }
}
