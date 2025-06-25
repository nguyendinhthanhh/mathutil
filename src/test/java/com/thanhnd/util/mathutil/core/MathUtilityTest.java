package com.thanhnd.util.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {






    @Test // tương đương với hàm main() trong class Main
    // biến hàm này là hàm test case, hàm kiểm thử
    public void verifyFactorialGivenRightArgRunsWell() {
        // 0 Giai thừa có là 1 hay không?
        assertEquals(1, MathUtility.getFactorial(0), "0! should be 1");
    }

    @Test // tương đương với hàm main() trong class Main
    // biến hàm này là hàm test case, hàm kiểm thử
    public void verifyFactorialGivenRightArg2RunsWell() {
        // 0 Giai thừa có là 1 hay không?
        assertEquals(2, MathUtility.getFactorial(2), "2! should be 2");
    }
    @Test // tương đương với hàm main() trong class Main
    // biến hàm này là hàm test case, hàm kiểm thử
    public void verifyFactorialGivenRightArg1RunsWell() {
        // 0 Giai thừa có là 1 hay không?
        assertEquals(6, MathUtility.getFactorial(3), "3! should be 3");
    }


}