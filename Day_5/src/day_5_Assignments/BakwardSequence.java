package day_5_Assignments;

public class BakwardSequence implements CharSequence {
    private final String original;

    public BakwardSequence(String original) {
        this.original = original != null ? original : "";
    }

    @Override
    public int length() {
        return original.length();
    }

    @Override
    public char charAt(int index) {
        if (index < 0 || index >= length()) {
            throw new IndexOutOfBoundsException(
                "Index: " + index + ", Length: " + length());
        }
        // Reverse: character from the end
        return original.charAt(length() - 1 - index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        if (start < 0 || end < start || end > length()) {
            throw new IndexOutOfBoundsException(
                "start " + start + ", end " + end + ", length " + length());
        }
        // Build reversed substring boundary-aware
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(charAt(i));
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return new StringBuilder(original).reverse().toString();
    }

    public static void main(String[] args) {
        BakwardSequence bs = new BakwardSequence("hello");
        System.out.println("Original: \"hello\"");
        System.out.println("BackwardSequence.toString(): " + bs.toString());
        System.out.println("length(): " + bs.length());
        System.out.println("charAt(0): " + bs.charAt(0));
        System.out.println("charAt(4): " + bs.charAt(4));
        System.out.println("subSequence(1, 4): " + bs.subSequence(1, 4));
        try {
            System.out.println(bs.charAt(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Expected exception: " + e);
        }
    }
}
