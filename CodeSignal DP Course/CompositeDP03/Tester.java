package CompositeDP03;

public class Tester implements Employee {
    private String testerName;
    private long testerId;
    private String testerPosition;

    public Tester(long testerId, String testerName, String testerPosition) {
        // TODO: Initialize testerId, testerName, and testerPosition
        this.testerId = testerId;
        this.testerName = testerName;
        this.testerPosition = testerPosition;
    }

    @Override
    public void displayEmployeeInfo() {
        System.out.println(testerId + " " + testerName + " " + testerPosition);
    }
}
