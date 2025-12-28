public class Student extends Human {

    private String major;
    private float attendance;

    public Student(int age, String name, boolean hasKids, String major, float attendance) {
        super(age, name, hasKids);
        this.major = major;
        this.attendance = attendance;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getAttendance() {
        return attendance;
    }

    public void setAttendance(float attendance) {
        this.attendance = attendance;
    }

    @Override
    public String getRole() {
        return "Student";
    }
}

