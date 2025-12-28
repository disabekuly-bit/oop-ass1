public class Human {

    private int age;
    private String name;
    private boolean hasKids;

    public Human(int age, String name, boolean hasKids) {
        this.age = age;
        this.name = name;
        this.hasKids = hasKids;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean hasKids() {
        return hasKids;
    }

    public void setHasKids(boolean hasKids) {
        this.hasKids = hasKids;
    }

    public void introduce() {
        System.out.println("Name: " + name + ", age: " + age);
    }

    public String getRole() {
        return "Human";
    }
}
