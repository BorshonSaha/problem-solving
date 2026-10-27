package final_keyword;

public class University {
    final String name = "SUAS";
    final int fees; // blank final variable. To initialize this blank final variable, we have to use constructor
    static final String address; // static blank final variable. To initialize this static blank final variable, we have to use static block

    University() {
        fees = 330;
    }

    static  {
        address = "Schmalkalden";
    }

    void display() {
        System.out.println("Name: " +name+ ", Fees: " +fees);
    }
}
