package vlad;

public class HobbyKarate extends Hobby {
    protected String style; // style of karate

    HobbyKarate() {
       super();

    }

    public void setStyle(String style) {
        this.style = style;
    }
    public String getStyle() {
        return style;
    }

    @Override
    public String tellAboutHobby() {
        return "\nName of the hobby is " + name + " the style is "+ style +", "
                + "You are engaged in this hobby " + hours + " hours a week \nand do it " + day +" day(s) a month. " +
                "You can not do hobbies " + interval +  " days in a row, \nalso you can not do hobby " + lazyMonths +
                " month a year" + "\n You spend " + moneySpend + " dollars for hobby" +
                "\n You earn " + moneyEarn + " dollars from hobby. " + "\n You have friends that have the same hobby. It is "
                + friends + "\nThe priority of " + name + " is " + priority + "\n";
    }
}
