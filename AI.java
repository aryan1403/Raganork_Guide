import java.util.*;
import java.util.concurrent.TimeUnit;
public class AI
{
    //Declaration of variables---------------------------------------------------------------------------------
    private String creator = "https://t.me/Hellion_Coder";
    private String dev = "https://t.me/Helboi_atul";
    private String name;
    private int namelength;
    private int renamelength;
    private String rename;
    private String choice;
    private String gender;
    //Decalaration ENDS----------------------------------------------------------------------------------------
    Scanner sc = new Scanner(System.in);
    public void greetings() throws InterruptedException
    {
       System.out.print("Hi ");
       TimeUnit.SECONDS.sleep(1);
       System.out.print("Welcome ");
       TimeUnit.SECONDS.sleep(1);
       System.out.print("to ");
       TimeUnit.SECONDS.sleep(1);
       System.out.print("DARK-COBRA ");
       TimeUnit.SECONDS.sleep(1);
       System.out.print("Artificial ");
       TimeUnit.SECONDS.sleep(1);
       System.out.print("Intelligence ");
       TimeUnit.SECONDS.sleep(1);
       System.out.print("run-time ");
       TimeUnit.SECONDS.sleep(1);
       System.out.print("Environment. ");
       TimeUnit.SECONDS.sleep(1);
       System.out.print("I ");
       TimeUnit.SECONDS.sleep(1);
       System.out.print("am ");
       TimeUnit.SECONDS.sleep(1);
       System.out.print("chiyu ");
       TimeUnit.SECONDS.sleep(1);
       System.out.print("an ");
       TimeUnit.SECONDS.sleep(1);
       System.out.print("Artificial ");
       TimeUnit.SECONDS.sleep(1);
       System.out.print("Intelligence ");
       TimeUnit.SECONDS.sleep(1);
       System.out.print("made ");
       TimeUnit.SECONDS.sleep(1);
       System.out.print("to ");
       TimeUnit.SECONDS.sleep(1);
       System.out.print("make ");
       TimeUnit.SECONDS.sleep(1);
       System.out.print("you ");
       TimeUnit.SECONDS.sleep(1);
       System.out.print("Understand ");
       TimeUnit.SECONDS.sleep(1);
       System.out.print("about ");
       TimeUnit.SECONDS.sleep(1);
       System.out.print("the ");
       TimeUnit.SECONDS.sleep(1);
       System.out.print("most ");
       TimeUnit.SECONDS.sleep(1);
       System.out.print("renouned ");
       TimeUnit.SECONDS.sleep(1);
       System.out.print("and ");
       TimeUnit.SECONDS.sleep(1);
       System.out.print("powerful ");
       TimeUnit.SECONDS.sleep(1);
       System.out.print("Userbot");
       TimeUnit.SECONDS.sleep(1);
       System.out.print("-");
       TimeUnit.SECONDS.sleep(1);
       System.out.print("-");
       TimeUnit.SECONDS.sleep(1);
       System.out.print("> ");
       TimeUnit.SECONDS.sleep(1);
       System.out.println("DARK-COBRA. ");
       TimeUnit.SECONDS.sleep(1);
       System.out.print("You ");
       TimeUnit.SECONDS.sleep(1);
       System.out.print("should ");
       TimeUnit.SECONDS.sleep(1);
       System.out.print("Thank ");
       TimeUnit.SECONDS.sleep(1);
       System.out.print(dev+" ");
       TimeUnit.SECONDS.sleep(1);
       System.out.print("for ");
       TimeUnit.SECONDS.sleep(1);
       System.out.print("Building ");
       TimeUnit.SECONDS.sleep(1);
       System.out.print("this ");
       TimeUnit.SECONDS.sleep(1);
       System.out.print("Amazing ");
       TimeUnit.SECONDS.sleep(1);
       System.out.print("AI ");
       TimeUnit.SECONDS.sleep(1);
       System.out.println("(chiyu)");
    }

