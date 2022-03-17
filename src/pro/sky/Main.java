package pro.sky;

public class Main {

    public static void printStudentsList(GryffindorHouse[] studentList) {
        System.out.println("Список студентов факультета Гриффиндор");
        for (int i = 0; i < studentList.length; i++) {
            System.out.println(studentList[i]);
        }
        System.out.println(">==================================================================================================================================<");
    }

    public static void printStudentsList(HufflepuffHouse[] studentList) {
        System.out.println("Список студентов факультета Пуффендуй");
        for (int i = 0; i < studentList.length; i++) {
            System.out.println(studentList[i]);
        }
        System.out.println(">==================================================================================================================================<");
    }

    public static void printStudentsList(RavenclawHouse[] studentList) {
        System.out.println("Список студентов факультета Когтевран");
        for (int i = 0; i < studentList.length; i++) {
            System.out.println(studentList[i]);
        }
        System.out.println(">==================================================================================================================================<");
    }

    public static void printStudentsList(SlytherinHouse[] studentList) {
        System.out.println("Список студентов факультета Слизерин");
        for (int i = 0; i < studentList.length; i++) {
            System.out.println(studentList[i]);
        }
        System.out.println(">==================================================================================================================================<");
    }

    public static void compareStudentsSkills(GryffindorHouse student1, GryffindorHouse student2) {
        //сравнение силы магии
        if (student1.getStudentMagicPowerValue() > student2.getStudentMagicPowerValue()) {
            System.out.println("Сила магии " + student1.getStudentName() + " больше, чем у " + student2.getStudentName());
        };
        if (student1.getStudentMagicPowerValue() < student2.getStudentMagicPowerValue()) {
            System.out.println("Сила магии " + student2.getStudentName() + " меньше, чем у " + student1.getStudentName());
        };
        if (student1.getStudentMagicPowerValue() == student2.getStudentMagicPowerValue()) {
            System.out.println("Сила магии " + student1.getStudentName() + " равна силе магии " + student2.getStudentName());
        };
        //сравнение расстояние трансгрессии
        if (student1.getStudentTransgressionValue() > student2.getStudentTransgressionValue()) {
            System.out.println("Расстояние трансгрессии " + student1.getStudentName() + " длиннее, чем у " + student2.getStudentName());
        };
        if (student1.getStudentTransgressionValue() < student2.getStudentTransgressionValue()) {
            System.out.println("Расстояние трансгрессии " + student2.getStudentName() + " короче, чем у " + student1.getStudentName());
        };
        if (student1.getStudentTransgressionValue() == student2.getStudentTransgressionValue()) {
            System.out.println("Расстояние трансгрессии " + student1.getStudentName() + " равно расстоянию трансгресии " + student2.getStudentName());
        };
        //сравнение благородства
        if (student1.getChivalryValue() > student2.getChivalryValue()) {
            System.out.println("Благородство " + student1.getStudentName() + " больше, чем у " + student2.getStudentName());
        };
        if (student1.getChivalryValue() < student2.getChivalryValue()) {
            System.out.println("Благородство " + student1.getStudentName() + " меньше, чем у " + student2.getStudentName());
        };
        if (student1.getChivalryValue() == student2.getChivalryValue()) {
            System.out.println("Благородство " + student1.getStudentName() + " равно благородству " + student2.getStudentName());
        };
        //сравнение чести
        if (student1.getHonourValue() > student2.getHonourValue()) {
            System.out.println("Честь " + student1.getStudentName() + " больше, чем у " + student2.getStudentName());
        };
        if (student1.getHonourValue() < student2.getHonourValue()) {
            System.out.println("Честь " + student1.getStudentName() + " меньше, чем у " + student2.getStudentName());
        };
        if (student1.getHonourValue() == student2.getHonourValue()) {
            System.out.println("Честь " + student1.getStudentName() + " равна чести " + student2.getStudentName());
        };
        //сравнение храбрости
        if (student1.getBraveryValue() > student2.getBraveryValue()) {
            System.out.println("Храбрость " + student1.getStudentName() + " больше, чем у " + student2.getStudentName());
        };
        if (student1.getBraveryValue() < student2.getBraveryValue()) {
            System.out.println("Храбрость " + student1.getStudentName() + " меньше, чем у " + student2.getStudentName());
        };
        if (student1.getBraveryValue() == student2.getBraveryValue()) {
            System.out.println("Храбрость " + student1.getStudentName() + " равна храбрости " + student2.getStudentName());
        };
        System.out.println(">==================================================================================================================================<");
    }

