package org.inlm1.server.start;

import org.inlm1.server.net.Server;

public class ServerMain {
    public static void main(String[] args) {
        Server s = new Server();
        s.start();
    }
}
