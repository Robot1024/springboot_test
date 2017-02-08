package yingu.domain;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @crea : Created by intelliJ IDEA 16.1.1 .
 * @auth : PengLei 18910335440@189.com .
 * @date : 2017/1/5
 * @desc : t
 */
@Repository
public class DemoDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    /**
     * 通过id获取demo对象.
     * @param id
     * @return
     */
    public DemoJPA getById(long id){
        String sql = "select * from DemoJPA where id=?";
        RowMapper<DemoJPA> rowMapper = new BeanPropertyRowMapper<DemoJPA>(DemoJPA.class);
        return jdbcTemplate.queryForObject(sql, rowMapper,id);
    }
}
