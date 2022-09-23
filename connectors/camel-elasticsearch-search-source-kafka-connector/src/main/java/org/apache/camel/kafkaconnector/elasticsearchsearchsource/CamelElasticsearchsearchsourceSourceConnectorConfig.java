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
 */package org.apache.camel.kafkaconnector.elasticsearchsearchsource;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelElasticsearchsearchsourceSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_PERIOD_CONF = "camel.kamelet.elasticsearch-search-source.period";
    public static final String CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_PERIOD_DOC = "The time interval between two searches";
    public static final Integer CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_PERIOD_DEFAULT = 1000;
    public static final String CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_QUERY_CONF = "camel.kamelet.elasticsearch-search-source.query";
    public static final String CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_QUERY_DOC = "The query we want to use to search on ElasticSearch.";
    public static final String CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_QUERY_DEFAULT = null;
    public static final String CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_USER_CONF = "camel.kamelet.elasticsearch-search-source.user";
    public static final String CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_USER_DOC = "Username to connect to ElasticSearch.";
    public static final String CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_USER_DEFAULT = null;
    public static final String CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_PASSWORD_CONF = "camel.kamelet.elasticsearch-search-source.password";
    public static final String CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_PASSWORD_DOC = "Password to connect to ElasticSearch.";
    public static final String CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_ENABLE_SSLCONF = "camel.kamelet.elasticsearch-search-source.enableSSL";
    public static final String CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_ENABLE_SSLDOC = "Do we want to connect using SSL?";
    public static final Boolean CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_ENABLE_SSLDEFAULT = true;
    public static final String CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_HOST_ADDRESSES_CONF = "camel.kamelet.elasticsearch-search-source.hostAddresses";
    public static final String CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_HOST_ADDRESSES_DOC = "Comma separated list with ip:port formatted remote transport addresses to use.";
    public static final String CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_HOST_ADDRESSES_DEFAULT = null;
    public static final String CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_INDEX_NAME_CONF = "camel.kamelet.elasticsearch-search-source.indexName";
    public static final String CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_INDEX_NAME_DOC = "The name of the index to act against.";
    public static final String CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_INDEX_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_CLUSTER_NAME_CONF = "camel.kamelet.elasticsearch-search-source.clusterName";
    public static final String CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_CLUSTER_NAME_DOC = "The name of the cluster.";
    public static final String CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_CLUSTER_NAME_DEFAULT = null;

    public CamelElasticsearchsearchsourceSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelElasticsearchsearchsourceSourceConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_PERIOD_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_PERIOD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_PERIOD_DOC);
        conf.define(CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_QUERY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_QUERY_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_QUERY_DOC);
        conf.define(CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_USER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_USER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_USER_DOC);
        conf.define(CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_PASSWORD_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_PASSWORD_DOC);
        conf.define(CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_ENABLE_SSLCONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_ENABLE_SSLDEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_ENABLE_SSLDOC);
        conf.define(CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_HOST_ADDRESSES_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_HOST_ADDRESSES_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_HOST_ADDRESSES_DOC);
        conf.define(CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_INDEX_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_INDEX_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_INDEX_NAME_DOC);
        conf.define(CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_CLUSTER_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_CLUSTER_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_ELASTICSEARCHSEARCHSOURCE_KAMELET_CLUSTER_NAME_DOC);
        return conf;
    }
}