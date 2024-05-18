public class Course {
    private String courseName;
    private String courseGrade;
    private int noCredits;

    // Constructors
    public Course() {
        this("", "", 0);
    }

    public Course(String courseName, String courseGrade, int noCredits) {
        this.courseName = courseName;
        this.courseGrade = courseGrade;
        this.noCredits = noCredits;
    }

    // Getters and Setters
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseGrade() {
        return courseGrade;
    }

    public void setCourseGrade(String courseGrade) {
        this.courseGrade = courseGrade;
    }

    public int getNoCredits() {
        return noCredits;
    }

    public void setNoCredits(int noCredits) {
        this.noCredits = noCredits;
    }
}
