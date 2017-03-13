package learn;

/**
 * Created by duanyuping on 17-3-13.
 */
public class Java {
//    int = String.indexOf("")--------------> -1

    static String stringSth = "this is my java demo, and what about you";

    public static void main(String[] args){

        /** create by duanyuping on 2017/3/13   */
        /* 字符串--->long   */
        long longObject = Long.parseLong("12");
        System.out.println(longObject);

        /* 截取字符串的一部分   */
        String stringObject = stringSth.substring(1,4);
        System.out.println(stringObject);

        /* 分割字符串保存到数组   */
        String[] stringArray = stringSth.split(",");
        System.out.println(stringArray[0].toString());

        /* 返回字符在字符串中第一次出现的位置， 如果没找到就返回-1   */
        int indexObject = stringSth.indexOf("boy");
        System.out.println(indexObject);





    }
}
