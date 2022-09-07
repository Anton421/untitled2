public class Main {
    public static void main (String[] args) {
        Student student = new Aspirant ();

        Student Vova  = new Student();
        Vova.firstName = "Max";
        Vova.lastName = "Stepanov";
        Vova.group = "PKS-320";
        Vova.averageMark = 5.0;

        Aspirant Danil = new Aspirant ();
        Danil.firstName = "Andrey";
        Danil.lastName = "Krivkin";
        Danil.group = "ISP-217";
        Danil.averageMark = 4.5;

        Student[] all = {Vova, Danil};

        for (int i = 0; i < all.length ;i++){
            all [i].getScholarship ();
        }
    }
}