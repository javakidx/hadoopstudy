package idv.jk.study.hadoop.myself;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

/**
 * Created by javakid on 2015/6/3.
 */
public class StringReplaceMapper
        extends Mapper<LongWritable, Text, NullWritable, Text>
{
    private static final String TARGET = "foo";
    private static final String REPLACEMENT = "bar";

    @Override
    protected void map(LongWritable key, Text value, Context context)
            throws IOException, InterruptedException
    {
        String line = value.toString();

        if(line.indexOf(TARGET) >= 0)
        {
            context.write(NullWritable.get(),
                            new Text(line.replaceAll(TARGET, REPLACEMENT)));
        }
    }
}
