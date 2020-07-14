package com.aurionpro.hazelcast;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;

@Configuration
public class HazelcastConfig {
	
	@Bean
	public HazelcastInstance hazalBean() {
	ClientConfig config = new ClientConfig();

	return HazelcastClient.newHazelcastClient(config);

	}


}
