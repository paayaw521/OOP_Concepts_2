public class Rider extends AppUser implements PaymentCapable {
    @Override
    public String getUserType() {
        return " Rider";
    }

    private String preferredPaymentMethod;
    private int rideCount;

    public Rider(String userID, String name, String phoneNumber, String preferredPaymentMethod, int rideCount) {
        super(userID, name, phoneNumber);
        this.preferredPaymentMethod = preferredPaymentMethod;
        this.rideCount = rideCount;
    }
    public Rider(String name) {
        super("defaultID", name, "defaultPhone");
        this.preferredPaymentMethod = "defaultPayment";
        this.rideCount = 0;
    }

    @Override
    public void ProcessPayment(double amount) {
        System.out.println("Processing payment of " + amount + " using " + preferredPaymentMethod);
    }

    public String getPreferredPaymentMethod() {
        return preferredPaymentMethod;
    }

    public int getRideCount() {
        return rideCount;
    }
    public void setPreferredPaymentMethod(String preferredPaymentMethod) {
        this.preferredPaymentMethod = preferredPaymentMethod;
    }
    public void addRide() {
        this.rideCount++;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nPreferred Payment Method: " + preferredPaymentMethod +
               "\nRide Count: " + rideCount;
    }
}
