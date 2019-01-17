import java.math.BigDecimal;

/**
 * Created by Rt on 2018/7/31.
 */
public class BigDecimalDemo01 {

    public static void main(String[] args) {
       /* System.out.println("加法运算：" + MyMath.round(MyMath.add(10.345,3.333),1)) ;
        System.out.println("减法运算：" + MyMath.round(MyMath.sub(10.345,3.333),3)) ;
        System.out.println("乘法运算：" + MyMath.round(MyMath.mul(10.345,3.333),4)) ;
        System.out.println("除法运算：" + MyMath.div(10.345,3.333,3)) ;*/
        BigDecimal bd = new BigDecimal(4.34);
        System.out.println(bd.doubleValue());
        BigDecimal bd2 = new BigDecimal(1);
        System.out.println(bd.divide(bd2,3,BigDecimal.ROUND_HALF_UP));

    }

}

class MyMath {
    public static double add(double d1,double d2){		// 进行加法计算
        BigDecimal b1 = new BigDecimal(d1) ;
        BigDecimal b2 = new BigDecimal(d2) ;
        return b1.add(b2).doubleValue() ;
    }
    public static double sub(double d1,double d2){		// 进行减法计算
        BigDecimal b1 = new BigDecimal(d1) ;
        BigDecimal b2 = new BigDecimal(d2) ;
        return b1.subtract(b2).doubleValue() ;
    }
    public static double mul(double d1,double d2){		// 进行乘法计算
        BigDecimal b1 = new BigDecimal(d1) ;
        BigDecimal b2 = new BigDecimal(d2) ;
        return b1.multiply(b2).doubleValue() ;
    }
    public static double div(double d1,double d2,int len){		// 进行除法计算
        BigDecimal b1 = new BigDecimal(d1) ;
        BigDecimal b2 = new BigDecimal(d2) ;
        return b1.divide(b2,len,1).doubleValue() ;
    }
    public static double round(double d,int len){	// 进行四舍五入
        BigDecimal b1 = new BigDecimal(d) ;
        BigDecimal b2 = new BigDecimal(1) ; // 技巧
        return b1.divide(b2,len,BigDecimal.ROUND_HALF_DOWN).doubleValue() ;
    }

}
