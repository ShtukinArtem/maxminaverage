public class Main {
    public static void main(String[] args) {
        double[] array = new double[20];
        for (int index = 0; index < array.length; index++) {
            array[index] = Math.random();
        }
        var min = Double.MAX_VALUE;
        var max = -Double.MAX_VALUE;
        var average = 0D;
        for (int index = 0; index < array.length; index++) {
            if (array[index] > max) {
                max = array[index];
            }
            if (array[index] < min) {
                min = array[index];
            }
            average += array[index];
        }
        System.out.println("Максимальное " + max + " Минимальное " + min + " Среднее " + average / array.length);
    }
}