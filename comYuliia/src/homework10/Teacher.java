package homework10;

class Teacher extends SuperEntity{
    private int experience;
    static int count;

    public Teacher() {
        count++;
    }
    public Teacher(int id) {
        super(id);
    }

    public Teacher(String name, int id) {
        super(name, id);
    }

    public Teacher(String name, int id, int experience) {
        super(name, id);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}


