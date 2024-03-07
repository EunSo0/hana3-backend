public class ex06 {
  public static void main(String[] args) {
    String str5 = "java";
    String str6 = "Web Programming is funny~";
    String str7 = "  Test Trim String  ";

    System.out.println(str6.indexOf("funny"));
    System.out.println(str6.toUpperCase());
    System.out.println(str6.toLowerCase());
    System.out.println(str5.concat(str6));
    System.out.println(str7.trim());
    System.out.println(str7.replace(" ", "*"));
    System.out.println(str6.toLowerCase().contains("web"));
    System.out.println(str6.split(" ")[0] + str6.split(" ")[3]);
  }
}
