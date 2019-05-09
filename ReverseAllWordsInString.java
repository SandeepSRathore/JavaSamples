public class Main {
    public static void main(String[] args) {

      String str = "this is java";
      String[] arr = str.split(" ");
      String temp1 = "";
      for (int i = 0; i < arr.length; i++) {
      String temp = arr[i];
      //System.out.println(temp.substring(0,1).toUpperCase() + temp.substring(1));
      String temp2 = "";
      for (int j = temp.length() - 1; j >= 0; j--) {
      temp2 += temp.charAt(j);
    }

    temp1 += temp2 + " ";
    }

    System.out.println(temp1);

    }
}
