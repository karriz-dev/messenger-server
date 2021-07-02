# messenger-server
[![Java CI with Maven & Jacoco](https://github.com/ldh1428a/messenger-server/actions/workflows/maven.yml/badge.svg)](https://github.com/ldh1428a/messenger-server/actions/workflows/maven.yml)
[![codecov](https://codecov.io/gh/ldh1428a/messenger-server/branch/master/graph/badge.svg?token=CRLG0LLUHJ)](https://codecov.io/gh/ldh1428a/messenger-server)
![License](https://img.shields.io/github/license/ldh1428a/messenger-server)
![GitHub last commit](https://img.shields.io/github/last-commit/ldh1428a/messenger-server)

심심해서 만들어보게 된 메신저 개인 프로젝트 입니다.<br>
모든 코드는 공개되어 있기 때문에 공부를 하고 싶은 학부생들이나 직장인 분들에게 좋은 자료가 되었으면 좋겠습니다.

## Stack
![Java](https://img.shields.io/badge/Java%2011-orange?style=for-the-badge&logo=java)
![Apache Tomcat](https://img.shields.io/badge/Apache%20Tomcat%209.0.48-red?style=for-the-badge&logo=apache-tomcat)
![Apache Kafka](https://img.shields.io/badge/Apache%20Kafka%202.7.1-black?style=for-the-badge&logo=apache-kafka)
![Elasticsearch](https://img.shields.io/badge/Elasticsearch-skyblue?style=for-the-badge&logo=elasticsearch)
![Junit 5](https://img.shields.io/badge/Junit%205-white?style=for-the-badge&logo=junit5)

+ Language
  - Java 11
+ WAS
  - Apache Tomcat 9.0.48
+ Messaging
  - Apache Kafka 2.1.7
+ DBMS
  - Elasticsearch DB
+ Test tool
  - Junit 5

## Architecture

## Installation

## Usage
### Github gpg sign commit
commit을 했을 때 verify된 내용이 있어야 머지 할 수 있도록 설정을 변경하기 위해서 등록함(설정 하지않으면 아무나 코드를 commit 할 수 있으니 반드시 설정)

1. win4gpg 설치하기
2. 자신의 gpg키 생성하기
3. Github Settings > SSH and GPG keys > new GPG key 클릭해서 자신의 gpg키 등록하기
4. egit 5.11 버전 이상 설치하기
5. gpg 키 전역 설정하기 
6. test commit 해보기 (정상적으로 동작하는지 확인)

