package yingu.controller;

/**
 * @crea : Created by intelliJ IDEA 16.1.1 .
 * @auth : PengLei 18910335440@189.com .
 * @date : 2016/12/28
 * @desc : test
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yingu.Service.DemoService;
import yingu.domain.DemoJPA;
import yingu.domain.Dome;

import javax.annotation.Resource;
import java.util.Map;

@RestController// 标记为：restful
@RequestMapping("/demo")
public class HelloController {

    @Resource
    private DemoService demoService;


    /**
     * 测试保存数据方法.
     * @return
     */
    @RequestMapping("/save")
    public String save(){
        DemoJPA d = new DemoJPA();
        d.setName("Angel");
        demoService.save(d);//保存数据.
        return"ok.Demo2Controller.save";
    }

    @RequestMapping("/getDemo")
    public Dome hello(){
        Dome demo = new Dome();
        demo.setId(1);
        demo.setName("Angel");
        return demo;
    }

    @RequestMapping("/zeroException")
    public int zeroException(){
        return 100/0;
    }

    @RequestMapping("/getById")
    public DemoJPA getById(long id){
        return demoService.getById(id);
    }

    /**
     * 返回html模板.
     */
    @RequestMapping("/helloHtml")
    public String helloHtml(Map<String,Object> map){
        map.put("hello","from TemplateController.helloHtml");
        return"/helloHtml";
    }
}
