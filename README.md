# java-lotto-precourse


## ⚙ 프로그램 기술️

- JDK 21
- Code Convention: [Java Style Guide](https://github.com/woowacourse/woowacourse-docs/tree/main/styleguide/java)
- gradle
- JUnit 5, AssertJ

## 🛠️ 기능 목록 단위

### 🧑‍💻 사용자
> - 구입 금액을 입력한다.    
  >  - 로또 가격 단위로 구입한다.
> - 당첨 번호 추첨 시 중복되지 않는 숫자 6개와 보너스 번호 1개를 뽑는다.
  >  - 당첨 번호를 입력 받는다. 번호는 쉼표(,)를 기준으로 구분한다.


### 💵 로또 발매기

> - 로또 번호의 숫자 범위는 1~45까지이다.
> - 1개의 로또를 발행할 때 중복되지 않는 6개의 숫자를 뽑는다.
> - 로또 구입 금액에 해당하는 만큼 로또를 발행해야 한다.
  >  - 로또 1장의 가격은 1,000원이다.
> - 당첨은 1등부터 5등까지 있다. 당첨 기준과 금액은 아래와 같다.
  >  - 1등: 6개 번호 일치 / 2,000,000,000원
  >  - 2등: 5개 번호 + 보너스 번호 일치 / 30,000,000원
  >  - 3등: 5개 번호 일치 / 1,500,000원
  >  - 4등: 4개 번호 일치 / 50,000원
  >  -  5등: 3개 번호 일치 / 5,000원
> - 사용자가 구매한 로또 번호와 당첨 번호를 비교하여 당첨 내역 및 수익률을 출력하고 로또 게임을 종료한다.
  >  - 수익률은 소수점 둘째 자리에서 반올림한다.

### ⛔️ 예외사항

사용자가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생시키고, "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.

**로또**
> - 로또 가격 단위(1,000)로 구입하지 않을 경우 예외가 발생한다.
> - 로또 구매 가격이 10만원을 초과할 시 예외가 발생한다.
> - 당첨 번호와 보너스 번호가 로또 숫자 범위가 아닌 경우 예외가 발생한다.
> - 당첨 번호들 중 숫자가 중복되면 예외가 발생한다.
> - 당첨 번호를 쉼표로 구분하지 않을 경우 예외가 발생한다.
> - 그 외 숫자를 입력해야 할 시 숫자가 아닌 다른 문자를 입력하면 예외가 발생한다.

## 📌 커밋 규칙

>- [AngularJS Git Commit Message Conventions](https://gist.github.com/stephenparish/9941e89d80e2bc58a153#allowed-type)을 참고한다.
>- 형식 : Type(Scope): Subject
>
> Type
> - feat (기능 구현)
> - fix (버그 수정)
> - docs (문서화)
> - style (포맷팅, 형식 수정)
> - refactor (리팩터링)
> - test (테스트 작성)
> - chore (그 외 설정)
> 
> Scope
> - 클래스(.class) 혹은 객체의 큰 범위로 작성한다.
> 
> Subject
> - 현재형과 명령어로 내용을 작성한다.