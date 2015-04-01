package idv.jk.study.hadoop.ch05;

import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

/**
 * Created by javakid on 3/11/15.
 */
public class MaxTemperatureDriver extends Configured implements Tool
{

    @Override
    public int run(String[] args) throws Exception {
        if(args.length != 2)
        {
            ToolRunner.printGenericCommandUsage(System.err);
            return -1;
        }
        return 0;
    }
}
