package idv.jk.study.hadoop.ed4.ch06;

import org.apache.hadoop.conf.Configuration;
import org.junit.Test;

import java.io.IOException;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by javakid on 6/24/15.
 */
public class SingleResourceConfigurationTest
{
    @Test
    public void get() throws IOException
    {
        // vv SingleResourceConfigurationTest
        Configuration conf = new Configuration();
        conf.addResource("idv/jk/study/hadoop/ed4/ch06/configuration-1.xml");
        assertThat(conf.get("color"), is("yellow"));
        assertThat(conf.getInt("size", 0), is(10));
        assertThat(conf.get("breadth", "wide"), is("wide"));
        // ^^ SingleResourceConfigurationTest
    }
}
