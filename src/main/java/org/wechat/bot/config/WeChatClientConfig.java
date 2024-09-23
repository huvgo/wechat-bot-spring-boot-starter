package org.wechat.bot.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.wechat.bot.WeChatClient;

@Configuration
@ConditionalOnProperty(name = "wechat.bot.enabled", havingValue = "true", matchIfMissing = true)
public class WeChatClientConfig {

    @Bean
    public WeChatClient getWeChatClient() {
        return new WeChatClient("127.0.0.1", 10086, false);
    }
}
