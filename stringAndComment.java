public class stringAndComment {
    public static void main(String[] args) {
        System.out.println('뛟');
        // 자바에선 쌍따옴표는 문자열(여러개의 문자) 그냥 따옴표는 문자(한 글자)를 나타낸다.
        System.out.println("안녕 나는 \"자바야\".");
        System.out.println("안녕 나는 자바야.\n앙 기모띠");
        /*
        이스케이프
        1) \ -> 따옴표 연결 ex)"안녕 나는 \"자바\"야"
            - output: 안녕 나는 "자바"야.
        2) \n -> 줄바꿈 ex)"안녕 나는 자바야.\n앙 기모띠
            - output: 안녕 나는 자바야.
                      앙 기모띠
        */
    }
}
