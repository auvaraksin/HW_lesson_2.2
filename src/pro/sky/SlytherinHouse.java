package pro.sky;

import java.util.Objects;

public class SlytherinHouse extends HogwartsSchool {
    private int cunningValue;
    private int ambitionValue;
    private int resolutenessValue;
    private int resourcefulnessValue;
    private int leadershipValue;

    public SlytherinHouse(String studentName, int studentMagicPowerValue, int studentTransgressionValue,
                          int cunningValue, int resolutenessValue, int ambitionValue, int resourcefulnessValue,
                          int leadershipValue) {
        super(studentName, studentMagicPowerValue, studentTransgressionValue);
        this.cunningValue = cunningValue;
        this.resolutenessValue = resolutenessValue;
        this.ambitionValue = ambitionValue;
        this.resourcefulnessValue = resourcefulnessValue;
        this.leadershipValue = leadershipValue;
    }

    public int getCunningValue() {
        return cunningValue;
    }

    public int getResolutenessValue() {
        return resolutenessValue;
    }

    public int getAmbitionValue() {
        return ambitionValue;
    }

    public int getResourcefulnessValue() {
        return resourcefulnessValue;
    }

    public int getLeadershipValue() {
        return leadershipValue;
    }

    public void setCunningValue(int cunningValue) {
        this.cunningValue = cunningValue;
    }

    public void setResolutenessValue(int resolutenessValue) {
        this.resolutenessValue = resolutenessValue;
    }

    public void setAmbitionValue(int ambitionValue) {
        this.ambitionValue = ambitionValue;
    }

    public void setResourcefulnessValue(int resourcefulnessValue) {
        this.resourcefulnessValue = resourcefulnessValue;
    }

    public void setLeadershipValue(int leadershipValue) {
        this.leadershipValue = leadershipValue;
    }

    @Override
    public String toString() {
        return getStudentName() + ": сила магии = "
                + getStudentMagicPowerValue() + ", расстояние трансгрессии = "
                + getStudentTransgressionValue() + ", хитрость = "
                + cunningValue + ", решительность = "
                + resolutenessValue + ", амбициозность = "
                + ambitionValue + ", находчивость = "
                + resourcefulnessValue + ", жажда власти = "
                + leadershipValue;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        SlytherinHouse student = (SlytherinHouse) object;
        return getStudentName().equals(student.getStudentName())
                && getStudentMagicPowerValue() == student.getStudentMagicPowerValue()
                && getStudentTransgressionValue() == student.getStudentTransgressionValue()
                && cunningValue == student.cunningValue
                && resolutenessValue == student.resolutenessValue
                && ambitionValue == student.ambitionValue
                && resourcefulnessValue == student.resolutenessValue
                && leadershipValue == student.leadershipValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudentName(), getStudentMagicPowerValue(), getStudentTransgressionValue(),
                cunningValue, resolutenessValue, ambitionValue, resourcefulnessValue, leadershipValue);
    }
}