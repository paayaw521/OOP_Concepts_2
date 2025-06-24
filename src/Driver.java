public class Driver extends AppUser{
    @Override
    public String getUserType() {
        return "Driver";
    }
    private String licenseNumber;
    private String vehicleInfo;

    public Driver(String userID, String name, String phoneNumber, String licenseNumber, String vehicleInfo) {
        super(userID, name, phoneNumber);
        this.licenseNumber = licenseNumber;
        this.vehicleInfo = vehicleInfo;
    }
    public Driver(String name){
        super("defaultID", name, "defaultPhone");
        this.licenseNumber = "defaultLicense";
        this.vehicleInfo = "defaultVehicle";
    }
    public String getLicenseNumber() {
        return licenseNumber;
    }
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
    public String getVehicleInfo() {
        return vehicleInfo;
    }
    public void setVehicleInfo(String vehicleInfo) {
        this.vehicleInfo = vehicleInfo;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nLicense Number: " + licenseNumber +
               "\nVehicle Info: " + vehicleInfo;
    }
}
