package test;

import bridgeMode.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BridgeModeTest {
    public static void main(String[] args){
        Client c1 = new Client("zhangsan","984611383@qq.com","18811348103");
        Client c2 = new Client("Mary","92345643@qq.com","18812346323");
        Client c3 = new Client("Lisi","meng9487@163.com","18600983244");
        Client c4 = new Client("Rose","134950@sohu.com","18843218153");
        Client c5 = new Client("John","zhanghuij@gmail.com","1892938103");
        Client[] clients = new Client[]{c1,c2,c3,c4,c5};
        List<Client> clients_list = new ArrayList<>();
        Collections.addAll(clients_list,clients);

        ITransmit transmit = new EmailTransmit();
        IMessage message_system = new BasicMessage(transmit,"淘宝");
        message_system.sendMessages("淘宝提醒：您有新的优惠券",c1);
//        System.out.print("消息来源"+message_system.getMessageSource());
    }
}
