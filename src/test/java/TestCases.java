import org.junit.Test;

/**
 * User: Shantanu Roy
 * Date: 10/25/2019
 * Time: 4:32 PM
 */
public class TestCases {

    @Test
    public void r1(){
        final boolean hasSeniorCitizenCard = true;
        final boolean hasFamilyCard = true;
        Child child = new Child(15);

        Person person = new Person(hasSeniorCitizenCard, hasFamilyCard, child);

        int discount = new DiscountResolver().evaluate(person);

        assert discount == 50;
    }

    @Test
    public void r2(){
        final boolean hasSeniorCitizenCard = true;
        final boolean hasFamilyCard = true;
        final Child child = null;

        Person person = new Person(hasSeniorCitizenCard, hasFamilyCard, child);

        int discount = new DiscountResolver().evaluate(person);

        assert discount == 34;
    }

    @Test
    public void r3(){
        final boolean hasSeniorCitizenCard = true;
        final boolean hasFamilyCard = false;
        Child child = new Child(14);

        Person person = new Person(hasSeniorCitizenCard, hasFamilyCard, child);

        int discount = new DiscountResolver().evaluate(person);

        assert discount == 34;
    }

    @Test
    public void r4(){
        final boolean hasSeniorCitizenCard = true;
        final boolean hasFamilyCard = false;
        final Child child = null;

        Person person = new Person(hasSeniorCitizenCard, hasFamilyCard, child);

        int discount = new DiscountResolver().evaluate(person);

        assert discount == 34;
    }

    @Test
    public void r5(){
        final boolean hasSeniorCitizenCard = false;
        final boolean hasFamilyCard = true;
        final Child child = new Child(14);

        Person person = new Person(hasSeniorCitizenCard, hasFamilyCard, child);

        int discount = new DiscountResolver().evaluate(person);

        assert discount == 50;
    }

    @Test
    public void r6(){
        final boolean hasSeniorCitizenCard = false;
        final boolean hasFamilyCard = true;
        final Child child = null;

        Person person = new Person(hasSeniorCitizenCard, hasFamilyCard, child);

        int discount = new DiscountResolver().evaluate(person);

        assert discount == 0;
    }

    @Test
    public void r7(){
        final boolean hasSeniorCitizenCard = false;
        final boolean hasFamilyCard = false;
        final Child child = new Child(14);

        Person person = new Person(hasSeniorCitizenCard, hasFamilyCard, child);

        int discount = new DiscountResolver().evaluate(person);

        assert discount == 10;
    }

    @Test
    public void r8(){
        final boolean hasSeniorCitizenCard = false;
        final boolean hasFamilyCard = false;
        final Child child = null;

        Person person = new Person(hasSeniorCitizenCard, hasFamilyCard, child);

        int discount = new DiscountResolver().evaluate(person);

        assert discount == 0;
    }
}
