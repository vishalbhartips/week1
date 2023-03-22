package questions_day_1and2;

class PolyMorphism {
    public void display(int a) {
        System.out.println("The value of a is: " + a);
    }

    public void display(double a) {
        System.out.println("The value of a is: " + a);
    }

    public static void main(String[] args) {
        PolyMorphism pm = new PolyMorphism();

        pm.display(5);
        pm.display(4.566);
    }
}

class Base {
    public void print() {
        System.out.println("This is the Base class");
    }
}

class Derived extends Base {
    @Override
    public void print() {
        System.out.println("This is the Derived class");
    }
}

class RuntimePolyMorphism {
    public static void main(String[] args) {
        Base b;
        Derived d = new Derived();
        b = d;

        b.print();
    }
}


