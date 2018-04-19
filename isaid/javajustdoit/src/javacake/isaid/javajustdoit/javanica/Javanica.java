package javacake.isaid.javajustdoit.javanica;

import java.util.Scanner;

public class Javanica { //

  private String talk;
  int i;

  Javanica (String talk){
      this.talk = talk;
  }

  public static void main(String[] args){
      Javanica jtalking=new Javanica("Привет, я Javanica, электрическая сущность типа java, а ты кто?");
      //создание объекта
     // talking.setTalk("Wtf");
      Scanner javanica_scan= new Scanner(System.in); //создание объекта класса сканер, в него я буду говорить Джаванике что делать
      // Scanner scan - это я создала объект с названием scan класса Scanner (встроенный библиотечный класс с кучей медотов
      //new Scanner - это я сказала яве что объект новый, принадлежит к классу Scanner библиотеки java util, и входной аргумнт у него
      // является - System.in
      System.out.println(jtalking.getTalk());
      System.out.println("Я ");
      String isaid = javanica_scan.nextLine();// создание переменной, типа стринг
      //в нее будет происходить считывание с помощью метода новосозданного сканера

      System.out.println("Приятно познакомиться, "+isaid);      //объявление переменной и присваивание ей результата
      // вызова метода getTalk объекта talking класса Javanica

  }


    public void setTalk(String talk) {
        this.talk = talk;
    }

    public String getTalk() {
     // talk = "Hello,im Javanika";
     // System.out.println(talk);
      return talk;
  }

  // добавить метод, который запишет в переменную talk передаваемое значение (параметр) и
    // удаляет из середины этого параметра все строки 'la'

}
