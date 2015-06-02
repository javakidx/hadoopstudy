package idv.jk.study.hadoop.myself;

import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

/**
 * Created by javakid on 2015/6/3.
 */
public class StringReplaceReducer
        extends Reducer<NullWritable, Text, NullWritable, Text>
{
    @Override
    protected void reduce(NullWritable key, Iterable<Text> values, Context context)
            throws IOException, InterruptedException
    {
        for(Text text : values)
        {
            context.write(NullWritable.get(), text);
        }

    }
}
