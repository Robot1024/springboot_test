package yingu.dao;

import org.springframework.data.repository.CrudRepository;
import yingu.domain.DemoJPA;

/**
 * @crea :Created by intelliJ IDEA 16.1.1 .
 * @auth :PengLei 18910335440@189.com .
 * @date :2017/1/5
 * @desc : ${desc}
 */
public interface DemoRepository extends CrudRepository<DemoJPA, Long> {

}