    public static void compareStudentsSkills(HufflepuffHouse student1, HufflepuffHouse student2) {
        //сравнение силы магии
        if (student1.getStudentMagicPowerValue() > student2.getStudentMagicPowerValue()) {
            System.out.println("Сила магии " + student1.getStudentName() + " больше, чем у " + student2.getStudentName());
        };
        if (student1.getStudentMagicPowerValue() < student2.getStudentMagicPowerValue()) {
            System.out.println("Сила магии " + student2.getStudentName() + " меньше, чем у " + student1.getStudentName());
        };
        if (student1.getStudentMagicPowerValue() == student2.getStudentMagicPowerValue()) {
            System.out.println("Сила магии " + student1.getStudentName() + " равна силе магии " + student2.getStudentName());
        };
        //сравнение расстояние трансгрессии
        if (student1.getStudentTransgressionValue() > student2.getStudentTransgressionValue()) {
            System.out.println("Расстояние трансгрессии " + student1.getStudentName() + " длиннее, чем у " + student2.getStudentName());
        };
        if (student1.getStudentTransgressionValue() < student2.getStudentTransgressionValue()) {
            System.out.println("Расстояние трансгрессии " + student2.getStudentName() + " короче, чем у " + student1.getStudentName());
        };
        if (student1.getStudentTransgressionValue() == student2.getStudentTransgressionValue()) {
            System.out.println("Расстояние трансгрессии " + student1.getStudentName() + " равно расстоянию трансгресии " + student2.getStudentName());
        };
        //сравнение трудолюбия
        if (student1.getHardworkValue() > student2.getHardworkValue()) {
            System.out.println("Трудолюбие " + student1.getStudentName() + " больше, чем у " + student2.getStudentName());
        };
        if (student1.getHardworkValue() < student2.getHardworkValue()) {
            System.out.println("Трудолюбие " + student1.getStudentName() + " меньше, чем у " + student2.getStudentName());
        };
        if (student1.getHardworkValue() == student2.getHardworkValue()) {
            System.out.println("Трудолюбие " + student1.getStudentName() + " равно трудолюбию " + student2.getStudentName());
        };
        //сравнение верности
        if (student1.getLoyaltyValue() > student2.getLoyaltyValue()) {
            System.out.println("Верность " + student1.getStudentName() + " больше, чем у " + student2.getStudentName());
        };
        if (student1.getLoyaltyValue() < student2.getLoyaltyValue()) {
            System.out.println("Верность " + student1.getStudentName() + " меньше, чем у " + student2.getStudentName());
        };
        if (student1.getLoyaltyValue() == student2.getLoyaltyValue()) {
            System.out.println("Верность " + student1.getStudentName() + " равна верности " + student2.getStudentName());
        };
        //сравнение честности
        if (student1.getJusticeValue() > student2.getJusticeValue()) {
            System.out.println("Честность " + student1.getStudentName() + " больше, чем у " + student2.getStudentName());
        };
        if (student1.getJusticeValue() < student2.getJusticeValue()) {
            System.out.println("Честность " + student1.getStudentName() + " меньше, чем у " + student2.getStudentName());
        };
        if (student1.getJusticeValue() == student2.getJusticeValue()) {
            System.out.println("Честность " + student1.getStudentName() + " равна честности " + student2.getStudentName());
        };
        System.out.println(">==================================================================================================================================<");
    }

