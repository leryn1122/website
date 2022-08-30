package io.github.leryn.homepage.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Leryn
 * @since Leryn 1.0.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SitemapVO {
  private String title;
  private String desc;
  private String url;
  private String logo;
}
