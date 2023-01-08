public class Student {
    private String name;
    private int age;
    private String group;
    private float mean_score;

    public Student(String name, int age, String group, float mean_score) {
        this.name = name;
        this.age = age;
        this.group = group;
        this.mean_score = mean_score;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGroup() {
        return group;
    }
    public float getMean_score() {
        return mean_score;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGroup() {
        this.group = group;
    }
    public void setMean_score() {
        this.mean_score = mean_score;
    }
}