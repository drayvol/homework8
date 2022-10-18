public class Main {


    public static void main(String[] args) {
        //Задача 1
        int[] arr = generateRandomArray();
        int sum=0;
        for (int i:arr) {
            sum+=i;
        }
        System.out.println("Сумма трат за месяц составила "+ sum+ " рублей");
        //Задача 2
        int max = arr[0];
        int min = arr[0];
        for (int i:arr) {
            max=Math.max(max,i);
            min=Math.min(min,i);
        }
        System.out.println("Минимальная сумма трат за день составила "+ min+ " рублей. Максимальная сумма трат за день составила "+ max+ " рублей");
        //Задача 3
        double meanValue = sum*1.0/arr.length;
        System.out.println("Средняя сумма трат за месяц составила "+ meanValue+ " рублей");
        //Задача 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for(int i =0; i<reverseFullName.length;i++){
            System.out.print(reverseFullName[reverseFullName.length-1-i]);
        }

    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            System.out.println(arr[i]);
        }
        return arr;

    }
}