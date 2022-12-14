/*
 * This file is generated by jOOQ.
 */
package io.github.leryn.homepage.data;


import io.github.leryn.homepage.data.tables.Sitemap;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Homepage extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>homepage</code>
     */
    public static final Homepage HOMEPAGE = new Homepage();

    /**
     * 地址导航
     */
    public final Sitemap SITEMAP = Sitemap.SITEMAP;

    /**
     * No further instances allowed
     */
    private Homepage() {
        super("homepage", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Sitemap.SITEMAP);
    }
}
