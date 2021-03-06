package bridgeMode;

import java.util.List;

public class EmailTransmit implements ITransmit {
    @Override
    public void sendMessage(String message, Client client) {
        System.out.println("send message to "+client.getEmail()+":");
        System.out.println("dear "+client.getName()+"：");
        System.out.println("\r"+message);
    }

    @Override
    public void massMessage(String message, List<Client> clients) {
        for(Client c : clients){
            this.sendMessage(message,c);
            System.out.println("\n");
        }
    }

    @Override
    public String getTransmitMode() {
        return "EMAIL";
    }
}
