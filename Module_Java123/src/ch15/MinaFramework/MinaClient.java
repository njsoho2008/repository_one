package ch15.MinaFramework;

import org.apache.mina.core.filterchain.DefaultIoFilterChainBuilder;
import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.transport.socket.nio.NioSocketConnector;

import java.net.InetSocketAddress;
import java.util.Scanner;

public class MinaClient {
    public static void main(String[] args) {
        NioSocketConnector connector = new NioSocketConnector(); // 创建接收数据的过滤器
        DefaultIoFilterChainBuilder chain = connector.getFilterChain();
//设定这个过滤器将一行一行(/r/n)的读取数据
        chain.addLast("myChain", new ProtocolCodecFilter(new TextLineCodecFactory()));
//设定服务器端的消息处理器:一个 SamplMinaServerHandler 对象
        connector.setHandler(new MinaClientHandler());
        connector.setConnectTimeoutMillis(10000);// Set connect timeout.
//连接到服务器:
        ConnectFuture cf = connector.connect(new InetSocketAddress("localhost", 9999));
// Wait for the connection attempt to be finished.等待链接成功
        cf.awaitUninterruptibly();
//发送消息
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("请输入客户端消息");
            String info = input.nextLine();
            if(info.equals("exitcf")) break;
            cf.getSession().write(info);
        }


// 如果服务器关闭，则如下语句就是自动让客户端阻塞,结束长连接
// cf.getSession().getCloseFuture().awaitUninterruptibly();
//        关闭客户端语句如下
//connector.dispose();

    }
}
