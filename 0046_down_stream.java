// 위에서 아래로 코드 읽기: 내려가기 규칙

TO 설정 페이지와 해제 페이지를 포함하려면, 설정 페이지를 포함하고, 테스트 페이지 내용을 포함하고, 해제 페이지를 포함한다.
  TO 설정 페이지를 포함하려면, 슈트이면 슈트 설정 페이지를 포함한 후 일반 설정 페이지를 포함한다.
  TO 슈트 설정 페이지를 포함하려면, 부모 계층에서 "SuiteSetUp" 페이지를 찾아 include문과 페이지 경로를 추가한다.
  TO 부모 계층을 검색하려면,....
  // 핵심은 짧으면서도 '한 가지'만 하는 함수다.
  // 위에서 아래로 TO 문단을 읽어내려 가듯이 코드를 구현하면 추상화 수준을 일관되게 유지하기가 쉬워진다.

// 목록 3-7 (62p)
// 각 함수는 다음 함수를 소개한다.
// 또한 각 함수는 일정한 추상화 수준을 유지한다.
