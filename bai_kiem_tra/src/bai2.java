public class bai2 {
    static char test(String x) {
        int[] a = new int[256];// mã Ascii 0-255
        for (int i = 0; i < x.length(); i++)
            a[x.charAt(i)]++;
        int max1 = 0, max2 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[max1]) {
                max2 = max1;
                max1 = i;
            } else if (a[i] > a[max2] && a[i] != a[max1])
                max2 = i;
        }
        return (char) max2;
    }
    public static void main(String args[]) {
        String str = "successes";
        System.out.println("Chuỗi: " + str);
        System.out.println("kq: " + test(str));
    }
}


