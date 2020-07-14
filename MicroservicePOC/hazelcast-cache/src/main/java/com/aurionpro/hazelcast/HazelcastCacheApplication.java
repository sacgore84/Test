package com.aurionpro.hazelcast;

import java.util.Map.Entry;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

@EnableCaching
@SpringBootApplication
@EnableFeignClients
public class HazelcastCacheApplication implements CommandLineRunner{
	private static Logger log = LoggerFactory.getLogger(HazelcastCacheApplication.class);
	
	@Autowired
	HazelcastInstance  hazelcastInstance;

	public static void main(String[] args) {
		SpringApplication.run(HazelcastCacheApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
        log.info("Spring Boot Hazelcast Caching Example Configuration");
       // log.info("Using cache manager: " + cacheManager.getClass().getName());
        
        IMap<Object, Object> map = hazelcastInstance.getMap("servicerequest");
        Set<Entry<Object, Object>> entrySet = map.entrySet();
        for (Entry<Object, Object> entry : entrySet) {
			System.out.println("Testing:::>>>"+entry.getKey());
		}
        
      /*  ClientConfig config = new ClientConfig();
        config.getGroupConfig().setPassword("imdg"); //that's the pw in your xml config.
       // com.hazelcast.client.HazelcastClient.newHazelcastClient(config);
        HazelcastInstance client =   com.hazelcast.client.HazelcastClient.newHazelcastClient(config);
        IMap<Object, Object> customerMap = client.getMap("servicerequest");
        Set<Entry<Object, Object>> entrySet = customerMap.entrySet();
        for (Entry<Object, Object> entry : entrySet) {
			System.out.println("Testing:::>>>"+entry.getKey());
		}*/
    }
	
	
	

}
