/*
 * Copyright © Magento, Inc. All rights reserved.
 * See COPYING.txt for license details.
 */

package com.magento.idea.magento2plugin.actions.generation.data;

import com.magento.idea.magento2plugin.magento.files.ModuleDbSchemaXml;
import java.util.LinkedHashMap;
import java.util.Map;

public class DbSchemaXmlData {
    private String tableName;
    private String tableResource;
    private String tableEngine;
    private String tableComment;

    /**
     * Constructor.
     *
     * @param tableName String
     * @param tableResource String
     * @param tableEngine String
     * @param tableComment String
     */
    public DbSchemaXmlData(
        final String tableName,
        final String tableResource,
        final String tableEngine,
        final String tableComment
    ) {
        this.tableName = tableName;
        this.tableResource = tableResource;
        this.tableEngine = tableEngine;
        this.tableComment = tableComment;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(final String tableName) {
        this.tableName = tableName;
    }

    public String getTableResource() {
        return tableResource;
    }

    public void setTableResource(final String tableResource) {
        this.tableResource = tableResource;
    }

    public String getTableEngine() {
        return tableEngine;
    }

    public void setTableEngine(final String tableEngine) {
        this.tableEngine = tableEngine;
    }

    public String getTableComment() {
        return tableComment;
    }

    public void setTableComment(final String tableComment) {
        this.tableComment = tableComment;
    }

    /**
     * Get table attributes values map.
     *
     * @return Map
     */
    public Map<String, String> getTableAttributesMap() {
        final Map<String, String> tableAttributesData = new LinkedHashMap<>();
        tableAttributesData.put(ModuleDbSchemaXml.XML_ATTR_TABLE_NAME, getTableName());
        tableAttributesData.put(ModuleDbSchemaXml.XML_ATTR_TABLE_RESOURCE, getTableResource());
        tableAttributesData.put(ModuleDbSchemaXml.XML_ATTR_TABLE_ENGINE, getTableEngine());
        tableAttributesData.put(ModuleDbSchemaXml.XML_ATTR_TABLE_COMMENT, getTableComment());

        return tableAttributesData;
    }
}
