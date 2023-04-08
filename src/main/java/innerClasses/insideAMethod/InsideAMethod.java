package innerClasses.insideAMethod;

public class InsideAMethod {
    public ForInsideAMethod testMethod(String name){
        class InnerClass1 implements ForInsideAMethod{
//            private String name = "Hossein";
            @Override
            public String test() {
                return name;
            }
        }
        return new InnerClass1();
    }
}
