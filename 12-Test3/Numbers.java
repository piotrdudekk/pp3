public class Numbers implements Ok {
    private int[] numbers;

    public Numbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public boolean ok() {
        boolean b = true;
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 != numbers[i] % 2) {
                b = false;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        int[] arr1 = { 6, 7, 6, 1, 4 };
        int[] arr2 = { 2, 5, 2, 8, 4 };
        System.out.println(new Numbers(arr1).ok());
        System.out.println(new Numbers(arr2).ok());

    }

}
