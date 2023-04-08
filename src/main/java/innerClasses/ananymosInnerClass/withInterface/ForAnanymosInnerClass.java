package innerClasses.ananymosInnerClass.withInterface;

public class ForAnanymosInnerClass {
    public ForAnanymosInnerInterface testMethodInClass(){
        return new ForAnanymosInnerInterface() {
            private final String name = "forTest";
            @Override
            public String testInterfaceMethods() {
                return name;
            }
        };
    }
}
