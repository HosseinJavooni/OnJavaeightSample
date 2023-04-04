package innerClasses;

public class OuterClass {
    private int a = 45;
    public class InnerClass{
        public int returnSomething(){
            return a;
        }
    }

    private class PrivateInnerClass{
        public int returnSomething(){
            return a;
        }
    }

    public int usePrivateInnerClass(){
        PrivateInnerClass privateInnerClass = new PrivateInnerClass();
        return privateInnerClass.returnSomething();
    }
    public InnerClass innerClass(){return new InnerClass();}
}
