/*
 * This file is generated by jOOQ.
 */
package io.github.leryn.homepage.data;


import io.github.leryn.homepage.data.tables.Sitemap;
import io.github.leryn.homepage.data.tables.records.SitemapRecord;

import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in 
 * homepage.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<SitemapRecord> KEY_SITEMAP_PRIMARY = Internal.createUniqueKey(Sitemap.SITEMAP, DSL.name("KEY_sitemap_PRIMARY"), new TableField[] { Sitemap.SITEMAP.ID }, true);
}
