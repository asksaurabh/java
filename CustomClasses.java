class InternalData {
  private String accountId;

  InternalData(String accountId) {
    this.accountId = accountId;
  }

  String getAccountId() {
    return accountId;
  }
}

class MyData {
  private String name;
  private Integer age;
  private InternalData account;

  MyData(String name, Integer age, String accountId) {
    this.name = name;
    this.age = age;
    this.account = new InternalData(accountId);
  }

  void setAge(Integer age) {
    this.age = age;
  }

  Integer getAge() {
    return age;
  }

  String getName() {
    return name;
  }

  void setName(String name) {
    this.name = name;
  }

  String getAccountId() {
    return account.getAccountId();
  }
}

class CustomClasses {
  public static void main(String[] args) {
    MyData data = new MyData("Alice", 30, "acc123");

    System.out.println("Name: " + data.getName());
    System.out.println("Age: " + data.getAge());
    System.out.println("Account ID: " + data.getAccountId());
  }
}