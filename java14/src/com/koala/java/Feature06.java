package com.koala.java;

import java.util.ArrayList;

/**
 * day06：弃用ParallelScavenge和SerialOld GC组合
 *  垃圾收集器的更新： ① 弃用ParallelScavenge和SerialOld GC组合
 *                  ② 删除CMS垃圾回收器
 *                  ③ ZGC 可以在macOS和Windows上使用
 * 测试：
 *   1、下拉选择 Edit Configurations... --》 Modify options --》 Add VM options
 *   2、分别输入下面的 ①/②/③ 进行测试
 *   3、未执行第二步时运行Feature06.java 进行测试查看
 *   4、执行第二步后运行Feature06.java 进行测试查看
 *
 *  ①：-XX:+UseParallelGC -XX:-UseParallelOldGC
 *
 *  ①：-XX:-UseParallelOldGC
 *
 *  ②：-XX:+UseConcMarkSweepGC
 *
 *  ③：-XX:+UnlockExperimentalVMOptions -XX:+UseZGC
 * Create by koala on 2021-08-15
 */
public class Feature06 {

    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<>();

        while(true){
            byte[] arr = new byte[100];
            list.add(arr);
        }
    }

}