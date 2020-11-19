/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

/**
 *
 * @author Administrator
 */
public class Github {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("5! = " + khanh.util.MathUtil.getFactorial(5));
        // tui tinh 5! hy vong ham tra ve 120
        //lat hoi ham chay coi thuc te la may - ACTUAL
        // tui so sanh voi cai tui hy vong truoc khi tinh, EXPECTED 120
        // ACTUAL == EXPECTED, Ham chay dung cho tinh huong nay, test case nay
        System.out.println("0! = " + khanh.util.MathUtil.getFactorial(0));
        // expected: 1, asctual: ? chay moi biet
        // chay xong moi biet ham dung sai
        System.out.println("-5! = " + khanh.util.MathUtil.getFactorial(-5));
        // expected: Dap vao mat ILLEGALARGUMENTEXCEPTION
        // cahc test nay kieu goi la MANUAL
        // vi ta phai nhin bang mat de luan ket qua
        // cach xin so, ta dung mau sac xanh do de luan ket qua dung sai cua ham
        // cach nay goi la TEST AUTOMATION
    }
    
}
