package ch15.MinaFramework;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;

public class MinaServerHandler extends IoHandlerAdapter {
    @Override
    public void sessionOpened(IoSession session) throws Exception {
        // Empty handler
        super.sessionOpened(session);
        System.out.println("wellcome client"+session.getRemoteAddress());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void sessionClosed(IoSession session) throws Exception {
        // Empty handler
        super.sessionClosed(session);
        System.out.println("one Clinet Disconnect !");

    }

    @Override
    public void messageReceived(IoSession session, Object message) throws Exception {
        // Empty handler
        //我们己设定了服务器解析消息的规则是一行一行读取,这里就可转为String:
        String s=(String)message;
        System.out.println("收到客户机发来的消息: "+s);
        session.write("echo:"+s);

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void messageSent(IoSession session, Object message) throws Exception {
        // Empty handler
    }

}
