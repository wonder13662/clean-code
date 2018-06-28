// 플래그 인수 (52p)
// 함수로 부울 값을 넘기는 관례는 정말로 끔찍하다.
// 함수가 한꺼번에 여러 가지를 처리한다고 공표하는 것이기 때문.
// true일 경우와 false일 경우의 처리가 모두 있기 때문.

// 목록 3-7에서
render(true); // bad

renderForSuite(); // good - 두개로 나눠야 함.
renderForSingleTest();
