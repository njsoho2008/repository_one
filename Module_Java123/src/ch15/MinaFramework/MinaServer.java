package ch15.MinaFramework;

import org.apache.mina.core.filterchain.DefaultIoFilterChainBuilder;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.transport.socket.SocketAcceptor;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

public class MinaServer {
    public static void main(String[] args) {
//        建立一个非阻塞的Server端socket
        SocketAcceptor acceptor = new NioSocketAcceptor();
        DefaultIoFilterChainBuilder chain = acceptor.getFilterChain();

//设定这个过滤器将一行一行(/r/n)的读取数据
        chain.addLast("myChain", new ProtocolCodecFilter(new TextLineCodecFactory()));
        acceptor.setHandler(new MinaServerHandler());
        int port=9999;
        try {
            acceptor.bind(new InetSocketAddress(port));
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Mina Server is running,listening on 9999");
    }
}
