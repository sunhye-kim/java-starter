package lang.object;

// 부모가 없으면 묵시적으로 Object 클래스를 상속받는다
public class Parent { // 여기에 사실은 extends Object 가 숨져져있음
    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}
