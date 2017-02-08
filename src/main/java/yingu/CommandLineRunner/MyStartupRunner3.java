package yingu.CommandLineRunner;

/**
 * @crea : Created by intelliJ IDEA 16.1.1 .
 * @auth : PengLei 18910335440@189.com .
 * @date : 2017/1/10
 * @desc : test
 */
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 服务启动执行
 *
 * @author   Angel(QQ:412887952)
 */
@Component
@Order(value=1)
public class MyStartupRunner3 implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
            System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作 22222222 <<<<<<<<<<<<<");
     }

}
