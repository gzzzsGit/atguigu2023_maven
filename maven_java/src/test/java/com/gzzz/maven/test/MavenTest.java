package com.gzzz.maven.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * className: MavenTest
 * Package : com.gzzz.maven.test
 * Description:
 *
 * @Author gzzz
 * @Create 2023/11/23 10:26
 * @Version 1.0
 */
// 类名必须以Test结尾(或开头，但不推荐)才能被识别为测试类
public class MavenTest {
    // 方法名必须以test开头才能被maven识别为测试方法
    @Test
    public void testAssert(){
        int a = 10;
        int b = 20;
        Assertions.assertEquals(a+b,30);//org.opentest4j.AssertionFailedError Expected :30 Actual   :20
    }
}
