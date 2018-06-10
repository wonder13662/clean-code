/* Variables */
/* 경과시간 / 날짜 / 측정하려는 값 */
int elapsedTimeInDays
int daysSinceCreation
int daysSinceModification
int fileAgeInDays

/* Class names */
/* 클래스 이름과 객체 이름은 명사나 명사구가 적합하다. (32p) */

Customer		// Good
WikiPage		// Good
Account			// Good
AddressParser	// Good

Manager 		// Bad
Processor		// Bad
Data 			// Bad
Info 			// Bad

/* method names */
/* 동사나 동사구가 적합 */

postPayment		// Good
deletePage		// Good
save			// Good

/* javabean 표준 */
get 	// Accessor 	접근자
set 	// Mutator 		변경자
is 		// Predicate 	조건자

/* 기발한 이름은 피하라 (32p) */
HolyHandGrenade // Bad
DeleteItems 	// Good

whack()			// Bad
kill()			// Good

eatMyShort()	// Bad
abort()			// Good

/* 한 개념에 한 단어를 사용하라 */
fetch
retrieve
get

controller
manager 
driver 

