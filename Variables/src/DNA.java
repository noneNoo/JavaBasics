public class DNA {
    public static void main(String[] args) {
    String dna = "GATCCGCCCGCCTCGGCCTCCCAAAGTGCTGGGATTACAGGTGTGAGCCA"
            + "CCACGCCCGGCTAATTTTTATTTATTTATTTAAAGACAGAGTCTCACTCT"
            + "GTCACTCAGGCTAGAGTGCAGTGGCACCATCTCAGCTCACTGCAGCCTTG"
            + "ACCTCCCTGGGCTCCGGTGATTTCACCCTCCCAAGTAGCTAGGACTACAG"
            + "GCACATGCCACGACACCCAGCTAATTTTTTATTTTCTGTGAAGTCAAGGT"
            + "CTTGCTACGTTGCCCATGCTGGTATCAAACCCCTGGGCTCAATCAATCCT"
            + "TCCACCTCAGCCTCCCCAAGTATTGGGGTTACAGGCATGAGCTACCACAC"
            + "TCAGCCCTAGCCTACTTGAAACGTGTTCAGAGCATTTAAGTTACCCTACA"
            + "GTTGGGCAAAGTCATCTAACACAAAGCCCTTTTTATAGTAATAAAATGTT"
            + "GTATATCTCATGTGATTTATTGAATATTGTTACTGAAAGTGAGAAACAGC"
            + "ATGGTTGCATGAAAGGAGGCACAGTCGAGCCAGGCACAGCCTGGGCGCAG"
            + "AGCGAGACTCAAAAAAAGAAAAGGCCAGGCGCACTGGCTCACGCCTGTAA"
            + "TCCCAGCATTTCGGGAGGCTGAGGCGGGTGGATCACCTGAGGTCAGGAGT"
            + "TCAAGACCAGCCTAGCCAACATGGTGAAACCCCGTCTCTACTAAAATACA"
            + "AAAATTAACCGGGCGTGATGGCAGGTGCCTGTAATCCCAGCTACTTGGGA"
            + "GGCTGAGGCAGGAGAATCGCTTGAACCAGGAGGCGGAGGTTGCAGGGAGC"
            + "CAAGATGGCGCCACTGCACTCCAGCCTGGGCGATAGAGTGAGACTCCGTC"
            + "TCAGAAAAAAAAGAAAAGAAACGAGGCACAGTCGCATGCACATGTAGTCC"
            + "CAGTTACTTGAGAGGCTAAGGCAGGAGGATCTCTTGAGCCCAAGAGTTTG"
            + "AGTCCAGCCTGAACAACATAGCAAGACATCATCTCTAAAATTTAAAAAAG"
            + "GGCCGGGCACAGTGGCTCACACCTGTAATCCCAGCACTTTGGGAGGTGGA"
            + "GGTGGGTAGATCACCTGACGTCAGGAGTTGGAAACCAGCCTGGCTAACAT";

    // DNA 문자열을 배열로 변환환다
   char[] charArray = dna.toCharArray();

   // 4개의 char 문자를 담을 배열
   char[] current = new char[4];

   // 특정 DNA를 세는 카운트 변수
   int TAGGCount = 0;
   int CCAGCount = 0;
   int AGCCCount = 0;

   for(int i = 0; i < charArray.length - 3; i++) {
       for(int j = 0; j < current.length; j++) {
           current[j] = charArray[i + j];
       }

       // current (char형 배열)을 string 으로 바꿔준다 (구글링했음 ㅠㅠ x발)
       String stringCurrent = String.valueOf(current);


       switch (stringCurrent) {
           case "TAGG":
               TAGGCount = TAGGCount + 1;
               break;
           case "CCAG":
               CCAGCount = CCAGCount + 1;
               break;
           case "AGCC":
               AGCCCount = AGCCCount + 1;
               break;
           default: break;
       }
   }

   // 출력
        System.out.println("TAGG: " + TAGGCount);
        System.out.println("CCAG: " + CCAGCount);
        System.out.println("AGCC: " + AGCCCount);

}
}
