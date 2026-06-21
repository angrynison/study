package java_study.lamda;

public class Lamda_args {
    public static void main(String[] args) {

        MyFuncionalInterface f1;

//        매개변수가 없는 람다식
//        f1 = () -> {
//            String str = "method call";
//            System.out.println(str);
//        };
//
//        f1.method();
//
//        f1 = () -> {
//            String str = "method2 call";
//            System.out.println(str);
//        };
//
//        f1.method();


        // 매개변수가 있는것
//        f1  = (str) -> {
//            str = "method transformation";
//            System.out.println(str);
//        };
//        f1.method("method 1 call");

        // 리턴타입이 있는것
        f1 = (x,y) -> {
            int result = x + y;
            return result;
        };
        System.out.println(f1.method(10, 20));


    }
}
