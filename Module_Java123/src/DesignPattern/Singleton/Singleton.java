package DesignPattern.Singleton;

import java.io.Serializable;

/*单例模式
1使用同步保正线程安全 synchronized
 2加上volatile关键字 只从同一地址读取数据，不从寄存器等地方读取，保证变量的数据一致性

 3防止反射调用私有构造方法
  4让单例类序例化安全

 * */
public class Singleton implements Serializable {
    private volatile static Singleton singleton = null;

    //为了防止new 以及反射构建新的实例
    private Singleton() {
        if (singleton != null) {
            throw new RuntimeException("实例已经存在了");
        }
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }

        }
        return singleton;
    }

}
