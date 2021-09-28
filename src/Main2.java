class Main2 {
    private String fName;
    private String lName;
    private int age;

    Main2() {
        this.fName = "Macovei";
        this.lName = "Grigore";
        this.age = 20;
    }

    Main2(String fName, String lName, int age) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }

    void hello() {
        System.out.println("Hello " + fName + " " + lName);
    }

    public String getFName() {
        return fName;
    }

    public String getLName() {
        return lName;
    }

    public int getAge() {
        return age;
    }
}
