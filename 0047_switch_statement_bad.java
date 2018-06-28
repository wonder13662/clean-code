// switch 문은 작게 만들기 어렵다.
// '한 가지' 작업만 하는 switch 문도 만들기 어렵다.
// 본질적으로 switch 문은 N가지를 처리한다.

// 목록 3-4 Payroll.java
// 1. 함수가 길다
// 2. '한 가지' 작업만 수행하지 않는다.
// 3. SRP(Single Responsibility Principle)을 위반한다. 코드를 변경할 이유가 여럿이기 때문이다.
// 4. OCP(Open Closed Principle)를 위반한다. 새 직원 유형을 추가할 때마다 코드를 변경하기 때문이다.
public Money calculatePay(Employee e) throws InvalidEmployeeType {
  switch(e.type) {
    case COMMISSIONED:
      return calculateCommisionedPay(e);
    case HOURLY:
      return calculateHourlyPay(e);
    case SALARIED:
      return calculateSalariedPay(e);
    default:
      throw new InvalidEmployeeType(e.type);
  }
}

public boolean isPayday(Employee e, Date date) throws InvalidEmployeeType {
  switch(e.type) {
    case COMMISSIONED:
      return isPaydayCommisionedPay(e);
    case HOURLY:
      return isPaydayHourlyPay(e);
    case SALARIED:
      return isPaydaySalariedPay(e);
    default:
      throw new InvalidEmployeeType(e.type);
  }
}

public void deliverPay(Employee e, Money pay) throws InvalidEmployeeType {
  switch(e.type) {
    case COMMISSIONED:
      return deliverPayCommisioned(e);
    case HOURLY:
      return deliverPayHourly(e);
    case SALARIED:
      return deliverPaySalaried(e);
    default:
      throw new InvalidEmployeeType(e.type);
  }
}
