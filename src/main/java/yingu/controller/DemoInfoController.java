package yingu.controller;

/**
 * @crea : Created by intelliJ IDEA 16.1.1 .
 * @auth : PengLei 18910335440@189.com .
 * @date : 2017/1/17
 * @desc : test
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import yingu.Service.DemoInfoService;
import yingu.domain.DemoInfo;


/**
 * 测试类.
 * @author Angel(QQ:412887952)
 * @version v.0.1
 */
@Controller
public class DemoInfoController {

     @Autowired
     DemoInfoService demoInfoService;


    @RequestMapping("/test")
    public@ResponseBody String test(){
        DemoInfo loaded = demoInfoService.findById("1");
        System.out.println("loaded="+loaded);
        DemoInfo cached = demoInfoService.findById("1");
        System.out.println("cached="+cached);
        loaded = demoInfoService.findById("2");
        System.out.println("loaded2="+loaded);
        return"ok";
     }


    @RequestMapping("/delete")
    public@ResponseBody String delete(String id){
        demoInfoService.deleteFromCache(id);
        return"ok";
    }

    @RequestMapping("/test1")
    public@ResponseBody String test1(){
        demoInfoService.test();
        System.out.println("DemoInfoController.test1()");
        return"ok";
        }
    }
