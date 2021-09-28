public class Main2 {
    String fName;
    String lName;
    int age;

    public Main2(){
        fName = "Macovei";
        lName = "Grigore";
        age = 20;
    }

    public Main2(String fName, String lName, int age){
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }

    public void hello() {
        System.out.println("Hello " + fName + " " + lName);
    }

}
