class Main2 {
    String fName;
    String lName;
    int age;

    Main2(){
        fName = "Macovei";
        lName = "Grigore";
        age = 20;
    }

    Main2(String fName, String lName, int age){
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }

    void hello() {
        System.out.println("Hello " + fName + " " + lName);
    }

}
