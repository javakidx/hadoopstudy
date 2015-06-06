# hadoopstudy
My practice for the sample code of Hadoop: The Definitive Guide
## How to execute

1. Set the directory for compiled classes.
2. Switch to the directory containing compile classes and execute the command:
  ```
        jar cf stuty-examples.jar **/*
  ```
3. Use hadoop command to run the class. For example, executing 
```
        hadoop jar study-examples.jar idv.jk.study.hadoop.myself.StringReplace replace/replace.txt replace/output
```
   will run the class to replace string with MapReduce.

## Commands in chapters
### Myself
1. 
```
        hadoop jar study-examples.jar idv.jk.study.hadoop.myself.StringReplace replace/replace.txt replace/output
```

### Chapter 03
1. 
```
        hadoop jar study-examples.jar idv.jk.study.hadoop.ed4.ch03.URLCat hdfs://javakid01:9000/user/javakid/input/quangle.txt
```
