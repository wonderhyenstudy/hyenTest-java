package _11_Test_260127_bk.service;

import _11_Test_260127_bk.model._3_MemberBase;
import _11_Test_260127_bk.model._3_NormalMember;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class _3_MemberService {
    //main 없다
    //설계, 기능을 담당하는 클래스다


    private static final String FILE_NAME = "members.txt";
    // 260123_화면_스윙_변경__순서2
    // 전역으로 사용할 멤버들 지정, 변수 지정.
    private Map<String, _3_MemberBase> members = new HashMap<>();
    // 로그인한 멤버 상태.
    private _3_MemberBase loggedInMember = null;

    // 기본생성자
    public _3_MemberService() {
        //생성시, 파일로드, members.txt
        loadMembers();
    }


    //모델 클래스 정리

    //상태 관련 메서드, 로그인한 멤버를 가져오기.
    public _3_MemberBase getLoggedInMember() {
        return loggedInMember;
    }

    //로그인한 멤버를 설정하기
    public void setLoggedInMember(_3_MemberBase loggedInMember) {
        this.loggedInMember = loggedInMember;
    }

    // 로그인한 정보를 담고 있는 메모리상의 정보 Map 가져오기
    public Map<String, _3_MemberBase> getMembers() {
        return members;
    }

    //기존 기능들을 가져오기
    //회원가입
    public String join(String name, String email, String password, int age){
        if(members.containsKey(email)) {
            return "이미 가입된 이메일입니다";
        }
        _3_NormalMember newMember = new _3_NormalMember(name, email, password, age);
        // 맵에 새 회원을 담는 과정,
        members.put(email, newMember);
        //  기존에 파일에 쓰기 기능.
        saveMembers();

        return "success";

    }
    //파일 저장
    private void saveMembers(){
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(FILE_NAME));
            for (_3_MemberBase m : members.values()) {
                String line = m.getName() + "," + m.getEmail() + "," + m.getPassword() + "," + m.getAge();
                bw.write(line);
                bw.newLine(); // 줄바꿈 함.
            }
//            System.out.println("파일 저장 완료 " + FILE_NAME);

        } catch (IOException e) {
//            System.out.println("오류가 발생 했습니다. 원인: " + e.getMessage());
//            printLog("오류발생 : " + e.getMessage());
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    System.out.println("오류 발생, 파일 닫기 실패. ");
                }
            }

        }
    }
    // 본문에 출력 기능

    // 로그인
    public String login(String email, String password){
        if(!members.containsKey(email)){
            return "존재하지 않는 이메일입니다.";
        }
        _3_MemberBase member =members.get(email);
        if(member.getPassword().equals(password)){
            return "패스워드가 틀렸습니다.";
        }
        this.loggedInMember = member;
        return "success";
    }

    // 로그아웃
    public void logout(){
        this.loggedInMember = null;
    }

    // 정보를 수정 후 저장
    public void updateMember(){
        saveMembers();
    }

    // 목록조회
    public void loadMembers() {
        File file = new File(FILE_NAME);
        if (!file.exists()) { // 해당 파일이 존재 안하니? true(파일없다)
            return ;
        }

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            String line;
            //이상용4,lsy4@naver.com,1234,20
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 4) {
                    String name = data[0];
                    String email = data[1];
                    String password = data[2];
                    int age = Integer.parseInt(data[3]);
                    members.put(email, new _3_NormalMember(name, email, password, age));


                }
            }
        } catch (IOException e) {
            System.out.println("파일 불러오기 실패 원인 : " + e.getMessage());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("파일 닫기 실패");
                }
            }
        } // finally 닫기
    }
    // 회원수정


    // 회원검색


    // 회원탈퇴


    // 종료




}
