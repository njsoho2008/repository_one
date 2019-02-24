装饰者模式，通过非继承的方法，来扩展应用程序的功能

有些情况下，继承的方式容易导致子类爆炸，就是类扩展的太多太多了

为了避免这种情况，解决思路就是采用装饰者模式

Java  IO  的体系结构来看，就是一个装饰者设计模式的典型

字节流 InPutStream OutPutStream  扩展出N多 流。。。。。

具体实现：

1 定义一个接口
2 定义一个被装饰者对象
3 n个装饰者对象
4 装饰者基类

测试main类

本例子以豆浆 为原始功能类

以配以 糖、牛奶、黑豆、五谷、鸡蛋等

在javaIO 设计中

InputStream 和 OutputStream 类 为被装饰者的基类（父类）

FileOutputStream  为 具体的被装饰者

装饰者是 FilterOutputStream  或者 BufferOutPutStream


