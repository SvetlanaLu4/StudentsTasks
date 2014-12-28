package task2;
public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[]{7, 12, 34, 23, 22, 23, 45, 456, -6, 56, 56, 3434, 34, 57, 76, 456, 34, 24, 24, 56};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("Array(elementsCount=" + numbers.length + ", " + "elementsSum=" + sum + ", " + "minElement=" + min + ", " + "maxElement=" + max + ")");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + ": " + numbers[i]);
        }
    }
}


     //Пример вывода:
     //Array(elementsCount=20, elementsSum=25387, minElement=2, maxElement=2447)
     //0: 432
     //1: 23
     //2: 2
     //3: 16
     //4: 447
     //5: 113

