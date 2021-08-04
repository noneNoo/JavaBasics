public class BankAccount {
    //잔액
    private int balance;

    public void setBalance(int newBalance) {
        balance = newBalance;
    }
    public int getBalance() {
        return  balance;
    }

    // 계좌의 주인 (person 객체를 연결한다)
    private Person owner;

    public void setOwner(Person newOwner) {
        owner = newOwner;
    }
    public Person getOwner() {
        return owner;
    }

    // 입금 메소드
    // owner의 현금을 통장잔고로 입금하는 메서드.
    // 파라미터: 입금할 액수 (int)
    // 리턴: 성공 여부 (boolean)
    public boolean deposit (int amount) {

        // 입금액이 음수거나, 입금자의 현금액보다 클 경우
        if(amount < 0 || owner.getCashAmount() < amount) {
            System.out.println("입금 실패입니다. 잔고: "+balance+"원, 현금: " + owner.getCashAmount()+"원");
            return false;
        }

        // owner의 현금액을 입금액만큼 줄이고 잔액을 추가한다
        owner.setCashAmount(owner.getCashAmount() - amount);
        balance = balance + amount;

        System.out.println(amount + "원 입금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
        return true;
    }

    // 환율 적용 입금 메소드 (메소드 오버로딩)
    public boolean deposit(double amount, double exchangeRate) {
        return deposit((int)(amount * exchangeRate));
    }

    // 출금 메소드
    // 통장 잔고를 owner의 현금으로 출금하는 메서드
    // 파라미터: 출금할 액수 (int)
    // 리턴: 성공 여부(boolean)
    boolean withdraw (int amount) {
        // 출금액이 음수거나, 잔고보다 큰 금액을 출금하려고 했을 경우
        if(amount < 0 || amount > balance) {
            System.out.println("출금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return false;
        }

        // owner의 통잔잔고를 출금액만큼 줄이고 owner의 현금액을 추가한다
        balance = balance - amount;

        owner.setCashAmount(owner.getCashAmount() + amount);
//        owner.cashAmount = owner.cashAmount + amount;

        System.out.println(amount + "원 출금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
        return true;
    }
//
    // 계좌 이체 메소드 (1. 첫 번째 인자로 이체할 사람을 받을 경우)
    // 파라미터: 받는 사람(person객체), 이체할 금액(int)
    // 리턴: 성공 여부(boolean)
    boolean transfer(Person to, int amount) {
        if(amount < 0 || amount > balance) {
            System.out.println("false - from: " + getOwner().getName() + ", to: " + to.getName() + ", amount: " + amount + ", balance: " + getBalance());
            return false;
        }
        // 나의 계좌 잔액을 감소
        setBalance(balance - amount);
        // 받는 사람의 잔액을 증가
        to.getAccount().setBalance(to.getAccount().balance + amount);
        // 메세지 출력
        System.out.println("true - from: " + getOwner().getName() + ", to: " + to.getName() + ", amount: " + amount + ", balance: " + getBalance());

        return true;
    }

    // 계좌 이체 메소드 (2. 첫 번째 인자로 은행계좌를 받는 경우)
    // 파라미터: 받는 사람의 계정 (BankAccount), 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)

    public boolean transfer(BankAccount to, int amount) {
        if(amount < 0 || amount > balance) {
            System.out.println("false - from: " + getOwner().getName() + ", to: " + to.getOwner().getName() + ", amount: " + amount + ", balance: " + getBalance());
            return false;
        }

        // 나의 계좌 잔액을 감소
        setBalance(balance - amount);
        // 받는 계좌의 잔액을 증가
        to.setBalance(to.balance + amount);
        // 메세지 출력
        System.out.println("true - from: " + getOwner().getName() + ", to: " + to.getOwner().getName() + ", amount: " + amount + ", balance: " + getBalance());

        return true;
    }
}
