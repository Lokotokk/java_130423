package lesson6;

public class ShowCat extends Cat {
    int place;
    String showName;

    public ShowCat(int age, String name, String breed, boolean isMale, int place, String showName) {
        super(age, name, breed, isMale);
        this.place = place;
        this.showName = showName;
    }

    @Override
    public String toString() {
        return super.toString() + " " + showName;
    }
}
