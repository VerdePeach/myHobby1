package vlad;

public class Test {
    public static void main(String []args){

    Hobby karate = new Hobby();

        System.out.println(karate.toString()+"\n");

    Hobby youtube = new Hobby("YouTube");
        youtube.getName();
        System.out.println("Enter other information fot it!");
        System.out.println("***IF YOU DO NOT SEE WHERE TO INPUT INFORMATION PRESS ENTER***");
        youtube.setFriends();
        youtube.setDay();
        youtube.setHours();
        youtube.setInterval();
        youtube.setLazyMonths();
        youtube.setMoneyEarn();
        youtube.setMoneySpend();
        youtube.setPriority();
        System.out.println(youtube.toString()+"\n");

    Hobby cat = new Hobby("Cat", true);
        cat.getName();
        System.out.println("Enter other information fot it!");
        System.out.println("***IF YOU DO NOT SEE WHERE TO INPUT INFORMATION PRESS ENTER***");
        cat.setDay();
        cat.setHours();
        cat.setInterval();
        cat.setLazyMonths();
        cat.setMoneyEarn();
        cat.setMoneySpend();
        cat.setPriority();

        cat.getName();
        cat.getDay();
        cat.getHours();
        cat.getInterval();
        cat.getLazyMonths();
        cat.getMoneyEarn();
        cat.getMoneySpend();
        cat.getPriority();
        cat.getFriends();
    }
}
