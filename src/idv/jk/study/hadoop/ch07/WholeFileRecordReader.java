package idv.jk.study.hadoop.ch07;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.lib.input.FileSplit;

import java.io.IOException;

/**
 * Created by javakid on 4/1/15.
 */
public class WholeFileRecordReader extends RecordReader<NullWritable, BytesWritable>
{
    private FileSplit mFileSplit;
    private Configuration mConfiguration;
    private BytesWritable value = new BytesWritable();
    private boolean processed = false;

    @Override
    public void initialize(InputSplit inputSplit, TaskAttemptContext taskAttemptContext) throws IOException, InterruptedException
    {
        mFileSplit = (FileSplit)inputSplit;
        mConfiguration = taskAttemptContext.getConfiguration();
    }

    @Override
    public boolean nextKeyValue() throws IOException, InterruptedException
    {
        if(!processed)
        {
            byte[] contents = new byte[(int) mFileSplit.getLength()];
            Path file = mFileSplit.getPath();
            FileSystem fileSystem = file.getFileSystem(mConfiguration);

            FSDataInputStream in = null;
            try
            {
                in = fileSystem.open(file);
                IOUtils.readFully(in, contents, 0, contents.length);
                value.set(contents, 0, contents.length);
            }
            finally
            {
                IOUtils.closeStream(in);
            }
            processed = true;
            return true;
        }

        return false;
    }

    @Override
    public NullWritable getCurrentKey() throws IOException, InterruptedException
    {
        return NullWritable.get();
    }

    @Override
    public BytesWritable getCurrentValue() throws IOException, InterruptedException
    {
        return value;
    }

    @Override
    public float getProgress() throws IOException, InterruptedException
    {
        return processed ? 1.0f : 0.0f;
    }

    @Override
    public void close() throws IOException
    {
        //do nothing
    }
}
