package bridgeMode;

import java.util.List;

public class ExtraUrgentMessage extends IMessage{

    public ExtraUrgentMessage(ITransmit transmit,String messageSource){
        super(transmit,messageSource);
    }

    private String messageType = "特急加急消息：";

    @Override
    protected void sendMessage(String message, Client client) {
        message = messageType + message;
        super.sendMessage(message, client);
    }

    @Override
    protected void massMessage(String message, List<Client> clients) {
        message = messageType+message+"(群发)";
        super.massMessage(message, clients);
    }
}
