package com.hnhy99999.zhgd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest

public class ZhgdApplicationTests {

    @Autowired
    private JdbcTemplate jdbcTemplate ;

    @Test
    public void  testMysql(){
        List<Map<String,Object>> result = jdbcTemplate.queryForList("select * from zhgd_test");
        System.out.println(result.size());
        System.out.println("suuce11");

    }


    @Test
    public void contextLoads() {
    }

}
