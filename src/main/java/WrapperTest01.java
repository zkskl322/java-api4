public class WrapperTest01 {
    public static void main(String[] args) {

        Integer num01 = 10; // autoBoxing 기능
        //Integer num02 = new Integer(10); // 이제 쓰지마!!
        Integer num03 = Integer.valueOf(10);
        Integer num04 = Integer.valueOf("10"); // 문자타입 숫자(정수) --> 정수

        Double dnum01 = 10.11;
        Double dnum02 = Double.valueOf("10.11");
        Double dnum03 = Double.valueOf("10");

        System.out.println("정수 : " + num01);
        System.out.println("실수 : " + dnum02);
    }
}