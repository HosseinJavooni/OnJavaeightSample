package innerClasses.insideAnInterface;

public interface TestOfInnerClassInsideAnInterface {
    int returnAnInteger(int a);
    class InsideAnInterface implements TestOfInnerClassInsideAnInterface{
        @Override
        public int returnAnInteger(int a) {
            return a;
        }
    }
}
