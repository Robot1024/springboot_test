package yingu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import yingu.dao.DemoInfoRepository;
import yingu.dao.DemoInfoRepositoryMongo;
import yingu.domain.DemoInfo;

import java.util.List;

/**
 * @crea : Created by intelliJ IDEA 16.1.1 .
 * @auth : PengLei 18910335440@189.com .
 * @date : 2017/2/12
 * @desc :
 */
public class DemoMongoController {
    @Autowired
    private DemoInfoRepositoryMongo demoInfoRepositoryMongo;

    @RequestMapping("save")
    public String save(){
        DemoInfo demoInfo = new DemoInfo();
        demoInfo.setName("张三");
        demoInfoRepositoryMongo.save(demoInfo);

        demoInfo = new DemoInfo();
        demoInfo.setName("李四");
        demoInfoRepositoryMongo.save(demoInfo);

        return "ok";
    }

    @RequestMapping("find")
    public List<DemoInfo> find(){
        return demoInfoRepositoryMongo.findAll();
    }

    @RequestMapping("findByName")
    public DemoInfo findByName(){
        return demoInfoRepositoryMongo.findByName("张三");
    }
}
