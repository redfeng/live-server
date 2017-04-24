package org.live.websocket.chat;

/**
 *  通讯信息
 *
 *  消息事件类型参考 {@link MessageType}
 *
 *  消息的理解：禁言，踢出，解除禁言，解除踢出等，发这些类型的消息时，理解为用户被动的发这些消息。
 *  即account，nickname字段是用户的， 而不是主播的
 *
 * Created by Mr.wang on 2017/3/17.
 */
public class Message {

    /**
     *  来自哪个直播间号
     */
    private String fromChatRoomNum ;

    /**
     *  发送至某直播间，或某人
     *  当发送至某人时，格式：  "直播间号-用户账号"，例如："10001-201335020231"
     */
    private String destination ;


    /**
     *  发送者的账号
     */
    private String account ;

    /**
     *  发送者的名称
     */
    private String nickname ;

    /**
     *  信息内容
     */
    private String content ;

    /**
     *
     *  消息事件类型
     */
    private int messageType ;

    /**
     * 额外的参数。
     */
    private String extra ;


    public String getFromChatRoomNum() {
        return fromChatRoomNum;
    }

    public void setFromChatRoomNum(String fromChatRoomNum) {
        this.fromChatRoomNum = fromChatRoomNum;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getMessageType() {
        return messageType;
    }

    public void setMessageType(int messageType) {
        this.messageType = messageType;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
}
