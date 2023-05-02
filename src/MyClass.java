import java.util.Arrays;

public class MyClass {
    String firstName;
    String lastName;
    int age;
    Peaksoft peaksofts [];
    String dishhes;
    MyClass(){

    }

    public MyClass(String firstName, String lastName, int age, Peaksoft [] peaksofts, String dishhes) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.peaksofts=peaksofts;
        this.dishhes = dishhes;
    }

    @Override
    public String toString() {
        return "firstName: " + firstName + '\'' +
                " lastName: " + lastName + '\'' +
                " age: " + age +
                " peaksofts: " + Arrays.toString(peaksofts) +
                " dishhes: " + dishhes ;
    }
}
