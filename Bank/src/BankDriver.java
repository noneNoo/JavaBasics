public class BankDriver {
    public static void main(String[] args) {
        // 인스턴스 생성 (사람)
        Person p1 = new Person();
        Person p2 = new Person();

        // 속성 부여
        p1.setName("김신의");
        p1.setAge(28);
        p1.setCashAmount(30000);


        p2.setName("박소이");
        p2.setAge(17);
        p2.setCashAmount(100000);

        // 은행 계좌 생성
        // (메서드들도 함께 생성된다)
        BankAccount a1 = new BankAccount();
        BankAccount a2 = new BankAccount();

        // 속성 부여
        a1.setBalance(100000);
        a2.setBalance(500000);

        // 객체끼리 연결
        p1.setAccount(a1);
        p2.setAccount(a2);
        // 은행의 예금주를 선언
        a1.setOwner(p1);
        a2.setOwner(p2);

        // 입금 메소드 테스트 (나의 현금을 나의 통장잔고로 입금)
        // 출금 메소드 테스트 (나의 통장잔고를 나의 현금으로 출금)
        a2.deposit(30000);
        a2.withdraw(170000);
        a2.deposit(620000);
        a2.withdraw(890000);

        a2.deposit(3.0,1142.63);

    }
}
