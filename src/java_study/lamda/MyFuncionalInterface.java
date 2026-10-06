package java_study.lamda;

// 추상 메소드가 1개인지, 즉 함수적 인터페이스인지 검사하는 어노테이션
@FunctionalInterface
public interface MyFuncionalInterface {
    //public void method();
    //public void method(String s);
    public int method(int x, int y);
}
