package idv.jk.study.hadoop.ed4.ch05;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.WritableComparator;
import org.apache.hadoop.io.WritableUtils;

import java.io.IOException;

/**
 * Created by javakid on 6/23/15.
 */
public class Comparator extends WritableComparator
{
//    private static final Text.Comparator TEXT_COMPARATOR = new Text.Comparator();
//
//    public Comparator()
//    {
//        super(TextPair.class);
//    }
//
//    @Override
//    public int compare(byte[] b1, int s1, int l1, byte[] b2, int s2, int l2)
//    {
//        try
//        {
//            int firstL1 = WritableUtils.decodeVIntSize(b1[s1])  + readVInt(b1, s1);
//            int firstL2 = WritableUtils.decodeVIntSize(b2[s2])  + readVInt(b2, s2);
//
//            int cmp = TEXT_COMPARATOR.compare(b1, s1, firstL1, b2, s2, firstL2);
//            if(cmp != 0)
//            {
//                return cmp;
//            }
//
//            return TEXT_COMPARATOR.compare(b1, s1 + firstL1, l1 - firstL1,
//                                            b2, s2 + firstL2, l2 - firstL2);
//        } catch (IOException e)
//        {
//            throw new IllegalArgumentException(e);
//        }
//
//    }
}

//static
//{
//    WritableComparator.define(TextPair.class, new Comparator());
//}