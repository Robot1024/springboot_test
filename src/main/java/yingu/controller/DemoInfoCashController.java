package yingu.controller;

/**
 * @crea : Created by intelliJ IDEA 16.1.1 .
 * @auth : PengLei 18910335440@189.com .
 * @date : 2017/2/8
 * @desc : test
 */

import javassist.NotFoundException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yingu.Service.DemoInfoServiceCash;
import yingu.domain.DemoInfo;

import javax.annotation.Resource;

@RestController
public class DemoInfoCashController {

    @Resource
    private DemoInfoServiceCash demoInfoServiceCash;

    @RequestMapping("/testCash")
    public String test(){

        //存入两条数据.
        DemoInfo demoInfo = new DemoInfo();
        demoInfo.setName("张三");
        demoInfo.setPwd("123456");
        DemoInfo demoInfo2 = demoInfoServiceCash.save(demoInfo);

        //不走缓存.
        System.out.println(demoInfoServiceCash.findById(demoInfo2.getId()));
        //走缓存.
        System.out.println(demoInfoServiceCash.findById(demoInfo2.getId()));


        demoInfo = new DemoInfo();
        demoInfo.setName("李四");
        demoInfo.setPwd("123456");
        DemoInfo demoInfo3 = demoInfoServiceCash.save(demoInfo);

        //不走缓存.
        System.out.println(demoInfoServiceCash.findById(demoInfo3.getId()));
        //走缓存.
        System.out.println(demoInfoServiceCash.findById(demoInfo3.getId()));

        System.out.println("============修改数据=====================");
        //修改数据.
        DemoInfo updated = new DemoInfo();
        updated.setName("李四-updated");
        updated.setPwd("123456");
        updated.setId(demoInfo3.getId());
        try {
            System.out.println(demoInfoServiceCash.update(updated));
        } catch (NotFoundException e) {
            e.printStackTrace();
        }

        //不走缓存.
        System.out.println(demoInfoServiceCash.findById(updated.getId()));

        return "ok";
    }


}
