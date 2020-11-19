/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khanh.util;

/**
 *
 * @author Administrator
 */
public class MathUtil {
    //LAM HANG FAKE GIONG NHU HANG THAT
    //JDK CO CLASS JAVA.UTIL.mATH CO 1 LOAT HAM STATIC.ABS() . sin() .sqrt() .pow(a,b)
    //      pi=3.1412.............

    public static final double pi = 3.1412;

    //ham tinh n! = 1.2.3...n!
    //n! tang nhanh nen minh chi tinh 20! toi da 21! tran long\
    //ko co am giai thua, neu tham so n la am, minhh chui, nem ra exeption
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 1..20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        // song sot de nlenh nay tuc la n = 2 ... 20 roi, thang nao xai else biet tay ong
        long rs = 1;
        for (int i = 2; i <= n; i++) {
            rs *= i;
        }
        return rs;
    }
}
