public class Main
{
  public static void main(String[] args)
  {
     //lastFirstN("Chrysanthemum", "Primrose", 5);
     //stringManip("jizan", "chunAENG");
     removeStr("Strawberry","awber");
  }

  /** Precondition: s1 and s2 are not null
  * Precondition: 0 <= n <= min(s1.length(), s2.length()
  */
  public static void lastFirstN(String s1, String s2, int n)
  {
    System.out.println(s1.substring(s1.length() - n) + s2.substring(0, n));
  }

  /** Precondition: s1 and s2 are not null
  */
  public static void stringManip(String s1, String s2)
  {
    System.out.println((s1.toUpperCase() ) + ( (s2.substring(0, 1)).toUpperCase() ) + ( (s2.substring(1)).toLowerCase() ));
  }

  /** Precondition: s1 and s2 are not null
  * Precondition: s2 is a substring of s1 and can be found at least one time in s1
  */
  public static void removeStr(String s1, String s2)
  {
    System.out.println(s1.substring(0, s1.indexOf(s2)) + s1.substring(s1.indexOf(s2) + s2.length() ));
  }
}
