// 목록 3-7 SetupTeardownIncluder.java
// 각 함수는 다음 함수를 소개한다
// 함수 인수의 잘못된 예제. StringBuffer가 인스턴스 변수로 가지고 있지 않고 모두 파라미터로 받는다면?
package fitnesse.html;

import fitnesse.responders.run.SuiteResponder;
import fitnesse.wiki.*;

public class SetupTeardownIncluder {
  private PageData pageData;
  private boolean isSuite;
  private WikiPage testPage;
  // private StringBuffer newPageContent;
  private PageCrawler pageCrawler;

  public static String render(PageData pageData) throws Exception {
    return render(pageData, false);
  }

  public static String render(PageData pageData, boolean isSuite) throws Exception {
    return new SetupTeardownIncluder(pageData);
  }

  private SetupTeardownIncluder(PageData pageData) {
    this.pageData = pageData;
    testPage = pageData.getWikiPage();
    pageCrawler = testPage.getPageCrawler();
    // newPageContent = new StringBuffer();
  }

  private String render(boolean isSuite) throws Exception {
    this.isSuite = isSuite;
    if (isTestPage())
      includeSetupAndTeardownPages();
    return pageData.getHtml();
  }

  private boolean isTestPage() throws Exception {
    return pageData.hasAttribute("Test");
  }

  private void includeSetupAndTeardownPages() throws Exception {
    includeSetupPages();
    includePageContent();
    includeTeardownPages();
    updatePageContent();
  }

  private void includeSetupPages() throws Exception {
    if(isSuite)
      includeSuiteSetupPage();
    includeSetupPage();
  }

  private void includeSuiteSetupPage() throws Exception {
    include(SuiteResponder.SUITE_SETUP_NAME, "-setup");
  }

  private void includeSetupPage() throws Exception {
    include("Setup", "-setup");
  }

  // private void includePageContent() throws Exception {
  //   newPageContent.append(pageData.getContent());
  // }

  private void includePageContent(StringBuffer newPageContent) throws Exception {
    newPageContent.append(pageData.getContent());
  }

  private void includeTeardownpages() throws Exception {
    includeTeardownPage();
    if(isSuite)
      includeSuiteTeardownPage();
  }

  private void includeTeardownPage() throws Exception {
    include("TearDown", "-teardown");
  }

  private void includeSuiteTeardownPage() throws Exception {
    include(SuiteResponder.SUITE_TEARDOWN_NAME, "-teardown");
  }

  // private void updatePageContent() throws Exception {
  //   pageData.setContent(newPageContent.toString());
  // }

  private void updatePageContent(StringBuffer newPageContent) throws Exception {
    pageData.setContent(newPageContent.toString());
  }

  private void include(String pageName, String arg) throws Exception {
    WikiPage inheritedPage = findInheritedPage(pageName);
    if(inheritedPage != null) {
      String pagePathName = getPathNameForPage(inheritedPage);
      buildIncludeDirective(pagePathName, arg);
    }
  }

  private WikiPage findInheritedPage(String pageName) throws Exception {
    return PageCrawlerImpl.getInheritedPage(pageName, testPage);
  }

  private String getPathNameForPage(WikiPage page) throws Exception {
    WikiPagePath pagePath = pageCrawler.getFullPath(page);
    return PathParser.render(pagePath);
  }

  // private void buildIncludeDirective(StringBuffer newPageContent, String pagePathName, String arg) {
  //   newPageContent
  //   .append("\n!include")
  //   .append(arg)
  //   .append(" .")
  //   .append(pagePathName)
  //   .append("\n")
  //   ;
  // }

  private void buildIncludeDirective(StringBuffer newPageContent, String pagePathName, String arg) {
    newPageContent
    .append("\n!include")
    .append(arg)
    .append(" .")
    .append(pagePathName)
    .append("\n")
    ;
  }
}
