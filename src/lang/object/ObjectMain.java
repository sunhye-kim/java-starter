package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        /*
         * Object 클래스는 자바의 모든 클래스의 최상위 부모 클래스이다.
         * - 별도로 extends 하지 않아도 자동으로 Object를 상속받는다.
         * - 따라서 Child → Parent → Object 구조가 형성된다.
         * - Object가 제공하는 메서드들 (toString, equals, getClass 등)을
         *   모든 클래스에서 바로 사용할 수 있다.
         */
        // toString()은 Object 클래스의 메서드
        String string = child.toString();
        System.out.println(string);

    }
}
