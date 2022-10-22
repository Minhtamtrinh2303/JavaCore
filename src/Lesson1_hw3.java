public class Lesson1_hw3 {
    public static void main(String[] args) {
        int numberOne = 10;
        int numberTwo = 23;
        int numberThree = 130;
        int numberFour = 50;
        int A = Math.max(numberOne, numberTwo); //compare numberOne and number Two
        int B = Math.max(numberThree, numberFour); //compare numberThree and numberFour
        int result = Math.max(A, B); // find max number
        System.out.println("Số lớn nhất trong 4 số biết trước là: " +result);
    }
}
