package vlad;

import java.util.Scanner;

public class Test {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        HobbyKarate karate = new HobbyKarate();
        System.out.println("Enter name of style of katare");
        karate.setStyle(sc.nextLine());

        HobbyYouTube youTube =  new HobbyYouTube();
        System.out.println("And now, enter the name of your chanel on youtube");
        youTube.setChanelName(sc.nextLine());
        System.out.println("Enter how many subscribers do you have on youtube!");
        youTube.setAmountOfSubscribers(sc.nextInt());

        Hobby myHobbies[] = {karate, youTube};

        int k = 0;
        for (Hobby i :myHobbies) {
            System.out.println(myHobbies[k].tellAboutHobby()+"\n");
            k++;
        }
        //System.out.println(myHobbies[0].tellAboutHobby()+"\n");
       // System.out.println(myHobbies[1].tellAboutHobby()+"\n");

    }
}
