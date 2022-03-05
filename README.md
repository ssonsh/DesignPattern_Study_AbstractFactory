# DesignPattern_Study_AbstractFactory

# Notion Link
https://five-cosmos-fb9.notion.site/Abstract-Factory-c4223bdd3bc64f4883164958c997dd94


# 추상 팩토리 (Abstract Factory)

### 팩토리/팩토리 메서드 패턴 → Object를 생성하기 위한 패턴

![image](https://user-images.githubusercontent.com/18654358/156861123-8b658495-8d26-4957-bf0f-0e0d20a80cf4.png)

비슷한 속성의 객체들을 인터페이스로 규격화된 팩토리에서 일관된 방식으로 생성하고,

생성된 객체끼리는 쉽게 교체될 수 있도록 고안한 패턴이다.

추상팩토리 패턴은 상세화된 서브클래스를 정의하지 않고도

서로 관련성이 있거나 독립적인 여러 객체의 군을 생성하기 위한 인터페이스를 제공한다.

### 추상 팩토리 패턴은?

*`**메트릭스 관계**를 가진 Class Object 들을 생성할 때 유용하다.`*
![image](https://user-images.githubusercontent.com/18654358/156861136-b694fa3c-c5c4-4708-a8ac-776e7810529d.png)


<aside>
💡 Factory Method Pattern 은 일반적인 Class 정의안에 상속이 가능한 
Factory Method 만 추가시킨 것

</aside>

<aside>
💡 Abstract Factory Pattern 은 Factory 의 목적을 가진 Class를 추상화 시킨 것

</aside>

→ 디자인패턴이 그러하듯 명확히 나누는 것은 의미가 없다.

→ 이러한 패턴이 있구나 정도 기억하고 요구사항에 맞춰 적절히 섞어 써도 상관없는 것 🙂

---

### 다시한번 살펴보는 `추상 팩토리` 패턴과 `팩토리 메소드` 패턴

**공통점**

1. Template Method Pattern 사용
2. Factory 클래스를 사용하여 생성
3. Factory Method Pattern을 사용
    1. 둘다 추상 클래스와 Factory를 통해 실제 구현 대상인 Concreate와 Client간 결합도를 낮춘다.
    2. 인자에 따라 생성되는 객체가 결정된다.
    3. 추상 팩토리 패턴은 Factory Method Pattern을 사용한다.
4. 객체 생성의 캡슐화
5. 구상 클래스가 아닌, 추상 클래스와 인터페이스에 맞춰 코딩 할 수 있다.

**차이점**

1. Factory 클래스에서 객체에 대한 생성을 지원하는 범위
    1. 팩토리 메소드 패턴
        1. 한 팩토리당 한 종류 (create 메서드가 Factory 클래스에 1개)
        2. 한 개의 메서드로 여러 개의 객체를 만듦
    2. 추상 팩토리 패턴
        1. 한 팩토리에서 서로 연관된 여러 종류 모두 지원 (create() 메서드가 팩토리 클래스에 여러개)
        2. 구상 클래스에 의존하지 않고 여러 개의 관련된 객체를 하나의 팩토리로 묶음
2. **팩토리 메서드에서 만드는 객체의 종류**
    1. 팩토리 메소드 패턴의 팩토리 메소드
        1. ***인자에 따라 객체의 종류가 결정 됨***
    2. 추상 팩토리 패턴의 팩토리 메소드
        1. ***인자에 따라 관련된 객체들을 생성하는 팩토리의 종류가 결정 됨.***
3. 결합도를 낮추는 대상
    1. 팩토리 메소드 패턴
        1. ConcreateProduct와 Client간의 결합도를 낮춤
    2. 추상 팩토리 패턴
        1. ConcreateFactory와 Client간으 ㅣ결합도를 낮춤
4. 포커스
    1. 팩토리 메서드 패턴
        1. 메서드(Factory Method) 레벨에서 포커스를 맞춤
        2. Client의 ConcreateProduct 인스턴스 생성 및 구성에 대한 책임을 덜어줌
    2. 추상 팩토리 패턴
        1. 클래스(Abstract Factory) 레벨에서 포커스를 맞춤
        2. 각 Product들이 다른 클래스와 함께 사용될 때의 제약사항을 강제할 수 있다.
        3. 단 새로운 COncreateFactory를 추가할 때 많은 작업이 필요하다.
5. 메서드와 오브젝트
    1. 팩토리 메서드는 단일 Method
    2. 추상 팩토리는 Object
6. **Inheritance(상속), Composition(구성)**
    1. 팩토리 메서드 패턴
        1. 상속을 사용해 객체의 인스턴스 생성에 대해서는 서브클래스에 의존
        2. 지역 레퍼런스 없이 바로 하위 클래스의 함수를 호출하여 객체를 만듦
    2. 추상 팩토리 패턴
        1. 지역 레퍼런스를 두어, 외부로부터 Factory 객체를 DI 받아서 위임.

---

### 의도

상세화된 서브클래스를 정의하지 않고도 서로 관련성이 있거나 독립적인 여러 객체의 군을 생성하기 위한 인터페이스를 제공한다.

<aside>
💡 다른이름 : 키트 (Kit)

</aside>

### 동기

모티프와 프리젠테이션 매니저와 같은 사용자 인터페이스 툴킷을 살펴보면,

**`서로 다른 룩앤필 표준을 가지고 있다.`**

**`서로 다른 룩앤필은 서로 다른 사용자 인터페이스의 표현 방식과 행동을 갖는다.`**

스크롤바, 윈도우 버튼은 모양이 다르고 동작 방식도 서로 다르다.

개발한 응용프로그램이 서로 다른 룩앤필 표준에 상관없이 이식성을 가지려면, 응용프로그램이 각 사용자 인터페이스 툴킷에서 **`제공하는 위젯을 직접 사용하지 못하도록 해야 한다.`**

<aside>
💡 이러한 문제에서 구체적 사용자 인터페이스의 위젯을 사용하지 말고
추상 클래스인 WidgetFactory를 정의하여 해결하는 것이 좋다.

</aside>

WidgetFactory 클래스는 위젯의 기본 사용자 인터페이스 요소(윈도우, 스크롤바, 버튼 등)을 생성할 수 있는 인터페이스를 정의한다. 그리고 응용프로그램은 필요한 사용자 인터페이스 요소를 WidgetFactory에 생성해 줄 것을 요청하여 필요한 요소의 인터페이스를 얻어온다. 

![image](https://user-images.githubusercontent.com/18654358/156861157-45a40c4a-ee54-4f63-aa61-92ad012bbc21.png)

### 활용성

추상 팩토리는 다음의 경우에 사용한다.

- 객체가 생성되거나 구성/표현되는 방식과 무관하게 시스템을 독립적으로 만들고자 할 때
- `여러 제품군 중 하나를 선택해서 시스템을 설정해야 하고 한번 구성한 제품을 다른 것으로 대체할 수 있을 때`
- 관련된 제품 객체들이 함께 사용되도록 설계되었고, 이 부분에 대한 제약이 외부에도 지켜지도록 하고 싶을 때
- 제품에 대한 클래스 라이브러리를 제공하고, 그들의 구현이 아닌 인터페이스를 노출시키고 싶을 때

### 구조

![image](https://user-images.githubusercontent.com/18654358/156861169-e36130cf-2fcf-4fd1-951d-098e5591a958.png)

### 참여자

**AbstractFactory**

- 개념적 제품에 대한 객체를 생성하는 연산으로 인터페이스를 제공한다.

**ConcreateFactory**

- 구체적인 제품에 대한 객체를 생성하는 연산을 구현한다.

**AbstractProduct**

- 개념적 제품 객체에 대한 인터페이스를 정의한다.

**CreateProduct**

- 구체적으로 팩토리가 생성할 객체를 정의하고
- AbstractProduct가 정의하는 인터페이스를 구현한다.

### 협력방법

- 일반적으로 ConcreateFactory 클래스의 인스턴스 한 개가 런타임에 만들어진다.
    - 이 구체 팩토리는 어떤 특정 구현을 갖는 제품 객체를 생성한다.
    - 서로 다른 제품 객체를 생성하려면 사용자는 서로 다른 구체 팩토리를 사용해야 한다.
- AbstractFactory는 필요한 제품 객체를 생성하는 책임을 ConcreateFactory 서브 클래스에 위임한다.

### 결과

**구체적인 클래스를 분리한다.**

- 추상 팩토리 패턴을 쓰면 응용 프로그램이 생성할 객체의 클래스를 제어할 수 있다.
- **`팩토리는 제품 객체를 생성하는 과정과 책임을 캡슐화한 것이기 때문에`**
- 구체적인 구현 클래스가 사용자에게서 분리된다.

**`제품군을 쉽게 대체할 수 있도록 한다.`**

- 구체 팩토리의 클래스는 응용 프로그램에서 한 번만 나타나기 때문에 응용 프로그램이 사용할 구체 팩토리를 변경하기는 쉽다.
- 또한, 구체 팩토리를 변경함으로써 응용 프로그램은 서로 다른 제품을 사용할 수 있게 변경된다.

**제품 사이의 일관성을 증진시킨다.**

- 하나의 군 안에 속한 제품 객체들이 함께 동작하도록 설계되어 있을 때
- 응용 프로그램은 한 번에 오직 한 군에서 만든 개체를 사용하도록 함으로써 프로그램의 일관성을 갖도록 해야한다.
- 추상 팩토리를 쓰면 이 점을 쉽게 보장받을 수 있다.

`**새로운 종류의 제품을 제공하기 어렵다.**`

- 새로운 종류의 제품을 만들기 위해 기존 추상 팩토리를 확장하기 쉽지 않다.
- **`생성되는 제품은 추상 팩토리가 생성할 수 있는 제품 집합에만 고정되어 있기 떄문이다.`**
- 만약 새로운 종류의 제품이 등장하면 팩토리의 구현을 변경해야 한다.
- 이는 추상 팩토리와 모든 서브 클래스의 변경을 가져오게 된다.

---

---

### 추상팩토리 생성 패턴을 이용한 예제

LOL에는 사용자가 이용할 수 있는 챔피언이 156개가 존재한다. 

156개의 챔피언은 아래의 기본적인 구조를 공통적으로 가지고 있다.

- 챔피언은 기본적으로 Q, W, E, R 4가지 스킬을 가지고 있다.
- 챔피언은 하나의 기본 패시브와 하나의 특정 패시브를 가지고 있다.


![image](https://user-images.githubusercontent.com/18654358/156861184-c42928aa-0468-496f-9a33-60903832722d.png)



**ChampionFactory**

- Champion을 생성할 때 필요한 Skill(), Passive() 를 정의하도록 한다.

```java
package factory;

import passive.Passive;
import skill.Skill;

public interface ChampionFactory {
    Skill skill();
    Passive passive();
}
```

**Skill**

- 스킬을 구성하는 인터페이스

```java
package skill;

public interface Skill {

    String Q();
    String W();
    String E();
    String R();
}
```

**Passive**

- 패시브를 구성하는 인터페이스

```java
package passive;

public interface Passive {

    String defaultPassive();
    String specificPassive();

}
```

**각 Champion별 Skill과 Passive 정의**

- **ZinxSkill** *implements Skill*, **ZileanSkill i**mplements Skill

```java
package champion.zinx;

import skill.Skill;

public class ZinxSkill implements Skill {
    @Override
    public String Q() {
        return "Zinx Q";
    }

    @Override
    public String W() {
        return "Zinx W";
    }

    @Override
    public String E() {
        return "Zinx E";
    }

    @Override
    public String R() {
        return "Zinx R";
    }
}
```

```java
package champion.zilean;

import skill.Skill;

public class ZileanSkill implements Skill {
    @Override
    public String Q() {
        return "Zilean Q";
    }

    @Override
    public String W() {
        return "Zilean W";
    }

    @Override
    public String E() {
        return "Zilean E";
    }

    @Override
    public String R() {
        return "Zilean R";
    }
}
```

**각 Champion 별 Factory 생성 - ZinxFactory, ZileanFactory, .... (156개의 챔피언 Factory들?!)**

```java
package champion.zinx;

import factory.ChampionFactory;
import passive.Passive;
import skill.Skill;

public class ZinxFactory implements ChampionFactory {

    @Override
    public Skill skill() {
        return new ZinxSkill();
    }

    @Override
    public Passive passive() {
        return new ZinxPassive();
    }
}

//////////////////////////////////////////////////////////////////////

package champion.zilean;

import factory.ChampionFactory;
import passive.Passive;
import skill.Skill;

public class ZileanFactory implements ChampionFactory {

    @Override
    public Skill skill() {
        return new ZileanSkill();
    }

    @Override
    public Passive passive() {
        return new ZileanPassive();
    }
}
```

추가적인 enum 클래스와 Type에 따른 팩토리 처리를 위한 코드

[Champion.java](http://Champion.java) (enum)

```java
package champion;

public enum Champion {
    ZINX,
    ZILEAN
}
```

Factory.java

```java
package champion;

import factory.ChampionFactory;
import champion.zilean.ZileanFactory;
import champion.zinx.ZinxFactory;

public class Factory {
    ChampionFactory championFactory;

    public Factory(Champion type){
        switch (type){
            case ZINX :
                championFactory = new ZinxFactory();
                break;
            case ZILEAN:
                championFactory = new ZileanFactory();
                break;
        }
    }

    public ChampionFactory get(){
        return this.championFactory;
    }
}
```

### 테스트

```java
public class Main {

  public static void main(String[] args) {

      for (Champion type : Champion.values()) {
          Factory factory = new Factory(type);
          ChampionFactory championFactory = factory.get();

          Skill skill = championFactory.skill();
          Passive passive = championFactory.passive();

          System.out.println("skill q : " + skill.Q());
          System.out.println("skill w : " + skill.W());
          System.out.println("skill e : " + skill.E());
          System.out.println("skill r : " + skill.R());

          System.out.println("passive default : " + passive.defaultPassive());
          System.out.println("passive specific : " + passive.specificPassive());
      }
  }
}
```

```java
skill q : Zinx Q
skill w : Zinx W
skill e : Zinx E
skill r : Zinx R
passive default : Zinx Default Passive
passive specific : Zinx Specific Passive
skill q : Zilean Q
skill w : Zilean W
skill e : Zilean E
skill r : Zilean R
passive default : Zilean Default Passive
passive specific : Zilean Specific Passive
```

---

제품군을 쉽게 대체할 수 있도록 해주는 것과 제품 사이의 일관성을 증진시켜주는 장점에 대해 큰 메리트를 느낀다!

- 잘 활용한다면 사용과 구현을 명확히 분리하여 다양한 형태의 제품을 제공해낼 수 있을 것 같다.

어느 정도 명확히 정의되어 다양한 타입들로 제공하여 서비스하는 모델에 대해서는 효율적으로 활용해낼 수 있을 것 같다. 

그러나 단점으로 확인할 수 있는 부분인 **“새로운 종류의 제품을 제공하기 어렵다”** 라는 측면에서는 

제한적인 부분이 있을 것 같다. 

**정말 활용할 수 있는 요소에 대해 명확화 하고 사용해야 할 것 같다.**

- 이게 또 이렇게도 바뀌고 추가될 수 있잖아요? 라는 여지가 있다면 활용성이 낮아질 것 같다.
