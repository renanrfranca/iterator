public class Main {
    public static void main(String[] args) {
        BookStack bookStack = new BookStack();

        bookStack.add("Clean Code");
        bookStack.add("The Enterprise of Law");
        bookStack.add("The Ethics of Liberty");
        bookStack.add("Java - A Beginner's Guide");

        BookStack.Iterator iterator = bookStack.getIterator();

        for (iterator.top(); ! iterator.isEmpty(); iterator.next()) {
            System.out.println(iterator.currentBook());
        }

        iterator.next();
        System.out.println(iterator.currentBook());
    }
}
