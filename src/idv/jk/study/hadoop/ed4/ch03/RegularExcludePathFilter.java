package idv.jk.study.hadoop.ed4.ch03;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.PathFilter;

/**
 * Created by javakid on 6/10/15.
 */
public class RegularExcludePathFilter implements PathFilter
{
    private String regex;

    public RegularExcludePathFilter(String regex)
    {
        this.regex = regex;
    }

    @Override
    public boolean accept(Path path)
    {
        return !path.toString().matches(this.regex);
    }
}
