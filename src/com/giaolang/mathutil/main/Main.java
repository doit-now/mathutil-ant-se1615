/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.giaolang.mathutil.main;

import com.giaolang.mathutil.core.MathUtility;

/**
 *
 * @author giao.lang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        testFactorialGivenWrongArgumentThrowsException();
        testFactorialGivenRightArgumentReturnsWell();
    }
    
    //Kiểm thử xem hàm getF() có chửi hay ko nếu đưa n cà chớn
    public static void testFactorialGivenWrongArgumentThrowsException() {
        //Test case #6: test getF() with n = -1
        //Expected value: 1 CÂU CHỬI N NHƯ HẠCH!!!
        //THIẾT KẾ HÀM TRONG TÌNH HUỐNG NÀY PHẢI XUẤT HIỆN NGOẠI LỆ
        
        System.out.println("Test -1!: expected: An Illegal Argument Exception is thrown!!!"
                               + " | actual: ???");
        MathUtility.getFactorial(-1);
        
    }
    
    
    //Kiểm thử xem hàm getF() có đc viết đúng như thiết kế hay ko???
    //thiết kế: đưa n tử tế từ 0..20 -> tính đc n! ĐÚNG NHƯ KÌ VỌNG
    //          đưa n cà chớn, < 0 hoặc > 20, CHỬI 
    //Ta phải giả lập các cách xài của user/của ai đó khác
    //cách xài nghĩa là đưa giá trị nào đó cho hàm -> xem hàm
    //trả về
    //Mỗi cách xài hàm, ứng với 1 n thì hàm sẽ chạy với n đó
    //Mỗi cách xài hàm TA GỌI LÀ 1 TEST CASE
    //Quy tắc đặt tên hàm dành cho kiểm thử code:
    //Cú pháp con lạc đà camelCase notation
    //Tên hàm mang luôn ý nghĩa/mục đích của việc test        
    public static void testFactorialGivenRightArgumentReturnsWell() {
        
        //Test case #1: Tình huống xài hàm số 1
        //              Test getF() with n = 0;
        //Expected value: 1
        //Vietsub: kiểm thử xem hàm getF() với 1 tức là tính 1!
        //         coi có trả về 1 hem?
        
        int n = 0;                 //tính 0!
        long expectedValue = 1;    //hy vọng ói về 1
        long actualValue = MathUtility.getFactorial(n);    //hàm tính đi, xem cụ thể mấy
        //kiểm thử là so sánh expected vs. actual
        System.out.println("Test " + n + "!: expected: " + expectedValue
                                       + " | actual: " + actualValue);
        
        //Test case #2: test getF() with n = 1
        //Expected value: 1
        //Vietsub: kiểm tra tình huống xài hàm tính 1! coi có
        //trả về 1 hay hem?
        n = 1;
        expectedValue = 1; 
        actualValue = MathUtility.getFactorial(n);
        System.out.println("Test " + n + "!: expected: " + expectedValue
                                       + " | actual: " + actualValue);
        
        //Test case #3: test getF() with n = 2
        //Expected value: 2
        //Vietsub: kiểm tra tình huống xài hàm tính 2! coi có
        //trả về 2 hay hem?
        System.out.println("Test 2!: expected: 2" 
                              + " | actual: " + MathUtility.getFactorial(2));
        
        //Test case #4: test getF() with n = 3
        //Expected value: 6
        //Vietsub: kiểm tra tình huống xài hàm tính 3! coi có
        //trả về 6 hay hem?
        System.out.println("Test 3!: expected: 6" 
                              + " | actual: " + MathUtility.getFactorial(3));
        
        //Test case #5: test getF() with n = 5
        //Expected value: 120
        //Vietsub: kiểm tra tình huống xài hàm tính 5! coi có
        //trả về 120 hay hem?
        System.out.println("Test 5!: expected: 120" 
                              + " | actual: " + MathUtility.getFactorial(5));
        
        
        
        
    }
}
