package yingu.Service;

import org.springframework.stereotype.Service;
import yingu.dao.DemoRepository;
import yingu.domain.DemoDao;
import yingu.domain.DemoJPA;

import javax.annotation.Resource;
import javax.transaction.Transactional;

/**
 * @crea : Created by intelliJ IDEA 16.1.1 .
 * @auth : PengLei 18910335440@189.com .
 * @date : 2017/1/5
 * @desc : t
 */
@Service
public class DemoService {
    @Resource
    private DemoRepository demoRepository;

    @Resource
    private DemoDao demoDao;

    @Transactional
    public void save(DemoJPA demo){
        demoRepository.save(demo);
    }

    public DemoJPA getById(long id){
        //demoRepository.findOne(id);//在demoRepository可以直接使用findOne进行获取.
        return demoDao.getById(id);
    }
}
