package CompositeDP03;

public class Designer implements Employee {
    private String designerName;
    private long designerId;
    private String designerPosition;

    public Designer(long designerId, String designerName, String designerPosition) {
        // TODO: Initialize designerId, designerName, and designerPosition
        this.designerId = designerId;
        this.designerName = designerName;
        this.designerPosition = designerPosition;
    }

    @Override
    public void displayEmployeeInfo() {
        System.out.println(designerId + " " + designerName + " " + designerPosition);
    }
}