public class Lesson1_hw7 {
    public static void main(String[] args) {
        // phương trình bậc hai một ẩn ax2 + bx + c = 0
        int a = 1; // a khác 0
        int b = 5;
        int c = 6;
        int tinhDeta = b*b - 4*a*c;
        double deta = (double) tinhDeta;
        double canBacHai = Math.sqrt(deta);       // khai căn deta
        // giải phương trình
        double x1 = ( -b + +canBacHai ) / (2*a);
        double x2 = ( -b - +canBacHai ) / (2*a);
        System.out.println("giải phương trình bậc hai một ẩn:");
        System.out.println("Nghiệm thứ nhất là:" +x1);
        System.out.println("Nghiệm thứ hai là:" +x2);
    }
}
