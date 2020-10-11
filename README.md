# parking-app  [주차장위치기억서비스](http://ec2-15-165-139-110.ap-northeast-2.compute.amazonaws.com:8080/?no=3)
주차장앱만들기

> 제가 살고있는 아파트는 지하 복층 주차장입니다.부모님께서 차를 몇 층에 주차했었는지 항상 잊어버리십니다.사실상 7개 층이며, 모바일로 쉽고 빠르고 직관적으로 마지막 주차 위치를 기록하고 찾아볼 수 있도록 만들고자 했습니다.

- domain 은 받지않았지만 aws 를 이용해서 실제 이용가능한 홈페이지를 만들었습니다

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

 - jquery 의 ajax 를 사용하면서 비동기는 어떤 코드에 어떤 식으로 동작하는 지 이해했습니다
 - spring-jpa 를 처음 사용했던 프로젝트입니다.
 - 날쿼리를 사용하지않는 수준으로 jpa 의 장점을 익혔습니다.
 - 간단한 기능이고, 프리티어의 AWS라 별도 비용도 지불하지는 않고 있지만,  실제 서비스를 제공한 첫번째 프로젝트였습니다.
