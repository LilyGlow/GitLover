package javacake.isaid.javajustdoit.javanica;

import java.util.Scanner;

public class Javanica { //

  private String talk;
  int i,j,q;
  int Javanica_calc( ){
      System.out.println("Я учусь считать, введи число:");
      Scanner jnc_scan=new Scanner(System.in);
      i = jnc_scan.nextInt();
      System.out.println("И еще одно:");
      j = jnc_scan.nextInt();
      q=i+j;
      System.out.println("Сумма "+ q);
      return q;
  }


  Javanica (String talk){
      this.talk = talk;
  }

  public static void main(String[] args){
      Javanica jtalking=new Javanica("Привет, я Javanica, электрическая сущность типа java, а ты кто?");
     //  Calc_kkal msg_kkal=new Calc_kkal();
      //создание объекта
     // talking.setTalk("Wtf");
      Scanner javanica_scan= new Scanner(System.in); //создание объекта класса сканер, в него я буду говорить Джаванике что делать
      // Scanner scan - это я создала объект с названием scan класса Scanner (встроенный библиотечный класс с кучей медотов
      //new Scanner - это я сказала яве что объект новый, принадлежит к классу Scanner библиотеки java util, и входной аргумнт у него
      // является - System.in
      String[] talkmore={"Приятно познакомиться, ","Сегодня отличный день для кенгуру","Вот и массивы пошли, не коллекции конечно, но все же"};
      System.out.println(jtalking.getTalk());
      System.out.println("Я ");
      String isaid = javanica_scan.nextLine();// создание переменной, типа стринг
      //в нее будет происходить считывание с помощью метода новосозданного сканера
switch (isaid) {
    case "Ivan":
        System.out.println(talkmore[2]+isaid);
        break;
        default:
        System.out.println(talkmore[0] + isaid);      //объявление переменной и присваивание ей результата
        System.out.println(talkmore[1]);
        // вызова метода getTalk объекта talking класса Javanica
        //    System.out.println(msg_kkal);
    }

    class Vnezapno{
    public void main(String[] args) {
        Javanica summiruet = new Javanica("И еще кое что");
        System.out.println(summiruet.Javanica_calc());

    }
    }
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
