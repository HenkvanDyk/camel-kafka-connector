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
 */package org.apache.camel.kafkaconnector.miniosink;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelMiniosinkSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_MINIOSINK_KAMELET_BUCKET_NAME_CONF = "camel.kamelet.minio-sink.bucketName";
    public static final String CAMEL_SINK_MINIOSINK_KAMELET_BUCKET_NAME_DOC = "The Minio Bucket name.";
    public static final String CAMEL_SINK_MINIOSINK_KAMELET_BUCKET_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_MINIOSINK_KAMELET_ACCESS_KEY_CONF = "camel.kamelet.minio-sink.accessKey";
    public static final String CAMEL_SINK_MINIOSINK_KAMELET_ACCESS_KEY_DOC = "The access key obtained from MinIO.";
    public static final String CAMEL_SINK_MINIOSINK_KAMELET_ACCESS_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_MINIOSINK_KAMELET_SECRET_KEY_CONF = "camel.kamelet.minio-sink.secretKey";
    public static final String CAMEL_SINK_MINIOSINK_KAMELET_SECRET_KEY_DOC = "The secret key obtained from MinIO.";
    public static final String CAMEL_SINK_MINIOSINK_KAMELET_SECRET_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_MINIOSINK_KAMELET_ENDPOINT_CONF = "camel.kamelet.minio-sink.endpoint";
    public static final String CAMEL_SINK_MINIOSINK_KAMELET_ENDPOINT_DOC = "The MinIO Endpoint. You can specify an URL, domain name, IPv4 address, or IPv6 address. Example: http://localhost:9000";
    public static final String CAMEL_SINK_MINIOSINK_KAMELET_ENDPOINT_DEFAULT = null;
    public static final String CAMEL_SINK_MINIOSINK_KAMELET_AUTO_CREATE_BUCKET_CONF = "camel.kamelet.minio-sink.autoCreateBucket";
    public static final String CAMEL_SINK_MINIOSINK_KAMELET_AUTO_CREATE_BUCKET_DOC = "Specify to automatically create the MinIO bucket.";
    public static final Boolean CAMEL_SINK_MINIOSINK_KAMELET_AUTO_CREATE_BUCKET_DEFAULT = false;

    public CamelMiniosinkSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelMiniosinkSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_MINIOSINK_KAMELET_BUCKET_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MINIOSINK_KAMELET_BUCKET_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_MINIOSINK_KAMELET_BUCKET_NAME_DOC);
        conf.define(CAMEL_SINK_MINIOSINK_KAMELET_ACCESS_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_MINIOSINK_KAMELET_ACCESS_KEY_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_MINIOSINK_KAMELET_ACCESS_KEY_DOC);
        conf.define(CAMEL_SINK_MINIOSINK_KAMELET_SECRET_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_MINIOSINK_KAMELET_SECRET_KEY_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_MINIOSINK_KAMELET_SECRET_KEY_DOC);
        conf.define(CAMEL_SINK_MINIOSINK_KAMELET_ENDPOINT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MINIOSINK_KAMELET_ENDPOINT_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_MINIOSINK_KAMELET_ENDPOINT_DOC);
        conf.define(CAMEL_SINK_MINIOSINK_KAMELET_AUTO_CREATE_BUCKET_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_MINIOSINK_KAMELET_AUTO_CREATE_BUCKET_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MINIOSINK_KAMELET_AUTO_CREATE_BUCKET_DOC);
        return conf;
    }
}