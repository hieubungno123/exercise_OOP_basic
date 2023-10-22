package statics;

public enum JobType {
    DEVELOPER("Developer"),
    SALE("Sale"),
    DESIGNER("Designer"),
    MANAGER("Manager");

    public  String value;

    JobType(String value) {
        this.value = value;
    }
}
