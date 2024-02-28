public class Patient {
    
    private String firstName;
    private String middleName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNum;
    private String emergencyName;
    private String emergencyNum;

    public Patient() {
    
    }

    public Patient(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public Patient(String firstName, String middleName, String lastName,
                   String streetAddress, String city, String state, String zipCode,
                   String phoneNum, String emergencyName, String emergencyNum) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNum = phoneNum;
        this.emergencyName = emergencyName;
        this.emergencyNum = emergencyNum;
    }

    // Accessors
    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getEmergencyName() {
        return emergencyName;
    }

    public String getEmergencyNum() {
        return emergencyNum;
    }

    // Mutators
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setEmergencyName(String emergencyName) {
        this.emergencyName = emergencyName;
    }

    public void setEmergencyNum(String emergencyNum) {
        this.emergencyNum = emergencyNum;
    }

    // Build method
    public String buildFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    public String buildAddress() {
        return streetAddress + " " + city + " " + state + " " + zipCode;
    }

    public String buildEmergencyContact() {
        return emergencyName + " " + emergencyNum;
    }

    // toString method
    public String toString() {
        return "\nPatient Information:\n" +
                "Name: " + buildFullName() + "\n" +
                "Address: " + buildAddress() + "\n" +
                "Phone: " + phoneNum + "\n" +
                "Emergency Contact: " + buildEmergencyContact();
    }
}