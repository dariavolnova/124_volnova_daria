public class Car {

    private String name, brand;
    private int year, total_distance;

    public Car(String name, String brand, int year, int total_distance) {
        this.name = name;
        this.brand = brand;
        this.year = year;
        this.total_distance = total_distance;
    }

    public String getName() {
        return name;
    }
    public String getBrand() {
        return brand;
    }
    public int getYear() {
        return year;
    }
    public int getTotal_distance() {
        return total_distance;
    }
    public void setName() {
        this.name = name;
    }
    public void setYear() {
        this.year = year;
    }
    public void setBrand() {
        this.brand = brand;
    }
    public void setTotal_distance() {
        this.total_distance = total_distance;
    }

    private int distance;
    public int trip(int distance){
        total_distance += distance;
        return total_distance;
    }
}