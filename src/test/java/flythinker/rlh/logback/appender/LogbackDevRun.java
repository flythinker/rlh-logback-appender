package flythinker.rlh.logback.appender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wlhua on 2018/10/23.
 */
public class LogbackDevRun {

    private static Logger logger = LoggerFactory.getLogger(LogbackDevRun.class);

    public static void test1() throws Exception{
        logger.info("test1 start.");
    }

    public static void main(String[] args)
    {
        try {
            test1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
