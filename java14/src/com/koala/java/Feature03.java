package com.koala.java;

import com.koala.java.entity.Person01;
import com.koala.java.entity.Person02;
import org.junit.Test;

import java.util.HashSet;

/**
 * day03：
 *      Record类型的演示
 * Create by koala on 2021-08-15
 */
public class Feature03 {

    @Test
    public void test1() {

        //测试构造器
        Person01 p1 = new Person01("罗密欧", new Person01("zhuliye", null));

        //测试toString()
        System.out.println(p1);

        //测试equals():
        Person01 p2 = new Person01("罗密欧", new Person01("zhuliye", null));
        System.out.println(p1.equals(p2));

        //测试hashCode()和equals()
        HashSet<Person01> set = new HashSet<>();
        set.add(p1);
        set.add(p2);

        for (Person01 person01 : set) {
            System.out.println(person01);
        }

        //测试name()和partner():类似于getName()和getPartner()
        System.out.println(p1.name());
        System.out.println(p1.partner());
    }

    @Test
    public void test2() {
        Person02 p1 = new Person02("zhuyingtai");

        System.out.println(p1.getNameInUpperCase());

        Person02.nation = "CHN";
        System.out.println(Person02.showNation());
    }
}
