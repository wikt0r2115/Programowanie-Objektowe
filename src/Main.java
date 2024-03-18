public class Main {
    public static void main(String[] args) {
        Film Avatar = new Film();

        Avatar.setNameMovie("Avatar");
        Avatar.setYearMovie("2004");
        Avatar.setNameAuthor("Janusz");
        Avatar.setSurName("Kowalski");
        Avatar.setYearAuthor("1900");

        Film Mulan = Avatar;
        Mulan.setNameMovie("Mulan");

        System.out.println(Avatar.Info());
        System.out.println(Mulan.Info());

        Car Car1 = new Car();
        System.out.println(Car1.InfoCar());

        Car Car2 = new Car("Lambo","2024","95");
        System.out.println(Car2.InfoCar());

        Car Car3 = new Car("Opel","2019","95","Czarny");
        System.out.println(Car3.InfoCar());
    }
}