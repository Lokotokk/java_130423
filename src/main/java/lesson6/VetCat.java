package lesson6;

public class VetCat extends Cat{
    String medicalHistory;
    boolean isSterilized;

    public VetCat(int age, String name, String breed, boolean isMale, String medicalHistory, boolean isSterilized) {
        super(age, name, breed, isMale);
        this.isSterilized = isSterilized;
        this.medicalHistory = medicalHistory;
    }

    @Override
    public String toString() {
        return super.toString() + " " + medicalHistory;
    }
}
