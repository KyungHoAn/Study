# Spring Framework

### 형싱관리 Configuration Management) - 버전관리
- 형상관리는 변경사항을 체계적으로 추적, 통제한다는 것, 어떤 문서나 파일이 변경되었을 경우 변경된 내역을 기록하였다가 나중에 이를 찾아보아야 할 경우에 대한 관리
- 형상관리 application (형상관리도구의 종류)
  - CSV : 가장 오랫동안 사용한 툴
  - SVM : CSV의 단점 보완
  - Git : 대중화


### Git 용어 (형상관리 어플리케이션)
- branch => mster(default) : 브렌치간 독립성을 보장한다.
- checkout => branch간 이동
- marge => 다른 Branch간 병합 * 다른 branch를 __가지고 오는__ 작업
- conflict => Mearge시 충돌
- repostory => 저장소
- Commit => branch 작업 저장
<hr/>

## eclipse Git 사용법
1. help에서 Eclipse Marketplaec 클릭
<img src="https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/git/1.png" width="30%" height="30%">  
2. git 검색 후 EGit - Git Integration for Eclipse 인스톨럴 되어있는지 확인
<img src="https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/git/2.png" width="30%" height="30%">
3. open Perpective 에서 Git 클릭 후 Git Repositories 생겼는지 확인
<table>
  <tr>
<td><img src="https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/git/3.png" width="40%" height="40%"> <img src="https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/git/4.png" width="50%" height="50%">
    </td>
  </tr>
</table>
4. (test file)생성 New Dynamic web Project 생성
<img src="https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/git/5.png" width="80%" height="80%">
5. (Project Name)  z.studyGit 생성 => create 누루고 프로젝트 이름 수정후 finish
<table>
  <tr>
    <td>
<img src="https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/git/6.png" width="40%" height="40%">
<img src="https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/git/7.png" width="40%" height="40%">
    </td>
  </tr>
</table>
6. 만든 project 오른쪽 클릭 -> Team -> Share Project
<img src="https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/git/8.png" width="50%" height="50%">
7. Share Project -> Create 클릭 -> master 브랜치 생성
<img src="https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/git/9.png" width="70%" height="70%">
8. javaEE클릭후 project 이름 옆에 master branch 생성되었는지 확인
<img src="https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/git/10.png" width="30%" height="30%">
9. Git Repositories 에서 Working Tree 밑 z.studyGit 생성 확인
<img src="https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/git/11.png" width="40%" height="40%">
10. 탐색기 workspace에 git project 생성 안되있는거 확인 -> 탐색기 사용자 -> git -> 01First(Create a Git Repository 에서 만든 이름) -> z.sudyGit파일 확인
<img src="https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/git/12.png" width="30%" height="30%">
11. project -> Team -> show in History (그동한 작업했던 경로들을 보여준다.)
<table>
  <tr>
    <td>
<img src="https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/git/13.png" width="30%" height="30%">
 <img src="https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/git/14.png" width="60%" height="90%">
    </td>
  </tr>
</table>  
12. commit하기전 __*필수사항(확인) Preferences -> Version Control(Team)-> Git -> Committing 에서 User Staging~~~ 체크표시 해제
<img src="https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/git/15.png" width="60%" height="60%">
13. Prodject => Team => commit
<table>
  <tr>
    <td>
<img src="https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/git/16.png" width="40%" height="40%">
<img src="https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/git/17.png" width="40%" height="40%">
    </td>
  </tr>
  </table>
14. Git Repositories 에서 커밋 메시지 확인
<img src="https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/git/18.png" width="60%" height="60%">
15. 새로운 branch 생성
<table>
  <tr>
    <td>
<img src=" https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/git/19.png" width="50%" height="50%">
<img src="https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/git/20.png" width="40%" height="40%">
    </td>
  </tr>
</table>
16. new/dev branch로 변경
<table>
  <tr>
    <td>
      <img src="https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/git/23.png" width="40%" height="40%">
<img src="https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/git/24.png" width="50%" height="50%">
    </td>
  </tr>
  </table>
17. master branch에서는 최신버전 관리만 진행하고 작업은 다른 브랜치에서 진행
  - branch 병합시 충돌오류가 표시되는데 충돌오류수정 후 수정했다는 것을 알려주기 위해서 Add in index 클릭
<table>
  <tr>
    <td>
<img src="https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/git/24.png" width="30%" height="30%">
<img src="https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/git/28.png" width="60%" height="60%">
    </td>
  </tr>
  </table>

<hr/>

## Spring Framework 사용
 - String Framework는 여러개의 모듈들이 합쳐진것을 말한다.
 - springFramework.org 이동하여 project->spring Framework LEARN
 - 앞에 숫자가 바뀌면 메이저 업그레이드 뒤에 숫자가 바뀌면 마이너 업그레이드
 - spring download후 spring_home 설정
 - project 생성

1. 새로운 자바 프로젝트 생성 -> Source Folder 클릭 <br/>
__*src/main/java => bean저장__<br/>
__*src/test/java => application저장__<br/>
__*src/main/resources => metadata저장__ : 소프트웨어를 돌리는데 부수적인것을 저장한다.<br/>
<img src="https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/spring/1.png" width="50%" height="50%">
<img src="https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/spring/2.png">
2. Source Folder 생성 (src/main/java) (src/main/resources) (src/test/java)
<img src="https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/spring/3.png" width="50%" height="50%">
<img src="https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/spring/4.png" width="50%" height="50%">
3. Spring Framework도 추가적으로 jar를 넣어주어야 한다. .jar를 넣기 위해서 Preferences -> User Libraies -> new -> spring_home루트 저장
<img src="https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/spring/5.png" width="60%" height="60%">
4. spring_framework-5.2.5 libs 에서 doc와 sources 빼고 넣어준다.
<img src="https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/spring/6.png" width="60%" height="60%">
6. Add Library하여 Library추가
<img src="https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/spring/7.png" width="60%" height="60%">
<img src="https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/spring/8.png" width="60%" height="60%">
<img src="https://github.com/KyungHoAn/Study/blob/master/%EB%85%B8%ED%8A%B8%EC%A0%95%EB%A6%AC/%EC%BA%A1%EC%B3%90/spring/9.png" width="60%" height="60%">

### Code
```

```
#### 용어
* FQCN(Fully Qualified Class Name)
  - FQCN은 클래스가 속한 패기지명을 모두 포함한 이름
ex)
```
java.lang.String s = new java.lang.String();
```
- Sring Framework의 기본 Base는 BeanContainer이다.
- spring Framework에서 Bean을 하는 이유는 new에 대한 커플링관계를 떨어뜨리기 위해서 사용한다. (돈/시간 절약)
- 
