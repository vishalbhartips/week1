package questions_day_1and2;

class AutoboxingUnboxing {
    public static void main(String[] args) {
        // Autoboxing
        int x = 10;
        Integer obj = x; // primitive int is converted to Integer object
        System.out.println("Autoboxing - x = " + x + ", obj = " + obj);

        // Unboxing
        Integer obj2 = 20;
        int y = obj2; // Integer object is converted to primitive int
        System.out.println("Unboxing - y = " + y + ", obj2 = " + obj2);
    }
}

