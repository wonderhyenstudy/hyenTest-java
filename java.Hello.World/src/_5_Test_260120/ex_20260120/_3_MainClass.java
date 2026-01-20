package _5_Test_260120.ex_20260120;

import java.util.Scanner;

public class _3_MainClass {
    public static void main(String[] args) {
        //최대 5명까지 저장 가능한 배열 생성.
        _3_MemberBase[] members = new _3_MemberBase[5];
        int count = 0 ; // 현재 저장된 회원 수 (배열 인덱스 관리용)

        //  콘솔에 입력 내용 불러오는 도구.
        Scanner sc = new Scanner(System.in);

        // 메뉴 반복문 이용해서 그려보기.
        while (true) {
            System.out.println("\n=============회원 관리 시스템 ver 1.0=======");
//            System.out.println("1. 회원가입 2. 목록조회 3. 종료");
            System.out.println("1. 회원가입 2. 목록조회 3. 로그인 4. 종료");
            System.out.println("메뉴 선택 >>");

            // 숫자를 입력 받을 준비 및 처리.
            int choice;
            // try catch finally
            // 1)파일 입출력 2)네트워크 통신 이럴 경우 반드시 의무적으로 try 구문안에 작성해야함
            // 안전한 예외처리
            try {
                // 콘솔에 입력된 내용은 모두 타입이 문자열입니다.
                // 그래서, 입력 받은 문자열을 숫자 형태로 변경해야함.
                // Integer.parseInt : 문자열 -> 숫자로 타입 변경 해주는 기능.
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                //NumberFormatException은 문자열을 숫자로 바꾸려고 할 때,
                // 문자열의 형식이 숫자로 변환할 수 없는 상태일 경우 발생하는 대표적인 예외
                System.out.println("숫자만 입력해주세요.");
                // 콘솔에 숫자가 아닌 다른 문자등을 입력시에는, 반복문이
                // 종료되지 않고, 계속 동작 하게끔 설정.
                continue;
            }

            switch(choice) {
                case 1: // 회원 가입.
                    // count , 현재 가입된 회원의 숫자,
                    // members.length : 5개 고정 길이, 왜? 배열이라서, 고정.
                    if(count >= members.length) {
                        System.out.println("정원초과, 가입 불가입니다.");
                        break;
                    }
                    System.out.println("이름: ");
                    String name = sc.nextLine();

                    System.out.println("이메일: ");
                    String email = sc.nextLine();

                    System.out.println("나이: ");
                    // 문자열 -> 숫자 타입으로 변경 :
                    //Integer.parseInt : 문자열 -> 숫자로 타입 변경 해주는 기능.
                    int age = Integer.parseInt(sc.nextLine());

                    System.out.println("패스워드: ");
                    String password = sc.nextLine();

                    // 다형성 활용 : 부모 타입 배열에, 자식 객체 저장.
//                    _3_NormalMember newMember = new _3_NormalMember(name,email,age);
                    _3_NormalMember newMember = new _3_NormalMember(name,email,password,age);
                    // 배열에 저장.
                    members[count] = newMember;
                    // members[0] = 이름1, 이메일1, 패스워드1, 나이1
                    // members[1] = 이름1, 이메일1, 패스워드1, 나이1
                    // members[2] = 이름1, 이메일1, 패스워드1, 나이1
                    // members[3] = 이름1, 이메일1, 패스워드1, 나이1
                    // members[4] = 이름1, 이메일1, 패스워드1, 나이1
                    // 인터페이스 메서드 호출
                    newMember.join();

                    // 인덱스 증가,. 현재 가입할 인원 증가.
                    count++;
                    break;

                //2, 3번 작업 이어서 진행하기.
                //목록 조회
                case 2:
                    if(count == 0) {
                        System.out.println("가입된 회원이 없습니다. ");
                    } else {
                        System.out.println("\n 총회원수 : " + count + "명입니다.");
                        for(int i = 0; i < count; i++) {
                            members[i].showInfo(); // 다형성 (오버라이딩된 메서드 실행)
                        }
                    }
                    break;
                //로그인
                case 3:
                    System.out.println("\n==== 로그인 ===== ");
                    // 이메일, 패스워드 정보 전달 받아서
                    // 일치하면 로그인 성공
                    // 아니면 로그인 불가
                    System.out.println("이메일 : ");
                    String inputEmail =  sc.nextLine();

                    System.out.println("패스워드 : ");
                    String inputPassword =  sc.nextLine();

                    //상태 변수, 로그인 성공 여부 체크
                    boolean isLogin = false;

                    //등록된 회원 숫자 만큼만 반복. count라는 변수를 활용
                    for (int i = 0; i < count; i++) {
                        // 임시 메모리 상에 저장된 회원의 이메일, 패스워드 확인
                        // 저정된 회원 한명씩 꺼내서 member에 담아두고
                        // 입력된 이메일, 패스워드와  == 불러온 이메일, 패스워드 일치 여부 확인
                        _3_MemberBase member = members[i];
//                        if (member.getEmail().equals(inputEmail) && member.getPassword().equals(inputPassword)){
                        if (member.getEmail().equals(inputEmail) && member.getPassword().equals(inputPassword)){
                            System.out.println("로그인 성공!! 환영합니다. " + member.name + "님");
                            System.out.println(member.name + " 님의 이메일은 : " + member.email);
                            isLogin = true;
                            break;
                        }
                    }

                    if (!isLogin){
                        System.out.println("로그인 실패: 정보가 일치하지 않습니다. ");
                    }
                    break;

                //종료
                case 4:
                    System.out.println("프로그램을 종료합니다. ");
                    // 스캐너 자원 반납
                    sc.close();
                    return; // 메인 메서드 종료
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");


            } //switch 닫기


        }//while 닫기

    } // main 닫기
}// _3_MainClass 닫기
