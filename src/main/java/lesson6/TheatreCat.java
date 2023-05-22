package lesson6;

public class TheatreCat extends Cat {
    int groupId;
    String capacity;

    public TheatreCat(int age, String name, String breed, boolean isMale, int groupId, String capacity) {
        super(age, name, breed, isMale);
        this.groupId = groupId;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return super.toString() + " " + capacity;
    }
}