    public static void compareStudentsSkills(RavenclawHouse student1, RavenclawHouse student2) {
        //сравнение силы магии
        if (student1.getStudentMagicPowerValue() > student2.getStudentMagicPowerValue()) {
            System.out.println("Сила магии " + student1.getStudentName() + " больше, чем у " + student2.getStudentName());
        };
        if (student1.getStudentMagicPowerValue() < student2.getStudentMagicPowerValue()) {
            System.out.println("Сила магии " + student2.getStudentName() + " меньше, чем у " + student1.getStudentName());
        };
        if (student1.getStudentMagicPowerValue() == student2.getStudentMagicPowerValue()) {
            System.out.println("Сила магии " + student1.getStudentName() + " равна силе магии " + student2.getStudentName());
        };
        //сравнение расстояние трансгрессии
        if (student1.getStudentTransgressionValue() > student2.getStudentTransgressionValue()) {
            System.out.println("Расстояние трансгрессии " + student1.getStudentName() + " длиннее, чем у " + student2.getStudentName());
        };
        if (student1.getStudentTransgressionValue() < student2.getStudentTransgressionValue()) {
            System.out.println("Расстояние трансгрессии " + student2.getStudentName() + " короче, чем у " + student1.getStudentName());
        };
        if (student1.getStudentTransgressionValue() == student2.getStudentTransgressionValue()) {
            System.out.println("Расстояние трансгрессии " + student1.getStudentName() + " равно расстоянию трансгресии " + student2.getStudentName());
        };
        //сравнение ума
        if (student1.getIntelligenceValue() > student2.getIntelligenceValue()) {
            System.out.println("Ум " + student1.getStudentName() + " больше, чем у " + student2.getStudentName());
        };
        if (student1.getIntelligenceValue() < student2.getIntelligenceValue()) {
            System.out.println("Ум " + student1.getStudentName() + " меньше, чем у " + student2.getStudentName());
        };
        if (student1.getIntelligenceValue() == student2.getIntelligenceValue()) {
            System.out.println("Ум " + student1.getStudentName() + " равен уму " + student2.getStudentName());
        };
        //сравнение мудрости
        if (student1.getWisdomValue() > student2.getWisdomValue()) {
            System.out.println("Мудрость " + student1.getStudentName() + " больше, чем у " + student2.getStudentName());
        };
        if (student1.getWisdomValue() < student2.getWisdomValue()) {
            System.out.println("Мудрость " + student1.getStudentName() + " меньше, чем у " + student2.getStudentName());
        };
        if (student1.getWisdomValue() == student2.getWisdomValue()) {
            System.out.println("Мудрость " + student1.getStudentName() + " равна мудрости " + student2.getStudentName());
        };
        //сравнение остроумия
        if (student1.getWitValue() > student2.getWitValue()) {
            System.out.println("Остроумие " + student1.getStudentName() + " больше, чем у " + student2.getStudentName());
        };
        if (student1.getWitValue() < student2.getWitValue()) {
            System.out.println("Остроумие " + student1.getStudentName() + " меньше, чем у " + student2.getStudentName());
        };
        if (student1.getWitValue() == student2.getWitValue()) {
            System.out.println("Остроумие " + student1.getStudentName() + " равно остроумию " + student2.getStudentName());
        };
        //сравнение творчества
        if (student1.getCreativeValue() > student2.getCreativeValue()) {
            System.out.println("Творчество " + student1.getStudentName() + " больше, чем у " + student2.getStudentName());
        };
        if (student1.getCreativeValue() < student2.getCreativeValue()) {
            System.out.println("Творчество " + student1.getStudentName() + " меньше, чем у " + student2.getStudentName());
        };
        if (student1.getCreativeValue() == student2.getCreativeValue()) {
            System.out.println("Творчество " + student1.getStudentName() + " равно творчеству " + student2.getStudentName());
        };
        System.out.println(">==================================================================================================================================<");
    }

