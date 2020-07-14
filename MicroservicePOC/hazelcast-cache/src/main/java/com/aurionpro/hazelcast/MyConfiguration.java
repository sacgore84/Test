/*package com.aurionpro.hazelcast;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.client.config.XmlClientConfigBuilder;
import com.hazelcast.core.HazelcastInstance;


@Configuration
public class MyConfiguration {
	 static Logger log = LoggerFactory.getLogger(MyConfiguration.class);

    @Configuration
    @ConditionalOnMissingBean(ClientConfig.class)
    static class HazelcastClientConfigConfiguration {

        @Bean
        public ClientConfig clientConfig() throws Exception {
                log.warn("Creating 'ClientConfig' manually not autoconfigure");
                return new XmlClientConfigBuilder().build();
        }
    }
        
    @Configuration
    @ConditionalOnMissingBean(HazelcastInstance.class)
    static class HazelcastClientConfiguration {

        @Bean
        public HazelcastInstance hazelcastInstance(ClientConfig clientConfig) {
            log.warn("Creating client 'HazelcastInstance' manually not autoconfigure");
            return HazelcastClient.newHazelcastClient(clientConfig);
        }
    }
}*/