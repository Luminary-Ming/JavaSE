package com.neuedu.demo.j_api;

import java.util.Objects;

/**
 * Object 类中的方法
 */
public class ObjectTest {
    public static void main(String[] args) {

        ObjectTest o1 = new ObjectTest();
        ObjectTest o2 = new ObjectTest();

        System.out.println(o1 == o2);  // false
        // Object 类中的 equals() 方法比较是地址，不是对象内容（因此一般重写Object中的方法）
        System.out.println(o1.equals(o2));  // false

        // Object 类中的 toString() 方法是输出对象的内存地址（因此一般重写Object中的方法）
        System.out.println(o1.toString());  // java.lang.Object@4eec7777
    }

    /**
     * Object 类中的 equals()
     */
    public boolean equals(Object obj) {
        return (this == obj);
    }

    /**
     * Object 类中的 toString()
     */
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}


/**
 * 实际项目中重写 Object 中的方法
 */
class User {
    int id;
    String name;
    String age;

    public User(int id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        // 比较字符串的地址是否相同
        return id == user.id && Objects.equals(name, user.name) && Objects.equals(age, user.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public static void main(String[] args) {
        User o1 = new User(1, "abc", "88");
        User o2 = new User(1, "abc", "88");


        System.out.println(o1.id == o2.id);  // true

        // 相当于：
        // String str1 = "abc";
        // String str2 = "abc";
        // System.out.println(str1.equals(str2));
        System.out.println(o1.name.equals(o2.name));  // true
        System.out.println(o1.age.equals(o2.age));  // true
    }
}