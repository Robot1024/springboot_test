package yingu.dao;

/**
 * @crea : Created by intelliJ IDEA 16.1.1 .
 * @auth : PengLei 18910335440@189.com .
 * @date : 2017/2/8
 * @desc : cash 持久类
 */


import org.springframework.data.repository.CrudRepository;
import yingu.domain.DemoInfo;

/**
 * 操作数据库.
 * @author Angel(QQ:412887952)
 * @version v.0.1
 */
public interface DemoInfoRepositoryCash extends CrudRepository<DemoInfo,Long> {

}