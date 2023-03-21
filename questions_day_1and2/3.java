package questions_day_1and2;

class GrandParent {
    public void displayGrandParent() {
        System.out.println("This is the GrandParent class");
    }
}

class Parent extends GrandParent {
    public void displayParent() {
        System.out.println("This is the Parent class");
    }
}

class Child extends Parent {
    public void displayChild() {
        System.out.println("This is the Child class");
    }
}

class GrandChild extends Child {
    public void displayGrandChild() {
        System.out.println("This is the GrandChild class");
    }
}

class Driver {
    public static void main(String[] args) {
        GrandChild gc = new GrandChild();
        gc.displayGrandParent();
        gc.displayParent();
        gc.displayChild();
        gc.displayGrandChild();
    }
}