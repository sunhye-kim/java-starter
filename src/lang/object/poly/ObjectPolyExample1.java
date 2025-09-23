package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        // Object는 자바 최상위 부모 클래스이기 때문에
        // action(Object obj) 메서드 하나로 Dog, Car 등 모든 객체를 받을 수 있다.
        // -> 이것이 바로 '다형성'의 특징 (여러 형태를 하나의 타입(Object)으로 다룰 수 있음)
        action(dog);
        action(car);
    }
    private static void action(Object obj) {
        // obj의 타입이 Object라서 공통 기능(toString, equals 등)만 접근 가능
        //obj.sound(); //컴파일 오류, Object는 sound()가 없다.
        //obj.move(); //컴파일 오류, Object는 move()가 없다.

        // 다형성 덕분에 Object로 받아두긴 했지만,
        // 실제 객체가 무엇인지 확인 후 '다운캐스팅'하면 자식 고유 메서드를 호출할 수 있다.

        // instanceof + 패턴 매칭 (자바 16 이후)
        if (obj instanceof Dog dog) {
            // Object -> Dog로 다운캐스팅됨
            dog.sound();
        } else if (obj instanceof Car car) {
            // Object -> Car로 다운캐스팅됨
            car.move();
        }

        // 전통적인 다운캐스팅 방식
        if (obj instanceof Dog) {
            ((Dog) obj).sound(); // Object를 강제로 Dog 타입으로 변환
        }
    }
}
