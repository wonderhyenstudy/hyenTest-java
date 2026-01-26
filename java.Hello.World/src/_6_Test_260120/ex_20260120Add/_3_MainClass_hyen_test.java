package _6_Test_260120.ex_20260120Add;

import java.io.*;
import java.util.Scanner;

public class _3_MainClass_hyen_test {
    // 임시저장파일 순서1
    // 저장할 파일의 이름을 지정한다.
    private static final String FILE_NAME = "members_hyen.txt";

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
                    // 인터페이스 메서드 호출
                    newMember.join();

                    // 인덱스 증가,. 현재 가입할 인원 증가.
                    count++;

                    // 임시저장파일 순서3
                    // 회원가입시, 메모리상의 내용을 파일에 저장하는 메서드를 이용
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
    // 임시저장파일 순서2
    // 임시저장파일 순서2 1) 저장하는 기능 메서드 만들기
    public static void saveMembers(_3_MemberBase[] members, int count){
        // 순서 2 1)-1 BufferedWriter : 버퍼를 사용해 파일 쓰기 속도를 높여줍니다.
        BufferedWriter bw = null;
        // 순서 2 1)-2 try ~ catch ~ finally
        // 순서 2 1)-3 try 스트림 생성.
        // 순서 2 1)-4 try members[i] 배열이고, 메모리상에 저장된 멤버들
        try{
            bw = new BufferedWriter(new FileWriter(FILE_NAME));

            //                for문 이용해서, 메모리상에 저장된 멤버들을, members.txt 파일에 기록하는 과정
            for (int i = 0; i < count; i++) {
                _3_MemberBase m = members[i];
                String line = m.getName()+","+m.getEmail()+","+m.getPassword()+","+m.getAge();

                bw.write(line);
                bw.newLine(); // 줄바꿈 함.

            }

            System.out.println("파일 저장 완료 " + FILE_NAME);
        }

        // 순서 2 1)-4 catch 오류 원인 출력
        catch (IOException e) {
            System.out.println("오류가 발생 했습니다. 원인: " + e.getMessage());
        }

        // 순서 2 1)-4 finally 자원반납. 닫기
        finally {
            if (bw != null){
                try{
                   bw.close();
                } catch (IOException e){
                    System.out.println("오류 발생, 파일 닫기 실패. ");
                }
            }
        }

    }
    // 임시저장파일 순서2 2) 불러오는 기능 메서드 만들기
    public static int loadMembers(_3_MemberBase[] members){
        // 순서 2 2)-1 가져오는 기능을 담당하는 클래스 File 를 이용해 파일에 접근
        File file = new File(FILE_NAME);

        // 순서 2 2)-2 유효성 검사 : 파일이 없다면 패스
        if (!file.exists()){
            return 0;
        }
        // 순서 2 2)-3 실제 불러올 멤버의 숫자(상태 변수)
        int loadCount = 0;
        // 순서 2 2)-4 버퍼를 이용해서 빠르게 불러오기, 도구를 사용하기.
        BufferedReader br = null;
        // 순서 2 2)-5 try


        try {
            // FileReader 사용하여 읽어오기
            br = new BufferedReader(new FileReader(file));
            // 파일에서 읽어온 내용을 한줄씩 임의로 담아둘 변수.
            String line;
            //  while 이용 br.readLine(), : 전체 내용중에서, 한줄 읽기.
            while((line = br.readLine()) != null){
                // 유효성 기본 체크, 읽을 때, 배열의 크기 이상을 읽지 못하게 막기.
                if (loadCount >= members.length){
                    break;
                }
                // 정상적으로 불러오는 경우
                // 쉼표를 기준으로 데이터를 불러오기.
                // 예시) line = "이상용,lsy@naver.com,1234,20"
                // split -> 문자열.split(","), 콤마를 기준으로 단어를 분리함.
                // String[] data = { "이상용", "lsy@naver.com",  "1234", "20"  }
                String[] data = line.split(",");
                // ,(콤마) 를 기준으로 한줄에 불러온 데이터가 배열로 들어간다.
                // 한 행의 갯수가 4개이면 각 변수에 넣어줘라.
                if(data.length == 4){
                    String name = data[0];
                    String email = data[1];
                    String password = data[2];
                    // Integer.parseInt : 문자열 -> 숫자로 변환
                    int age = Integer.parseInt(data[3]);

                    // 파일에서 읽어온 내용을 -> 메모리 상의 배열에 담기.
                    // name,email,password,age -> 객체에 담고 -> 배열에 담기.
                    members[loadCount] = new _3_NormalMember(name,email,password,age);
                    // 파일에서 불러온 사람의 숫자를 확인하는 상태 변수 카운트 1증가.
                    loadCount++;

                }
            }
            System.out.println("파일 불러오기 완료 :" + loadCount + "명의 회원 정보를 불러옴.");
        }

        // 순서 2 2)-6 catch
        catch (IOException e){
            System.out.println("파일 불러오기 실패 원인 : " + e.getMessage());
        }
        // 순서 2 2)-7 finally
        finally {
            // 자원 반납. 읽어 오는 도구 자원반납, 스캐너 다 사용 후 반납하듯이
            if (br != null){
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
