import java.util.Stack;
public class DecToBinOrHex {
    void printBin(int number) {
        int mask = 1 << 31;  // 0b10000000_00000000_000000000_000000000
        for (int i = 0; i < 32; i++)
            System.out.print((number & (mask >>> i)) != 0 ? 1 : 0);
        System.out.println();
    }
    public void printHEX(int number) {
        Stack<Character> stack = new Stack<>();
        char symbols[] = {'0', '1', '2', '3', '4', '5', '6', '7',
                            '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int mask = 0x0F;
        for (int i = 0; i < 31; i += 4) {
            stack.push(symbols[(number >>> i) & mask]);
        }
        while (!stack.empty()) System.out.print(stack.pop());
        System.out.println();
    }
}
