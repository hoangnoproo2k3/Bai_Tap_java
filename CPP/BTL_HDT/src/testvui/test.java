package testvui;

/**
 *
 * @author AS
 */
public class test {
    public static void main(String[] args) {
        DSsach x= new DSsach();
        DSdocgia y= new DSdocgia();
        x.nhapds();
        y.nhapdsdg();
        x.hiends();
        y.hiendsdg();
        dshoadon z = new dshoadon();
        z.nhapdshd(x.dssach, y.dsdocgia);
        z.hiendshd();
    }
}
