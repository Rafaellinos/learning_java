package org.example;

public interface DoesItCompile {
  // A
//  public abstract final int swim(); // final doesnt make sense in this context

  // B
 public abstract void swim(); // compile!

  // C
//  public abstract swim(); // doesnt compile, missing return type

  // D
//  public abstract void swim(){} // doesnt compile, brackets on the end doesnt work

  //E
//  public void swim() {}  // doesnt compile, brackets on the end doesnt work
}
