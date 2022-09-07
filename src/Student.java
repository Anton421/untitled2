public class Student {
    String firstName, lastName, group;
    double averageMark;

    void getScholarship(){
        if (averageMark == 5 ){
            System.out.println("Сумма стипендии = 10.000 руб");
        }
        else {
            System.out.println("Сумма стипендии = 8.000 руб");
        }
    }
}