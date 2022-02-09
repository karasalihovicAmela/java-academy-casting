package com.company;

public class Main {

    public static void main(String[] args) {

        short varShort = 35;
        int varInt = (int) varShort;

        System.out.println("Var int " + varInt);

        int intToByteVar = 300;
        byte byteVar = (byte) intToByteVar;

        System.out.println("Var byte " + byteVar);

        long varLong = 300;
        int varLongToInt = (int) varLong;

        System.out.println("Var long to int " + varLongToInt);

        Double newDouble = new Double(varLongToInt);

        System.out.println("Double value from string " +
                Double.valueOf("30"));

        System.out.println(Boolean.valueOf("true"));

        //example
        int intNum = 65;
        long longNum = (long) intNum;
        System.out.println("Long num " + longNum);

        short shortNum = (short) intNum;
        System.out.println("Short num " + shortNum);

        long longNumber = 10000;
        System.out.println(String.valueOf(longNumber));
    }
}
