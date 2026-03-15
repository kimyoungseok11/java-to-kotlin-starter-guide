package com.lannstark.lec02;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Person {

  private final String name;

  public Person(String name) {
    this.name = name;
  }

  /**
   * 코틀린에서 자바 기반의 메소드 등을 사용할 경우
   * null 관련 정보가 중요(Nullable, NotNull)
   * null 관련 어노테이션이 없다면 일단 null을 혀용(플랫폼 타입)
   * null이 파라미터로 전달될 경우 런타임 환경에서 npe 반환
   * @return
   */
  public String getName() {
    return name;
  }

}


