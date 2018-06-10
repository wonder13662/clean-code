public List<int[]> getThem() {
	List<int[]> list1 = new ArrayList<int[]>();
	for(int[] x : theList)
		if(x[0] == 4)
			list1.add(x);

	return list1;
}

/*
	1. theList에 무엇이 들었는가?
	2. theList에서 0번째 값이 어째서 중요한가?
	3. 값 4는 무슨의미인가?
	4. 함수가 반환하는 리스트 list1 어떻게 사용하는가?
*/