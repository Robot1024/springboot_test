package yingu.Service;

import yingu.domain.DemoInfo;

/**
 * demoInfo 服务接口
 * @author Angel(QQ:412887952)
 * @version v.0.1
 */
public interface DemoInfoService {

    public DemoInfo findById(String id);

    public void deleteFromCache(String id);

    void test();

}