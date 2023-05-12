package com.example.shangrongbao;

import com.example.shangrongbao.mapper.UserMapper;
import com.example.shangrongbao.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = ShangrongbaoApplication.class)
@Slf4j
public class MabatisPulsTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(null);
        log.info("***{}", users);
    }
}
