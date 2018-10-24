package flythinker.rlh.logback.appender;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wlhua on 2018/10/23.
 */
public class LogbackRedisAppenderTest {

    private static Logger logger = LoggerFactory.getLogger(LogbackRedisAppenderTest.class);

    /**
     * 基本功能测试
     */
    @Test
    public void testBasicFunc(){
        logger.info("testBasicFunc");
    }
}
