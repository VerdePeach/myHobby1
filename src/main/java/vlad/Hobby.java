package vlad;

import org.apache.log4j.Logger;
import java.util.Scanner;
import java.util.InputMismatchException;

public abstract class Hobby {

    final static Logger logger = Logger.getLogger(Hobby.class);

    protected String name;
    protected int hours; // hours for hobby a week;
    protected short day; //amount of days when you are engaged in hobby a week
    protected byte interval; // maximum number of days in a row when you don't do hobbies
    protected char priority; //priority of hobby from A to F
    protected float moneySpend; // spend for hobby
    protected double moneyEarn; // profit from a hobby
    protected long lazyMonths; // amount of month a year when you do not do hobby a
    protected boolean friends;// My friends have the same hobby
    Scanner scanner = new Scanner(System.in);

    Hobby() {
        System.out.println("***IF YOU DO NOT SEE WHERE TO INPUT INFORMATION PRESS ENTER***");
        setName();
        setHours();
        setDay();
        setInterval();
        setPriority();
        setMoneySpend();
        setMoneyEarn();
        setLazyMonths();
        setFriends();
    }


    public void setName() {
        try {

            System.out.print("Enter name for your hobby: ");
            name = scanner.nextLine();
            logger.info("name: " + name);
            logger.debug("name: " + name);
        }catch (InputMismatchException exp){
            logger.error("Wrong input format of name: " + name + " " + exp);
        }

    }
    public void getName() {
        System.out.println("Hobby name: " + name);
    }

    public void setHours() {
        try {
            scanner.nextLine();
            System.out.print("Enter amount of hours that You spend for hobby a week (INTEGER VALUE): ");
            hours = scanner.nextInt();
            logger.info("hours: " + hours);
            logger.debug("hours: " + hours);
        }catch (InputMismatchException exp){
            logger.error("Wrong input format of hours " + hours + " " + exp);
        }
    }

    public void getHours() {
        System.out.println("Hours that You spend for hobby a week: " + hours);
    }

    public void setDay() {
        try {
            scanner.nextLine();
            System.out.print("Enter amount of days a week when You are engaged in hobby  (INTEGER VALUE): ");
            day = scanner.nextShort();
            logger.info("day " + day);
            logger.debug("day " + day);
        }catch (InputMismatchException exp){
            logger.error("Wrong input format of day " + day + " " + exp);
        }
    }

    public void getDay() {
        System.out.println("Amount of days a week when You are engaged in hobby: " + day);
    }

    public void setInterval() {
        try {
            scanner.nextLine();
            System.out.print("Enter maximum number of days in a row when You do not do hobby  (INTEGER VALUE): ");
            interval = scanner.nextByte();
            logger.info("interval: " + interval);
            logger.debug("interval: " + interval);
        }catch (InputMismatchException exp){
            logger.error("Wrong input format of interval " + interval + " " + exp);
        }
    }

    public void getInterval() {
        System.out.println("Maximum number of days in a row when You do not do hobby: " + interval);
    }

    public void setPriority() {
        try {
            scanner.nextLine();
            System.out.print("Enter the importance of a hobby for You from A(the highest score) to F(the lowest score) (ONLY BIG LETTERS): ");
            priority = scanner.next().charAt(0);
            logger.info("priority: " + priority);
            logger.debug("priority: " + priority);
        }catch (InputMismatchException exp){
            logger.error("Wrong input format of priority " + priority + " " + exp);
        }
    }

    public void getPriority() {
        System.out.println("Importance of a hobby for You from: " + priority);
    }

    public void setMoneySpend() {
        try {
            scanner.nextLine();
            System.out.print("Enter amount of money(dollars) that You spend for hobby (FLOATING POINT NUMBER): ");
            moneySpend = scanner.nextFloat();
            logger.info("moneySpend: " + moneySpend);
            logger.debug("moneySpend: " + moneySpend);
        }catch (InputMismatchException exp){
            logger.error("Wrong input format of moneySpend " + moneySpend + " " + exp);
        }
    }

    public void getMoneySpend() {
        System.out.println("Amount of money(dollars) that You spend for hobby: " + moneySpend);
    }

    public void setMoneyEarn() {
        try {
            scanner.nextLine();
            System.out.print("Enter amount of money(dollars) that You earn from hobby (FLOATING POINT NUMBER): ");
            moneyEarn = scanner.nextDouble();
            logger.info("moneyEarn: " + moneyEarn);
            logger.debug("moneyEarn: " + moneyEarn);
        }catch (InputMismatchException exp){
            logger.error("Wrong input format of moneyEarn " + moneyEarn + " " + exp);
        }
    }

    public void getMoneyEarn() {
        System.out.println("Amount of money(dollars) that You earn from hobby: " + moneyEarn);
    }

    public void setLazyMonths() {
        try {
            scanner.nextLine();
            System.out.print("Enter maximum number of months when you are not doing hobby a year (INTEGER VALUE): ");
            lazyMonths = scanner.nextLong();
            logger.info("lazyMonths: " +  lazyMonths );
            logger.debug("lazyMonths " + lazyMonths);
        }catch (InputMismatchException exp){
            logger.error("Wrong input format of lazyMonths " +  lazyMonths + " " + exp);
        }
    }

    public void getLazyMonths() {
        System.out.println("Maximum number of months when you are not doing hobby a year: " + lazyMonths);
    }

    public void setFriends() {
        try {
            scanner.nextLine();
            System.out.print("Enter true or false. Do your friends have the same hobby? (only small letters): ");
            friends = scanner.nextBoolean();
            logger.info("friends: " + friends);
            logger.debug("friends: " +  friends);
        }catch (InputMismatchException exp){
            logger.error("Wrong input format of friends " +  friends + " " + exp);
        }
    }

    public void getFriends() {
        System.out.println("Your friends have the same hobby, it is " + friends);
    }
/*
    public void setStyle() {}
    public String getStyle() {
        return null;
    }
    public void setChanelName() {}
    public String getChanelName() {
        return null;
    }
    public void setAmountOfSubscribers() {}

    public int getamountOfSubscribers() {
        return 0;
    }*/

    abstract String tellAboutHobby();
}