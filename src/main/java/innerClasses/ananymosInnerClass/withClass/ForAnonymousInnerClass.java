package innerClasses.ananymosInnerClass.withClass;

public class ForAnonymousInnerClass {
    private int anInt;

    public ForAnonymousInnerClass(int anInt){
        this.anInt = anInt;
    }
    public int testMethodInClass(){
        return anInt++;
    }
}
