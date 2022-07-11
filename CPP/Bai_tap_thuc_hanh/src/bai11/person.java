package bai11;

/**
 *
 * @author AS
 */
public class person {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public person() {
    }

    public person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void hienThongTin(){
        
        System.out.println("Ho ten: " + this.name);
        System.out.println("Dia chi: " + this.address);
    }
    
}
