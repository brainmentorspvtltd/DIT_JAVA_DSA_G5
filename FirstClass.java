// Java Class Name and File Name in PascalCase
// Java is OOPS
// So Every Java Program start with class
// Recommened Way is FileName and className is same.
// class FirstClass{

// }
// If we give different ClassName and Different file Name
// If className is public so fileName must be match with className ,otherwise code wouldn't compile.
// Ctrl + S to Save a Code
// To Compile a Code 
// javac <FileName>.java
// After Compile the Byte Code will be generated , the Byte Code is always with a className.
// To Run the Code , we need java <ByteCodeFileName> with out .class extension

class SecondClass{
    /*
     * main is the entry point of Java Program
     * main is a method
     * main has special signature
     * void is a keyword, nothing to return 
     * public is also a keyword, this tells main scope can be outside the package (Folder)
     * So Jre can access your main during the execution 
     * static is also a keyword , this tells main will be loaded in the memory during the class load time
     * so static things willbe loaded with the class , whenever class loading is happens
     * when u run a java program so it do the class loading and static things will be load during class load.
        String args[] is a command line arguments 
        String is a predefine class in a Java.
        String is a collection of chars
        args is just a argument name it can be anything
        because arguments can be N , that's why it an array . [] is the box syntax (Array Syntax)

     */
   public static void main(String args[]){
      // to print on console in Java we call a print function
      // print function is call by using out object
      // out object is belongs to PrintStream class
      // System is a class which creates object of out , in ,err
      // all these object (in , out , err ) are defined static
      // that's why they call with a class name
         //System.out.print("Hello Java");
         // print function print in a same line it not add any new line \n character
         //System.out.println("Hello Java ");
         // println - print with new line
         System.out.println("*");
         System.out.println("*");
         System.out.println("*");
         System.out.println("*");
         System.out.println("*");
         System.out.print("* ");
         System.out.print("* ");
         System.out.print("* ");
         System.out.print("* ");
         System.out.print("* ");
      }
}