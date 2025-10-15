package lang.object.equals;

public class EqualsMainV2 {
    public static void main(String[] args) {
        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");

        System.out.println("identity = " + (user1 == user2)); // 동일성(identity) 는 객체의 참조가 다르다
        System.out.println("equality = " + user1.equals(user2)); // 동등성(Equality) 는 같은 id 를 갖고있음
    }



}
