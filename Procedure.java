public class Procedure {
    private String procedureName;
    private String procedureDate;
    private String procedurePractitioner;
    private double charges;

    public Procedure() {
    }

    public Procedure(String procedureName, String procedureDate) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
    }

    public Procedure(String procedureName, String procedureDate, String procedurePractitioner, double charges) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.procedurePractitioner = procedurePractitioner;
        this.charges = charges;
    }

    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    public void setProcedureDate(String procedureDate) {
        this.procedureDate = procedureDate;
    }

    public void setProcedurePractitioner(String procedurePractitioner) {
        this.procedurePractitioner = procedurePractitioner;
    }

    public void setCharges(double charges) {
        this.charges = charges;
    }
    
    public String getProcedureName() {
        return procedureName;
    }

    public String getProcedureDate() {
        return procedureDate;
    }

    public String getProcedurePractitioner() {
        return procedurePractitioner;
    }

    public double getCharges() {
        return charges;
    }

    public String toString() {
        return "\nProcedure: " + procedureName + "\n" +
                "Procedure Date: " + procedureDate + "\n" +
                "Practitioner: " + procedurePractitioner + "\n" +
                "Charges: $" + charges;
    }
}
