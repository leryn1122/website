/*
 * This file is generated by jOOQ.
 */
package io.github.leryn.homepage.data.tables.daos;


import io.github.leryn.homepage.data.tables.Sitemap;
import io.github.leryn.homepage.data.tables.records.SitemapRecord;

import java.time.LocalDateTime;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * 地址导航
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class SitemapDao extends DAOImpl<SitemapRecord, io.github.leryn.homepage.data.tables.pojos.Sitemap, Integer> {

    /**
     * Create a new SitemapDao without any configuration
     */
    public SitemapDao() {
        super(Sitemap.SITEMAP, io.github.leryn.homepage.data.tables.pojos.Sitemap.class);
    }

    /**
     * Create a new SitemapDao with an attached configuration
     */
    @Autowired
    public SitemapDao(Configuration configuration) {
        super(Sitemap.SITEMAP, io.github.leryn.homepage.data.tables.pojos.Sitemap.class, configuration);
    }

    @Override
    public Integer getId(io.github.leryn.homepage.data.tables.pojos.Sitemap object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<io.github.leryn.homepage.data.tables.pojos.Sitemap> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Sitemap.SITEMAP.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<io.github.leryn.homepage.data.tables.pojos.Sitemap> fetchById(Integer... values) {
        return fetch(Sitemap.SITEMAP.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public io.github.leryn.homepage.data.tables.pojos.Sitemap fetchOneById(Integer value) {
        return fetchOne(Sitemap.SITEMAP.ID, value);
    }

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<io.github.leryn.homepage.data.tables.pojos.Sitemap> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Sitemap.SITEMAP.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<io.github.leryn.homepage.data.tables.pojos.Sitemap> fetchByName(String... values) {
        return fetch(Sitemap.SITEMAP.NAME, values);
    }

    /**
     * Fetch records that have <code>title BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<io.github.leryn.homepage.data.tables.pojos.Sitemap> fetchRangeOfTitle(String lowerInclusive, String upperInclusive) {
        return fetchRange(Sitemap.SITEMAP.TITLE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>title IN (values)</code>
     */
    public List<io.github.leryn.homepage.data.tables.pojos.Sitemap> fetchByTitle(String... values) {
        return fetch(Sitemap.SITEMAP.TITLE, values);
    }

    /**
     * Fetch records that have <code>description BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<io.github.leryn.homepage.data.tables.pojos.Sitemap> fetchRangeOfDescription(String lowerInclusive, String upperInclusive) {
        return fetchRange(Sitemap.SITEMAP.DESCRIPTION, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<io.github.leryn.homepage.data.tables.pojos.Sitemap> fetchByDescription(String... values) {
        return fetch(Sitemap.SITEMAP.DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>url BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<io.github.leryn.homepage.data.tables.pojos.Sitemap> fetchRangeOfUrl(String lowerInclusive, String upperInclusive) {
        return fetchRange(Sitemap.SITEMAP.URL, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>url IN (values)</code>
     */
    public List<io.github.leryn.homepage.data.tables.pojos.Sitemap> fetchByUrl(String... values) {
        return fetch(Sitemap.SITEMAP.URL, values);
    }

    /**
     * Fetch records that have <code>logo BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<io.github.leryn.homepage.data.tables.pojos.Sitemap> fetchRangeOfLogo(String lowerInclusive, String upperInclusive) {
        return fetchRange(Sitemap.SITEMAP.LOGO, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>logo IN (values)</code>
     */
    public List<io.github.leryn.homepage.data.tables.pojos.Sitemap> fetchByLogo(String... values) {
        return fetch(Sitemap.SITEMAP.LOGO, values);
    }

    /**
     * Fetch records that have <code>deleted BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<io.github.leryn.homepage.data.tables.pojos.Sitemap> fetchRangeOfDeleted(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(Sitemap.SITEMAP.DELETED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>deleted IN (values)</code>
     */
    public List<io.github.leryn.homepage.data.tables.pojos.Sitemap> fetchByDeleted(Boolean... values) {
        return fetch(Sitemap.SITEMAP.DELETED, values);
    }

    /**
     * Fetch records that have <code>create_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<io.github.leryn.homepage.data.tables.pojos.Sitemap> fetchRangeOfCreateTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Sitemap.SITEMAP.CREATE_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<io.github.leryn.homepage.data.tables.pojos.Sitemap> fetchByCreateTime(LocalDateTime... values) {
        return fetch(Sitemap.SITEMAP.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>modified_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<io.github.leryn.homepage.data.tables.pojos.Sitemap> fetchRangeOfModifiedTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Sitemap.SITEMAP.MODIFIED_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>modified_time IN (values)</code>
     */
    public List<io.github.leryn.homepage.data.tables.pojos.Sitemap> fetchByModifiedTime(LocalDateTime... values) {
        return fetch(Sitemap.SITEMAP.MODIFIED_TIME, values);
    }
}
