# testjxl应用说明

## 问题描述

![testjxl](C:\Users\Administrator\Desktop\testjxl.png)

1. 测试表：保存一些用分号隔开的字符串数据，第一列数字为该组字符串中分号隔开的字符串个数。
2. 对照表：每一个分号隔开的字符串对应一组数据。
3. 结果表：获取测试表中分号隔开的每个字符串对应的一组数据，输出在结果表中。要求无重复。



## 测试应用

0. 将项目导入到eclipse中，将lib目录下的jxl.jar右键 -> Build Path -> Add to build Path.


1. appdata目录下复制test.xls表和source.xls表分别放在Windows桌面路径下。
2. 运行Client类下的main方法。
3. 在桌面上得到结果表out.xls