public class Lesson1_hw8 {
    public static void main(String[] args) {
        int a = 200;
        int b = 500;
        int c = 300;
        int A = Math.max(a,b); // so sánh a và b
        int B = Math.max(b,c); // so sánh b và c
        int max = Math.max(A,B); // tìm số lớn nhất
        System.out.println("số lớn nhất là:" +max); // kết quả
    }
}
