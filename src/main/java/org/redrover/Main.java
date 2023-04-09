package org.redrover;

import jdk.jshell.execution.Util;
import org.apache.commons.lang3.StringUtils;

public class Main {
    //пишем наш метод
    public static void main(String[] args) {
        System.out.println("Hello");
        testAbbr();
    }


//        System.out.println(StringUtils.abbreviate("Hello world!", 14));
//        System.out.println(Utils.abbr("Hello world", 11));

// для метода пишем тест
    private static void testAbbr(){
        if (!"Hello...".equals(Utils.abbr("Hello world", 7))){
            System.out.println("bug!");
        }


        System.out.println(Utils.abbr1("Hello world", 11));


//        if (6 != Utils.sum(2, 4)) {
//            System.out.println("method sum has a bug");
//      }
    }

    private static void TestAbbr(){
        if ("Hello wo...".equals(StringUtils.abbreviate("Hello world", 11))){
            System.out.println("This is bug");
        }
    }

        }




