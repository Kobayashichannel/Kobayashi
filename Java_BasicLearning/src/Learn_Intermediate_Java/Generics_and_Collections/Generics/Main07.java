package Learn_Intermediate_Java.Generics_and_Collections.Generics;

public class Main07 {
    public static void main(String[] args) {
        Bus05<Student05> studentBus = new Bus05<>(new Student05("Mike", "Math"));
        Bus05<SchoolPerson05> personBus = new Bus05<>(new SchoolPerson05("Jerry"));

        transferData(studentBus, personBus);
    }

    public static void transferData(Bus05<? extends Student05> src, Bus05<? super SchoolPerson05> dsc) {
        System.out.print("dsc bus rider before switch: ");
        dsc.printRider();
        Student05 studentInSrcBus = src.getRider();
        System.out.print("dsc bus rider after switch: ");
        dsc.setRider(studentInSrcBus);
        dsc.printRider();
    }
}
