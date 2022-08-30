package io.github.leryn.homepage.service;

import java.util.List;
import javax.annotation.Resource;

import io.github.leryn.homepage.data.Tables;
import io.github.leryn.homepage.vo.SitemapVO;
import org.jooq.DSLContext;
import org.springframework.stereotype.Service;

/**
 * @author Leryn
 * @since Leryn 1.0.0
 */
@Service
public class SitemapService {

  @Resource
  private DSLContext dsl;

  public List<SitemapVO> getSitemapList() {
    List<SitemapVO> sitemapVOs = dsl.select(Tables.SITEMAP.fields())
      .from(Tables.SITEMAP)
      .where(Tables.SITEMAP.DELETED.eq(true))
      .fetchInto(SitemapVO.class);
    return sitemapVOs;
  }

}
