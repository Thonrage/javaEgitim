package final_examples01;

public class FinalVariableExample02 {
    public static void main(String[] args) {
        final Person person = new Person();
      // person.setName("bilge");

        System.out.println(person.getName());

       // person.setName("adam");
        System.out.println(person.getName());
    }
}
