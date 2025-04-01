class C {
  int z1;
  int z28;
  int z29;
  int z26;
  int z3;
  long z9;
  long z23;
  long z35;
  int[] z38 = {2, -3, 2, -3, 0};
  int[] z4 = {2, -1, 2, -3, 1};
  int[] z36 = {0, 1, 2, 3, 0};
  static int z40;
  static int z10;
  static int z24;
  static int z15;
  static int z11;
  public C() {
    z1 = 9;
    z28 = 0;
    z29 = 0;
    z26 = 1;
    z3 = 2;
    z9 = 3L;
    z23 = 6L;
    z35 = 3L;
  }
  public void z5() {
    System.out.println("метод z5 в классе C");
    System.out.println(z29 << 2);
  }
  public void z27() {
    System.out.println("метод z27 в классе C");
    System.out.println((int)z23);
  }
  public void z25() {
    System.out.println("метод z25 в классе C");
    System.out.println(--z1);
  }
  public void z34() {
    System.out.println("метод z34 в классе C");
    System.out.println((int)z35);
  }
  public void z12() {
    System.out.println("метод z12 в классе C");
    System.out.println(z36[1] + z36[1]);
  }
  public void z8() {
    System.out.println("метод z8 в классе C");
    System.out.println(z3++);
  }
  public static void z2() {
    System.out.println("метод z2 в классе C");
    System.out.println(z15);
  }
  public static void z18() {
    System.out.println("метод z18 в классе C");
    System.out.println((z15 + 1));
  }
  public static void z20() {
    System.out.println("метод z20 в классе C");
    System.out.println(z11);
  }
  public static void z21() {
    System.out.println("метод z21 в классе C");
    System.out.println((z11 + 2));
  }
  public void z30(C r) {
    r.z5();
  }
  public void z30(B r) {
    r.z27();
  }
}
