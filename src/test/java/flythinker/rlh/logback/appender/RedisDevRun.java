package flythinker.rlh.logback.appender;

/**
 * Created by wlhua on 2018/10/23.
 */
public class RedisDevRun {
    static void test1() throws Exception
    {
        LogbackRedisAppender appender = new LogbackRedisAppender();
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
