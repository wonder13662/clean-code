// 이항 함수 (52p)

// 인수가 2개인 함수는 인수가 1개인 함수보다 이해하기 어렵다.
writeField(name); // good
writeField(outputStream, name); // bad

// 이항 함수가 적절한 경우
Point p = new Point(0, 0);
Point p = new Point(0); // worst! 이건 도대체 뭐지?

assertEquals(expected, actual); // expected에 actual을 집어넣는 실수가 자주 일어난다.

// 가능하다면 단항 함수로 바꿔라.
writeField(outputStream, name); // bad
outputStream.writeField(name); // better
