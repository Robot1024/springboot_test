package yingu.evn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @crea : Created by intelliJ IDEA 16.1.1 .
 * @auth : PengLei 18910335440@189.com .
 * @date : 2017/1/10
 * @desc : read Properties
 */
//@Configuration
//@ConditionalOnClass(Mongo.class)
//@EnableConfigurationProperties(MongoProperties.class)
public class MongoAutoConfiguration {

    @Autowired
    private MongoProperties properties;

}
