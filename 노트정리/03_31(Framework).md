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

### eclipse Git 사용법
1. help에서 Eclipse Marketplaec 클릭
2. git 검색 후 EGit - Git Integration for Eclipse 인스톨럴 되어있는지 확인
3. open Perpective 에서 Git 클릭 후 Git Repositories 생겼는지 확인
4. (test file)생성 New Dynamic web Project 생성
5. (Project Name)  z.studyGit 생성
6. 만든 project 오른쪽 클릭 -> Team -> Share Project
7. Share Project -> Create 클릭 -> master 브랜치 생성
8. javaEE클릭후 project 이름 옆에 master branch 생성되었는지 확인
9. Git Repositories 에서 Working Tree 밑 z.studyGit 생성 확인
10. 탐색기 workspace에 git project 생성 안되있는거 확인 -> 탐색기 사용자 -> git -> 01First(Create a Git Repository 에서 만든 이름) -> z.sudyGit파일 확인
11. 
