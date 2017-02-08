package yingu.Service;

/**
 * @crea :Created by intelliJ IDEA 16.1.1 .
 * @auth :PengLei 18910335440@189.com .
 * @date :2017/2/8
 * @desc : ${desc}
 */

import javassist.NotFoundException;
import yingu.domain.DemoInfo;

public interface DemoInfoServiceCash {

    void delete(Long id);

    DemoInfo update(DemoInfo updated) throws NotFoundException;

    DemoInfo findById(Long id);

    DemoInfo save(DemoInfo demoInfo);

}
