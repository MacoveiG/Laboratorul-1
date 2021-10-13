public class Main {
    public static void main(String[] args) {

        //Comment 1
        /*Comment 2
        Comment 2*/

        System.out.println("Hello World");

        //Variable
        String s = "String var";
        byte bt = 19;
        short sh = 19;
        int i = 19;
        long l = 19L;
        float f = 19f;
        double d = 19d;
        char c = 'c';
        boolean b = true;

        //Casting
        //automatically
        byte cast1 = 19;
        int cast2 = cast1;
        double cast3 = cast2;
        //manually
        int cast4 = (int) cast3;
        short cast5 = (short) cast4;

        //Operators
        int x = 10 + 5;
        x = 10 - 5;
        x = 10 * 5;
        x = 10 / 5;
        x = 10 % 5;
        x++;
        x--;
        x += 5;

        //Math
        Math.max(5, 1);
        Math.min(5, 8);
        Math.sqrt(16);
        Math.abs(-5.6);
        int randomNum = (int) (Math.random() * 101);  // 0 to 100

        //Conditions and if Statements
        //if
        int time = 22;
        if (time < 10) {
            System.out.println("Buna dimineata.");
        } else if (time < 20) {
            System.out.println("Buna ziua.");
        } else {
            System.out.println("Buna seara.");
        }
        //or
        String str = (time < 10) ? "Buna dimineata." : "Buna ziua.";

        //switch
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Luni");
                break;
            case 2:
                System.out.println("Marti");
                break;
            case 3:
                System.out.println("Miercuri");
                break;
            default:
                System.out.println("1 >= day <= 7");
        }
        //or
        switch (day) {
            case 1 -> System.out.println("Luni");
            case 2 -> System.out.println("Marti");
            case 3 -> System.out.println("Miercuri");
            default -> System.out.println("1 >= day <= 7");
        }

        //while
        int i1 = 0;
        while (i1 < 5) {
            System.out.println(i1);
            i1++;
        }

        //do while
        i1 = 0;
        do {
            System.out.println(i1);
            i1++;
        } while (i1 < 5);

        //for
        for (int j = 0; j < 5; j++) {
            System.out.println(j);
        }

        //Array
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] nr = {10, 20, 30, 40};
        System.out.println(cars[3]);
        System.out.println(nr[2]);
        int[][] nrr = {{1, 2, 3, 4}, {5, 6, 7}};
        System.out.println(nrr[1][2]);

        //Method
        System.out.println(myMethod(5, 3));
        System.out.println(myMethod(5.6d, 1.9d));

        //Recursion
        System.out.println(sum(10));

        //OOP
        Persoana persoana = new Persoana();
        persoana.hello();
        System.out.println("Age: " + persoana.getAge());
        System.out.println(persoana.getFirstName());

        Persoana persoana2 = new Persoana("MM", "NN", 5);
        persoana2.hello();
        System.out.println(persoana2.getAge());
        persoana2.setFirstName("Nume1");
        persoana2.setAge(6);

    }

    static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    static int myMethod(int a, int b) {
        return a + b;
    }

    static double myMethod(double a, double b) {
        return a + b;
    }

}
