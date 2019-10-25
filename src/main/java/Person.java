/**
 * User: Shantanu Roy
 * Date: 10/25/2019
 * Time: 4:27 PM
 */
public class Person {

    private boolean hasSeniorCitizenCard;
    private boolean hasFamilyCard;
    private Child child;

    Person(boolean hasSeniorCitizenCard, boolean hasFamilyCard, Child child){
        this.hasSeniorCitizenCard = hasSeniorCitizenCard;
        this.hasFamilyCard = hasFamilyCard;
        this.child = child;
    }

    public boolean hasSeniorCitizenCard() {
        return hasSeniorCitizenCard;
    }

    public boolean hasFamilyCard() {
        return hasFamilyCard;
    }

    public boolean isTravellingWithChild() {
        return child != null;
    }

    public Child getChild() {
        return child;
    }
}
