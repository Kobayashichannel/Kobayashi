package Learn_Intermediate_Java.Generics_and_Collections.Generics;

public class Teacher05 extends SchoolPerson05 {
    private String subject;

    public Teacher05(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return this.subject;
    }

    public String toString() {
        return "Teacher = (name = "+this.getName()+", subject = "+ this.subject+")";
    }
}
