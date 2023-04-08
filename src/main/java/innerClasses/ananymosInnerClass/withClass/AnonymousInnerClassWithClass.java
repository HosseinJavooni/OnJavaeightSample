package innerClasses.ananymosInnerClass.withClass;

public class AnonymousInnerClassWithClass {
    public ForAnonymousInnerClass testMethod(final int integer){
        return new ForAnonymousInnerClass(integer){
            @Override
            public int testMethodInClass(){
                return integer;
            }
        };
    }
}
