package com.neuedu.homework.$2024_07_17;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        // 对应数组 相同下标位置 为同一用户的数据
        // 提前设置 账户
        String[] userAccount = {"user111", "user123", "user321"};
        // 提前设置 密码
        String[] userPwd = {"111", "123", "321"};
        // 提前设置 余额
        double[] userMoney = {1000, 2000, 3000};


        // 标记变量 标记用户登录状态
        boolean isLogin = false;
        /*记录登录用户 数组下标(下标>=0，取-1,后续只要对下标有了改变，
           其值不为-1的话也说明用户已经登录成功)*/
        int userIndex = -1;
        // 登录
        Scanner input = new Scanner(System.in);

        while (true) {
            for (int i = 0; i < 3; i++) {// i表示账号和密码输入的次数 0 1 2
                System.out.println("请输入账户：");
                String account = input.next();
                System.out.println("请输入密码：");
                String password = input.next();
                // 用账号和密码去做比较
                // 遍历 账号数组
                for (int j = 0; j < userAccount.length; j++) {
                    // j表示账号数组的下标 和 密码数组的下标
                    // 拿用户输入的账号和密码去和所有存在的账号和密码进行比较
                    // 字符串的比较 使用equals， 字符串1.equals(字符串2)
                    if (account.equals(userAccount[j])
                            && password.equals(userPwd[j])) {
                        userIndex = j;
                        isLogin = true;
                        break;// 结束本层循环
                        //continue; // 跳过本次循环 剩余代码 进入下一次循环条件的判断
                    }
                }
                // 想要知道登录成功与否 是不是需要循环结束后才能知道
                //所以我们设置一个标记变量 改变状态
                if (!isLogin) { // 在当前位置等价于 isLogin == false
                    System.out.println("用户或密码有误，请重新输入");
                    // 提示 还剩下几次机会
                    if (i != 2) {// 0 1
                        System.out.println("还有" + (2 - i) + "次输入机会");
                    } else if (i == 2) {
                        System.out.println("3次机会已经用完，卡被冻结");
                        System.out.println("解冻请联系88888888");
                        // 3次机会结束 结束程序
                        System.exit(0);
                    }
                } else {
                    System.out.println("恭喜 登录成功\n欢迎进入江小白银行");
                    break;
                }
            }


            // 最好 是在登录成功以后 才会建立死循环
            while (isLogin) {
                // 登录成功 进入菜单
                System.out.println("欢迎进入菜单界面：");
                //存款、取款、查询、转账、退出
                System.out.println("请选择：1-存款 2-取款 3-查询 " +
                        "4-转账 5-切换账号 6-修改密码 7-退出");
                // 声明变量 接收用户 输入的选择
                int choose = input.nextInt();
                // 判断用户输入的值 做出不同的操作 switch-case语句/if语句   --分支语句
                if (choose == 1) {// 存款
                    while (true) {
                        System.out.println("请输入存款金额");
                        double saveMoney = input.nextDouble();

                        if (saveMoney < 0 || saveMoney % 100 != 0) {
                            System.out.println("输入金额有误，请重新输入");
                            continue;
                        }
                        // 把存款金额 加到余额上
                        // userMoney[userIndex] = userMoney[userIndex] +  saveMoney;
                        userMoney[userIndex] += saveMoney;
                        System.out.println("存款成功，当前余额为：" + userMoney[userIndex] + "元");
                        // 操作成功结束 存款循环
                        break;
                    }

                } else if (choose == 2) {// 取款
                    System.out.println("请输入取款金额");
                    double getMoney = input.nextDouble();
                    // 如果取款金额大于余额 或者 取款金额输入为负数 或者取款金额不是100的倍数
                    // 重新输入金额在做金额判断

                    if (getMoney < 0 || getMoney > userMoney[userIndex] || getMoney % 100 != 0) {
                        System.out.println("金额输入有误，取款失败");
                        // 第一个选择.把取款操作做出循环 在操作中听输入
                        // 第二个选择.输入有误，直接进入菜单 此时我做的选择2
                        continue;
                    }

                    // 代码执行此处 说明金额输入没有问题 可以继续取款操作
                    userMoney[userIndex] -= getMoney;
                    System.out.println("取款成功,当前余额" + userMoney[userIndex] + "元");
                } else if (choose == 3) {// 查询
                    // 获取当前登录用户的余额
                    // 根据登录用户下标获取余额
                    System.out.println("当前余额为：" + userMoney[userIndex] + "元");
                } else if (choose == 4) {// 转账
                    // 对方账号(判断账号是存在的) 和 转账金额(合法金额 小于余额、100整数倍、不能为负数)
                    System.out.println("请输入转账账号：");
                    String transAccount = input.next();
                    // 第二种写法 减少嵌套
                    // 保存对方账号的下标
                    int transIndex = -1;
                    // 判断账号是否存在 遍历整个账号数组
                    for (int i = 0; i < userAccount.length; i++) {
                        if (userAccount[i].equals(transAccount) &&
                                i != userIndex) {
                            transIndex = i;
                            break;
                        }
                    }
                    if (transIndex == -1) {// 说明账号不存在
                        System.out.println("对方账号不存在，请重新执行转账操作");
                        continue;
                    }

                    System.out.println("请输入转账金额：");
                    double transMoney = input.nextDouble();
                    if (transMoney < 0 || transMoney % 100 != 0 ||
                            transMoney > userMoney[userIndex]) {
                        System.out.println("金额有误，请重新执行转账操作");// 菜单
                        continue;
                    }
                    //  代码能执行到此处，说明账号存在 且 金额无误 可以做转账操作
                    // 转账操作 自己账号扣钱 对方账号加钱
                    userMoney[userIndex] -= transMoney;
                    userMoney[transIndex] += transMoney;
                    System.out.println("转账成功");
                    System.out.println("当前余额为：" + userMoney[userIndex] + "元");

                } else if (choose == 5) {// 切换账号
                    System.out.println("切换账号");
                    break;
                } else if (choose == 6) {// 修改密码
                    // 如果修改ATM密码 会做哪些操作
                    // 改密码 和 转账(数据有误是回到菜单重新开始) 换一种写法
                    // 数据有误 不返回菜单，重新去输入
                    while (true) {
                        System.out.println("请输入旧密码");
                        String oldPwd = input.next();
                        // 拿到输入的旧密码和数组中保存的密码 比价
                        if (!oldPwd.equals(userPwd[userIndex])) {
                            // 输入的旧密码和原本密码不一致
                            System.out.println("旧密码有误,请重新开始修改密码步骤");
                            continue;// 跳过剩余代码，直接再输入旧密码
                        }
                        // 代码能执行到此处，旧密码输入正确
                        System.out.println("请输入新密码");
                        String newPwd = input.next();
                        if (newPwd.equals(oldPwd)) {// 新密码和老密码相同
                            System.out.println("新密码不能和旧密码一致," +
                                    "请重新开始修改密码步骤");
                            continue;
                        }
                        // 代码能执行到此处，旧密码输入正确 新密码输入和旧密码不一致
                        System.out.println("请确认新密码");
                        String reNewPwd = input.next();
                        // 新密码 和第二次输入的新密码去做比较
                        if (!newPwd.equals(reNewPwd)) {
                            System.out.println("两次输入的新密码不一致，" +
                                    "请重新开始修改密码步骤");
                            continue;
                        }
                        // 代码能执行到此处，旧密码输入正确 新密码输入和旧密码不一致
                        // 两次输入的新密码一致 执行最后的改密操作
                        userPwd[userIndex] = newPwd;
                        System.out.println("修改密码成功，请重新登录");
                        // 想要重新登录 需要中断 菜单循环 和 修改密码循环
                        break;
                    }
                    break;
                } else if (choose == 7) {// 退出
                    System.out.println("欢迎下次再来");
                    // 结束程序
                    System.exit(0);
                }
            }

        }

    }
}