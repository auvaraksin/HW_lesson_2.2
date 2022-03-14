package pro.sky;

import java.util.Objects;

public class RavenclawHouse extends HogwartsSchool {
        private int intelligenceValue;
        private int wisdomValue;
        private int witValue;
        private int creativeValue;

        public RavenclawHouse(String studentName, int studentMagicPowerValue, int studentTransgressionValue,
                               int intelligenceValue, int wisdomValue, int witValue, int creativeValue) {
            super(studentName, studentMagicPowerValue, studentTransgressionValue);
            this.intelligenceValue = intelligenceValue;
            this.wisdomValue = wisdomValue;
            this.witValue = witValue;
            this.creativeValue = creativeValue;
        }

        public int getIntelligenceValue() {
            return intelligenceValue;
        }

        public int getWisdomValue() {
            return wisdomValue;
        }

        public int getWitValue() {
            return witValue;
        }

        public int getCreativeValue() {
            return creativeValue;
        }

        public void setIntelligenceValue(int intelligenceValue) {
            this.intelligenceValue = intelligenceValue;
        }

        public void setWisdomValue(int wisdomValue) {
            this.wisdomValue = wisdomValue;
        }

        public void setWitValue(int witValue) {
            this.witValue = witValue;
        }

    public void setCreativeValue(int creativeValue) {
            this.creativeValue = creativeValue;
    }

        @Override
        public String toString() {
            return getStudentName() + ": сила магии = "
                    + getStudentMagicPowerValue() + ", расстояние трансгрессии = "
                    + getStudentTransgressionValue() + ", ум = "
                    + intelligenceValue + ", мудрость = "
                    + wisdomValue + ", остроумие = "
                    + witValue + ", творчество = "
                    + creativeValue;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null || getClass() != object.getClass()) return false;
            RavenclawHouse student = (RavenclawHouse) object;
            return getStudentName().equals(student.getStudentName())
                    && getStudentMagicPowerValue() == student.getStudentMagicPowerValue()
                    && getStudentTransgressionValue() == student.getStudentTransgressionValue()
                    && intelligenceValue == student.intelligenceValue
                    && wisdomValue == student.wisdomValue
                    && witValue == student.witValue
                    && creativeValue == student.creativeValue;
        }

        @Override
        public int hashCode() {
            return Objects.hash(getStudentName(), getStudentMagicPowerValue(), getStudentTransgressionValue(),
                    intelligenceValue, wisdomValue, witValue, creativeValue);
        }
}