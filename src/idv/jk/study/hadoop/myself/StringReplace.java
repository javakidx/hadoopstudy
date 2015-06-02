package idv.jk.study.hadoop.myself;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.io.IOException;

/**
 * Created by javakid on 2015/6/3.
 */
public class StringReplace
{
    public static void main(String[] argv)
            throws IOException, ClassNotFoundException, InterruptedException
    {
        if(argv.length != 2)
        {
            System.err.println("Usage: StringReplace <input path> <output path>");
            System.exit(-1);
        }

        Job job = new Job();
        job.setJarByClass(StringReplace.class);
        job.setJobName("String replacement");

        FileInputFormat.addInputPath(job, new Path(argv[0]));
        FileOutputFormat.setOutputPath(job, new Path(argv[1]));

        job.setMapperClass(StringReplaceMapper.class);
        job.setReducerClass(StringReplaceReducer.class);

        job.setOutputKeyClass(NullWritable.class);
        job.setOutputValueClass(Text.class);

        System.out.println(job.waitForCompletion(true) ? 0 : 1);
    }
}
