package org.inlm1.client.net;

public interface OutputHandler {

    public void handleMessage(String message);

    public void handleGameOver();
}
