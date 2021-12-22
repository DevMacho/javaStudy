public class variable {
    public static void main(String[] args) {
        //변수 선언
        int number = 1; //정수 변수 선언 output: 1
        System.out.println(number);

        //연산자
        number++; // output : 2
        System.out.println(number);
        number += 3; // output : 5
        System.out.println(number);
        number *= 2; // output : 10
        System.out.println(number);
        number /= 2; // output : 5
        System.out.println(number);
        number %= 2; // output : 1
        System.out.println(number);
        number = number + 2 * 4; // output : 9
        System.out.println(number);
        number = (number - 7) * 2; // output : 4

        // 연산 우선순위
        System.out.println(number);
        // 일반 수학과 같이 괄호 -> 곱셈, 나눗셈, 나머지 -> 덧셈 뺄셈 순으로 계산한다.

        // 타입 전환
        number = (int) 1.2; // output : 1;
        System.out.println(number);
        // Java에서는 실수 앞에 (int)를 붙여주면 소수점을 버리고 정수로 변환할 수 있다.

        // 정수 자료형
        byte oneByte = -128;
        oneByte = 127;
        System.out.println(oneByte);
        // byte 자료형은 1byte의 크기로 -128부터 127까지 표현할 수 있다.
        short twoByte = -32768;
        twoByte = 32767;
        System.out.println(twoByte);
        // short 자료형은 2byte의 크기로 -32768부터 32767까지 표현할 수 있다.
        int fourByte = -2147483648;
        fourByte = 2147483647;
        System.out.println(fourByte);
        // int 자료형은 4byte의 크기로 -2147483648부터 2147483647까지 표현할 수 있다.
        long eightByte = -9223372036854775808L;
        eightByte = 9223372036854775807L;
        System.out.println(eightByte);
        // long 자료형은 8byte의 크기로 -9223372036854775808부터 9223372036854775807까지 표현할 수 있다.
        // 단, long 자료형은 컴퓨터가 int로 착각할 수 있기 때문에 숫자 뒤에 꼭 l을 붙여줘야 한다.
        
        // 실수 자료형
        float floatNum = 1.5f;
        System.out.println(floatNum);
        // float 자료형은 4byte의 크기로 실수를 표현할 수 있다.
        // 단, float 자료형은 컴퓨터가 double로 착각할 수 있기 때문에 숫자 뒤에 꼭 f를 붙여주야 한다.
        double doubleNum = 1.345346;
        System.out.println(doubleNum);
        // double 자료형은 8byte의 크기로 실수를 표현할 수 있다.
        // 실수 자료형들은 정확한 계산이 불가능해서 정수 자료형으로 계산한 뒤에 나눗셈을 통해 실수로 바꿔주는 것이 좋다.

        // 문자 자료형
        char character = '가';
        System.out.println(character);

        // 문자열 자료형
        String sentence = "안녕하세요 저는 자바를 오늘 처음 배우는 자바스크립트 개발자입니다.";
        System.out.println(sentence);
        
        // 문자열 붙이기
        String myName = "제 이름은 마쵸라고 해요.";
        String introduceMe = sentence + myName;
        System.out.println(introduceMe);

        // 문자열 글자 수 세기
        System.out.println(introduceMe.length()); // 공백도 포함되어 세진다.
        // length() 함수는 string 자료형에 포함되어 있는 내장 함수로 int 자료형으로 문자열의 글자 수를 return한다.

        // 문자열 바꾸기
        String newIntroduce = introduceMe.replaceAll("요", "요!");
        System.out.println(newIntroduce);
        // replaceAll() 함수는 string 자료형에 포함되어 있는 내장 함수로 첫 번째 인자를 두 번째 인자로 변환해 새로운 문자열을 return한다.

        // 문자열 쪼개기
        String message = "마쵸봇 주가 보여줘";
        String newMessage = message.substring(0, 3); // 0부터 2까지 잘라내기
        System.out.println(newMessage);
        String newMessage2 = message.substring(4); // 4부터 끝까지 잘라내기
        System.out.println(newMessage2);

        // 참 거짓 자료형
        boolean trueValue = true;
        System.out.println(trueValue);
        boolean falseValue = false;
        System.out.println(falseValue);
        boolean question = 4 > 1;
        System.out.println(question);
    }
}



