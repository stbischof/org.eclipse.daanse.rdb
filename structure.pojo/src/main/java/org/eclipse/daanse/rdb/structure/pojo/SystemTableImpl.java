/*
 * Copyright (c) 2024 Contributors to the Eclipse Foundation.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   SmartCity Jena - initial
 *   Stefan Bischof (bipolis.org) - initial
 */
package org.eclipse.daanse.rdb.structure.pojo;

import org.eclipse.daanse.rdb.structure.api.model.SystemTable;

public class SystemTableImpl extends AbstractTable implements SystemTable {

    public SystemTableImpl(Builder builder) {
        setName(builder.getName());
        setColumns(builder.getColumns());
        setSchema(builder.getSchema());
        setDescription(builder.getDescription());
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder extends AbstractBuilder {

        private Builder() {
        }

        public SystemTableImpl build() {
            return new SystemTableImpl(this);
        }

    }
}
