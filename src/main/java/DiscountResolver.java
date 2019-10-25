/**
 * User: Shantanu Roy
 * Date: 10/25/2019
 * Time: 4:34 PM
 */
public class DiscountResolver {

    private int discount = 0;

    private void setDiscount(int amount) {
        discount = amount > discount ? amount : discount;
    }

    public int evaluate(Person person) {
        if (person.hasSeniorCitizenCard()) {
            setDiscount(34);
        }
        if (person.isTravellingWithChild()) {
            Child child = person.getChild();
            setDiscount(10);
            if (person.hasFamilyCard() && child.getAge() < 16) {
                setDiscount(50);
            }
        }
        return discount;
    }
}
