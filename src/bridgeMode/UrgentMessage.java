package bridgeMode;

import java.util.List;

public class UrgentMessage extends IMessage{
    private String messageType = "紧急消息：";

    public UrgentMessage(ITransmit transmit,String messageSource){
        super(transmit,messageSource);
    }

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
