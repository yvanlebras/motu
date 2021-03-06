package fr.cls.atoll.motu.web.dal.request.status.jedis;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;

public class MotuJedisClient {

    private JedisCluster jedisCluster;
    private Jedis jedisClient;
    private boolean isCluster;

    public MotuJedisClient(boolean isCluster, String hostname, int port) {
        this.isCluster = isCluster;
        if (isCluster) {
            HostAndPort masterEndPoint = new HostAndPort(hostname, port);
            jedisCluster = new JedisCluster(masterEndPoint);
        } else {
            jedisClient = new Jedis(hostname, port);
        }
    }

    public String set(String key, String value) {
        String result;
        if (isCluster) {
            result = jedisCluster.set(key, value);
        } else {
            result = jedisClient.set(key, value);
        }
        return result;
    }

    public boolean exists(String requestId) {
        boolean result;
        if (isCluster) {
            result = jedisCluster.exists(requestId);
        } else {
            result = jedisClient.exists(requestId);
        }

        return result;
    }

    public Map<String, String> hgetAll(String requestId) {
        Map<String, String> result;
        if (isCluster) {
            result = jedisCluster.hgetAll(requestId);
        } else {
            result = jedisClient.hgetAll(requestId);
        }

        return result;
    }

    public String hmset(String requestId, Map<String, String> data) {
        String result;
        if (isCluster) {
            result = jedisCluster.hmset(requestId, data);
        } else {
            result = jedisClient.hmset(requestId, data);
        }

        return result;
    }

    public Set<String> keys(String pattern) {
        Set<String> result;
        if (isCluster) {
            result = clusterKeys(pattern);
        } else {
            result = jedisClient.keys(pattern);
        }

        return result;
    }

    private Set<String> clusterKeys(String pattern) {
        TreeSet<String> keys = new TreeSet<>();
        Map<String, JedisPool> clusterNodes = jedisCluster.getClusterNodes();
        for (String k : clusterNodes.keySet()) {
            JedisPool jp = clusterNodes.get(k);
            Jedis connection = jp.getResource();
            try {
                keys.addAll(connection.keys(pattern));
            } finally {
                connection.close();
            }
        }
        return keys;
    }

    public Long del(String requestId) {
        Long result;
        if (isCluster) {
            result = jedisCluster.del(requestId);
        } else {
            result = jedisClient.del(requestId);
        }

        return result;
    }

    public long getRedisIdent(String requestIdIdentManager) {
        long result;
        if (isCluster) {
            result = jedisCluster.incr(requestIdIdentManager);
        } else {
            result = jedisClient.incr(requestIdIdentManager);
        }
        return result;
    }
}
