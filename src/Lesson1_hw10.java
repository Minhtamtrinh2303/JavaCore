public class Lesson1_hw10 {
    public static void main(String[] args) {
        int a = 5;
        int n = 10;
        // Tính lũy thừa mũ n cơ số a
        double exponential = Math.pow((double) a, (double) n);
        int result = (int)exponential; // ép kiểu dữ liệu
        System.out.println(" Lũy thừa mũ " + n + " của cơ số " + a + " là : " +result);
    }
}
