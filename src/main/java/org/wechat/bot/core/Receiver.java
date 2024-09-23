package org.wechat.bot.core;

@FunctionalInterface
public interface Receiver {

    void receive(Wcf.WxMsg msg);
}
