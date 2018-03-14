package bridgeMode;

import java.util.List;

public class BasicMessage extends IMessage{
    private String messageType = "普通消息:";

    public BasicMessage(ITransmit transmit,String messageSource){
        super(transmit,messageSource);
    }

    @Override
    protected void sendMessage(String message, Client client) {
        message = messageType+message;
        super.sendMessage(message, client);
    }

    @Override
    protected void massMessage(String message, List<Client> clients) {
        message = messageType+message+"(群发)";
        super.massMessage(message, clients);
    }
}
