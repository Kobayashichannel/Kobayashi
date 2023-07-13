package Learn_Intermediate_Java.Generics_and_Collections.Generics;

public class Student05 extends SchoolPerson05 {
    private String bestSubject;

    public Student05(String name, String bestSubject) {
        super(name);
        this.bestSubject = bestSubject;
    }

    public String getBestSubject() {
        return this.bestSubject;
    }

    public void setSubject(String bestSubject) {
        this.bestSubject = bestSubject;
    }

    public String toString() {
        return "Student = (name = "+this.getName()+", bestSubject = "+ this.bestSubject+")";
    }
}
