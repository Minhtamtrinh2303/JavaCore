public class Lesson1_hw9 {
    public static void main(String[] args) {
        int a = 9;
        int b = 16;
        // ép kiểu dữ liệu và làm tròn kết quả tới 3 chữ số thập phân
        double result = Math.round(((double)a/(double)b) * 1000.0) / 1000.0;
        System.out.println("Thương của 2 số nguyên là " + a + " và " + b + " là : " +result);
    }
}
