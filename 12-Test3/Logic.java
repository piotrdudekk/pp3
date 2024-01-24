public class Logic {
    private boolean[] values;

    public Logic(boolean[] values) {
        this.values = values;
    }

    public boolean[] getValues() {
        return values;
    }

    public void setValues(boolean[] values) {
        this.values = values;
    }

    public int opposite() {
        int c = 0;
        for (int b = 1; b < (values.length - 1); b++) {
            if (values[b] == true) {
                if (values[b - 1] == false && values[b + 1] == false) {
                    c = c + 1;
                }
            } else if (values[b] == false) {
                if (values[b - 1] == true && values[b + 1] == true) {
                    c = c + 1;
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        boolean[] arr1 = { true, false, false };
        boolean[] arr2 = { true, false, true, false };
        boolean[] arr3 = { true, false, true, true, false, true, false, true, false };
        System.out.println(new Logic(arr1).opposite());
        System.out.println(new Logic(arr2).opposite());
        System.out.println(new Logic(arr3).opposite());

    }

}
