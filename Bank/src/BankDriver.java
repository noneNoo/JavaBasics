public class BankDriver {
    public static void main(String[] args) {
        // 인스턴스 생성

        // 사람 생성
        // 생성자에서 바로 속성 부여
        Person p1 = new Person("김신의", 28);
        p1.setCashAmount(30000);
        Person p2 = new Person("박소이",24, 100000);


        // 은행 계좌 생성
//        BankAccount a1 = new BankAccount();
//        BankAccount a2 = new BankAccount();

        // 계좌 생성과 동시에 사람 연결
        BankAccount a1 = new BankAccount(p1);
        a1.setBalance(100000);

        BankAccount a2 = new BankAccount(500000, p2);


        // 객체끼리 연결
        // 이 과정을 this로...? 뺄 수 있지 않을까~
        p1.setAccount(a1);
        p2.setAccount(a2);

//        a2.transfer(a1, 200000);  // 여기테스트해야함
//        a1.transfer(p2, 150000);
//        p2.transfer(a1, 270000); // 여기오류남
//        p1.transfer(p2, 130000);


        // 계좌 이체 테스트
        a2.transfer(a1, 200000);
        a1.transfer(p2, 150000);
        p2.transfer(a1, 270000);
        p1.transfer(p2, 130000);
    }
}
