//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Laborator_1.Classes;

public enum StudyField {
    MECHANICAL_ENGINEERING,
    SOFTWARE_ENGINEERING,
    FOOD_TECHNOLOGY,
    URBANISM_ARCHITECTURE,
    VETERINARY_MEDICINE;

    private StudyField() {
    }

    public static boolean validation(String field) {
        StudyField[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            StudyField studyField = var1[var3];
            if (studyField.name().equals(field)) {
                return true;
            }
        }

        return false;
    }
}
