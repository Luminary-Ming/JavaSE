package com.neuedu.demo.c_math;

public class Math09 {
    public static void main(String[] args) {
        // 方法一：首先确定母鸡的购买数量为0，使公鸡的购买数量从0-100逐次变化，每当公鸡的数量变化一次，小鸡的数量就从0逐次变化到100。
        // 母鸡数量
        for (int i = 0; i < 101; i++) {
            // 公鸡数量
            for (int j = 0; j < 101; j++) {
                // 小鸡数量
                for (int k = 0; k < 101; k++) {
                    if ((i + j + k == 100) && (i * 3 + j * 4 + k * 0.5 == 100)) {
                        System.out.println("母鸡数量：" + i + "\t公鸡数量：" + j + "\t小鸡数量：" + k);
                    }
                }

            }

        }


        // 方法二：100元最多能购买33只母鸡，若只买公鸡只能买25只，而按照用100元买100只的要求，100减去公鸡和母鸡的购买数量即是小鸡的购买数量。
        // 100元最多能购买33只母鸡
        for (int i = 0; i < 34; i++){
            // 100元最多能购买25只公鸡
            for (int j = 0; j < 26; j++) {
                // 小鸡数量
                int k = 100 - i -j;
                if (i * 3 + j * 4 + k * 0.5 == 100){
                    System.out.println("母鸡数量：" + i + "\t公鸡数量：" + j + "\t小鸡数量：" + k);
                }
            }
        }



    }
}
