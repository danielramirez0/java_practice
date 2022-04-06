package com.learningjava;

public class ScopeCheck {
    private static String containerPrivate = "See, I'm from ScopeCheck";
    public int publicVariable = 0;
    private int privateVariable = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVariable = " + publicVariable + ": privateVariable = " + privateVariable);
    }

    public int getPrivateVariable() {
        return privateVariable;
    }

    public void timesTwo() {
        int privateVariable = 2;
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " x 2 is " + i * privateVariable + "(From timesTwo scope)");
            System.out.println(i + " x 1 is " + i * this.privateVariable + "(From ScopeCheck scope)");
        }
    }

    public void innerClassCheck() {
        InnerClass innerClass = new InnerClass();
        System.out.println("If instantiated in the containing class, each containing object has access to all private vars/methods of any inner class");
        System.out.println("e.g. innerClass.innerPrivateVar = " + innerClass.innerPrivateVar);
        innerClass.outerClassCheck();
    }

    public class InnerClass {
        //        public  int privateVariable = 3;
        private String innerPrivateVar = "I came from private InnerClass";

        public InnerClass() {
            System.out.println("InnerClass created, privateVariable is " + privateVariable);
        }

        public void outerClassCheck(){
            System.out.println("And vice versa each inner class has access to all private vars/methods of the containing class");
            System.out.println("e.g. ScopeCheck.privateVariable = " + ScopeCheck.containerPrivate);
        }

        public void timesTwo() {
//            int privateVariable = 2;
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " x 2 is " + i * privateVariable + "(From ScopeCheck scope)");
//                System.out.println(i + " x 3 is " + i * this.privateVariable + "(From ScopeCheck.InnerClass scope)");
                System.out.println(i + " x 3 is " + i * ScopeCheck.this.privateVariable + "(From ScopeCheck scope)");
            }
        }
    }
}
