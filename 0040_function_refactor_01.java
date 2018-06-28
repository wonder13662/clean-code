// 목록 3-2 HtmlUtil.java (리팩터링한 버전) 42p
// https://github.com/unclebob/fitnesse
public static String renderPageWithSetupAndTeardowns (
	PageData pageData, boolean isSuite
) throws Exception {
	boolean isTestPage = pageData.hasAttribute("Test");
	if(isTestPage) {
		WikiPage testPage = pageData.getWikiPage();
		StringBuffer newPageContent = new StringBuffer();
		includeSetupPages(testPage, newPageContent, isSuite);
		newPageContent.append(pageData.getContent());
		includeTeardownPages(testPage, newPageContent, isSuite);
		pageData.setContent(newPageContent.toString());
	}
	return pageData.getHtml();
}
