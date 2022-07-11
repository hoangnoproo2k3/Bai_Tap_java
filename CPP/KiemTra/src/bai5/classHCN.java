package bai5;

public class classHCN {
    public double dai;
    public double rong;

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }
    public void dienTich(){
        System.out.println("Diện tích là: "+dai*rong);
    }
    public void chuVi(){
        System.out.println("Chu vi là: "+(dai+rong)*2);
    }

    @Override
    public String toString() {
        return "Hiện thị{" + "chuVi=" + (dai+rong)*2 + ", Diện tích=" + dai*rong + '}';
    }
    
    
}
