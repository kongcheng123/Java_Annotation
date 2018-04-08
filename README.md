# Java_Annotation
java 自定义注解
-
1.注解用处：
  
  1）生成文档。这是最常见的，也是java 最早提供的注解。常用的有@param @return 等
  
  2）跟踪代码依赖性，实现替代配置文件功能。比如Dagger 2依赖注入，未来java开发，将大量注解配置，具有很大用处;
  
  3）在编译时进行格式检查。如@override 放在方法前，如果你这个方法并不是覆盖了超类方法，则编译时就能检查出。

2.注解可以分为三类：

  1）一类是Java自带的标准注解，包括@Override、@Deprecated和@SuppressWarnings，分别用于标明重写某个方法、标明某个类或方法过时、标明要忽略的警告，用这些注解标明后编译器就会进行检查。

  2）一类为元注解，元注解是用于定义注解的注解，包括@Retention、@Target、@Inherited、@Documented，@Retention用于标明注解被保留的阶段，@Target用于标明注解使用的范围，@Inherited用于标明注解可继承，@Documented用于标明是否生成javadoc文档。
  
  3）一类为自定义注解，可以根据自己的需求定义注解，并可用元注解对自定义注解进行注解。
https://www.cnblogs.com/acm-bingzi/p/javaAnnotation.html

https://www.cnblogs.com/icerainsoft/p/3471749.html
