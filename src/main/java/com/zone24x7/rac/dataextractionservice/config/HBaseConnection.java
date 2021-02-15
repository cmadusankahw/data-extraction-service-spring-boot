package com.zone24x7.rac.dataextractionservice.config;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.IOException;

import static com.zone24x7.rac.dataextractionservice.utils.HbaseConstants.*;

/**
 * Hbase Connection class
 */
@Component
public class HBaseConnection {

    private static final Logger logger = LoggerFactory.getLogger(HBaseConnection.class);
    private Connection connection;

    /**
     * Method to configure the Hbase connection
     *
     * @throws IOException
     */
    public HBaseConnection() throws IOException {
        Configuration config = HBaseConfiguration.create();
        config.set("hbase.zookeeper.quorum", Hbase_ZookeeperQuorum);
        config.set("hbase.zookeeper.property.clientPort", Hbase_ZookeeperPropertyClientPort);
        config.set("zookeeper.znode.parent", Hbase_ZookeeperZnodeParent);

        this.connection = ConnectionFactory.createConnection(config);
        logger.info("Hbase Connection Created");
    }

    /**
     * Return the created Hbase Connection
     *
     * @return
     */
    @Bean("HbaseConnection")
    public Connection getConnection() {
        logger.info("Passing the HBase connection");
        return connection;
    }
}