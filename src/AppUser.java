abstract  class AppUser {
    private final String userID;
    private String name;
    private String phoneNumber;
    private String userType;

    public AppUser(String userID, String name, String phoneNumber) {
        this.userID = userID;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    abstract public String getUserType();

    final public void displayProfile() {
        System.out.println("User ID: " + userID);
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("User Type: " + getUserType());
    }

    public String getUserID() {
        return userID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "User ID: " + userID +
               "\nName: " + name +
               "\nPhone Number: " + phoneNumber +
               "\nUser Type: " + getUserType();
    }
}
