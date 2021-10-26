
public class Person {
    protected int id;
    protected String name;
    protected int yearOfBirth;
    protected GenderEnum gender;

    public Person() {
        id = 1;
    }

    public Person(int id, String name, int yearOfBirth, GenderEnum gender) {
        this.id = id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("YearOfBirth: " + yearOfBirth);
        System.out.println("Gender: " + gender.getGenderEnum());
    }
}

