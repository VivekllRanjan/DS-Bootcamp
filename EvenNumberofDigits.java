package com.vivek;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenNumberofDigits
{
    public static void main(final String[] args) {
        final int[] arr = { 0, -12, -444, 1332, 2219 };
        final int count = findNumbers(arr);
        System.out.println(count);
    }

    static int findNumbers(final int[] nums) {
        int count = 0;
        for (final int i : nums) {
            if (isevn(i)) {
                ++count;
            }
        }
        return count;
    }

    static boolean isevn(int x) {
        int c = 0;
        if (x == 0) {
            return false;
        }
        if (x < 0) {
            x *= -1;
        }
        while (x > 0) {
            x /= 10;
            ++c;
        }
        return c % 2 == 0;
    }
}