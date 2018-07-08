package stringoperation;

import java.util.Scanner;

public class StringOperation 
{
    public static void main(String[] args) 
    {
        int total_user = 2;
        String[][] userdb = new String[total_user][total_user];
        
        userdb[0][0] = "sm"; userdb[0][1] = "abc";
        userdb[1][0] = "kmh"; userdb[1][1] = "xyz";
        
        Scanner sc = new Scanner(System.in);
        
        String user_name = sc.next();
        String user_pass = sc.next();
        
        int flag = 0;
        for(int i = 0; i < total_user; i++)
        {
            if(userdb[i][0].compareTo(user_name) == 0)
            {
                flag = 1;
                if(userdb[i][1].compareTo(user_pass) == 0)
                {
                    System.out.println("OK");
                }
                else
                {
                    System.out.println("Password Incorrect");
                }                
            }            
        }
        
        if(flag == 0)
        {
            System.out.println("No User found");
        }
        
        
//        String name = "Bangladesh is my country";
//        String ret = name.toUpperCase();
//        int l = name.length();
//        char c = name.charAt(6);
//        
//        System.out.println(name);
//        System.out.println(ret);
//        System.out.println(l);
//        System.out.println(c);
    }    
}
