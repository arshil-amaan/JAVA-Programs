public class string_builder {
  public static void main(String[] args) {
    StringBuilder str = new StringBuilder("Arshil");
    System.out.println("Original Str : "+str);

    // str1.append(str2) returns str1+str2
    str.append("Amaan");
    System.out.println("str.append(\"Amaan\") : "+str);
    
    // str1.insert(index,str2) returns str2 inserted at index of str1
    str.insert(2,"code");
    System.out.println("str.insert(2,\"code\") : "+str);

    // str.delete(idx1,idx2) deletes string from idx1 to idx2-1
    str.delete(1,3);
    System.out.println("str.delete(1,3) : "+str);

    // str1.replace(idx1,idx2,str2) replaces from str1's idx1 to idx2-1 with str2
    str.replace(2,4,"Ansari");
    System.out.println("str.replace(2,4,\"Ansari\") : "+str);

    // str.reverse() returns str1 but in reverse
    str.reverse();
    System.out.println("str.reverse() : "+str);
    
  }
}
