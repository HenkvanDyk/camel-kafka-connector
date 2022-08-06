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
 */
package org.apache.camel.kafkaconnector.elasticsearchindexsink;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelElasticsearchindexsinkSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_ELASTICSEARCHINDEXSINK_KAMELET_USER_CONF = "camel.kamelet.elasticsearch-index-sink.user";
    public static final String CAMEL_SINK_ELASTICSEARCHINDEXSINK_KAMELET_USER_DOC = "Username to connect to ElasticSearch.";
    public static final String CAMEL_SINK_ELASTICSEARCHINDEXSINK_KAMELET_USER_DEFAULT = null;
    public static final String CAMEL_SINK_ELASTICSEARCHINDEXSINK_KAMELET_PASSWORD_CONF = "camel.kamelet.elasticsearch-index-sink.password";
    public static final String CAMEL_SINK_ELASTICSEARCHINDEXSINK_KAMELET_PASSWORD_DOC = "Password to connect to ElasticSearch.";
    public static final String CAMEL_SINK_ELASTICSEARCHINDEXSINK_KAMELET_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_ELASTICSEARCHINDEXSINK_KAMELET_ENABLE_SSLCONF = "camel.kamelet.elasticsearch-index-sink.enableSSL";
    public static final String CAMEL_SINK_ELASTICSEARCHINDEXSINK_KAMELET_ENABLE_SSLDOC = "Do we want to connect using SSL?";
    public static final Boolean CAMEL_SINK_ELASTICSEARCHINDEXSINK_KAMELET_ENABLE_SSLDEFAULT = true;
    public static final String CAMEL_SINK_ELASTICSEARCHINDEXSINK_KAMELET_HOST_ADDRESSES_CONF = "camel.kamelet.elasticsearch-index-sink.hostAddresses";
    public static final String CAMEL_SINK_ELASTICSEARCHINDEXSINK_KAMELET_HOST_ADDRESSES_DOC = "Comma separated list with ip:port formatted remote transport addresses to use. Example: quickstart-es-http:9200";
    public static final String CAMEL_SINK_ELASTICSEARCHINDEXSINK_KAMELET_HOST_ADDRESSES_DEFAULT = null;
    public static final String CAMEL_SINK_ELASTICSEARCHINDEXSINK_KAMELET_CLUSTER_NAME_CONF = "camel.kamelet.elasticsearch-index-sink.clusterName";
    public static final String CAMEL_SINK_ELASTICSEARCHINDEXSINK_KAMELET_CLUSTER_NAME_DOC = "Name of the cluster. Example: quickstart";
    public static final String CAMEL_SINK_ELASTICSEARCHINDEXSINK_KAMELET_CLUSTER_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_ELASTICSEARCHINDEXSINK_KAMELET_INDEX_NAME_CONF = "camel.kamelet.elasticsearch-index-sink.indexName";
    public static final String CAMEL_SINK_ELASTICSEARCHINDEXSINK_KAMELET_INDEX_NAME_DOC = "The name of the index to act against. Example: data";
    public static final String CAMEL_SINK_ELASTICSEARCHINDEXSINK_KAMELET_INDEX_NAME_DEFAULT = null;

    public CamelElasticsearchindexsinkSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelElasticsearchindexsinkSinkConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_ELASTICSEARCHINDEXSINK_KAMELET_USER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ELASTICSEARCHINDEXSINK_KAMELET_USER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ELASTICSEARCHINDEXSINK_KAMELET_USER_DOC);
        conf.define(CAMEL_SINK_ELASTICSEARCHINDEXSINK_KAMELET_PASSWORD_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_ELASTICSEARCHINDEXSINK_KAMELET_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ELASTICSEARCHINDEXSINK_KAMELET_PASSWORD_DOC);
        conf.define(CAMEL_SINK_ELASTICSEARCHINDEXSINK_KAMELET_ENABLE_SSLCONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ELASTICSEARCHINDEXSINK_KAMELET_ENABLE_SSLDEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ELASTICSEARCHINDEXSINK_KAMELET_ENABLE_SSLDOC);
        conf.define(CAMEL_SINK_ELASTICSEARCHINDEXSINK_KAMELET_HOST_ADDRESSES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ELASTICSEARCHINDEXSINK_KAMELET_HOST_ADDRESSES_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_ELASTICSEARCHINDEXSINK_KAMELET_HOST_ADDRESSES_DOC);
        conf.define(CAMEL_SINK_ELASTICSEARCHINDEXSINK_KAMELET_CLUSTER_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ELASTICSEARCHINDEXSINK_KAMELET_CLUSTER_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_ELASTICSEARCHINDEXSINK_KAMELET_CLUSTER_NAME_DOC);
        conf.define(CAMEL_SINK_ELASTICSEARCHINDEXSINK_KAMELET_INDEX_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ELASTICSEARCHINDEXSINK_KAMELET_INDEX_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ELASTICSEARCHINDEXSINK_KAMELET_INDEX_NAME_DOC);
        return conf;
    }
}