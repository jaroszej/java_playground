package dev.rosze;

import java.util.ArrayList;

public class convertNumber {
    public static String decToHex(int input) {
        String[] valsAfter9 = {"A", "B", "C", "D", "E", "F"};
        StringBuilder hex = new StringBuilder();
        ArrayList<String> output = new ArrayList<>();

        int rem = input % 16;

        handleOver9(valsAfter9, output, rem);

        int res = input / 16;
        while (res != 0) {
            rem = res % 16;
            res = res / 16;
            handleOver9(valsAfter9, output, rem);
        }

        for (int j = output.size() - 1; j >= 0; j--) {
            try {
                hex.append(output.get(j));
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
                System.out.println("iterator `j=" + j + "` was greater than output size, " + output.size());
            }
        }

        return hex.toString();
    }

    private static void handleOver9(String[] valsAfter9, ArrayList<String> output, int rem) {
        if (rem > 9) {
            output.add(valsAfter9[rem - 10]);
        } else {
            output.add(String.valueOf(rem));
        }
    }
}
