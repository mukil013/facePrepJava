package day11;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    CustomArrayList<Integer> list = new CustomArrayList<>();
    int n = in.nextInt();
    for (int i = 0; i < n; i++) {
      list.add(in.nextInt());
    }
    in.close();
    int index = in.nextInt();
    System.out.println(list.get(index));
  }
}


class CustomArrayList<T> {
  private Object[] array;
  private int size;

  public CustomArrayList() {
    array = new Object[10];
    size = 0;
  }

  public void add(T element) {
    if (size >= array.length) {
      resize();
    }
    array[size] = element;
    size++;
  }

  @SuppressWarnings("unchecked")
  public T get(int index) {
    if (index >= size || index < 0) {
      throw new IndexOutOfBoundsException();
    }
    return (T) array[index];
  }

  private void resize() {
    Object[] newArray = new Object[array.length * 2];
    for (int i = 0; i < array.length; i++) {
      newArray[i] = array[i];
    }
    array = newArray;
  }
}