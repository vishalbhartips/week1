package questions_day_1and2;

class A {
    public int x = 1;
    private int y = 2;
    protected int z = 3;
    int w = 4;
}

class B extends A {
    public void display() {
        System.out.println("x = " + x);
        //System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("w = " + w);
    }
}

class AccessModifiersInheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}

