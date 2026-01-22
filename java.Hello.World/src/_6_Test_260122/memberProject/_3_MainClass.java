package _6_Test_260122.memberProject;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _3_MainClass {


    private static final String FILE_NAME = "members.txt";

    public static void main(String[] args) {

        Map<String,_3_MemberBase> members = new HashMap<>();
        loadMembers(members);

        _3_MemberBase loggedInMember = null;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=============회원 관리 시스템 ver 2.0=======");
            if(loggedInMember != null) {
                System.out.println("-------------------------------------------");
                System.out.println("로그인 한 유저 : " + loggedInMember.getEmail());
                System.out.println("-------------------------------------------");
                System.out.println("1. 회원가입 2. 목록조회 3. 로그아웃 4. 회원수정 5. 회원검색 6. 종료");
            } else {
                System.out.println("1. 회원가입 2. 목록조회 3. 로그아웃 4. 회원수정 5. 회원검색 6. 종료");
            }
            System.out.println("메뉴 선택 >>");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("숫자만 입력해주세요.");
                continue;
            }

            switch (choice) {
                case 1: // 회원 가입.

                    System.out.println("이름: ");
                    String name = sc.nextLine();

                    System.out.println("이메일: ");
                    String email = sc.nextLine();

                    if(members.containsKey(email)) {
                        System.out.println("이미 가입된 이메일입니다.");
                        break;
                    }
                    System.out.println("패스워드: ");
                    String password = sc.nextLine();

                    System.out.println("나이: ");
                    int age = Integer.parseInt(sc.nextLine());

                    _3_NormalMember newMember = new _3_NormalMember(name, email, password, age);
                    members.put(email, newMember);
                    newMember.join();
                    saveMembers(members);
                    break;

                case 2:
                    if (members.isEmpty()) {
                        System.out.println("가입된 회원이 없습니다. ");
                    } else {
                        for (_3_MemberBase member: members.values()) {
                            // 260121_업그레이드_ArrayList에서_HashMap으로_변경, 순서4-3
//                            members.get(i).showInfo();
                            member.showInfo();
                        }
                    }
                    break;
                case 3:
                    if(loggedInMember != null) { // 로그인 된 상태
                        loggedInMember = null; // 로그인 정보 초기화
                        System.out.println("로그아웃 되었습니다.");
                    } else {// 로그인 안된 상태
                        System.out.println("\n====로그인===== ");
                        System.out.println("이메일 : ");
                        String inputEmail = sc.nextLine();

                        System.out.println("패스워드 : ");
                        String inputPassword = sc.nextLine();
                        boolean isLogin = false;

                        if(members.containsKey(inputEmail)) {
                            // 로그인시, 입력한 이메일 정보가, Map 들어가 있다면, 로직 실행.
                            _3_MemberBase member = members.get(inputEmail);

                            if(member.getEmail().equals(inputEmail) &&
                                    member.getPassword().equals(inputPassword)
                            ) {
                                System.out.println("로그인 성공!! 환영합니다.~" + member.name+ "님");
                                isLogin = true;
                                loggedInMember = member;
//                                break;
                            } // if 닫기
                            else { // 비밀번호가 틀린 경우
                                System.out.println("패스워드가 틀렸습니다.");

                            }
                        } // for 닫기. -> if 닫기 변경.
                        // 260121_기능추가_로그아웃, 순서3
                        else {
                            // 이메일이 존재하지 않는 경우
                            System.out.println("존재하지 않는 이메일입니다. ");
                        }
                    }
                    break;
                case 4:
                    //회원 수정은 로그인 했을 경우만 수정하기
                    //로그인 안되었을 경우
                    if(loggedInMember == null){ //기본 유효성 체크. 로그인이 되었는지, 안되었는지 체크.
                        System.out.println("로그인 이후에 수정 할 수 있습니다.");
                        break;
                    }
                    //화면구성
                    //로그인 되었을 경우. 위에 break로 안 가고 여기로 옴
                    System.out.println("\n====== 회원정보수정 =======");
                    System.out.println("수정할 항목을 선택하세요.");
                    System.out.println("1. 비밀번호 2. 이름 3. 나이 4. 취소");
                    System.out.println("입력 : ");

                    //입력된 정보를 받아라
                    String choiceNumber = sc.nextLine();

                    //수정 여부를 체크할 사태변수 사용
                    boolean isUpdated = false;

                    switch (choiceNumber){
                        // 입력 받은 숫자가 문자열 타입이므로 "" 로 묶어줌
                        case "1" :
                            System.out.println("새로운 비밀번호 입력 : ");
                            String newPassword = sc.nextLine(); //입력받고
                            loggedInMember.setPassword(newPassword); // 데이터에 수정하고
                            isUpdated = true; // 수정했음 체크
                            break;
                        case "2" :
                            System.out.println("새로운 이름 입력 : ");
                            String newName = sc.nextLine();
                            loggedInMember.setName(newName);
                            isUpdated = true;
                            break;
                        case "3" :
                            System.out.println("새로운 나이 입력 : ");
                            //예외처리. 숫자가 아닌 문자가 올 경우는????
                            try {
                                String newAge = sc.nextLine();
                                // 문자열 -> 숫자 변환 :
                                // 정상 : "30", 잘못된 입력: "삼십"
                                int newAge2= Integer.parseInt(newAge);
                                loggedInMember.setAge(newAge2);
                                isUpdated = true;
                            }catch (Exception e){
                                System.out.println("잘못된 나이 입력입니다.");
                            }


                            break;
                        case "4" :
                            System.out.println("수정취소");
                            break;
                        default:
                            System.out.println("잘못된 입력입니다.");
                    }
                    // 변경된 내용을 파일 쓰는 작업
                    if(isUpdated){ // 수정했으면 참.
                        saveMembers(members); // 파일에 저장해라
                    }
                    break;
                case 5: // 회원검색
                    System.out.println("\n============회원검색=============");
                    System.out.println("1. 이메일로 검색 : 정확히 일치");
                    System.out.println("2. 이름으로 검색 : 포함된 이름으로 검색");
                    System.out.println("선택 : "); 
                    String searchType = sc.nextLine(); // 검색종류 저장

                    if (searchType.equals("1")) {
                        // 이메일로검색
                        System.out.println("검색할 이메일 입력 : ");
                        String searchEmail = sc.nextLine();
                        System.out.println("\n 검색결과");
                        if (members.containsKey(searchEmail)){
                            members.get(searchEmail).showInfo();
                        } else {
                            System.out.println("해당 이메일의 회원이 없습니다.");
                        }

                    } else if (searchType.equals("2")) {
                        // 이름으로 검색
                        System.out.println("검색할 이름 입력 : ");
                        String searchName = sc.nextLine();
                        boolean isFound = false; // 이름이 있는지 없는지 확인
                        System.out.println("검색중");

                        for (_3_MemberBase m : members.values()) {
                            if (m.getName().contains(searchName)){ // 이름으로 키 검색을 한다
                                m.showInfo();
                                isFound = true;
                            }
                        }

                        if(!isFound){ // false 일 경우 : isFound = false 와 같음
                            System.out.println("검색한 결과가 없습니다.");
                        }


                    } else {
                        System.out.println("잘못된 입력입니다.");
                    }
                    break;

                case 6:
                    System.out.println("프로그램을 종료합니다. ");
                    // 스캐너 자원 반납
                    sc.close();
                    return; // 메인 메서드 종료
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            } //switch 닫기
        }//while 닫기
    } // main 닫기
    public static void saveMembers(Map<String,_3_MemberBase> members){
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(FILE_NAME));
            for(_3_MemberBase m: members.values()) {
                String line = m.getName()+","+m.getEmail()+","+m.getPassword()+","+m.getAge();
                bw.write(line);
                bw.newLine(); // 줄바꿈 함.
            }
            System.out.println("파일 저장 완료 " + FILE_NAME);

        } catch (IOException e){
            System.out.println("오류가 발생 했습니다. 원인: " + e.getMessage());
        }finally {
            if(bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    System.out.println("오류 발생, 파일 닫기 실패. ");
                }
            }

        }
    }

    public static int loadMembers(Map<String,_3_MemberBase> members){
        File file = new File(FILE_NAME);
        if(!file.exists()) { // 해당 파일이 존재 안하니? true(파일없다)
            return 0;
        }
        int loadCount = 0;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null ) {
                String[] data = line.split(",");
                if( data.length == 4) {
                    String name = data[0];
                    String email = data[1];
                    String password = data[2];
                    int age = Integer.parseInt(data[3]);
                    members.put(email,new _3_NormalMember(name,email,password,age));
                    loadCount++;

                }
            }
            System.out.println("파일 불러오기 완료 :" + loadCount + "명의 회원 정보를 불러옴.");
        }catch (IOException e){
            System.out.println("파일 불러오기 실패 원인 : " + e.getMessage());
        }finally {
            if( br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("파일 닫기 실패");
                }
            }
        } // finally 닫기
        return loadCount;
    }

}// _3_MainClass 닫기
