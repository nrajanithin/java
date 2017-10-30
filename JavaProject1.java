import java.util.Scanner;
import java.io.*;
class Third
{
    Third()
    {
        String un,pwd;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the username");
        un=sc.next();
        System.out.println("enter the password");
        pwd=sc.next();
        if((un.equals("160030959")&&pwd.equals("rajanithin"))||(un.equals("160030665")&&pwd.equals("bhuvana"))||(un.equals("160030221")&&pwd.equals("himaja")))
        {
            System.out. println("you have successfully logged in");
            nit2();
        }
        else
        {
            System.out.println("you have given wrong username or password");
            System.out.println("please try again");
            JavaProject1 j=new JavaProject1();
        }
    }
    void nit2()
    {
        int option;
        int option1;
        Scanner sc=new Scanner(System.in);
        //System.out. println("you have successfully logged in");
        System.out.println("enter your option");
        System.out.println("1.getdata\n2.SEARCH\n3.logout");
        option=sc.nextInt();
        if(option==1)
        {
            System.out.println("enter the choice");
            System.out.println("1.btech\n2.bcom\n3.bba");
            option1=sc.nextInt();
            if(option1==1)
            {
               int raj;
               System.out.println("select your branch");
               System.out.println("1.CSE\n2.ECE\n3.ECM\n4.MECH\n5.CIVIL");
               raj=sc.nextInt();
               if(raj==1)
               {
                String n1="btechCSE.txt";
                bhuvana(n1);      
               }
               else if(raj==2)
               {
                  String n1="btechECE.txt"; 
                  bhuvana(n1);
               }
               else if(raj==3)
               {
                 String n1="btechECM.txt";
                 bhuvana(n1);  
               }
               else if(raj==4)
               {
                 String n1="btechMECH.txt";
                 bhuvana(n1);  
               }
               else
               {
                   String n1="btechCIVIL.txt";
                   bhuvana(n1);   
               }
            }
            else if(option1==2)
            {
               String n1="bcom.txt";
               bhuvana(n1);  
            }
            else
            {
               String n1="bba.txt";
               bhuvana(n1);
          //  nit2();
           }
        }
        else if(option==2)
        {
            System.out.println("ENTER THE COURSE TO SEARCH");
            System.out.println("1)B.TECH\n2)B.COM\n3)BBA");
            int a=sc.nextInt();
            switch(a)
            {
                case 1:System.out.println("SELECT THE BRANCH");
                       System.out.println("1)CSE\n2)ECE\n3)ECM\n4)MECH\n5)CIVIL");
                       int opti=sc.nextInt();
                       if(opti==1)
                       {
                           String f="btechCSE.txt";
                           search(f);
                       }
                       else if(opti==2)
                       {
                           String f="btechECE.txt";
                           search(f);
                       }
                       else if(opti==3)
                        {
                            String f="btechECM.txt";
                            search(f);
                        }
                       else if(opti==4)
                       {
                           String f="btechMECH.txt";
                           search(f);
                       }
                       else
                       {
                           String f="btechCIVIL.txt";
                           search(f);
                       }
                       break;
                case 2:String f="B.COM.txt";search(f);
                       break;
                case 3:f="BBA.txt";search(f);
                       break;
            }
        }
        else 
        {
            JavaProject1 j=new JavaProject1();
        }
    }
    void bhuvana(String n1) 
    {
               try (BufferedReader br = new BufferedReader(new FileReader(n1)))
               {
                String line = null;
                while ((line = br.readLine()) != null)
                {
                   System.out.println(line);
                }
                   nit2();
               } 
               catch(Exception e)
               {
                   System.out.println(e);
                   nit2();
               }
     }
     void search(String f)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NAME TO BE SEARCHED");
        String student=sc.nextLine();
        try
            {
                int x=0;
                BufferedReader file = new BufferedReader(new FileReader(f));
                String line;
                while ((line = file.readLine()) != null) 
                {
                    //System.out.println(line);
                    if (line.contains(student))
                    {
                        System.out.println("Student is present");
                        System.out.println(line);
                        x++;
                        break;
                    }
                }
                file.close();
                if(x==0)
                {
                    System.out.println("STUDENT DATA NOT FOUND");
                }
                nit2();
             }
             catch(Exception e)
             {
                 System.out.println(e);
                 nit2();
             }
         }
}

class Second
{
    String name;
    int age;
    String phone;
    String fname;
    double percentage;
    Second()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.enter your name");
        name=sc.nextLine();
        System.out.println("2.enter your fathers name");
        fname=sc.nextLine();
        System.out.println("3.enter phone number");
        phone=sc.next();
        System.out.println("4.enter the age");
        age=sc.nextInt();
        System.out.println("5.enter inter percentage and");
        percentage=sc.nextDouble();
        System.out.println("6.select your course");
        nit1();
    }
    void nit1()
    {
        int opt;
        Scanner sc=new Scanner(System.in);
        System.out.println("1)B.TECH\n2)B.COM\n3)BBA");
        opt=sc.nextInt();
        if(opt==1)
        {
            int option2;
            System.out.println("enter the branch");
            System.out.println("1.CSE\n2.ECE\n3.ECM\n4.MECH\n5.CIVIL");
            option2=sc.nextInt();
             if(option2==1)
             {
               String s1="btechCSE.txt";
               register(s1);
            }
            else if(option2==2)
            {
               String s1="btechECE.txt";
               register(s1);         
            }
            else if(option2==3)
            {
               String s1="btechECM.txt";
               register(s1);
            }
            else if(option2==4)
            {
               String s1="btechMECH.txt";
               register(s1);
            }
            else
            {
               String s1="btechCIVIL.txt";
               register(s1);
            }
        }
        else if(opt==2)
        {
            String s1="bcom.txt";
            register(s1);
        }
        else
        {
            String s1="bba.txt";
            register(s1);
        }
    }
    void register(String s)
    {
            try
            {
              FileWriter w=new FileWriter(s,true);
                 w.write("NAME:"+name+"   ");
                 w.write("AGE:"+age+"   ");
                 w.write("FATHER NAME:"+fname+"   ");                  
                 w.write("PHONE:"+phone+"   ");
                 w.write("PERCENTAGE:"+percentage+"   "); 
              w.write(System.getProperty("line.separator"));
              w.close();
              System.out.println("successfully written to the file");
              JavaProject1 j=new JavaProject1();
            }
            catch(Exception e)
            {
                System.out.println("not wrriten to the file\nfailed!!!!!!!!!!!!!!!");
                System.out.println("please try again");
                JavaProject1 j=new JavaProject1();
            }
    }
}
public class JavaProject1
{
    JavaProject1()
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("who are you?\n1.Student\n2.Admin");
        n=sc.nextInt();
        if(n==1)
        {
            Second s=new Second();
        }
        else if(n==2)
        {
            Third t=new Third();
        }
        else
        {
            System.out.println("ivalid");
            JavaProject1 j=new JavaProject1();
        }
    }
    public static void main(String args[])
    {
        JavaProject1 j=new JavaProject1();
    }
}
