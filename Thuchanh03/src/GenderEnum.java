
public enum GenderEnum {
    MALE("Male"), FEMALE("Female");
    private String genderEnum;


    private GenderEnum(String genderEnum) {
        this.genderEnum = genderEnum;
    }

    public String getGenderEnum() {
        return genderEnum;
    }

    public void setGenderEnum(String genderEnum) {
        this.genderEnum = genderEnum;
    }
}

