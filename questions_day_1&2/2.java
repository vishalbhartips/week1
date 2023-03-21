package questions;

class MyClass {
    public int publicVar;
    private int privateVar;
    protected int protectedVar;

    public MyClass() {
        publicVar = 0;
        privateVar = 0;
        protectedVar = 0;
    }

    public void setPrivateVar(int value) {
        privateVar = value;
    }

    public int getPrivateVar() {
        return privateVar;
    }

    protected void setProtectedVar(int value) {
        protectedVar = value;
    }

    protected int getProtectedVar() {
        return protectedVar;
    }
}

class Main {
    public static void main(String[] args) {
        MyClass myObj = new MyClass();

        myObj.publicVar = 10;
        System.out.println("Public variable value: " + myObj.publicVar);

        // This will cause a compile error
        // myObj.privateVar = 20;

        myObj.setPrivateVar(20);
        System.out.println("Private variable value: " + myObj.getPrivateVar());

        // This will cause a compile error
        // myObj.protectedVar = 20;

        myObj.setProtectedVar(30);
        System.out.println("Protected variable value: " + myObj.getProtectedVar());
    }
}

class Main2 extends MyClass {
    public static void main(String[] args) {
        MyClass myObj = new MyClass();

        myObj.publicVar = 10;
        System.out.println("Public variable value: " + myObj.publicVar);

        // This will cause a compile error
        // myObj.privateVar = 20;

        myObj.setPrivateVar(20);
        System.out.println("Private variable value: " + myObj.getPrivateVar());

        myObj.protectedVar = 30;
        System.out.println("Protected variable value: " + myObj.protectedVar);
    }
}
