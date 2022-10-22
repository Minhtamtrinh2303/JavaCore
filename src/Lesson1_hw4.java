public class Lesson1_hw4 {
    public static void main(String[] args) {
        int a = 23; // khai báo 1 số dương
        double A = Math.sqrt(a); // khai căn
        double canBacHai = Math.round(A * 1000.0) /1000.0; // làm tròn tới 3 chữ số thập phân
        System.out.println("Căn bậc hai của " + a + " = " + canBacHai); // kết quả
    }
}
