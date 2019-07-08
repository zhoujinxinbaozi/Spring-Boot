package com.zhoujinxin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/***
 *  相当于@Configuration ，@EnableAutoConfiguration 和 @ComponentScan 三个配置
 * @ComponentScan：让spring Boot扫描到Configuration类并把它加入到程序上下文。
 * @Configuration ：等同于spring的XML配置文件；使用Java代码可以检查类型安全。
 * @EnableAutoConfiguration ：自动配置。
 */
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
