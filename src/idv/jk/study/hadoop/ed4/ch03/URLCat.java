package idv.jk.study.hadoop.ed4.ch03;

import org.apache.hadoop.fs.FsUrlStreamHandlerFactory;
import org.apache.hadoop.io.IOUtils;

import java.io.InputStream;
import java.net.URL;

/**
 * Created by javakid on 6/5/15.
 */
public class URLCat
{
    static
    {
        URL.setURLStreamHandlerFactory(new FsUrlStreamHandlerFactory());
    }

    public static void main(String[] argv) throws Exception
    {
        InputStream in = null;
        try
        {
            in = new URL(argv[0]).openStream();
            IOUtils.copyBytes(in, System.out, 4096, false);
        }
        finally
        {
            IOUtils.closeStream(in);
        }
    }
}
