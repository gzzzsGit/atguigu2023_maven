package com.gzzz.maven.test;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;

/**
 * className: DruidTest
 * Package : com.gzzz.maven.test
 * Description:
 *
 * @Author gzzz
 * @Create 2023/11/23 21:10
 * @Version 1.0
 */
public class DruidTest {
//    测试依赖传递
    @Test
    public void test(){
        DruidDataSource druidDataSource= new DruidDataSource();
    }
}
