package com.neuedu.homework.$2024_07_29;

public class StringExceptionTest {
    public static void main(String[] args) {
        try {
            String str1 = "null";
            String str2 = "";
            if (str1.isEmpty() || str2.isEmpty()) {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
