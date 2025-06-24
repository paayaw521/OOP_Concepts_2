public class Main {
    public static void main(String[] args) {

        Rider rider = new Rider("Rider1", "Kwame A", "1234567890", "Credit Card", 5);
        System.out.println(rider);

        rider.ProcessPayment(20.0);


        Driver driver = new Driver("Driver1", "Kwaku Oppong", "0987654321", "DL12345", "Toyota Camry");
        System.out.println(driver);
        driver.displayProfile();

    }
}