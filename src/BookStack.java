import java.util.ArrayList;

public class BookStack {
    private final ArrayList<String> stack = new ArrayList<>();

    public class Iterator {
        private final BookStack books;
        private int index;
        private String title;

        public Iterator(BookStack bookStack) {
            this.books = bookStack;
        }

        public void next() {
            this.index--;
            try {
                title = books.stack.get(index);
            } catch (IndexOutOfBoundsException e) {
                title = "-- Não há livros na pilha --";
            }
        }

        public String currentBook() {
            return this.title;
        }

        public void top() {
            this.index = this.books.stack.size();
            next();
        }

        public boolean isEmpty() {
            return this.index == -1;
        }
    }

    public void add(String book) {
        stack.add(book);
    }

    public Iterator getIterator() {
        return new Iterator(this);
    }
}
