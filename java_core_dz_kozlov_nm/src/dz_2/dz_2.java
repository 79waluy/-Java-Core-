package dz_2;

import static java.lang.Integer.*;

public class dz_2 {
    // ������ �������� ������
    static String[][] mas1 = {{"1", "1", "1"}, {"1", "1", "1"}, {"1", "1", "1"}};
    // ������ ������������ ��������
    static String[][] mas2 = {{"2", "2", "zero", "2"}, {"2", "2", "2", "2"}, {"2", "2", "2", "2"}, {"2", "2", "2", "2"}};
    // ������ ����������
    static String[][] mas3 = {{"3", "3", "3", "3"}, {"3", "3", "3", "3"}, {"3", "3", "3", "3"}, {"3", "3", "3", "3"}};

    public static void main(String[] args) {
        try {
            System.out.println("����� ��������� ������� mas1 = " + MyMethodEx(mas1));
        } catch (MyArrayDataException | MyArraySizeException e) {
            System.out.println(e);

        }
        try {
            System.out.println("����� ��������� ������� mas2 = " + MyMethodEx(mas2));
        } catch (MyArrayDataException | MyArraySizeException e) {
            System.out.println(e);

        }
        try {
            System.out.println("����� ��������� ������� mas3 = " + MyMethodEx(mas3));
        } catch (MyArrayDataException | MyArraySizeException e) {
            System.out.println(e);

        }
    }

    static Integer MyMethodEx(String[][] mas) throws MyArrayDataException, MyArraySizeException {
        int sum = 0;
        if (mas.length != 4 || mas[0].length != 4)
            throw new MyArraySizeException("������ �� ������������� ����������� 4�4!");
        for (int x = 0; x < mas.length; x++) {
            for (int y = 0; y < mas.length; y++) {
                try {
                    sum += parseInt(mas[x][y]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("� ������� �� ����� ���� ������������ � ����� ������� - " +x  +y );
                }
            }
        }
        return sum;

    }

    public static class MyArrayDataException extends RuntimeException {
        public MyArrayDataException(String message) {
            super( message);
        }

    }

    public static class MyArraySizeException extends RuntimeException {
        public MyArraySizeException(String message) {
            super(message);
        }
    }

}