
import java.util.*;
import java.io.*;
class Book
{
    String name,movie;
    int[][] n=new int[25][150];
    Book()
    {}
    void booking()
    {
       int loc;
       Scanner sc=new Scanner(System.in);
       System.out.println("SELECT YOUR LOCATION");
       System.out.println("1.NELLORE\n2.GUNTUR\n3.VIZAG");
       loc=sc.nextInt();
       if(loc==1){
           int x=display(loc);
           System.out.println(x+"theaters are there");
        }
       else if(loc==2){
           int x=display(loc);
           System.out.println(x+"theaters are there");
        }
       else{
           int x=display(loc);
           System.out.println(x+"theaters are there");
        }
       Movie m=new Movie();
    }
    int display(int x)
    {
        String l;int i=1;
        if(x==1){l="nellore.txt";}else if(x==2){l="guntur.txt";}else{l="vizag.txt";}
        try
        {
                BufferedReader file = new BufferedReader(new FileReader(l));
                String line;
                while ((line = file.readLine()) != null) 
                {
                        System.out.println(i+line);i++;
                }  
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return i;
    }
}
class Information
{
    Information()
    {
        Scanner sc=new Scanner(System.in);
       int x;
       System.out.println("select your option");
       System.out.println("1.SEARCH BY MOVIE NAME");
       System.out.println("2.SEARCH BY HERO NAME");
       System.out.println("3.DISPLAY CURRENT MOVIE DETAILS");
       x=sc.nextInt();
       if(x==1)
       {
           System.out.println("ENTER MOVIE NAME");
           sc.nextLine();
           String mn=sc.nextLine();
           mn="("+mn+")";
           try
           {
             BufferedReader file = new BufferedReader(new FileReader("movieinfo.txt"));
                String line;
                while ((line = file.readLine()) != null) 
                {
                    //System.out.println(line);
                    if (line.contains(mn))
                    {
                        System.out.println(line);
                        Movie m=new Movie();
                    }
                } 
            }
           catch(Exception e)
           {
               System.out.println("no such movie exists");
           }
       }
       else if(x==2)
       {
           System.out.println("ENTER HERO NAME");
           sc.nextLine();
           String hn=sc.nextLine();
           hn="("+hn+")";
           try
           {
             BufferedReader file = new BufferedReader(new FileReader("movieinfo.txt"));
                String line;
                while ((line = file.readLine()) != null) 
                {
                    //System.out.println(line);
                    if (line.contains(hn))
                    {
                        System.out.println(line);
                        Movie m=new Movie();
                    }
                } 
            }
           catch(Exception e)
           {
               System.out.println("NO SUCH HERO EXISTS");
           }
       }
       else
       {
           try
           {
             BufferedReader file = new BufferedReader(new FileReader("movieinfo.txt"));
                String line;
                while ((line = file.readLine()) != null) 
                {
                        System.out.println(line);
                } 
                Movie m=new Movie();
            }
           catch(Exception e)
           {
               System.out.println(e);
           }
       }
    }
}
class Manager
{   
    Manager()
    {
        Scanner sc=new Scanner(System.in);
        String id,pwd;
        System.out.println("enter your username\nun:");
        id=sc.nextLine();
        System.out.println("enter your password\n");
        pwd=sc.nextLine();
        if(id.equals("160030959") && pwd.equals("nithin"))
        {
            menu();
        }
    }
    void menu()
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("SELECT YOUR OPTION");
        System.out.println("1.ADD MOVIE");
        System.out.println("2.REMOVE MOVIE");
        System.out.println("3.ADD MOVIE THEATERS");
        n=sc.nextInt();
        if(n==1)
        {
             sc.nextLine();
             System.out.println("ENTER THE MOVIE NAME");
             String mov=sc.nextLine();
             System.out.println("ENTER THE HERO NAME");
             String hero=sc.nextLine();
             System.out.println("ENTER THE HEROINE NAME");
             String heroine=sc.nextLine();
             System.out.println("ENTER THE DIRECTOR NAME");
             String director=sc.nextLine();
             System.out.println("ENTER PRODUCER NAME");
             String producer=sc.nextLine();
             
             try
               {
                 FileWriter w=new FileWriter("movieinfo.txt",true);
                 w.write("NAME:("+mov+")  ");
                 w.write("HERO:("+hero+") ");
                 w.write("HEROINE:("+heroine+") ");
                 w.write("DIRECTOR:("+director+")  ");
                 w.write("PRODUCER:("+producer+")  ");
                 w.write(System.getProperty("line.separator"));
                 w.close();
                 System.out.println("Details are entered");
                 System.out.println("enter 1 for logout");
                 int y=sc.nextInt();
                 if(y==1)
                 {
                     Movie m=new Movie();
                 }
                 else
                 {
                     menu();
                 }
                }
               catch(Exception e)
               {
                System.out.println("not wrriten to the file\nfailed!!!!!!!!!!!!!!!");
                System.out.println("please try again");
                menu();
               } 
        }
        else if(n==2)
        {
            String remov;
            System.out.println("ENTER THE MOVIE NAME TO DELETE");
            sc.nextLine();
            remov=sc.nextLine();
            remov="("+remov+")";
            try
            {
                BufferedReader file = new BufferedReader(new FileReader("movieinfo.txt"));
                String line;
                String input = "";
                while ((line = file.readLine()) != null) 
                {
                    //System.out.println(line);
                    if (line.contains(remov))
                    {
                        line = "";
                        System.out.println("Line deleted.");
                    }
                    input += line + '\n';
                }
                FileOutputStream File = new FileOutputStream("movieinfo.txt");
                File.write(input.getBytes());
                file.close();
                File.close();
                 System.out.println("enter 1 for logout");
                 int y=sc.nextInt();
                 if(y==1)
                 {
                     Movie m=new Movie();
                 }
             }
             catch(Exception e)
             {
                 System.out.println(e);
             }
         }
         else
         {
             System.out.println("select the loaction");
             System.out.println("1.NELLORE\n2.GUNTUR\n3.VIZAG");
             int a=sc.nextInt();
             if(a==1)
             {   
                 System.out.println("ENTER THE MOVIE THEATER");sc.nextLine();String thn=sc.nextLine();
                 System.out.println("ENTER THE MOVIE ALLOTED");String thm=sc.nextLine();
                 write(thn,thm,a);
             }
             else if(a==2){
                 System.out.println("ENTER THE MOVIE THEATER");sc.nextLine();String thn=sc.nextLine();
                 System.out.println("ENTER THE MOVIE ALLOTED");String thm=sc.nextLine();
                 write(thn,thm,a);}
             else{ 
                 System.out.println("ENTER THE MOVIE THEATER");sc.nextLine();String thn=sc.nextLine();
                 System.out.println("ENTER THE MOVIE ALLOTED");String thm=sc.nextLine();
                 write(thn,thm,a);
                }
         }
    }
    void write(String thn,String thm,int a)
    {   Scanner sc=new Scanner(System.in);
        try
        { String l;
            if(a==1){l="nellore.txt";}else if(a==2){l="guntur.txt";}else{l="vizag.txt";}
           FileWriter w=new FileWriter(l,true);
                 w.write("NAME:("+thn+")  ");w.write("MOVIE:"+thm+" ");
                 w.write(System.getProperty("line.separator"));
                 w.close(); System.out.println("successfully written");
        }
        catch(Exception e){System.out.println(e);}
         System.out.println("enter 1 for logout");int x=sc.nextInt();
         if(x==1){Movie m=new Movie();}else{menu();}
    }
}
public class Movie
{
   Movie()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("select your option");
        System.out.println("1.BOOK THE TICKETS");
        System.out.println("2.MANAGE THE THEATERS");
        System.out.println("3.GET INFORMATION ABOUT MOVIES");
        int opt=sc.nextInt();
        if(opt==1)
        {
            Book b=new Book();
            b.booking();
        }
        else if(opt==2)
        {
            Manager m=new Manager();
        }
        else
        {
            Information i=new Information();
        }
    }
   public static void main(String args[])
    {
        Movie m=new Movie();       
    }
}
