// 한 단어에 한 개념을 사용하라

// bad
fetch   // 모두 같은 역할. 혼란스럽지 않은지?
retrieve
get

controller
manager
driver

// 아래 2개 객체는 근본적으로 어떻게 다른가?
// 어째서 둘 다 Controller가 아닌가?
// 어째서 둘 다 Manager가 아닌가?
// 정말 둘 다 Driver가 아닌가?
// 이름이 다르면 독자는 당연히 클래스도 다르고 타입도 다르리라 생각한다.
DeviceManager
ProtocolController
