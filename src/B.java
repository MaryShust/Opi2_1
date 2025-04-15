class B extends C {
  public B() {

    z28 = 92;
    z3 = 42;
    z35 = 12L;

  }
  
  public void z27() {
    System.out.println("метод z27 в классе B");
    System.out.println(z1++);
  }
  
  public void z25() {
    System.out.println("метод z25 в классе B");
    System.out.println(z28 >> 1);
  }
  
  public void z34() {
    System.out.println("метод z34 в классе B");
    System.out.println(z1 + 1);
  }
  
  public void z12() {
    System.out.println("метод z12 в классе B");
    System.out.println(z1 >> 2);
  }
  
  public void z8() {
    System.out.println("метод z8 в классе B");
    System.out.println(z4[1]);
  }
  
  public static void z2() {
    System.out.println("метод z2 в классе B");
    System.out.println(z10);
  }
  
  public static void z18() {
    System.out.println("метод z18 в классе B");
    System.out.println((z10 - 4));
  }
  
  public static void z20() {
    System.out.println("метод z20 в классе B");
    System.out.println(z10);
  }
  
  public static void z21() {
    System.out.println("метод z21 в классе B");
    System.out.println((z10 + 2));
  }
  
  public void z30(C r) {
    r.z25();
  }
  
  public void z30(B r) {
    r.z34();
  }
}
