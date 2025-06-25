package com.thanhnd.util.mathutil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTest {

    // chuan bi bo data riêng -- dd -- ata driven
    // LÁT HOIF, FILL VÀO THAM SỐ CỦA HÀM getFactorial()
    // FILL VAO QUA THAM SO HAM - LAM VIEC VOI NHIEU DATA
    // DDT CÒN GỌI TEN KHAC, PARAMETERIZED TESTING -> KIEM THU THEO KIEU THAM SO HOA

    // BỘ DATA NẰM TRONG HÀM STATIC - CHO DE LAY
    // DATA NẰM TRONG MẢNG 2 CHIỀU
    // BỘ DATA NÀY CÓ THỂ LÀ MẢNG 2 CHIỀU, GIA TRI DAU VAO VA GIA TRI KI VONG

    public static Object[][] initData() {

      //  int[] a = {0, 1, 2, 3, 4, 5, 6}; // mang 1 chieu chua data dau vao

        return new Object[][]{
                {0, 1}, // 0! = 1
                {1, 1}, // 1! = 1
                {2, 2}, // 2! = 2
                {3, 6}, // 3! = 6
                {4, 24}, // 4! = 24
                {5, 120}, // 5! = 120
                {6, 720} // 6! = 720
        };     //n  expected

    }


    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRightArgRunsWell(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }

}