// 목록 2-1 맥락이 불분명한 변수 35p
// 아래 코드는 독자가 맥락을 유추해야 한다. 끝까지 읽어봐야만 각 변수의 역할을 알게 된다.
private void printGuessStatistics(char candidate, int count) {
	String number;
	String verb;
	String pluralModifier;
	if(count == 0) {
		number = "no";
		verb = "are";
		pluralModifier = "s";
	} else if(count == 1) {
		number = "1";
		verb = "is";
		pluralModifier = "";
	} else {
		number = Integer.toString(count);
		verb = "are";
		pluralModifier = "s";
	}
	String guessMessage = String.format("There %s %s %s%s", verb, number, candidate, pluralModifier);
	print(guessMessage);
	// number, verb, pluralModifier라는 변수 세 개가 '통계 추측 guess statistics' 메시지에 사용되는 것을 알게됨.
}
