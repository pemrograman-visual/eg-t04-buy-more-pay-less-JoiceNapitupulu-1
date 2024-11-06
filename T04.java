// 12S24020 - Joice Anastasya Napitupulu
// 12S24014 - Arion Dippos Pandapotan Manurung
import java.util.*;
import java.lang.Math;

public class T04 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] iSBN = new String[3];
        double[] price = new double[3];
        int[] quantity = new int[3];
        int i, j;

        for (i = 0; i <= 2; i++) {
            iSBN[i] = "0";
            price[i] = 0;
            quantity[i] = 0;
        }
        j = 0;
        int quantity1, quantity2, quantity3;
        double totalPrice1, totalPrice2, totalPrice3;
        double hargatotal1, hargatotal2, hargatotal3;

        quantity1 = 0;
        quantity2 = 0;
        quantity3 = 0;
        totalPrice1 = 0;
        totalPrice2 = 0;
        totalPrice3 = 0;
        hargatotal1 = 0;
        hargatotal2 = 0;
        hargatotal3 = 0;
        double hargatotal;
        String iSBN0;

        do {
            iSBN0 = input.nextLine();
            if (iSBN0.equals("---")) {
            } else {
                if (iSBN0.equals(iSBN[0])) {
                    price[0] = Double.parseDouble(input.nextLine());
                    quantity[0] = Integer.parseInt(input.nextLine());
                    quantity1 = quantity1 + quantity[0];
                    totalPrice1 = price[0] * quantity1;
                } else {
                    if (iSBN0.equals(iSBN[1])) {
                        price[1] = Double.parseDouble(input.nextLine());
                        quantity[1] = Integer.parseInt(input.nextLine());
                        quantity2 = quantity2 + quantity[1];
                        totalPrice2 = price[1] * quantity2;
                    } else {
                        if (iSBN0.equals(iSBN[2])) {
                            price[2] = Double.parseDouble(input.nextLine());
                            quantity[2] = Integer.parseInt(input.nextLine());
                            quantity3 = quantity3 + quantity[2];
                            totalPrice3 = price[2] * quantity3;
                        } else {
                            price[j] = Double.parseDouble(input.nextLine());
                            quantity[j] = Integer.parseInt(input.nextLine());
                            if (j == 0) {
                                iSBN[j] = iSBN0;
                                quantity1 = quantity1 + quantity[0];
                                totalPrice1 = price[0] * quantity1;
                                j = 1;
                            } else {
                                if (j == 1) {
                                    iSBN[j] = iSBN0;
                                    quantity2 = quantity2 + quantity[1];
                                    totalPrice2 = price[1] * quantity2;
                                    j = 2;
                                } else {
                                    iSBN[j] = iSBN0;
                                    quantity3 = quantity3 + quantity[2];
                                    totalPrice3 = price[2] * quantity3;
                                }
                            }
                        }
                    }
                }
            }
        } while (!iSBN0.equals("---"));
        if (quantity1 >= 5 && quantity1 < 10) {
            hargatotal1 = totalPrice1 - totalPrice1 * 0.02;
        } else {
            if (quantity1 >= 10 && quantity1 < 20) {
                hargatotal1 = totalPrice1 - totalPrice1 * 0.05;
            } else {
                if (quantity1 >= 20) {
                    hargatotal1 = totalPrice1 - totalPrice1 * 0.12;
                } else {
                    hargatotal1 = totalPrice1;
                }
            }
        }
        if (quantity2 >= 5 && quantity2 < 10) {
            hargatotal2 = totalPrice2 - totalPrice2 * 0.02;
        } else {
            if (quantity2 >= 10 && quantity2 < 20) {
                hargatotal2 = totalPrice2 - totalPrice2 * 0.05;
            } else {
                if (quantity2 >= 20) {
                    hargatotal2 = totalPrice2 - totalPrice2 * 0.12;
                } else {
                    hargatotal2 = totalPrice2;
                }
            }
        }
        if (quantity3 >= 5 && quantity3 < 10) {
            hargatotal3 = totalPrice3 - totalPrice3 * 0.02;
        } else {
            if (quantity3 >= 10 && quantity3 < 20) {
                hargatotal3 = totalPrice3 - totalPrice3 * 0.05;
            } else {
                hargatotal3 = totalPrice3;
            }
        }
        hargatotal = hargatotal1 + hargatotal2 + hargatotal3;
        System.out.println(toFixed(hargatotal,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
