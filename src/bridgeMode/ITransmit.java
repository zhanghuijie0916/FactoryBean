package bridgeMode;

import java.util.List;

/**
 * 以某种手段发送消息
 */
public interface ITransmit {
    public abstract void sendMessage(String message,Client client);

    public abstract void massMessage(String message, List<Client> clients);

    public abstract String getTransmitMode();
}
