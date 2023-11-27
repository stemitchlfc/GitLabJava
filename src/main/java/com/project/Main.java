package com.project;

public class Main {
    public static void main(String[] args) {
        DollarADay dollarADay = new DollarADay();
        int weekAmount = dollarADay.calculateTotal(7);
        System.out.println(weekAmount);
        int monthAmount = dollarADay.calculateTotal(28);
        System.out.println(monthAmount);
        int halfYearAmount = dollarADay.calculateTotal(180);
        System.out.println(halfYearAmount);
        int yearAmount = dollarADay.calculateTotal(365);
        System.out.println(yearAmount);
        int leapYear = dollarADay.calculateTotal(366);
        System.out.println(leapYear);
        int zero = dollarADay.calculateTotal(0);
        System.out.println(zero);

        String firstReversal = ReverseString.reverse("Example String");
        System.out.println(firstReversal);
        String secondReversal = ReverseString.reverse("Liverpool");
        System.out.println(secondReversal);
        String thirdReversal = ReverseString.reverse("Reverse String");
        System.out.println(thirdReversal);
        String fourthReversal = ReverseString.reverse("String");
        System.out.println(fourthReversal);

    }
}