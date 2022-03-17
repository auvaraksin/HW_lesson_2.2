package pro.sky;

import java.util.Objects;

public class HufflepuffHouse extends HogwartsSchool {
    private int hardworkValue;
    private int loyaltyValue;
    private int justiceValue;

    public HufflepuffHouse(String studentName, int studentMagicPowerValue, int studentTransgressionValue,
                           int hardworkValue, int loyaltyValue, int justiceValue) {
        super(studentName, studentMagicPowerValue, studentTransgressionValue);
        this.hardworkValue = hardworkValue;
        this.loyaltyValue = loyaltyValue;
        this.justiceValue = justiceValue;
    }

    public int getHardworkValue() {
        return hardworkValue;
    }

    public int getLoyaltyValue() {
        return loyaltyValue;
    }

    public int getJusticeValue() {
        return justiceValue;
    }

    public void setHardworkValue(int hardworkValue) {
        this.hardworkValue = hardworkValue;
    }

    public void setLoyaltyValue(int loyaltyValue) {
        this.loyaltyValue = loyaltyValue;
    }

    public void setJusticeValue(int justiceValue) {
        this.justiceValue = justiceValue;
    }

    @Override
    public String toString() {
        return getStudentName() + ": сила магии = "
                + getStudentMagicPowerValue() + ", расстояние трансгрессии = "
                + getStudentTransgressionValue() + ", трудолюбие = "
                + hardworkValue + ", верность = "
                + loyaltyValue + ", честность = "
                + justiceValue;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        HufflepuffHouse student = (HufflepuffHouse) object;
        return getStudentName().equals(student.getStudentName())
                && getStudentMagicPowerValue() == student.getStudentMagicPowerValue()
                && getStudentTransgressionValue() == student.getStudentTransgressionValue()
                && hardworkValue == student.hardworkValue
                && loyaltyValue == student.loyaltyValue
                && justiceValue == student.justiceValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudentName(), getStudentMagicPowerValue(), getStudentTransgressionValue(),
                hardworkValue, loyaltyValue, justiceValue);
    }
}