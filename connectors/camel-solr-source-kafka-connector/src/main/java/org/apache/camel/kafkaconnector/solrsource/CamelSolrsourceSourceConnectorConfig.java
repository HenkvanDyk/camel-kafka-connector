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
package org.apache.camel.kafkaconnector.solrsource;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelSolrsourceSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_SOLRSOURCE_KAMELET_PERIOD_CONF = "camel.kamelet.solr-source.period";
    public static final String CAMEL_SOURCE_SOLRSOURCE_KAMELET_PERIOD_DOC = "The interval between fetches to the Solr collection";
    public static final Integer CAMEL_SOURCE_SOLRSOURCE_KAMELET_PERIOD_DEFAULT = 10000;
    public static final String CAMEL_SOURCE_SOLRSOURCE_KAMELET_COLLECTION_CONF = "camel.kamelet.solr-source.collection";
    public static final String CAMEL_SOURCE_SOLRSOURCE_KAMELET_COLLECTION_DOC = "Solr Collection name";
    public static final String CAMEL_SOURCE_SOLRSOURCE_KAMELET_COLLECTION_DEFAULT = null;
    public static final String CAMEL_SOURCE_SOLRSOURCE_KAMELET_SERVERS_CONF = "camel.kamelet.solr-source.servers";
    public static final String CAMEL_SOURCE_SOLRSOURCE_KAMELET_SERVERS_DOC = "Comma separated list of Solr Servers and ports";
    public static final String CAMEL_SOURCE_SOLRSOURCE_KAMELET_SERVERS_DEFAULT = null;
    public static final String CAMEL_SOURCE_SOLRSOURCE_KAMELET_QUERY_CONF = "camel.kamelet.solr-source.query";
    public static final String CAMEL_SOURCE_SOLRSOURCE_KAMELET_QUERY_DOC = "The query to submit to Solr";
    public static final String CAMEL_SOURCE_SOLRSOURCE_KAMELET_QUERY_DEFAULT = null;
    public static final String CAMEL_SOURCE_SOLRSOURCE_KAMELET_USERNAME_CONF = "camel.kamelet.solr-source.username";
    public static final String CAMEL_SOURCE_SOLRSOURCE_KAMELET_USERNAME_DOC = "Username to connect to Solr.";
    public static final String CAMEL_SOURCE_SOLRSOURCE_KAMELET_USERNAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_SOLRSOURCE_KAMELET_PASSWORD_CONF = "camel.kamelet.solr-source.password";
    public static final String CAMEL_SOURCE_SOLRSOURCE_KAMELET_PASSWORD_DOC = "Password to connect to Solr.";
    public static final String CAMEL_SOURCE_SOLRSOURCE_KAMELET_PASSWORD_DEFAULT = null;

    public CamelSolrsourceSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelSolrsourceSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_SOLRSOURCE_KAMELET_PERIOD_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_SOLRSOURCE_KAMELET_PERIOD_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_SOLRSOURCE_KAMELET_PERIOD_DOC);
        conf.define(CAMEL_SOURCE_SOLRSOURCE_KAMELET_COLLECTION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SOLRSOURCE_KAMELET_COLLECTION_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_SOLRSOURCE_KAMELET_COLLECTION_DOC);
        conf.define(CAMEL_SOURCE_SOLRSOURCE_KAMELET_SERVERS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SOLRSOURCE_KAMELET_SERVERS_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_SOLRSOURCE_KAMELET_SERVERS_DOC);
        conf.define(CAMEL_SOURCE_SOLRSOURCE_KAMELET_QUERY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SOLRSOURCE_KAMELET_QUERY_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_SOLRSOURCE_KAMELET_QUERY_DOC);
        conf.define(CAMEL_SOURCE_SOLRSOURCE_KAMELET_USERNAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SOLRSOURCE_KAMELET_USERNAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SOLRSOURCE_KAMELET_USERNAME_DOC);
        conf.define(CAMEL_SOURCE_SOLRSOURCE_KAMELET_PASSWORD_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_SOLRSOURCE_KAMELET_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SOLRSOURCE_KAMELET_PASSWORD_DOC);
        return conf;
    }
}