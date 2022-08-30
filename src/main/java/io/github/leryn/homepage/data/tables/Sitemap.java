/*
 * This file is generated by jOOQ.
 */
package io.github.leryn.homepage.data.tables;


import io.github.leryn.homepage.data.Homepage;
import io.github.leryn.homepage.data.Keys;
import io.github.leryn.homepage.data.tables.records.SitemapRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * 地址导航
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sitemap extends TableImpl<SitemapRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>homepage.sitemap</code>
     */
    public static final Sitemap SITEMAP = new Sitemap();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SitemapRecord> getRecordType() {
        return SitemapRecord.class;
    }

    /**
     * The column <code>homepage.sitemap.id</code>. 主键
     */
    public final TableField<SitemapRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>homepage.sitemap.name</code>. 名称(缩写)
     */
    public final TableField<SitemapRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(20).nullable(false), this, "名称(缩写)");

    /**
     * The column <code>homepage.sitemap.title</code>. 标题
     */
    public final TableField<SitemapRecord, String> TITLE = createField(DSL.name("title"), SQLDataType.VARCHAR(50).nullable(false), this, "标题");

    /**
     * The column <code>homepage.sitemap.description</code>. 描述
     */
    public final TableField<SitemapRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.VARCHAR(100), this, "描述");

    /**
     * The column <code>homepage.sitemap.url</code>. 地址URL
     */
    public final TableField<SitemapRecord, String> URL = createField(DSL.name("url"), SQLDataType.VARCHAR(255).nullable(false), this, "地址URL");

    /**
     * The column <code>homepage.sitemap.logo</code>. 图标URL
     */
    public final TableField<SitemapRecord, String> LOGO = createField(DSL.name("logo"), SQLDataType.VARCHAR(255), this, "图标URL");

    /**
     * The column <code>homepage.sitemap.deleted</code>. 是否删除:1-未删除,0-删除
     */
    public final TableField<SitemapRecord, Boolean> DELETED = createField(DSL.name("deleted"), SQLDataType.BOOLEAN.nullable(false).defaultValue(DSL.inline("1", SQLDataType.BOOLEAN)), this, "是否删除:1-未删除,0-删除");

    /**
     * The column <code>homepage.sitemap.create_time</code>. 创建时间
     */
    public final TableField<SitemapRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "创建时间");

    /**
     * The column <code>homepage.sitemap.modified_time</code>. 修改时间
     */
    public final TableField<SitemapRecord, LocalDateTime> MODIFIED_TIME = createField(DSL.name("modified_time"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "修改时间");

    private Sitemap(Name alias, Table<SitemapRecord> aliased) {
        this(alias, aliased, null);
    }

    private Sitemap(Name alias, Table<SitemapRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("地址导航"), TableOptions.table());
    }

    /**
     * Create an aliased <code>homepage.sitemap</code> table reference
     */
    public Sitemap(String alias) {
        this(DSL.name(alias), SITEMAP);
    }

    /**
     * Create an aliased <code>homepage.sitemap</code> table reference
     */
    public Sitemap(Name alias) {
        this(alias, SITEMAP);
    }

    /**
     * Create a <code>homepage.sitemap</code> table reference
     */
    public Sitemap() {
        this(DSL.name("sitemap"), null);
    }

    public <O extends Record> Sitemap(Table<O> child, ForeignKey<O, SitemapRecord> key) {
        super(child, key, SITEMAP);
    }

    @Override
    public Schema getSchema() {
        return Homepage.HOMEPAGE;
    }

    @Override
    public Identity<SitemapRecord, Integer> getIdentity() {
        return (Identity<SitemapRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<SitemapRecord> getPrimaryKey() {
        return Keys.KEY_SITEMAP_PRIMARY;
    }

    @Override
    public List<UniqueKey<SitemapRecord>> getKeys() {
        return Arrays.<UniqueKey<SitemapRecord>>asList(Keys.KEY_SITEMAP_PRIMARY);
    }

    @Override
    public Sitemap as(String alias) {
        return new Sitemap(DSL.name(alias), this);
    }

    @Override
    public Sitemap as(Name alias) {
        return new Sitemap(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Sitemap rename(String name) {
        return new Sitemap(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Sitemap rename(Name name) {
        return new Sitemap(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, String, String, String, String, String, Boolean, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}