    public void information_setup() throws InterruptedException
    {
       System.out.println("What is your name?"); //Ask's your name
       name = sc.nextLine();
       namelength = name.length();
       if(namelength<=2)//Check if the name is too short
       {
          System.out.println("Sorry But your name "+"'"+name+"'"+" is too short your name should have a minimum of 3 characters");
          System.out.println("Do you want to Re-Enter you name?");
          choice = sc.nextLine();
          if(choice.equals("yes")||choice.equals("ya")||choice.equals("yup")||choice.equals("yo"))//Checks choice(yes) for Lower-Case
          {
             System.out.println("Ok! Initialising Data ");
             TimeUnit.SECONDS.sleep(1);
             System.out.println("Re-Enter your name");
             rename = sc.nextLine();//Re-Entered name
             renamelength = rename.length();
             if(renamelength<=2)//Checks is the entered name is again too short or not
             {
               System.out.println("Sorry But again you entered a name "+"'"+name+"'"+" which is too short");
               System.out.println("Re-Enter your name");
               rename = sc.nextLine();
               renamelength =  rename.length();
               if(renamelength<=2)
               {
                  System.out.println("You have Entered your name Incorrect so many times");
                  System.out.println("So,I am disconnected for 30 seconds");
                  System.out.println("Please wait Until is restore my Data...");
                  TimeUnit.SECONDS.sleep(30);
                  System.out.println("Enter your name this time please be carefull");
                  rename = sc.nextLine();
                  renamelength = rename.length();
                  if(renamelength<=2)
                  {
                     System.out.println("You noob human can't be able to write your name");
                     TimeUnit.SECONDS.sleep(5);
                     System.out.println("I'm frustrated.........");
                     TimeUnit.SECONDS.sleep(3);
                     System.out.println("Sorry for the bad behaviour but I'm an AI I also have emotions");
                     TimeUnit.SECONDS.sleep(7);
                     System.out.println("Hope you will understand...");
                     TimeUnit.SECONDS.sleep(1);
                     System.out.println("Till then bye see you later!");
                     System.exit(0);
                  }
               }
             }
             if(rename.equals(name))
             {
                System.out.println("Sorry But you Enterd the same name which you Entered Earlier");
                while(rename.equals(name))
                {
                   System.out.println("Enter your name Again");
                   rename = sc.nextLine();
                }
             }
             System.out.println("Nice name "+rename);
          }
           if(choice.equals("Yes")||choice.equals("Ya")||choice.equals("Yup")||choice.equals("Yo"))//Checks choice(YES) for INTERMEDIATE-Case
           {
            System.out.println("Ok! Initialising Data ");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Re-Enter your name");
            rename = sc.nextLine();//Re-Entered name
            renamelength = rename.length();
            if(renamelength<=2)//Checks is the entered name is again too short or not
            {
              System.out.println("Sorry But again you entered a name "+"'"+name+"'"+" which is too short");
              System.out.println("Re-Enter your name");
              rename = sc.nextLine();
              renamelength =  rename.length();
              if(renamelength<=2)
              {
                 System.out.println("You have Entered your name Incorrect so many times");
                 System.out.println("So,I am disconnected for 30 seconds");
                 System.out.println("Please wait Until is restore my Data...");
                 TimeUnit.SECONDS.sleep(30);
                 System.out.println("Enter your name this time please be carefull");
                 rename = sc.nextLine();
                 renamelength = rename.length();
                 if(renamelength<=2)
                 {
                    System.out.println("You noob human can't be able to write your name");
                    TimeUnit.SECONDS.sleep(5);
                    System.out.println("I'm frustrated.........");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println("Sorry for the bad behaviour but I'm an AI I also have emotions");
                    TimeUnit.SECONDS.sleep(7);
                    System.out.println("Hope you will understand...");
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("Till then bye see you later!");
                    System.exit(0);
                 }
              }
            }
            if(rename.equals(name))
            {
               System.out.println("Sorry But you Enterd the same name which you Entered Earlier");
               while(rename.equals(name))
               {
                  System.out.println("Enter your name Again");
                  rename = sc.nextLine();
               }
            }
            System.out.println("Nice name "+rename);
          }
           if(choice.equals("YES")||choice.equals("YA")||choice.equals("YUP")||choice.equals("YO"))//Checks choice(yes) for Upper-Case
           {
            System.out.println("Ok! Initialising Data ");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Re-Enter your name");
            rename = sc.nextLine();//Re-Entered name
            renamelength = rename.length();
            if(renamelength<=2)//Checks is the entered name is again too short or not
            {
              System.out.println("Sorry But again you entered a name "+"'"+name+"'"+" which is too short");
              System.out.println("Re-Enter your name");
              rename = sc.nextLine();
              renamelength =  rename.length();
              if(renamelength<=2)
              {
                 System.out.println("You have Entered your name Incorrect so many times");
                 System.out.println("So,I am disconnected for 30 seconds");
                 System.out.println("Please wait Until is restore my Data...");
                 TimeUnit.SECONDS.sleep(30);
                 System.out.println("Enter you name this time please be carefull");
                 rename = sc.nextLine();
                 renamelength = rename.length();
                 if(renamelength<=2)
                 {
                    System.out.println("You noob human can't be able to write your name");
                    TimeUnit.SECONDS.sleep(5);
                    System.out.println("I'm frustrated.........");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println("Sorry for the bad behaviour but I'm an AI I also have emotions");
                    TimeUnit.SECONDS.sleep(7);
                    System.out.println("Hope you will understand...");
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("Till then bye see you later!");
                    System.exit(0);
                 }
              }
            }
            if(rename.equals(name))
            {
               System.out.println("Sorry But you Enterd the same name which you Entered Earlier");
               while(rename.equals(name))
               {
                  System.out.println("Enter your name Again");
                  rename = sc.nextLine();
               }
            }
            System.out.println("Nice name "+rename);
          }
           if(choice.equals("no")||choice.equals("nope")||choice.equals("never")||choice.equals("noo"))//Checks choice(no) for Lower-Case
           {
              System.out.println("Ok! no problem "+name);
           }
           if(choice.equals("No")||choice.equals("Nope")||choice.equals("Never")||choice.equals("Noo"))//Checks choice(NO) for INTERMEDIATE-Case
           {
             System.out.println("OK! no problem "+name);
           }
           if(choice.equals("NO")||choice.equals("NOPE")||choice.equals("NEVER")||choice.equals("NOO"))//Checks choice(no) for Upper-Case
           {
              System.out.println("Ok! no problem "+name);
           }
           if(!choice.equals("NO")||!choice.equals("NOPE")||!choice.equals("NEVER")||!choice.equals("NOO")||!choice.equals("No")||!choice.equals("Nope")||!choice.equals("Never")||!choice.equals("Noo")||!choice.equals("no")||!choice.equals("nope")||!choice.equals("never")||!choice.equals("noo")||!choice.equals("YES")||!choice.equals("YA")||!choice.equals("YUP")||!choice.equals("YO")||!choice.equals("Yes")||!choice.equals("Ya")||!choice.equals("Yup")||!choice.equals("Yo"))//if you enter neither yes nor no in the choice to re-enter your nam
           {
              System.out.println("I did not understand your choice '"+choice+"' "+name);
           }
       }
          if(name.equals("DC")||name.equals("dc")||name.equals("dark-cobra")||name.equals("darkcobra"))
          {
              System.out.println("Sorry, But it is my Creator Bot's name Don't make me fool I'm an AI Better smart than you😝 😂 😏 😏 😏 😏");
              TimeUnit.SECONDS.sleep(5);
          }
          if(name.equals("Hellboy")||name.equals("hellboy")||name.equals("HELLBOY")||name.equals("hellboy op")||name.equals("Hellboy op")||name.equals("HELLBOY op")||name.equals("Hellboy OP")||name.equals("HELLBOY OP"))
          {
              System.out.println("Sorry, But it is my Creator name "+dev+" Don't make me fool I'm an AI Better smart than you😝 😂 😏 😏 😏 😏");
              TimeUnit.SECONDS.sleep(5);
          }
          //Checking of Whether the person is chutiya or not Ends  Hope Everyone not get Insulting hahaahaha | ^_^ |  : )

          //Checking Whether the person is Developer Frnd or not ^_^
          if(name.equals("Hellboi")||name.equals("hellboi")||name.equals("HELLBOI")||name.equals("hellboi atul")||name.equals("Hellboy atul")||name.equals("HELLBOI atul")||name.equals("Hellboi Atul")||name.equals("HELLBOY ATUL")||name.equals("hellboi Atul"))
          {
              System.out.println("Sorry, But it is my Creator name "+dev+" Don't make me fool I'm an AI Better smart than you😝 😂 😏 😏 😏 😏");
              TimeUnit.SECONDS.sleep(5);
          }
          if(name.equals("noob")||name.equals("Noob")||name.equals("NOOB")||name.equals("NOOB_GUY_OP")||name.equals("Noob_Guy_Op")||name.equals("Noob_Guy_OP")||name.equals("@Noob_Guy_OP")||name.equals("@Noob_Guy_Op")||name.equals("@NOOB_GUY_OP"))
          {
             System.out.println("OHH! Welcome Sir "+name+" My master told me about you Sir.You are my Master's Bro means my respected Lord.Nice to Meet you");
             TimeUnit.SECONDS.sleep(7);
          }
          //Checking Whether the person is Developer frnd or not Finished
       else
       {
          System.out.println("By The way Nice name "+name);
       }
       //------------------NAME ENDS-----------------------------------------------------------------------------
       System.out.println("Are you a boy or a girl?");
       gender = sc.nextLine();
       if(gender.equals("boy")||gender.equals("man")||gender.equals("boi")||gender.equals("male"))//checks gender(male) in lower-case
       {
          System.out.println("OK Sir!");
       }
       if(gender.equals("BOY")||gender.equals("MAN")||gender.equals("BOI")||gender.equals("MALE"))//checks gender(male) in upper-case
       {
          System.out.println("OK Sir!");
       }
       if(gender.equals("girl")||gender.equals("female")||gender.equals("gurl")||gender.equals("gul"))//checks gender(female) in lower-case
       {
          System.out.println("OK Mam!");
       }
       if(gender.equals("GIRL")||gender.equals("FEMALE")||gender.equals("GURL")||gender.equals("GUL"))//checks gender(female) in upper*case
       {
          System.out.println("OK Mam!");
       }
       if(gender.equals("gay")||gender.equals("Gay")||gender.equals("GAY")||gender.equals("GUL"))//checks gender(gay)
       {
          System.out.println("Ohh! Bhago BC Chakka aaya!!");
          TimeUnit.SECONDS.sleep(7);
          System.exit(0);
       }
       if(!gender.equals("boy")||!gender.equals("man")||!gender.equals("boi")||!gender.equals("male")||!gender.equals("BOY")||!gender.equals("MAN")||!gender.equals("BOI")||!gender.equals("MALE")||!gender.equals("girl")||!gender.equals("female")||!gender.equals("gurl")||!gender.equals("gul")||!gender.equals("GIRL")||!gender.equals("FEMALE")||gender.equals("GURL")||!gender.equals("GUL")||!gender.equals("gay")||gender.equals("Gay")||!gender.equals("GAY")||!gender.equals("GUL"))
       {
          System.out.println("I did not understand your gender");
          TimeUnit.SECONDS.sleep(2);
          System.out.println("What type of gender is '"+gender+"'");
          TimeUnit.SECONDS.sleep(1);
          System.out.println("So, are you a boy or a girl?");
          gender = sc.nextLine();
          if(gender.equals("boy")||gender.equals("Boy")||gender.equals("BOY"))
          {
             System.out.println("OK Sir!");
          }
          if(gender.equals("girl")||gender.equals("Girl")||gender.equals("GIRL"))
          {
             System.out.println("OK Mam!");
          }
          if(!gender.equals("boy")||!gender.equals("Boy")||!gender.equals("BOY")||!gender.equals("girl")||!gender.equals("Girl")||!gender.equals("GIRL"))
          {
             System.out.println("Abe Bhosdike ja ke apni ma se puch kya hai tu chakka hai kya dimag ki dahi kar di tune");
             TimeUnit.SECONDS.sleep(7);
             System.exit(0);
          }
       }
    }

    public static void main(String args[]) throws InterruptedException
    {
       AI obj = new AI();
       obj.greetings();
      obj.information_setup();
    }
}
