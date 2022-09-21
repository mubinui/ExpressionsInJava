public class Person {
    private String name;
    private String phone;
    private int id ;
    private int mo;

    public Person(String name, String phone, int id, int mo) {
        this.name = name;
        this.phone = phone;
        this.id = id;
        this.mo = mo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMo() {
        return mo;
    }

    public void setMo(int mo) {
        this.mo = mo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", id=" + id +
                ", mo=" + mo +
                '}';
    }
}
