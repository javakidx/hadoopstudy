# hadoopstudy
My practice for the sample codes in Hadoop: The Definitive Guide. Most of these codes are the same as the sample codes in this book.
## How to execute

1. Set the directory for compiled classes.
2. Switch to the directory containing compile classes and execute the command to generate the jar file: `jar cf stuty-examples.jar **/*`
3. Use hadoop command to run the class. For example, executing `hadoop jar study-examples.jar idv.jk.study.hadoop.myself.StringReplace replace/replace.txt replace/output`
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