    public static void compareStudentsSkills(SlytherinHouse student1, SlytherinHouse student2) {
        //сравнение силы магии
        if (student1.getStudentMagicPowerValue() > student2.getStudentMagicPowerValue()) {
            System.out.println("Сила магии " + student1.getStudentName() + " больше, чем у " + student2.getStudentName());
        };
        if (student1.getStudentMagicPowerValue() < student2.getStudentMagicPowerValue()) {
            System.out.println("Сила магии " + student2.getStudentName() + " меньше, чем у " + student1.getStudentName());
        };
        if (student1.getStudentMagicPowerValue() == student2.getStudentMagicPowerValue()) {
            System.out.println("Сила магии " + student1.getStudentName() + " равна силе магии " + student2.getStudentName());
        };
        //сравнение расстояние трансгрессии
        if (student1.getStudentTransgressionValue() > student2.getStudentTransgressionValue()) {
            System.out.println("Расстояние трансгрессии " + student1.getStudentName() + " длиннее, чем у " + student2.getStudentName());
        };
        if (student1.getStudentTransgressionValue() < student2.getStudentTransgressionValue()) {
            System.out.println("Расстояние трансгрессии " + student2.getStudentName() + " короче, чем у " + student1.getStudentName());
        };
        if (student1.getStudentTransgressionValue() == student2.getStudentTransgressionValue()) {
            System.out.println("Расстояние трансгрессии " + student1.getStudentName() + " равно расстоянию трансгресии " + student2.getStudentName());
        };
        //сравнение хитрости
        if (student1.getCunningValue() > student2.getCunningValue()) {
            System.out.println("Хитрость} " + student1.getStudentName() + " больше, чем у " + student2.getStudentName());
        };
        if (student1.getCunningValue() < student2.getCunningValue()) {
            System.out.println("Хитрость " + student1.getStudentName() + " меньше, чем у " + student2.getStudentName());
        };
        if (student1.getCunningValue() == student2.getCunningValue()) {
            System.out.println("Хитрость " + student1.getStudentName() + " равен хитрости " + student2.getStudentName());
        };
        //сравнение решительнсоти
        if (student1.getResolutenessValue() > student2.getResolutenessValue()) {
            System.out.println("Решимость " + student1.getStudentName() + " больше, чем у " + student2.getStudentName());
        };
        if (student1.getResolutenessValue() < student2.getResolutenessValue()) {
            System.out.println("Решимость " + student1.getStudentName() + " меньше, чем у " + student2.getStudentName());
        };
        if (student1.getResolutenessValue() == student2.getResolutenessValue()) {
            System.out.println("Решимость " + student1.getStudentName() + " равна решимости " + student2.getStudentName());
        };
        //сравнение амбициозности
        if (student1.getAmbitionValue() > student2.getAmbitionValue()) {
            System.out.println("Амбициозность " + student1.getStudentName() + " больше, чем у " + student2.getStudentName());
        };
        if (student1.getAmbitionValue() < student2.getAmbitionValue()) {
            System.out.println("Амбициозность " + student1.getStudentName() + " меньше, чем у " + student2.getStudentName());
        };
        if (student1.getAmbitionValue() == student2.getAmbitionValue()) {
            System.out.println("Амбициозность " + student1.getStudentName() + " равна амбициозности " + student2.getStudentName());
        };
        //сравнение находчивости
        if (student1.getResourcefulnessValue() > student2.getResourcefulnessValue()) {
            System.out.println("Находчивость " + student1.getStudentName() + " больше, чем у " + student2.getStudentName());
        };
        if (student1.getResourcefulnessValue() < student2.getResourcefulnessValue()) {
            System.out.println("Находчивость " + student1.getStudentName() + " меньше, чем у " + student2.getStudentName());
        };
        if (student1.getResourcefulnessValue() == student2.getResourcefulnessValue()) {
            System.out.println("Находчивость " + student1.getStudentName() + " равна находчивости " + student2.getStudentName());
        };
        //сравнение жажды власти
        if (student1.getLeadershipValue() > student2.getLeadershipValue()) {
            System.out.println("Жажда власти " + student1.getStudentName() + " больше, чем у " + student2.getStudentName());
        };
        if (student1.getLeadershipValue() < student2.getLeadershipValue()) {
            System.out.println("Жажда власти " + student1.getStudentName() + " меньше, чем у " + student2.getStudentName());
        };
        if (student1.getLeadershipValue() == student2.getLeadershipValue()) {
            System.out.println("Жажда власти " + student1.getStudentName() + " равна жажде власти " + student2.getStudentName());
        };
        System.out.println(">==================================================================================================================================<");
    }

