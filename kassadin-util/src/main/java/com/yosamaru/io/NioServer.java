package com.yosamaru.io;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;

public class NioServer {
    private static Charset charset = Charset.forName("UTF-8");

    public static void main(String[] args) {
        try {
            Selector selector = Selector.open();
            ServerSocketChannel chanel = ServerSocketChannel.open();
            chanel.bind(new InetSocketAddress(8083));
            chanel.configureBlocking(false);
            chanel.register(selector, SelectionKey.OP_ACCEPT);
            while (true) {
                int select = selector.select();
                if (select == 0) {
                    System.out.println("select loop");
                    continue;
                }
                System.out.println("os data ok");
                Set<SelectionKey> selectionKeys = selector.selectedKeys();
                Iterator<SelectionKey> iterator = selectionKeys.iterator();
                while (iterator.hasNext()) {
                    SelectionKey selectionKey = iterator.next();
                    if (selectionKey.isAcceptable()) {
                        ServerSocketChannel server = (ServerSocketChannel) selectionKey.channel();
                        SocketChannel client = server.accept();
                        client.configureBlocking(false);
                        client.register(selector, SelectionKey.OP_READ);
                        //继续可以接收连接事件
                        selectionKey.interestOps(SelectionKey.OP_ACCEPT);
                    } else if (selectionKey.isReadable()) {
                        //得到SocketChannel
                        SocketChannel client = (SocketChannel) selectionKey.channel();
                        //定义缓冲区
                        ByteBuffer buffer = ByteBuffer.allocate(1024);
                        StringBuilder content = new StringBuilder();
                        while (client.read(buffer) > 0) {
                            buffer.flip();
                            content.append(charset.decode(buffer));
                        }
                        System.out.println("client port:" + client.getRemoteAddress().toString() + ",input data: " + content.toString());
                        //清空缓冲区
                        buffer.clear();
                    }
                    iterator.remove();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

