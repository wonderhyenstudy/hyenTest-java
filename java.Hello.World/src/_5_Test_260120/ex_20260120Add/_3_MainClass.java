package _5_Test_260120.ex_20260120Add;

import _1_Test_260113.ex._6_Ex;

import java.io.*;
import java.util.Scanner;

public class _3_MainClass {

    private static final String FILE_NAME = "members.txt";


    public static void main(String[] args) {
        //최대 5명까지 저장 가능한 배열 생성.
        _3_MemberBase[] members = new _3_MemberBase[5];
        int count = 0 ; // 현재 저장된 회원 수 (배열 인덱스 관리용)

        //프로그램 시작시, 파일에서 회원 정보 불러오기
        count = loadMembers(members);

        //현재 로그인한 회원을 저장할 변수
        //로그인 한 유저 값 저장
        _3_MemberBase loggedInMember = null;


        //  콘솔에 입력 내용 불러오는 도구.
        Scanner sc = new Scanner(System.in);

        // 메뉴 반복문 이용해서 그려보기.
        while (true) {
            System.out.println("\n=============회원 관리 시스템 ver 1.0=======");

            if(loggedInMember != null) {
                System.out.println("-------------------------------------------");
                System.out.println("로그인 한 유저 : " + loggedInMember.getEmail());
                System.out.println("-------------------------------------------");
            };

//            System.out.println("1. 회원가입 2. 목록조회 3. 종료");
            System.out.println("1. 회원가입 2. 목록조회 3. 로그인 4. 종료");
            System.out.println("메뉴 선택 >>");

            // 숫자를 입력 받을 준비 및 처리.
            int choice;
            try {
                // 콘솔에 입력된 내용은 모두 타입이 문자열입니다.
                // 그래서, 입력 받은 문자열을 숫자 형태로 변경해야함.
                // Integer.parseInt : 문자열 -> 숫자로 타입 변경 해주는 기능.
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
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
                    // 인터페이스 메서드 호출
                    newMember.join();

                    // 인덱스 증가,. 현재 가입할 인원 증가.
                    count++;

                    //회원가입시, 메모리상의 내용을 파일에 저장하는 메서드 이용
                    saveMembers(members, count);

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
                        if (member.getEmail().equals(inputEmail) && member.getPassword().equals(inputPassword)){
                            System.out.println("로그인 성공!! 환영합니다" + member.name + "님");
                            isLogin = true;
                            //로그인 성공 시 해당 로그인한 객체를 변수에 저장.
                            loggedInMember = member;
                            break;
                        }

                    }
                    //거짓이면
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

    // 저장하기
    //1 저장하는 기능의 메서드 만들기
    //  1) 메모리상에 저장된 멤버들의 배열 members
    //  2) 가입된 인원수 count
    public static void saveMembers(_3_MemberBase[] members, int count){
        // ButteredWriter : 파일 속도 높여줌
        // try
//        File file = new File(); // File 자바가 제공하는 클래스
        BufferedWriter bw = null;
//        try catch finally
        // 1)파일 입출력 2)네트워크 통신 이럴 경우 반드시 의무적으로 try 구문안에 작성해야함
        try {
            //스트림 생성
//            new FileWriter(FILE_NAME) : 우리가 지정한 파일에 쓰겠다
//            new BufferedWriter(여기)   : 여기 라는 내용을 좀 더 빠르게 쓰겟다
            bw = new BufferedWriter(new FileWriter(FILE_NAME));

            for (int i = 0; i < count; i++) {
                _3_MemberBase m = members[i];

//                System.out.println("디버깅1 넘어온 데이터 확인1 getName: " + m.getName());
                String line = m.getName() + "," + m.getEmail() + "," + m.getPassword() + "," + m.getAge();
//                System.out.println("디버깅2 넘어온 데이터 확인2 line: " + line);
                bw.write(line);
                bw.newLine();

            }
            System.out.println("파일 저장 완료" + FILE_NAME);
            
        } catch (IOException e){
            System.out.println("오류가 발생 했습니다. 원인 : " + e.getMessage());
        } finally {
            //에러가 있든, 없든 무조건 실행 되는 구간.
            //자원반납. bw 기능 반납하기
            if (bw != null){
                try {
                    bw.close();
                } catch (IOException e) {
                    System.out.println("오류가 발생했습니다. ");
                }
            }
        }


    }




    //2 불러오는 기능의 메서드 만들기
    // 1) 메모리에 저장된 배열,
    public static int loadMembers(_3_MemberBase[] members) {
        // 물리파일 : FILE_NAME = members.txt 파일에 접근하고, 가져오는 기능을 담당하는 클래스 이용
        // 담당 클래스 : File
        // 스캐너 도구 사용하듯이
        // 파일 도구를 이용아힉
        File file = new File(FILE_NAME);

        // 유효성 체크. 파일이 무조건 있다는 보장이 없음. 안전 장치 달기
        // 파일이 없다면, 해당 기능 실행을 중지
        if (!file.exists()){
            //  exists 함수 : 존재한다면
            // 해당 파일이 존재 안하니? true ( 파일없음)
            return  0;
        }

        // 실제 불러올 멤버의 숫자(상태 변수)
        int loadCount = 0;

        //버퍼를 이용하여 빠르게 불러오기, 도구를 사용하기
        BufferedReader br = null;

        // 실험장에서 작업하기. 왜? 파일을 읽고, 쓰는 작업을 여기서 하기로 약속 햇음
        // 만약 안하면/ 그러면 실행 안해줘!
        try {
            // new FileReader(file) : 물리 파일 읽는 도구
            // new BufferedReader   : 빨리 읽어주는 도구
            // br : 파일에서 읽었던 내용이 모두 br 에 들어가 있음(내용물)
            br = new BufferedReader(new FileReader(file));

            // 파일에서 읽어온 내용을 한줄씩 임의로 담아둘 변수.
            String line;
            //br.readLine() : 전체 내용중에서 한줄만 읽기
            while((line = br.readLine()) != null) {
                // 유효성 기본 체크. 읽을때, 배열의 크기 이상을 읽지 못하게 막기
                // 예시) loadCount 4, members.length : 회원 가입된 인원 3명
                //       못 불러옴. 에러남
                if (loadCount >= members.length){
                    break;
                }
                //정상적으로 불러오는 경우
                // 쉼표를 기준으로 데어터를 불러오기
                // 예시) 이름, 이메일, 비밀번호, 나이
                // split -> 문자열.split(",") : 콤마를 기준으로 단어를 분리함.
                //String[] data = {"이름", "이메일", "비밀번호", "나이"}
                String[] data = line.split(",");
                if (data.length == 4) {
                    String name = data[0];
                    String email = data[1];
                    String password = data[2];
                    //Integer.parseInt : 문자열 -> 숫자로 타입 변경 해주는 기능.
                    int age = Integer.parseInt(data[3]);
                    // 파일에서 읽어온 내용을 -> 메모리 상의 배열에 담기
                    //name,email,password,age ->
                    members[loadCount] = new _3_NormalMember(name,email,password,age);

                    loadCount++;
                }

                System.out.println("파일 불러오기 완료 : " + loadCount + "명의 회원정보를 ㅂ루러옴");

            }
        } catch (IOException e){
            System.out.println("오류가 발생 했습니다. 원인 : " + e.getMessage());
        } finally {
            //자원반납
            if(br != null){
                try {
                    br.close();
                } catch (IOException e){
                    System.out.println("파일 닫기 실패");
                }
            }
        }

        return loadCount;
    }
}// _3_MainClass 닫기
