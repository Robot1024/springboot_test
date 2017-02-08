package yingu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yingu.common.SpringUtil;
import yingu.servlet.MyServlet1;

/**
 * @crea : Created by intelliJ IDEA 16.1.1 .
 * @auth : PengLei 18910335440@189.com .
 * @date : 2016/12/26
 * @desc : app
 */
@ServletComponentScan
@SpringBootApplication
public class App {

//    /**
//     * 注册Servlet.不需要添加注解：@ServletComponentScan
//     * @return
//     */
//    @Bean
//    public ServletRegistrationBean MyServlet1(){
//        return new ServletRegistrationBean(new MyServlet1(),"/myServlet/*");
//    }

    /**注册Spring Util
     * 这里为了和上一个冲突，所以方面名为：springUtil2
     * 实际中使用springUtil
     */
    @Bean
    public SpringUtil springUtil2(){return new SpringUtil();}

    public static void main(String[] args) {
        SpringApplication.run(App.class, new String[]{"hello,","林峰"});
    }
}