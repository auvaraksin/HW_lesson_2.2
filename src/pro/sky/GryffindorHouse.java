package pro.sky;

import java.util.Objects;

public class GryffindorHouse extends HogwartsSchool {
    private int chivalryValue;
    private int honourValue;
    private int braveryValue;

    public GryffindorHouse(String studentName, int studentMagicPowerValue, int studentTransgressionValue,
                           int chivalryValue, int honourValue, int braveryValue) {
        super(studentName, studentMagicPowerValue, studentTransgressionValue);
        this.chivalryValue = chivalryValue;
        this.honourValue = honourValue;
        this.braveryValue = braveryValue;
    }

    public int getChivalryValue() {
        return chivalryValue;
    }

    public int getHonourValue() {
        return honourValue;
    }

    public int getBraveryValue() {
        return braveryValue;
    }

    public void setChivalryValue(int chivalryValue) {
        this.chivalryValue = chivalryValue;
    }

    public void setHonourValue(int honourValue) {
        this.honourValue = honourValue;
    }

    public void setBraveryValue(int braveryValue) {
        this.braveryValue = braveryValue;
    }

    @Override
    public String toString() {
        return getStudentName() + ": сила магии = "
                + getStudentMagicPowerValue() + ", расстояние трансгрессии = "
                + getStudentTransgressionValue() + ", благородство = "
                + chivalryValue + ", честь = "
                + honourValue + ", храбрость = "
                + braveryValue;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        GryffindorHouse student = (GryffindorHouse) object;
        return getStudentName().equals(student.getStudentName())
                && getStudentMagicPowerValue() == student.getStudentMagicPowerValue()
                && getStudentTransgressionValue() == student.getStudentTransgressionValue()
                && chivalryValue == student.chivalryValue
                && honourValue == student.honourValue
                && braveryValue == student.braveryValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudentName(), getStudentMagicPowerValue(), getStudentTransgressionValue(),
                chivalryValue, honourValue, braveryValue);
    }
}