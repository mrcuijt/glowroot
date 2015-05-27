/*
 * Copyright 2015 the original author or authors.
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
package org.glowroot.plugin.cassandra;

import org.glowroot.api.Message;
import org.glowroot.api.MessageSupplier;

class QueryMessageSupplier extends MessageSupplier {

    private final String query;

    QueryMessageSupplier(String query) {
        this.query = query;
    }

    @Override
    public Message get() {
        StringBuilder sb = new StringBuilder();
        sb.append("cql execution: ");
        sb.append(query);
        return Message.from(sb.toString());
    }
}
