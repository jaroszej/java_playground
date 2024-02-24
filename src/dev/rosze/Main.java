package dev.rosze;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hex 24 to Dec: " + convertNumber.decToHex(24));
        System.out.println("Hex 1128 to Dec: " + convertNumber.decToHex(1128));
        System.out.println("Hex 482993 to Dec: " + convertNumber.decToHex(482993));
        System.out.println("Hex 2147483647 to Dec: " + convertNumber.decToHex(2147483647));
        System.out.println("Hex -2147483648 to Dec: " + convertNumber.decToHex(-2147483648));
        System.out.println("Hex 0 to Dec: " + convertNumber.decToHex(0));
    }

}
