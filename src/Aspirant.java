public class Aspirant extends Student {
    String nauka;



    @Override
    void getScholarship() {
        if (averageMark == 5 ){
            System.out.println("Сумма стипендии = 20.000 руб");
        }
        else {
            System.out.println("Сумма стипендии = 18.000 руб");
        }
    }
}