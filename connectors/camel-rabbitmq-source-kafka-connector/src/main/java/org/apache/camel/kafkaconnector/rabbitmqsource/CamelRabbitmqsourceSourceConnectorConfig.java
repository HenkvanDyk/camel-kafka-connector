/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */package org.apache.camel.kafkaconnector.rabbitmqsource;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelRabbitmqsourceSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_ADDRESSES_CONF = "camel.kamelet.rabbitmq-source.addresses";
    public static final String CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_ADDRESSES_DOC = "Comma separated list of RabbitMQ broker addresses Example: localhost:5672";
    public static final String CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_ADDRESSES_DEFAULT = null;
    public static final String CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_ROUTING_KEY_CONF = "camel.kamelet.rabbitmq-source.routingKey";
    public static final String CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_ROUTING_KEY_DOC = "The routing key to use when binding a consumer queue to the exchange";
    public static final String CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_ROUTING_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_USERNAME_CONF = "camel.kamelet.rabbitmq-source.username";
    public static final String CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_USERNAME_DOC = "The username to access the RabbitMQ server";
    public static final String CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_USERNAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_PASSWORD_CONF = "camel.kamelet.rabbitmq-source.password";
    public static final String CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_PASSWORD_DOC = "The password to access the RabbitMQ server";
    public static final String CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_EXCHANGE_NAME_CONF = "camel.kamelet.rabbitmq-source.exchangeName";
    public static final String CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_EXCHANGE_NAME_DOC = "The exchange name determines the exchange the queue will be bound to";
    public static final String CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_EXCHANGE_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_QUEUE_CONF = "camel.kamelet.rabbitmq-source.queue";
    public static final String CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_QUEUE_DOC = "The queue to receive messages from";
    public static final String CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_QUEUE_DEFAULT = null;
    public static final String CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_VHOST_CONF = "camel.kamelet.rabbitmq-source.vhost";
    public static final String CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_VHOST_DOC = "The vhost for the channel";
    public static final String CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_VHOST_DEFAULT = "/";

    public CamelRabbitmqsourceSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelRabbitmqsourceSourceConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_ADDRESSES_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_ADDRESSES_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_ADDRESSES_DOC);
        conf.define(CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_ROUTING_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_ROUTING_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_ROUTING_KEY_DOC);
        conf.define(CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_USERNAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_USERNAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_USERNAME_DOC);
        conf.define(CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_PASSWORD_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_PASSWORD_DOC);
        conf.define(CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_EXCHANGE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_EXCHANGE_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_EXCHANGE_NAME_DOC);
        conf.define(CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_QUEUE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_QUEUE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_QUEUE_DOC);
        conf.define(CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_VHOST_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_VHOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_RABBITMQSOURCE_KAMELET_VHOST_DOC);
        return conf;
    }
}