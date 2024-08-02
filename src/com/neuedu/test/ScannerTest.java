package com.neuedu.test;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line2 = scanner.nextLine();
        String line1 = scanner.next();

        System.out.println(line2 + "a" + line1);
    }
}

/**
 * 1. next()
 * next()：对第一个输入的有效字符之前遇到的空格键、Tab键或Enter键等结束符，
 * next()方法会自动将其去掉，只有在输入有效字符之后，
 * next()方法才将其后输入的空格键（隔一个空格）、Tab键（隔一个Tab键）或Enter键（换行）等视为分隔符 或 结束符
 * next()：包括nextDouble() ，nextFloat() ，nextInt() 是不能得到带空格的字符串
 * next()：在输入有效字符后空格键、Tab键 或 Enter键 就是结束符
 * <p>
 * 2. nextLine()
 * nextLine()方法的结束符只是Enter键，
 * 即nextLine()方法在第一个字符或（字符串）输入后，之后输入的空格键、Tab键都是可以输出的
 * nextLine() 它是可以得到带空格的字符串的。
 * <p>
 * 3. 一般在 next() 后 加一个 scanner.nextLine(); 吃掉回车符
 * nextLine()自动读取了被next()去掉的Enter作为它的结束符，所以没办法给下一个输入从键盘输入值。
 * 经过验证，发现其他的next的方法，如nextDouble() ，nextFloat() ，nextInt() 等与nextLine()连用时都存在这个问题，
 * 解决的办法是：在每一个 next()、nextDouble() 、 nextFloat()、nextInt() 等语句之后加一个nextLine()语句，
 * 将被next()去掉的Enter等结束符过滤掉。
 */