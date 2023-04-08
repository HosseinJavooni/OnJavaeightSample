package innerClasses;

import innerClasses.ananymosInnerClass.withClass.AnonymousInnerClassWithClass;
import innerClasses.ananymosInnerClass.withInterface.ForAnanymosInnerClass;
import innerClasses.insideAMethod.ForInsideAMethod;
import innerClasses.insideAMethod.InsideAMethod;

public class MainClass {
    public static void main(String[] args){
        OuterClass outerClass = new OuterClass();

        //type 1 of calling an innerClass -> need a method for instantiate
        OuterClass.InnerClass innerClass1 = outerClass.innerClass();
        System.out.println(innerClass1.returnSomething());

        //type 2 of calling an innerClass -> don't need any method of outer class
        OuterClass.InnerClass innerClass2 = outerClass.new InnerClass();
        System.out.println(innerClass2.returnSomething());

        //Test of calling a private innerClass
        System.out.println("use of private inner class: " + outerClass.usePrivateInnerClass());

        InsideAMethod insideAMethod = new InsideAMethod();
        ForInsideAMethod forInsideAMethod = insideAMethod.testMethod("Perech");
        System.out.println("it a class inside a methods: " + forInsideAMethod.test());

        ForAnanymosInnerClass forAnanymosInnerClass = new ForAnanymosInnerClass();
        System.out.println("AnonymousInnerClass: " + forAnanymosInnerClass.testMethodInClass().testInterfaceMethods());

        AnonymousInnerClassWithClass anonymousInnerClassWithClass = new AnonymousInnerClassWithClass();
        System.out.println("AnonymousInnerClass with implementing a class: " + anonymousInnerClassWithClass.testMethod(23).testMethodInClass());
    }
}
