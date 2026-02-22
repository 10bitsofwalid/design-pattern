public class MainSite {
    public static void main(String[] args) {
        CourseManagementModule crsmod = new CourseManagementModule();
        OnlineExamModule onexmod = new OnlineExamModule();

        crsmod.performAction();
        onexmod.performAction();
    }
}
