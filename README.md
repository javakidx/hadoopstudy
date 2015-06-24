# hadoopstudy
My practice for the code examples in Hadoop: The Definitive Guide.<br/>
To run the code examples, I need some setup and this is one of the reason I put my practice to Githup. Another reason is that I will not have to write the code again that I have completed somewhere.<br/> Most of these codes are the same as the sample codes in this book.
Please visit [Hadoop Book](http://hadoopbook.com/) for more information.

## How to execute

1. Set the directory for compiled classes. In my case, it is */home/javakid/study/hadoop/classpath*
2. Set Hadoop classpath which in my case is `export HADOOP_CLASSPATH=/home/javakid/study/hadoop/classpath`
3. Switch to the directory containing compile classes and execute the command to generate the jar file: `jar cf stuty-examples.jar **/*`
4. Use hadoop command to run the class. For example, executing `hadoop jar study-examples.jar idv.jk.study.hadoop.myself.StringReplace replace/replace.txt replace/output`
    will run the class to replace string with MapReduce.

## Commands in chapters
### Myself
1. `hadoop jar study-examples.jar idv.jk.study.hadoop.myself.StringReplace replace/replace.txt replace/output`

### Chapter 03
#### Prerequisite
Put the **quangle.txt** in *resource* to *hdfs://<materdominname>:9000/user/<yourusername>/input*.

#### Commands
1. `hadoop jar study-examples.jar idv.jk.study.hadoop.ed4.ch03.URLCat hdfs://javakid01:9000/user/javakid/input/quangle.txt`
2. `hadoop jar study-examples.jar idv.jk.study.hadoop.ed4.ch03.FileSystemCat hdfs://javakid01:9000/user/javakid/input/quangle.txt`
3. `hadoop jar study-examples.jar idv.jk.study.hadoop.ed4.ch03.FileSystemDoubleCat hdfs://javakid01:9000/user/javakid/input/quangle.txt`
4. Run `FileCopyWithProgress`:
    * Get file **1400-8.txt** via https://github.com/tomwhite/hadoop-book/blob/4e/input/docs/1400-8.txt
    * Use the path of the **1400-8.txt** file as the first parameter
    * `hadoop jar study-examples.jar idv.jk.study.hadoop.ed4.ch03.FileCopyWithProgress /home/javakid/study/hadoop/input/1400-8.txt hdfs://javakid01:9000/user/javakid/1400-8.txt`
5. `hadoop idv.jk.study.hadoop.ed4.ch03.ListStatus hdfs://javakid01:9000/ hdfs://javakid01:9000/user/javakid`

### Chapter 05
#### Commands
1. Writing a Sequence File:  
  `hadoop idv.jk.study.hadoop.ed4.ch05.SequenceFileWriteDemo numbers.seq`
2. Reading a Sequence File:  
    `hadoop idv.jk.study.hadoop.ed4.ch05.SequenceFileReadDemo numbers.seq`
    
### Chapter 06
#### Commands
1. `hadoop idv.jk.study.hadoop.ed4.ch06.ConfigurationPrinter -conf conf/hadoop-localhost.xml | grep yarn.resourcemanager.address=`
