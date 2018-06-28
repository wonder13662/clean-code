// 많이 쓰이는 단항 형식 (51p)

// 함수에 인수 1개를 넘기는 이유.
// 1. 인수에 질문을 던지는 경우.
  boolean fileExist("MyFile")

// 2. 인수를 뭔가로 변환해 결과를 반환하는 경우.
  InputStream fileOpen("MyFile") // String 형의 파일 이름을 InputStream으로 변환.

// 3. 이벤트 함수. 프로그램은 함수 호출을 이벤트로 해석해 입력 인수로 시스템 상태를 바꾼다.
  passwordAttemptFailedNtimes(int attempts)

// (Bad) 위의 경우가 아니라면 단항 함수는 가급적 피한다.
  void includeSetupPageInto(StringBuffer pageText)

// (Bad) 변환 함수에서 출력 인수를 사용하면 혼란을 일으킨다.
  void transform(StringBuffer in) // bad
  StringBuffer transform(StringBuffer in) // good
