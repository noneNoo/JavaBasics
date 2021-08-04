import javax.naming.Name;

public class Person {
    // class에 바로 변수를 만들 시 객체의 속성을 담당한다.
    private String name;
    // private: 접근제어자. 이 클래스에서만 접근 가능하다.
    private int age;
    private int cashAmount;

    // 소유 계좌 (bankaccount 객체를 연결한다)
    private BankAccount account;

    // 계좌 getter, setter
    public void setAccount(BankAccount PublicAccount) {
        account = PublicAccount;
    }

    public BankAccount getAccount() {
        return account;
    }

    // 외부에서 접근 가능한 메소드를 만들기

    // 나이 setter, getter
    public void setAge(int newAge) {
        if(newAge >= 0) {
            age = newAge;
        }
    }
    public int getAge() {
        return age;
    }

    // 이름 setter, getter
    public void setName(String newName) {
        name = newName;
    }
    public String getName() {
        return name;
    }

    // 현금 setter, getter
    public void setCashAmount(int newCashAmount){
        if(newCashAmount >= 0) {
            cashAmount = newCashAmount;
        }
    }
    public int getCashAmount() {
        return cashAmount;
    }

    // 첫 번째 파라미터: 받는 사람 (Person)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(Person to, int amount) {
        // 내 계좌의 transfer 메서드를 이용하여
        // 첫 번째 인자에 to로 넘겨받은 사람의 계좌를 넘겨준다.
        return account.transfer(to.account, amount);
    }

//    // 첫 번째 파라미터: 받는 사람의 계정 (BankAccount)
//    // 두 번째 파라미터: 이체할 금액 (정수)
//    // 리턴 : 성공여부 (불린)
    public boolean transfer(BankAccount to, int amount) {
        return account.transfer(to, amount);
    }

}
