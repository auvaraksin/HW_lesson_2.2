package pro.sky;

import java.util.Objects;

public class HogwartsSchool {
    private final String studentName;
    private int studentMagicPowerValue;
    private int studentTransgressionValue;

    public HogwartsSchool(String studentName, int studentMagicPowerValue, int studentTransgressionValue) {
        this.studentName = studentName;
        this.studentMagicPowerValue = studentMagicPowerValue;
        this.studentTransgressionValue = studentTransgressionValue;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentMagicPowerValue() {
        return studentMagicPowerValue;
    }

    public int getStudentTransgressionValue() {
        return studentTransgressionValue;
    }

    public void setStudentMagicPowerValue(int studentMagicPowerValue) {
        this.studentMagicPowerValue = studentMagicPowerValue;
    }

    public void setStudentTransgressionValue(int studentTransgressionValue) {
        this.studentMagicPowerValue = studentTransgressionValue;
    }

    @Override
    public String toString() {
        return studentName + ": сила магии = "
                + studentMagicPowerValue + ", расстояние трансгрессии = "
                + studentTransgressionValue;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        HogwartsSchool student = (HogwartsSchool) object;
        return studentName.equals(student.studentName)
                && studentMagicPowerValue == student.studentMagicPowerValue
                && studentTransgressionValue == student.studentTransgressionValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentName, studentMagicPowerValue, studentTransgressionValue);
    }
}