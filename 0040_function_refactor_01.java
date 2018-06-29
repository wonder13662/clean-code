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

// 함수가 설정(setup) 페이지와 해제(teardown) 페이지를 테스트 페이지에 넣은 후 해당 테스트 페이지를 HTML로 랜더링한 다는 것을 알 수 있다.

// 질문
// 1. 목록 3-2 함수가 읽기 쉽고 이해하기 쉬운 이유는 무엇일까?
// 2. 의도를 분명히 표현하는 함수를 어떻게 구현할 수 있을까?
// 3. 함수에 어떤 속성을 부여해야 처음 읽는 사람이 프로그램 내부를 직관적으로 파악할 수 있을까?
