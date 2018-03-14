package bridgeMode;


import java.util.List;

/**
 * 发送的消息抽象
 */
public abstract class IMessage {
    private ITransmit transmit;
    private String messageSource;  //发送消息的来源

    public IMessage(ITransmit transmit,String messageSource){
        this.transmit = transmit;
        this.messageSource = messageSource;
    }

    /**
     * protected可以被同一个包内的类访问，也可以被不同包的子类访问。
     * 为了给外界提供统一的发送消息的方式（个体，群发）,使用protected修饰。
     */
    public void sendMessages(String message,Object obj){
        if(obj instanceof List){
            List<Client> list = (List<Client>)obj;
            this.massMessage(message,list);
        }
        if(obj instanceof Client){
            this.sendMessage(message,(Client)obj);
        }
    }

    /**
     * 单个发送消息的方法
     * @param message
     * @param client
     */
    protected void sendMessage(String message,Client client){
        if (!messageSource.equals("京东")){
            this.transmit.sendMessage(message,client);
        }

    }

    /**
     * 群发消息的方法
     * @param message
     * @param clients
     */
    protected void massMessage(String message, List<Client> clients){
        this.transmit.massMessage(message,clients);
    }

    public void getTransmitMode(){
        this.transmit.getTransmitMode();
    }

    public ITransmit getTransmit() {
        return transmit;
    }

    public void setTransmit(ITransmit transmit) {
        this.transmit = transmit;
    }

    public String getMessageSource() {
        return messageSource;
    }

    public void setMessageSource(String messageSource) {
        this.messageSource = messageSource;
    }
}
