package idv.jk.study.hadoop.ch07;

import idv.jk.study.hadoop.ch05.v4.avro.NcdcRecordParser;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

/**
 * Created by javakid on 2015/4/2.
 */
public class StationPartitioner extends Partitioner<LongWritable, Text>
{
    private NcdcRecordParser parser = new NcdcRecordParser();

    @Override
    public int getPartition(LongWritable key, Text value, int numPartitions) {
        parser.parse(value);
        return getPartition(parser.getStationId());
    }

    private int getPartition(String stationId) {
    /*...*/
// ^^ StationPartitioner
        return 0;
// vv StationPartitioner
    }

}
//^^ StationPartitioner
