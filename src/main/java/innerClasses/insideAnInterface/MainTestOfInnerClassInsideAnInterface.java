package innerClasses.insideAnInterface;

public class MainTestOfInnerClassInsideAnInterface {
    public static void main(String[] args) {
        TestOfInnerClassInsideAnInterface.InsideAnInterface a = new TestOfInnerClassInsideAnInterface.InsideAnInterface();
        System.out.println(a.returnAnInteger(34));
    }
}
