/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khanh.util.test;

import khanh.util.MathUtil;
import org.junit.Test;
import static org.junit.Assert.*;
import math.util.Github;

/**
 *
 * @author Administrator
 */
public class MathUtilityTest {

    @Test // kí hiệu của JUnit đưa ra, biến hàm ngay sau đay thành
    //public static void mai(), app có nhiều main()
    // F6 chạy main() mặc định, shift f6 là chạy main() ở @Test
    // đây là 1 trong những cách đặt tên cho hàm test, để test code chính

    public void getFactorial_RuWell_IfValidArgument() {
        assertEquals(720, MathUtil.getFactorial(6));
        assertEquals(120, MathUtil.getFactorial(5));
        assertEquals(240, MathUtil.getFactorial(4));
        assertEquals(6, MathUtil.getFactorial(3));
        assertEquals(1, MathUtil.getFactorial(0));
    }
     //Xanh chỉ đạt được nếu tất cả cùng xah, hàm ý hàm đúng hết tất cả
    //hàm đã dùng thì phải đúng hết, sai ì cái hay vài cái
    
    //Viet code để test code chính (MathUtility)
    //Viết code dùng thư viện Unit
}
