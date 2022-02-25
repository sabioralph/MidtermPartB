/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 *
 * @author ralph
 */
public class TestUserprofile {
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter Your Favourite Genre: ");
        String genre = sc.nextLine();
        
        UserProfile user = new UserProfile( name,genre);
        System.out.print(user);
    }
}
