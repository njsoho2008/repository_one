package ch15.MinaFramework;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;

public class MinaClientHandler extends IoHandlerAdapter {

    //当一个客端端连结进入时
    public void sessionOpened(IoSession session) throws Exception {
        System.out.println("incomming client :" + session.getRemoteAddress());
        session.write("我来啦........");
    }

    //当一个客户端关闭时
    public void sessionClosed(IoSession session) {
        System.out.println("one Clinet Disconnect !");
    }

    //当客户端发送的消息到达时:
    public void messageReceived(IoSession session, Object message) throws Exception {
//我们己设定了服务器解析消息的规则是一行一行读取,这里就可转为 String:
        String s = (String) message;
        System.out.println("服务器发来的收到消息: " + s);
        //测试将消息回送给客户端
        session.write(s);
    }
}


