class Persoana {
    private String firstName;
    private String lastName;
    private int age;

    Persoana() {
        this.firstName = "Macovei";
        this.lastName = "Grigore";
        this.age = 20;
    }

    Persoana(String fName, String lastName, int age) {
        this.firstName = fName;
        this.lastName = lastName;
        this.age = age;
    }

    void hello() {
        System.out.println("Hello " + firstName + " " + lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String fName) {
        this.firstName = fName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
