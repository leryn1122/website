package io.github.leryn.homepage.controller;

import javax.annotation.Resource;

import io.github.leryn.homepage.model.Result;
import io.github.leryn.homepage.service.SitemapService;
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
  public Result getSitemapList() {
    return Result.onSuccess(sitemapService.getSitemapList());
  }

}