    public static void compareStudentsMagicSkills(HogwartsSchool student1, HogwartsSchool student2) {
        //сравнение силы магии
        if (student1.getStudentMagicPowerValue() > student2.getStudentMagicPowerValue()) {
            System.out.println("Сила магии " + student1.getStudentName() + " больше, чем у " + student2.getStudentName());
        };
        if (student1.getStudentMagicPowerValue() < student2.getStudentMagicPowerValue()) {
            System.out.println("Сила магии " + student2.getStudentName() + " меньше, чем у " + student1.getStudentName());
        };
        if (student1.getStudentMagicPowerValue() == student2.getStudentMagicPowerValue()) {
            System.out.println("Сила магии " + student1.getStudentName() + " равна силе магии " + student2.getStudentName());
        };
        //сравнение расстояние трансгрессии
        if (student1.getStudentTransgressionValue() > student2.getStudentTransgressionValue()) {
            System.out.println("Расстояние трансгрессии " + student1.getStudentName() + " длиннее, чем у " + student2.getStudentName());
        };
        if (student1.getStudentTransgressionValue() < student2.getStudentTransgressionValue()) {
            System.out.println("Расстояние трансгрессии " + student2.getStudentName() + " короче, чем у " + student1.getStudentName());
        };
        if (student1.getStudentTransgressionValue() == student2.getStudentTransgressionValue()) {
            System.out.println("Расстояние трансгрессии " + student1.getStudentName() + " равно расстоянию трансгресии " + student2.getStudentName());
        };
        System.out.println(">==================================================================================================================================<");
    }

    public static void main(String[] args) {
        GryffindorHouse[] gryffindorHousesStudentsList = {
                new GryffindorHouse("Гарри Поттер", 100, 100,
                        100, 100, 100),
                new GryffindorHouse("Гермиона Грейнджер", 75, 100,
                        70, 52, 25),
                new GryffindorHouse("Рон Уизли", 75, 33,
                        70, 70, 100)
        };
        HufflepuffHouse[] hufflepuffHouseStudentsList = {
                new HufflepuffHouse("Захария Смит", 55, 12,
                        23, 46, 75),
                new HufflepuffHouse("Седрик Диггори", 96, 69,
                        77, 90, 99),
                new HufflepuffHouse("Джастин Финч-Флетчли", 57, 57,
                        57, 57, 57)
        };
        RavenclawHouse[] ravenclawHouseStudentsList = {
                new RavenclawHouse("Чжоу Чанг", 17, 1,
                        0, 0, 2, 99),
                new RavenclawHouse("Падма Патил", 88, 74,
                        86, 80, 71, 91),
                new RavenclawHouse("Маркус Белби", 66, 50,
                        75, 60, 50, 47)
        };
        SlytherinHouse[] slytherinHousepStudentList = {
                new SlytherinHouse("Драко Малфой", 99, 97,
                        97, 97, 100, 97, 100),
                new SlytherinHouse("Грэхэм Монтегю", 95, 93,
                        100, 93, 90, 100, 80),
                new SlytherinHouse("Грегори Гойл", 90, 80,
                        92, 70, 70, 90, 100)
        };
        printStudentsList(gryffindorHousesStudentsList);
        printStudentsList(hufflepuffHouseStudentsList);
        printStudentsList(ravenclawHouseStudentsList);
        printStudentsList(slytherinHousepStudentList);
        compareStudentsSkills(gryffindorHousesStudentsList[1], gryffindorHousesStudentsList[2]);
        compareStudentsSkills(hufflepuffHouseStudentsList[0], hufflepuffHouseStudentsList[1]);
        compareStudentsSkills(ravenclawHouseStudentsList[1], ravenclawHouseStudentsList[2]);
        compareStudentsSkills(slytherinHousepStudentList[0], slytherinHousepStudentList[2]);
        compareStudentsMagicSkills(gryffindorHousesStudentsList[0], slytherinHousepStudentList[0]);
    }
}