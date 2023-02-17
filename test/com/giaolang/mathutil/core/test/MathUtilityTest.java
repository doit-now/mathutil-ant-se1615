package com.giaolang.mathutil.core.test;


import com.giaolang.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;


public class MathUtilityTest {
    
    //Ta sẽ test tiếp hàm getF() với n cà chớn
    //n cà chớn nghĩa là n < 0 | n > 20
    //THIẾT KẾ CỦA HÀM GETF() như sau
    //-Nếu đưa n tử tế từ 0..20 thì hàm getF() phải tính ngon
    //done!!! 5 test case ở dưới
    //-Nếu đưa n cà chớn  < 0 | > 20, thì hàm getF()
    //hok thèm tính, nó CHỬI, NÓ TUNG RA, NÉM RA NGOẠI LỆ
    //tên là Illegal Argument Exception
    //Do đó: test case nếu đưa n = -5 THÌ EXPECTED SẼ LÀ: NGOẠI LỆ
    //JUnit 4 ko có hàm assertEquals() cho Exception
    //JUnit 5 có hàm assertThrows()
    //dùng chiêu đc cung cấp bởi JUnit 4, ko phải assertE()
    //để đo lường, lắng nghe xem có NGOẠI LỆ ĐC NÉM RA HAY KO
    @Test(expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
        MathUtility.getFactorial(-5);
    }
    
    
    //ta sẽ viết các test case, các tình huống test để
    //kiểm tra hàm getF() chạy đúng hay ko nếu ta đưa đầu vào
    //n tử tế
    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        //Test case #1: test getF() with n = 0
        //Expected result: 1; kiểm tra 0! có đúng là 1 hem?
        //                    check if 0! == 1 or not?
        int n = 0;        
        long expected = 1;  //hy vọng 0! = 1
        long actual = MathUtility.getFactorial(n); //gọi hàm mà tính
        
        Assert.assertEquals(expected, actual);
        //XANH NẾU 2 THẰNG GIỐNG NHAU == NHAU
        //ĐỎ NẾU 2 THẰNG KHÁC NHAU!!!
        
        //Test case #2: test getF() with n = 1;
        //Expected: 1;  check if 1! returns 1
        //              kiểm tra xem có đúng 1! == 1 hem?
        n = 1;
        expected = 1;
        actual = MathUtility.getFactorial(n);
        Assert.assertEquals(expected, actual);
        
        //Test case #3: test getF() with n = 2;
        //Expected: 2;  check if 2! returns 2
        Assert.assertEquals(2, MathUtility.getFactorial(2));
        
        //Test case #4: test getF() with n = 3;
        //Expected: 6;  check if 3! returns 6
        Assert.assertEquals(6, MathUtility.getFactorial(3));
        
        //Test case #5: test getF() with n = 5;
        //Expected: 120;  check if 5! returns 120
        Assert.assertEquals(120, MathUtility.getFactorial(5));
        
        
    }
    
    @Test
    public void testRedGreen() {
        Assert.assertEquals(6789, 6789);
    }
}
