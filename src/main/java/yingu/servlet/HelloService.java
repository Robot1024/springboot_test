package yingu.servlet;

/**
 * @crea : Created by intelliJ IDEA 16.1.1 .
 * @auth : PengLei 18910335440@189.com .
 * @date : 2017/1/10
 * @desc : test
 */

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getName(){
        return"hello";
    }
}
