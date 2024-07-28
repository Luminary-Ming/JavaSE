package com.neuedu.test;


public class StringTest {
    public static void main(String[] args) {
        String str = "www.baidu.com";

        // length() 字符串长度
        System.out.println("字符串长度：" + str.length());  // 字符串长度：13


        // charAt(int index)
        // 用于返回字符串指定索引（下标）处的字符。索引（下标）范围为从 0 到 length() - 1。
        char result = str.charAt(5);
        System.out.println("字符串下标5对应的字符为：" + result);  // 字符串下标5对应的字符为：a


        // indexOf(int char) 或 indexOf(String str)
        // 返回指定字符在此字符串中第一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1。
        int index = str.indexOf(".");
        System.out.println("‘.’第一次出现的位置下标是：" + index);  // ‘.’第一次出现的位置下标是：3


        // str = "www.baidu.com"
        //indexOf(int ch, int fromIndex) 或 indexOf(String str, int fromIndex);
        // 返回从下标 fromIndex 开始往后继续查找指定字符串中第一次出现的索引，如果此字符串中没有这样的字符，则返回 -1。
        System.out.println("从下标 5 开始，返回第一个字符 ‘.’ 的下标: " + str.indexOf(".", 5)); // 从下标 5 开始，返回第一个字符 ‘.’ 的下标: 9


        // lastIndexOf(int ch) 或  lastIndexOf(String str)
        // 返回指定字符在此字符串中最后一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1。
        String str4 = "菜鸟教程:www.chat.com.cn";
        System.out.println("查找字符 c 最后出现的下标位置: " + str4.lastIndexOf("c"));  // 查找字符 c 最后出现的下标位置: 18


        //lastIndexOf(int ch, int fromIndex) 或 lastIndexOf(String str, int fromIndex)
        // 返回指定字符在此字符串中最后一次出现处的索引，从指定的索引处开始进行反向搜索，如果此字符串中没有这样的字符，则返回 -1。
        String str5 = "菜鸟教程:www.chat.com.cn";
        System.out.println("以下标 10 为终点，返回最后一个字符 c 的下标" + str5.lastIndexOf("c", 10));  // 以下标 10 为终点，返回最后一个字符 c 的下标9

        // equals(Object anObject)
        // 用于比较两个字符串的内容是否相等，如果给定对象与字符串相等，则返回 true；否则返回 false。
        String str1 = "apple";
        String str2 = "run";
        String str3 = "apple";
        System.out.println("str1与str2是否相等：" + str1.equals(str2));  // str1与str2是否相等：false
        System.out.println("str1与str3是否相等：" + str1.equals(str3));  // str1与str3是否相等：true


        // replace(char searchChar, char newChar)   旧字符（或旧字符串）替换成新字符（或新字符串）
        String str6 = "apple";
        System.out.println("新字符串为：" + str6.replace("pple", "b"));  // 新字符串为：ab


        // split(String regex, int limit) 拆分字符串 regex -- 分隔符  limit -- 分割的份数
        //  注意： . 、 $、 | 和 * 等转义字符，必须得加 \\。
        //  注意：多个分隔符，可以用 | 作为连字符。
        String str7 = "www.baidu.com";
        for (String result2 : str7.split("\\.", 3)) {
            System.out.print(result2 + " ");  // www baidu com
        }


        // startsWith() 方法用于检测字符串是否以指定的前缀开始。
        String str8 = "www.baidu.com";
        System.out.println(str8.startsWith("www"));  // true
        // 从下标为 4 的字符光标前开始，查找光标后的字符串是否以 baidu 开头
        System.out.println(str8.startsWith("baidu", 4));  // true


        // trim() 方法用于删除字符串的头尾空白符，只删除前头和结尾的空格
        String str9 = "   www. baidu    .com    ";
        System.out.println(str9.trim());  // www. baidu    .com


        // toLowerCase() 方法将字符串转换为小写。
        String str10 = "WWW.BAIDU.COM";
        System.out.println(str10.toLowerCase());  // www.baidu.com


        // toUpperCase() 方法将字符串小写字符转换为大写。
        String str11 = "www.baidu.com";
        System.out.println(str11.toUpperCase());  // WWW.BAIDU.COM


        // substring() 方法返回字符串的子字符串。
        String str12 = "www.baidu.com";
        // 从下标为 4 的字符光标前截取后面的所有字符
        System.out.println(str12.substring(4));  // baidu.com
        // 从下标为 4 的字符光标前，到下标为 9 的字符光标前
        System.out.println(str12.substring(4, 9));  // baidu


        // 截取 register
        String str13 = "http://localhost:8080/user/register.do";
        // str13.lastIndexOf('/') 查的是字符光标前的位置，所以要+1，截取字符光标后的位置
        System.out.println(str13.substring(str13.lastIndexOf('/') + 1, str13.lastIndexOf('.')));  // register

    }
}
