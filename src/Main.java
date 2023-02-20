public class Main {
    public static void main(String[] args) {
        int a = 0;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~HOME~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
        Family family = new Home("Nurseyit", "Ak bosogo", 5500);
        Family family1 = new Home("Aizat", "Ak bosogo", 5500);
        Family family2 = new Home("Ernazar", "Archa beshik", 5500);
        Family family3 = new Home("Sanjar", "Archa beshik", 5500);
        Family family4 = new Home("Temirlan", "Ak orgo", 5500);
        Family[] families = {family, family1, family2, family3, family4};
        for (Family f : families) {
            a++;
            System.out.println(f);
            System.out.println("The people in the house spent so much: "+f.home());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("In this house " + a + " people live");
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~APARTMENT~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        Family apartment = new Apartment("Manasbek","IHLAS",12000);
        Family apartment1 = new Apartment("Ruslan","IHLAS",12000);
        Family apartment2 = new Apartment("Matmusa","IHLAS",12000);
        Family[] families1 = {apartment1,apartment2,apartment};
        int b = 0;
        for (Family family5 : families1) {
            b++;
            System.out.println(family5);
            System.out.println("The people in the apartment spent so much:"+family5.apartment());
        }
        System.out.println("~~~~~~~~~~~~~~~~");
        System.out.println("In this house " + b + " people live");

        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~HOTEL~~~~~~~~~~~~~~~~~~~~~~~~~");
        Family hotel = new Hotel("Syimyk","AVANGARD",2200);
        Family hotel1 = new Hotel("Baitik","AVANGARD",2200);
        Family[] hotels = {hotel1,hotel};
        int s = 0;
        for (Family hotel2 : hotels) {
            s++;
            System.out.println(hotel2);
            System.out.println("The people in the hotel spent so much: "+hotel2.hotel());
        }
        System.out.println("In this house " + s + " people live");
        }
    }
