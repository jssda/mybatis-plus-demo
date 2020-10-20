package pers.jssd.mybatisplusdemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import pers.jssd.mybatisplusdemo.mapper.StudentMapper;
import pers.jssd.mybatisplusdemo.pojo.Students;

import java.util.List;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class MybatisPlusDemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<Students> students = studentMapper.selectList(null);
        students.forEach(System.out::println);
    }

}
