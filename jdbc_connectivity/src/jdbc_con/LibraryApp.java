package jdbc_con;

import java.sql.*;

public class LibraryApp {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/mydb", u = "root", p = "Swapna@123";
        Connection c = DriverManager.getConnection(url, u, p);

        c.createStatement().execute("INSERT INTO books (title, author, available) VALUES ('1984','Orwell',TRUE)");
        ResultSet rs = c.createStatement().executeQuery("SELECT id, title, author, available FROM books");
        while (rs.next()) System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getBoolean(4));

        c.setAutoCommit(false);
        int bookId = 1, memberId = 1;
        int r1 = c.prepareStatement("UPDATE books SET available = FALSE WHERE id = " + bookId).executeUpdate();
        int r2 = c.prepareStatement("INSERT INTO issued_books (book_id, member_id) VALUES (" + bookId + ", " + memberId + ")").executeUpdate();
        if (r1 > 0 && r2 > 0) {
            c.commit();
            System.out.println("Issued");
        } else {
            c.rollback();
            System.out.println("Issue failed");
        }

        c.setAutoCommit(false);
        int r3 = c.prepareStatement("UPDATE books SET available = TRUE WHERE id = " + bookId).executeUpdate();
        int r4 = c.prepareStatement("UPDATE issued_books SET return_date = CURRENT_DATE WHERE book_id = " + bookId + " AND return_date IS NULL").executeUpdate();
        if (r3 > 0 && r4 > 0) {
            c.commit();
            System.out.println("Returned");
        } else {
            c.rollback();
            System.out.println("Return failed");
        }

        c.close();
    }
}
