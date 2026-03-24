package com.lannstark.lec08;

public class Lec08Main {

  public static void main(String[] args) {

  }

  //타입...을 쓰면 가변인자(배열을 넣거나 여려개의 문자열을 넣을 수 있음)
  public static void printAll(String... strings) {
    for (String str : strings) {
      System.out.println(str);
    }
  }

}
