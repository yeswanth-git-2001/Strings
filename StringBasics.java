public class StringBasics {
    public void display(){
        String str1 = "Yeswanth";
        System.out.println(str1);

        String str2 = new String("Gowthami");
        System.out.println(str2);

        //By default the strings are immutable => we cant change the strings or modify the strings
        //In strings there are two types : immutable(String class), mutable(StringBuilder, StringBuffer)

        String str3 = "bhanu";
        str3.concat("Chowdary");//In SCP chowdary string will be created
        System.out.println(str3); //Here only bhanu will be printed
        //In the above code after concatinating a new object will be created and you are not storing in any of the string varible\
        //The new object have any reference, garbage collector will remove from the heap area

        String str4 = str3.concat(" Chwodary");
        System.out.println(str4); //Here bhanu chowdary woill be printed
        //But here in the above code, you are catching the data in the variable of type string, then bhanu chowdary will be printed

        //If you want to make it mutable without createing a new object : use StringBuilder or StringBuffer
        StringBuilder ss1 = new StringBuilder("yeswanth");
        ss1.append(" Chowdary");
        System.out.println(ss1);

        String name1 = "yeswanth"; 
        String name2 = new String("yeswanth");
        System.out.println(name1 == name2); //In the case of operator it will check that, it was referrening to the same object
        System.out.println(name1.equals(name2));//In this case it will check the content of the object

        StringBuilder name3 = new StringBuilder("Yeswanth");
        StringBuilder name4 = new StringBuilder("Yeswanth");
        System.out.println(name3 == name4); //In case of stringbuilder equals to operator will check if it was referring to the same object
        System.out.println(name3.equals(name4));//In case of stringbuilder equals method will check if it was referring to the same object

        String name5 = new String("Yeswanth");
        //In the above line two object will be created in heap area : one is for working to the user in heap area and another one is created in the String constant pool
        //In string pool, the object dont have any reference, but still garbage collector wont remove the object from the SCP area.
        //The above cases will be applicable only when you created the string object using the new keyword.

        String name6 = "yeswanth";
        //The above string will directly go and creates in String Constant Pool and will have reference name6

        String name7 = new String("chandu");
        String name8 = new String("chandu");
        //Here in the above code, name7 object will create in heap area and stringconstantpool
        //Again name8 is created in the heap area, but in the stringconstantpool already one string is available with same name => in SCP duplicates are not allowed
        //But in heap area it will create the string object with the reference

        System.out.println(name7 == name8); //the equal to operator will check the references are pointing to the same object or not it will result in false, two references are pointing to two different objects

        String name9 = "chandu";
        String name10 = "chandu";
        System.out.println(name9 == name10);
        //Observe the above code already in string pool same string object name with chandu is created, in SCP duplicates are not allowed, so directly the name9 and name10 will referring to the SCP constant chandu
        //The above comparision will result in true
        //The object in the string pool will be remove after the JVM shutdown

        String name = new String("sachin"); //Direct string literal will be created in SCP and will be created in heap area for the user.
        name.concat("tendulkar"); //method call with strings will be happen at runtime, it will store in heap area, no one is pointing to this string, It will be removed using the garbage collector
        name = name.concat("IND");//method call will happen at runtime, the string sachin IND will be created in heap area and reference for this is name
        name = "sachin tendulkar"; //after the above line, only in string pool, it will check any name is there likes "sachin tendulkar" if not it will create and name will be pointing  the string "sachin tendulkar" the memory for "sachinIND will be deallocated"
        System.out.println(name);


        String s1=new String("you cannot change me!");//One string will create in string pool and another one in heap area
        String s2=new String("you cannot change me!");//here in SCP already one copy is there, duplicates are not allowed, so one copy in heap area will be created
        System.out.println(s1==s2); //s1 and s1 are referring to different objects, result in false

        String s3="you cannot change me!"; //Already one copy of this string is available in SCP, directly the s3 will be pointing to this string
        System.out.println(s1==s3);//s1 and s3 are pointing to different objects, output will be false.

        String s4="you cannot change me!"; //Already one copy of this string is available in SCP, directly the s4 will be pointing to this string
        System.out.println(s3==s4);//s4 and s3 are pointing to same objects in SCP, output will be true.

        String s5="you cannot " + "change me!";//These are direct literals, first "you cannot" string will be created in SCP and next "change me!" will be created and this will result in "you cannot change me!" => this was already present in SCP, it wont create one more time
        //s5 will directly will point to "you cannot change me!"
        System.out.println(s3==s5); //s5 and s3 are pointing to same objects in SCP, output will be true.

        String s6="you cannot ";//In SCP already this string is available, s6 will directly point to it
        String s7=s6+"change me!";//here variable was involved and JVM will perform the operation so, the string will be created in heap and new string will be created and s7 will point to the string in heap
        System.out.println(s3==s7);//s7 and s3 are pointing to different objects, output will be false.

        final String s8="you cannot "; //s8 will directly will point to the string already available in SCP
        String s9=s8+"change me!";//here variable of type final is involved, which means then compiler involvement will happen, s9 will result in "you cannot change me!" => this striing is already present in SCP, directly it will point to there
        System.out.println(s3==s9); //this will result in true
        System.out.println(s6==s8);//this will print true

        String s10 = new String("Chunchu");
        //this intern method will check in SCP area only
        String s11 = s10.intern(); //This method will give you the reference of the string that was available in SCP and both are referring to different objects
        System.out.println(s10 == s11);//this will result in false

        String s12 = "Chunchu";//here the string Chunchu already present in SCP and it will directly will point to that
        System.out.println(s12 == s11); //this will result in true because both are pointing to the same object in SCP "Chunchu"

        String s13 = new String("Chandrika");//In heap and SCP two copies will be created
        String s14 = s13.concat("chereddy");//In SCP "chereddy" will be created and method was involved so JVM will be involved and "Chandrika chereddy will be created" in heap
        //"Chandrika chereddy" string will be available only in heap area

        String s15 = s14.intern();//here I'm assigining the reference of s14, and intern method will check if the string is present in SCP or not, if not it will create the string and return the reference
        //To confirm that 
        String s16 = "Chandrikachereddy";//this was direct literal and will create directly in SCP and will directly point to the intern() method created string
        System.out.println(s15 == s16);//this will result in true 

        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
        String s17 = new String();//creates an empty string;
        String s18 = new String("Yeswanth chowdary chunchu");//creates a string in SCP and heap
        
        String s20 = s18.intern();
        String s19 = "Yeswanth chowdary chunchu";
        System.out.println("The s19 string will directly point to the s18 string which is created in SCP : " + (s19 == s20));

        char[] ch = {'a','b','c','d'};//creates a character array
        String s21 = new String(ch);//passing the character array to the string, then it will create a string in heap and the string pool, refer the below code for confirmation
        String s22 = s21.intern();
        String s23 = "abcd";
        System.out.println(s22 == s23);

        byte[] b = {65, 66, 67, 68, 69};//create a byte array
        String s24 =new String(b);//passing the byte array to the string and internally the ASCII value will be taken, refer the below code for confirmation
        String s25 = s24.intern();
        String s26 = "ABCDE";
        System.out.println(s25 == s26);

        String s27 = new String("Babu Gouda");
        char ch1 = s27.charAt(7);//this method will return the character at the index
        //If you try to use indexing like in arrays, it will throw an error
        System.out.println("character at index 6 : " + ch1);

        String s28 = new String("Dasharatha");
        int len = s28.length();//this will return the length of the string
        //length is property for arrays, you will get the length using this property
        //But the length() is method which you will get in case of strings
        System.out.println("Length of the string : " + len);

        String s29 = "chunchu";
        String s30 = "chunchu";
        System.out.println(s29 == s30);// == this will compare that, if both the references are referring to the same objcet

        String s31 = "Chunchu yash chowdary";
        String s32 = new String("Chunchu yash chowdary");
        System.out.println(s31.equals(s32));//equals metod will compare the content of the strings
        //incase of the equals method, if the string in the parameter of the equals method will check case also, which means if the string is exact match, whether it was uppercase or lowercase, it will return the true

        //if you want to ignore the case you can use the equalsIgnoreCase
        System.out.println(s32.equalsIgnoreCase("CHUNCHU YASH CHOWDARY"));//in this case it will ignore the case and return the boolean value true

        String s33 = "YeswanthChowdaryChunchu";
        System.out.println(s33.substring(16));//If you enter the strting index of the string you want, from there it will give the substring
        System.out.println(s33.substring(0, 16));//here you can mention the ending index also[here ending index - 1 ] will be printed
        

        String s34 = "yash";
        System.out.println(s34.replace('a', 'e'));//It can replace the old character with new character
        System.out.println(s34);
        //If old character is not present, iT will do nothing
        String s35 = "yashchunchu";
        System.out.println(s35.replace('c', 'h'));//It can change the multiple occurances of the old character
        System.out.println(s35);

        String s36 = "YeSwAnTh";//Here the string will be SCP
        System.out.println(s36.toLowerCase());//method invoked, which means, JVM will involved and a new string with all caps of s36 string will be created in heap
        System.out.println(s36.toUpperCase());//method invoked, which means, JVM will involved and a new string with all lower case of s36 string will be created in heap

        //Trim method will only remove the spaces before and after the string, if the space is in between the string, it wont be removed
        String s37 = "yeswanth chowdary";
        System.out.println(s37.length());
        System.out.println(s37.trim());
        System.out.println("----------------------------------------------------------------");
        String s38 = "     yeswanth chowdary     ";//A new string will be created after trimming and will be Heap because, method involvement is there
        System.out.println(s38.length());
        String s39 = s38.trim();
        System.out.println(s39.length());

        //indexOf() method
        String s41= "GowthamIChOwdary";
        System.out.println(s41.indexOf('o'));//will gives the index of the samaller o in string
        System.out.println(s41.indexOf('O'));//will gives the index of the capital O in string
        //If repititions are there, it will result in first occuring index of the string    
        //if you want the last index use onother method
        System.out.println(s41.lastIndexOf('a'));
        System.out.println(s41.indexOf('Z'));//if the character is not present, it will return the -1
      }

}