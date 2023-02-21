/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.giaolang.mathutil.core;

/**
 *
 * @author giao.lang
 */
public class MathUtility {
    
    public static final double PI = 3.1415;
    
    
    //hàm getFactorial() là hàm tính n!
    //quy ước: n! = 1 x 2 x 3 x ... x n
    //         0! = 1! = 1
    //         ko có giai thừa của số âm!!!
    //Thiết kế của hàm tính giai thừa của chúng ta là:
    //- hàm ko tính giai thừa âm, nếu đưa âm giai thừa, CHỬI
    //                   ĐẬP VÀO MẶT NGƯỜI XÀI HÀM 1 EXCEPTION
    //- hàm ko tính giai thừa quá to, ko tính giai thừa 21 trở lên
    //  vì kiểu long chỉ có tối đa 18 số 0
    //  mà 21 giai thừa lớn hơn 18 số 0, tràn kiểu long, tính sai
    //  CHỬI LUÔN, KO SUPPORT GIAI THỪA ÂM, GIAI THỪA QUÁ BỰ!!!
    //Người QC phải kiểm tra xem hàm có hành xử đúng như thiết kế
    //hay ko??? phải test, thử nghiệm các TÌNH HUỐNG XÀI HÀM
    //                                các TEST CASE 
    public static long getFactorial(int n) {
        
        if (n < 0 || n > 21)
            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
        
        if (n == 0 || n == 1)
            return 1;
        
        //sống sót đến lệnh dưới đây, sure n = 2..20
        long product = 1; //tích nhân dồn!!!
        for (int i = 2; i <= n; i++) //make the code wrong!!
                        //make the code green again and 4ever   
            product *= i;
        
        return product;
    }
}
