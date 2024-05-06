public class StringBasics{
    public void display(){
        String str1 = "Yeswanth";
        System.out.println(str1);

        String str2 = new String("Gowthami");
        System.out.println(str2);

        //By default the strings are immutable => we cant change the strings or modify the strings
        //In strings there are two types : immutable(String class), mutable(StringBuilder, StringBuffer)

        String str3 = "bhanu";
        str3.concat("Chowdary");
        System.out.println(str3); //Here only bhanu will be printed
        //In the above code after concatinating a new object will be created and you are not storing in any of the string varible\
        //The new object have any reference, garbage collector will remove from the heap area

        String str4 = str3.concat(" Chwodary");
        System.out.println(str4); //Here bhanu chowdary woill be printed
        //But here in the above code, you are catching the data in the variable of type string, then bhanu chowdary will be printed

        //If you want to make it mutable without createing a new object : use StringBuilder or StringBuffer
        StringBuilder s1 = new StringBuilder("yeswanth");
        s1.append(" Chowdary");
        System.out.println(s1);

        String name1 = "yeswanth";
        String name2 = new String("yeswanth");
        System.out.println(name1 == name2); //In the case of operator it will check that, it was referrening to the same object
        System.out.println(name1.equals(name2));//In this case it will check the content of the object

        StringBuilder name3 = new StringBuilder("Yeswanth");
        StringBuilder name4 = new StringBuilder("Yeswanth");
        System.out.println(name3 == name4); //In case of stringbuilder it will check if it was referring to the same object
        System.out.println(name3.equals(name4));//In case of stringbuilder equals method will check if it was referring to the same object

        String name5 = new String("Yeswanth");
        //In the above line two object will be created in heap area : one is for working to the user in heap area and another one is created in the String constant pool
        //In string pool, the object dont have any reference, but still garbage collector wont remove the object from the SCP area.
        //The above cases will be applicable only when you created the string object using the new keyword.

        String name6 = "yeswanth";
        //The above string will directly go and creates in String Constant Pool and will have reference name6

    }
}