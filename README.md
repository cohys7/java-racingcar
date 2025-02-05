# 자동차 경주 게임

## 진행 방법

* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정

* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 3단계 자동차 경주

### 기능 요구사항

- [x]  자동차 이름과 시도할 횟수를 입력받는다.
   - [x]  자동차 이름은 0 ~ 5글자 이다.
   - [x]  자동차 이름은 ,를 기준으로 구분한다.
   - [x]  입력 자동차 이름 만큼 자동차가 존재한다.
   - [x]  시도 횟수는 최소 1회이다.

- [x]  자동차는 이름과 위치를 가진다.
   - [x]  위치는 0보다 작을 수 없다.
- [x]  자동차는 전진하거나 멈출 수 있다.
- [x]  0~9 사이 랜덤 값을 구한다.
- [x]  랜덤 값이 4 이상이면 전진한다.

- [x]  자동차 경주 게임을 시작한다.
   - [x]  입력 받은 시도 횟수만큼 자동차를 움직인다.
   - [x]  매 회차 마다 자동차의 상태를 화면에 출력한다.

- [x]  게임이 끝난 후 우승자를 출력한다.
   - [x]  자동차의 위치가 가장 먼 차가 우승한다.
   - [x]  가장 먼 위치의 차가 여러 대일 경우 우승자는 여러 명이다.

```
자동차 대수는 몇 대 인가요?
3
시도할 회수는 몇 회 인가요?
5

실행 결과
-
-
-

--
-
--

---
--
---

----
---
----

----
----
-----
```

### 프로그래밍 요구사항

- [x]  모든 로직에 단위 테스트 구현, UI 로직 제외
   - [x]  핵심 로직과 UI 로직 분리
- [x]  자바 코드 컨벤션 지키기 ([Code Style. Java | IntelliJ IDEA](https://www.jetbrains.com/help/idea/code-style-java.html))
- [x]  else를 사용하지 않기, switch-case로 구현하지 않기
- [x]  README.md 에 구현할 기능 목록 정리하기
- [x]  git commit 단위는 정리한 기능 목록 단위로
- [x]  커밋 컨벤션 지키기
