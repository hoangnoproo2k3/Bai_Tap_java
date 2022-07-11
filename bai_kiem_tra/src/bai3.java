public class bai3 {
    public static String ghep(String s1, String s2){
        if(s1.length()==s2.length()) return s1+s2;
        else if(s1.length()>s2.length()){
            int n= s1.length()-s2.length();
            String s3= s2+s1.substring(n,s1.length());
            return s3;
        }
        else {
            int n=s2.length()-s1.length();
            String s3=s1+s2.substring(n,s2.length());
            return s3;
        }
    }

    public static void main(String[] args) {
        String s1="welcome", s2="home";
        System.out.println("kq: "+ghep(s1,s2));

    }
}
