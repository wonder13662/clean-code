// 목록 3-5 Employee and Factory
public abstract class Employee {
  public abstract boolean isPayday();
  public abstract Money calculatePay();
  public abstract void deliverPay(Money pay);
}
------------------------------------
public interface EmployeeFactory {
  public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType;
}
------------------------------------
public class EmployeeFactoryImpl implements EmployeeFactory {
  public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType {
    switch (r.type) {
      case COMMISSIONED:
        return new CommisionedEmployee(r);
      case HOURLY:
        return new HourlyEmployee(r);
      case SALARIED:
        return new SalariedEmployee(r);
      default:
        return new InvalidEmployeeType(r.type);
    }
  }
}
