package io.github.leryn.homepage.controller;

import java.util.List;
import javax.annotation.Resource;

import io.github.leryn.homepage.model.Result;
import io.github.leryn.homepage.service.SitemapService;
import io.github.leryn.homepage.vo.SitemapVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Leryn
 * @since Leryn 1.0.0
 */
@RestController
@RequestMapping("/v1")
public class SitemapController {

  @Resource
  private SitemapService sitemapService;

  @GetMapping("/sitemap")
  public Result<List<SitemapVO>> getSitemapList() {
    return Result.onSuccess(sitemapService.getSitemapList());
  }

}
