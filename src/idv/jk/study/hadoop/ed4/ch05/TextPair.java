package idv.jk.study.hadoop.ed4.ch05;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Created by javakid on 6/23/15.
 */
public class TextPair implements WritableComparable<TextPair>
{
    private Text first;
    private Text second;

    public TextPair()
    {
        set(new Text(), new Text());
    }

    public TextPair(Text first, Text second)
    {
        set(first, second);
    }

    public TextPair(String first, String second)
    {
        set(new Text(first), new Text(second));
    }

    public void set(Text first, Text second)
    {
        this.first = first;
        this.second = second;
    }

    public Text getFirst()
    {
        return first;
    }

    public Text getSecond()
    {
        return second;
    }

    @Override
    public int compareTo(TextPair o)
    {
        int cmp = first.compareTo(o.first);
        if(cmp != 0)
        {
            return cmp;
        }

        return second.compareTo(o.second);
    }

    @Override
    public void write(DataOutput dataOutput) throws IOException
    {
        first.write(dataOutput);
        second.write(dataOutput);
    }

    @Override
    public void readFields(DataInput dataInput) throws IOException
    {
        first.readFields(dataInput);
        second.readFields(dataInput);
    }

    @Override
    public int hashCode()
    {
        return first.hashCode() * 163 + second.hashCode();
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof TextPair)
        {
            TextPair tp = (TextPair)obj;
            return first.equals(tp.first) && second.equals(tp.second);
        }
        return false;
    }

    @Override
    public String toString()
    {
        return first + "\t" + second;
    }
}
