public static void copyChars(char a1[], char a2[]) {
	for(int i = 0; i < a1.length; i++) { // 'a1' is a noise word(불용어)
		a2[i] = a1[i];
	}
}

// 불용어 중복
NameString	// bad
Name				// good

CustomerObject	// bad
Customer				// good

money // which one?
moneyAmount

customerInfo // which one?
customer

accountData // which one?
account

// 어느 함수를 호출해야 할까?
getActiveAccount();
getActiveAccounts();
getActiveAccountInfo();
