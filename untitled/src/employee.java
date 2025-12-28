public class Employee extends Human {

    private String profession;
    private float experience;

    public static int employeeCount = 0;

    public Employee(int age, String name, boolean hasKids, String profession, float experience) {
        super(age, name, hasKids);
        this.profession = profession;
        this.experience = experience;
        employeeCount++;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    @Override
    public String getRole() {
        return "Employee";
    }
}
