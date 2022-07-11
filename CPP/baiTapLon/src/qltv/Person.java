package qltv;

/**
 *
 * @author AS
 */
public class Person {
   
        protected int id;
        protected String name,address, phoneNo;
        static int n=0; // khởi tạo đầu tiên khi nhập vào số người tăng lên

    public Person(int idnum, String name, String address, String phoneNo) {
        n++;
        
        if(id==-1)
        {
            id = n;
        }
        else
            id = idnum;
        
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
        public void printInfo()
    {
        System.out.println("-----------------------------------------");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone No: " + phoneNo + "\n");
    }
         public static void setIDCount(int x)
    {
        n=x;
    }
    
    
}
