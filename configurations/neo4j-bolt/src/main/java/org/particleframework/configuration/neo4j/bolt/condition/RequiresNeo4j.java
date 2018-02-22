/*
 * Copyright 2018 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.particleframework.configuration.neo4j.bolt.condition;

import org.neo4j.driver.v1.Config;
import org.particleframework.configuration.neo4j.bolt.Neo4jBoltSettings;
import org.particleframework.context.annotation.Requires;

import java.lang.annotation.*;

/**
 * @author graemerocher
 * @since 1.0
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PACKAGE, ElementType.TYPE})
@Requires(property = Neo4jBoltSettings.PREFIX)
@Requires(classes= Config.class)
public @interface RequiresNeo4j {
}
