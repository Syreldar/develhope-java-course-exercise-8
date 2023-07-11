public class BooleanOperators
{
    public static void main(String[] args)
    {
        // 1. 2 <= 2 --> true;
        // 2. !true --> false;
        // 3. true && false --> false;
        System.out.println(2 <= 2 && !true);

        // 1. !false --> true;
        // 2. (3 > 2) --> true;
        // 3. true && true --> true;
        System.out.println(!false && 3 > 2);

        // 1. (!false || true) --> (true || true) --> true;
        // 2. !(true) -> false;
        System.out.println(!(!false || true));

        // 1. !(true && true) --> !(true);
        // 2. !(true) --> false --> 0;
        // 3. (6 > 6 ^ 0) --> 6 > 6 --> false;
        System.out.println(6 > 6 ^ !(true && true));
    }
}
