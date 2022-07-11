package qlnv;

/**
 *
 * @author AS
 */
public class nhanvien {
    private String id;
    private String name;
    private String gender;
    private int age;
    private double hsl;
    private String position;
    public final static double luongcb=1500;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHsl() {
        return hsl;
    }

    public void setHsl(double hsl) {
        this.hsl = hsl;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public nhanvien() {
    }

    public nhanvien(String id, String name, String gender, int age, double hsl, String position) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.hsl = hsl;
        this.position = position;
    }
    public double luong(){
        return hsl*luongcb;
    }
    @Override
    public String toString() {
        return "nhanvien{" + "id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", hsl=" + hsl + ", position=" + position + '}';
    }
    
    
}
