// 작게 만들어라!
// 목록 3-2 HtmlUtil.java와 비교.
// 목록 3-3 HtmlUtil.java (re-refactored) 42p
public static String renderPageWithSetupAndTeardowns(
	PageData pageData, boolean isSuite
) throws Exception {
	if(isTestPage(pageData))
		includeSetupAndTeardownPages(pageData, isSuite);
	return pageData.getHtml();
}

// 중첩구조가 생길만큼 함수가 커져서는 안된다는 뜻이다. 그러므로 함수에서 들여쓰기 수준은 1단이나 2단을 넘어서면 안된다. 당연한 말이지만, 그래야 함수는 읽고 이해하기 쉬워진다.
