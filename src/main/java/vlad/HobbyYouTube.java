package vlad;

public class HobbyYouTube extends Hobby{
    protected String chanelName; // YouTube chanel name
    protected int amountOfSubscribers;

    HobbyYouTube() {
        super();

    }

    public void setChanelName(String chanelName) {
        this.chanelName = chanelName;
    }
    public String getChanelName() {
        return chanelName;
    }

    public void setAmountOfSubscribers(int amountOfSubscribers) {
        this.amountOfSubscribers = amountOfSubscribers;
    }
    public int getamountOfSubscribers() {
        return amountOfSubscribers;
    }

    @Override
    public String tellAboutHobby() {
        return "\nName of the hobby is " + name + ", name of chanel is " + chanelName +
                " and amount of subscribers is " + amountOfSubscribers
                + " You are engaged in this hobby " + hours + " hours a week \nand do it " + day +" day(s) a month. " +
                "You can not do hobbies " + interval +  " days in a row, \nalso you can not do hobby " + lazyMonths +
                " month a year" + "\n You spend " + moneySpend + " dollars for hobby" +
                "\n You earn " + moneyEarn + " dollars from hobby. " + "\n You have friends that have the same hobby. It is "
                + friends + "\nThe priority of " + name + " is " + priority + "\n";
    }
}
