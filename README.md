# parking-app
주차장앱만들기

[주차장위치기억서비스](http://ec2-15-165-139-110.ap-northeast-2.compute.amazonaws.com:8080/?no=3)
- domain 은 받지않았지만 aws 를 이용해서 실제 이용가능한 홈페이지를 만들었습니다

> 저희 아파트 지하 주차장은 복합 주차장이라 층수가 많습니다. 그래서 저희 부모님께서 이전에 차를 몇 층에 주차하셨는지 자주 까먹으셔서 만든 모바일 웹입니다. 

# 기술스택
 - JDK 11
 - springboot 2.2.7
 - spring data jpa
 - javascript
 - jquery
 - JUnit 5

# 목표
 - 정상적으로 작동해야합니다.
 - 사용하기 편리해야합니다.
 - jquery, ajax, javascript 가 익숙해져야합니다
 
 # Front
 - HTML
 - Jquery (비동기로 처리)
 빠르고 간단하게 만드는 용이라 꾸미지않았습니다. 
 
 # 핵심 기능
 
 ![주차](https://user-images.githubusercontent.com/45488643/85920403-69f97d80-b8ae-11ea-982e-415bdd1fea73.gif)


# 회고

- jquery 의 ajax 를 사용하면서 비동기는 어떤 코드에 어떤 식으로 동작하는 지 이해했다.
- spring-jpa 에 대해 아직 개념이 확실하게 잡혀있는 상태로 시작한 것이 아니라서 초반엔 많이 해맸지만 빠르게 자리잡고 코트중심사고로 코드를 짜는 것이 무엇인지 알 수 있었다
- jpa 와 lombok 처럼 framework 를 사용하니 쿼리 시간과 중복되는 코드가 많이 줄어서 관리하기 더 쉬웠다
- 무료 버전 aws 를 사용했지만 인스턴스를 받아 내가 만든 프로젝트를 다른 사람들이 사용하니 마치 실제 서비스를 운영한 것 같은 기분이 들었다.
