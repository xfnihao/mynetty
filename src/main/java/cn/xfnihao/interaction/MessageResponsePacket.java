package cn.xfnihao.interaction;

import lombok.Data;

import static cn.xfnihao.protocol.Command.MESSAGE_RESPONSE;

/**
 * @Author Fang chenjiang
 * @Date 2020/11/9
 */
@Data
public class MessageResponsePacket  extends  Packet {

    String msg;

    @Override
    public Byte getCommand() {
        return  MESSAGE_RESPONSE;
    }
}