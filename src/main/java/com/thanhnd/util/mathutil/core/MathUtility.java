package com.thanhnd.util.mathutil.core;

public class MathUtility {


//    public static long getFactorial(int n) {
//        if (n < 0) {
//            throw new IllegalArgumentException("n must be a non-negative integer.");
//        }
//        long result = 1;
//        for (int i = 1; i <= n; i++) {
//            result *= i;
//        }
//        return result;
//    }
public static long getFactorial(int n) {
    if (n < 0 || n > 20) {
        throw new IllegalArgumentException("n must be between 0 and 20 inclusive.");
        // nếu data n cà chớn, ne ra ngoại lệ, ném ra câu thông báo lỗi
    }

    if(n == 0 ) {
        return 1; // 0! = 1! = 1
    }
    // npu chay được đến đây, tức là n >= 1 && n <= 20
    // tính n! = 1.2.3.4... thuật toán con heo đất,ốc bu nhồi thịt, nhân dồn, cộng, ồn tích lũy

    long result = 1;
    for (int i = 1; i <= n; i++) {
        result *= i;
    }
    return result;
}


}
