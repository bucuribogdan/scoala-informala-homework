package com.sci.bv;

import java.sql.*;
import java.util.Scanner;


public class Main {
    /**
     * In this program is importing five tables from SQL: Courses, Classes, CrossListings,CoursesProfs and Profs and
     * display data for all these tables.
     * selectDataSpecificiedId(int id) will display the course with specified id.
     * selectBeginIntro()  will display data for all classes whose title (when converted to all lowercase letters) begins with "intro".
     * selectDataWhereDeptIsCosAndCoursenumIsThree() will display data for all classes whose dept
     *                              (when converted to all lowercase letters) is "cos" and whose coursenum begins with "3".
     *
     */
    public static void main(String[] args) {
        selectClasses();
        selectCourses();
        selectCrosslistings();
        selectCoursesProfs();
        selectProfs();
        System.out.println("Please write the course id to diplay data for it:");
        Scanner scan =new Scanner(System.in);
        int id=scan.nextInt();
        selectDataSpecificiedId(id);
        selectBeginIntro();
        selectDataWhereDeptIsCosAndCoursenumIsThree();

    }

    /**
     * Import the "Courses" table from SQL, then display the table.
     */
    public static void selectCourses(){
        try {
            System.out.println("Courses:\n"+
                    "_____________________________________________________________________________\n");
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (InstantiationException|IllegalAccessException|ClassNotFoundException e){
            System.err.println("Can’t load driver. Verify CLASSPATH");
            System.err.println(e.getMessage());
        }

        Connection conn = getConnection("mysql","Localhost","3306","school","root","123456");
        if (conn == null) return;
        Statement st = null;
        ResultSet rs = null;
        final String format = "%20s   %20s    %20s    %20s    %20s\n";
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from courses");
            boolean hasResults = rs.next();
            if (hasResults) {
                System.out.format(format, "courseid", "area ", "title","descrip","prereqs");
                do {
                    System.out.format(format, rs.getInt("courseid"),
                            rs.getString("area"),
                            rs.getString("title"),
                            rs.getString("descrip"),
                            rs.getString("prereqs"));
                } while (rs.next());
                System.out.println("_____________________________________________________________________________\n");
            } else {
                System.out.println("No results");
            }
        } catch (SQLException e) {
            System.err.println("Cannot execute query: " + e.getMessage());
        } finally {
            if (rs != null) try { rs.close(); } catch (SQLException e) {  }
            if (st != null) try { st.close(); } catch (SQLException e) {  }
            try { conn.close(); } catch (SQLException e) { }
        }
    }

    /**
     * Import the "Classes" table from SQL, then display the table.
     */
    public static void selectClasses(){
        try {
            System.out.println("Classes:\n"+
                    "_____________________________________________________________________________\n");
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (InstantiationException|IllegalAccessException|ClassNotFoundException e){
            System.err.println("Can’t load driver. Verify CLASSPATH");
            System.err.println(e.getMessage());
        }

        Connection conn = getConnection("mysql","Localhost","3306","school","root","123456");
        if (conn == null) return;
        Statement st = null;
        ResultSet rs = null;
        final String format = "%20s   %20s    %20s    %20s    %20s  %20s\n";
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from classes");
            boolean hasResults = rs.next();
            if (hasResults) {
                System.out.format(format, "classid", "courseid ", "days","starttime","endtime","roomnum");
                do {
                    System.out.format(format, rs.getInt("classid"),
                            rs.getInt("courseid"),
                            rs.getString("days"),
                            rs.getString("starttime"),
                            rs.getString("endtime"),
                            rs.getInt("roomnum"));
                } while (rs.next());
                System.out.println( "_____________________________________________________________________________\n");
            } else {
                System.out.println("No results");
            }
        } catch (SQLException e) {
            System.err.println("Cannot execute query: " + e.getMessage());
        } finally {
            if (rs != null) try { rs.close(); } catch (SQLException e) {  }
            if (st != null) try { st.close(); } catch (SQLException e) {  }
            try { conn.close(); } catch (SQLException e) { }
        }
    }

    /**
     * Import the "Crosslistings" table from SQL, then display the table.
     */
    public static void selectCrosslistings(){
        try {
            System.out.println("Crosslistings:\n"+
                    "_____________________________________________________________________________\n");
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (InstantiationException|IllegalAccessException|ClassNotFoundException e){
            System.err.println("Can’t load driver. Verify CLASSPATH");
            System.err.println(e.getMessage());
        }

        Connection conn = getConnection("mysql","Localhost","3306","school","root","123456");
        if (conn == null) return;
        Statement st = null;
        ResultSet rs = null;
        final String format = "%20s   %20s    %20s\n";
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from crosslistings");
            boolean hasResults = rs.next();
            if (hasResults) {
                System.out.format(format,"courseid","dept ", "coursenum");
                do {
                    System.out.format(format, rs.getInt("courseid"),
                            rs.getString("dept"),
                            rs.getInt("coursenum")
                            );
                } while (rs.next());
                System.out.println("_____________________________________________________________________________\n");
            } else {
                System.out.println("No results");
            }
        } catch (SQLException e) {
            System.err.println("Cannot execute query: " + e.getMessage());
        } finally {
            if (rs != null) try { rs.close(); } catch (SQLException e) {  }
            if (st != null) try { st.close(); } catch (SQLException e) {  }
            try { conn.close(); } catch (SQLException e) { }
        }
    }

    /**
     * Import the "CoursesProfs" table from SQL, then display the table.
     */
    public static void selectCoursesProfs(){
        try {System.out.println("CoursesProfs:\n"+
                "_____________________________________________________________________________\n");
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (InstantiationException|IllegalAccessException|ClassNotFoundException e){
            System.err.println("Can’t load driver. Verify CLASSPATH");
            System.err.println(e.getMessage());
        }

        Connection conn = getConnection("mysql","Localhost","3306","school","root","123456");
        if (conn == null) return;
        Statement st = null;
        ResultSet rs = null;
        final String format = "%20s   %20s\n";
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from coursesprofs");
            boolean hasResults = rs.next();
            if (hasResults) {
                System.out.format(format, "profid", "courseid");
                do {
                    System.out.format(format, rs.getInt("profid"),
                            rs.getInt("courseid"));
                } while (rs.next());
                System.out.println("_____________________________________________________________________________\n");
            } else {
                System.out.println("No results");
            }
        } catch (SQLException e) {
            System.err.println("Cannot execute query: " + e.getMessage());
        } finally {
            if (rs != null) try { rs.close(); } catch (SQLException e) {  }
            if (st != null) try { st.close(); } catch (SQLException e) {  }
            try { conn.close(); } catch (SQLException e) { }
        }
    }

    /**
     * Import the "Profs" table from SQL, then display the table.
     */
    public static void selectProfs(){
        try {System.out.println("Profs:\n"+
                "_____________________________________________________________________________\n");
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (InstantiationException|IllegalAccessException|ClassNotFoundException e){
            System.err.println("Can’t load driver. Verify CLASSPATH");
            System.err.println(e.getMessage());
        }

        Connection conn = getConnection("mysql","Localhost","3306","school","root","123456");
        if (conn == null) return;
        Statement st = null;
        ResultSet rs = null;
        final String format = "%20s   %20s\n";
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from profs");
            boolean hasResults = rs.next();
            if (hasResults) {
                System.out.format(format, "profid", "profname");
                do {
                    System.out.format(format, rs.getInt("profid"), rs.getString("profname"));
                } while (rs.next());
                System.out.println("_____________________________________________________________________________\n");
            } else {
                System.out.println("No results");
            }
        } catch (SQLException e) {
            System.err.println("Cannot execute query: " + e.getMessage());
        } finally {
            if (rs != null) try { rs.close(); } catch (SQLException e) {  }
            if (st != null) try { st.close(); } catch (SQLException e) {  }
            try { conn.close(); } catch (SQLException e) { }
        }
    }

    /**
     * Will display the course with specified id.
     */
    public static void selectDataSpecificiedId(int id){
        try {System.out.println("_____________________________________________________________________________\n");
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (InstantiationException|IllegalAccessException|ClassNotFoundException e){
            System.err.println("Can’t load driver. Verify CLASSPATH");
            System.err.println(e.getMessage());
        }

        Connection conn = getConnection("mysql","Localhost","3306","school","root","123456");
        if (conn == null) return;
        Statement st = null;
        ResultSet rs = null;
        final String format = "%20s   %20s    %20s    %20s    %20s\n";
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from courses where courseid="+id);
            boolean hasResults = rs.next();
            if (hasResults) {
                System.out.format(format, "courseid", "area ", "title","descrip","prereqs");
                do {
                    System.out.format(format, rs.getInt("courseid"),
                            rs.getString("area"),
                            rs.getString("title"),
                            rs.getString("descrip"),
                            rs.getString("prereqs"));
                } while (rs.next());
                System.out.println("_____________________________________________________________________________\n");
            } else {
                System.out.println("No results");
            }
        } catch (SQLException e) {
            System.err.println("Cannot execute query: " + e.getMessage());
        } finally {
            if (rs != null) try { rs.close(); } catch (SQLException e) {  }
            if (st != null) try { st.close(); } catch (SQLException e) {  }
            try { conn.close(); } catch (SQLException e) { }
        }
    }

    /**
     * Will display data for all classes whose title (when converted to all lowercase letters) begins with "intro".
     */
    public static void selectBeginIntro(){
        try {
            System.out.println("Data From All Classes Whose Title Begin With 'Intro'\n"+
                    "_____________________________________________________________________________\n");
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (InstantiationException|IllegalAccessException|ClassNotFoundException e){
            System.err.println("Can’t load driver. Verify CLASSPATH");
            System.err.println(e.getMessage());
        }

        Connection conn = getConnection("mysql","Localhost","3306","school","root","123456");
        if (conn == null) return;
        Statement st = null;
        ResultSet rs = null;
        final String format = "%20s   %20s    %20s    %20s     %20s\n";
        try {
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM courses WHERE courses.title LIKE 'intro%'\n");
            boolean hasResults = rs.next();
            if (hasResults) {
                System.out.format(format, "courseid", "area ", "title","descrip","prereqs");
                do {
                    System.out.format(format, rs.getInt("courses.courseid"),
                            rs.getString("area"),
                            rs.getString("title"),
                            rs.getString("descrip"),
                            rs.getString("prereqs")
                    );
                }  while (rs.next());
                System.out.println("_____________________________________________________________________________\n");
            } else {
                System.out.println("No results");
            }
        } catch (SQLException e) {
            System.err.println("Cannot execute query: " + e.getMessage());
        } finally {
            if (rs != null) try { rs.close(); } catch (SQLException e) {  }
            if (st != null) try { st.close(); } catch (SQLException e) {  }
            try { conn.close(); } catch (SQLException e) { }
        }
    }

    /**
     * Will display data for all classes whose dept(when converted to all lowercase letters)
     * is "cos" and whose coursenum begins with "3".
     */
    public static void selectDataWhereDeptIsCosAndCoursenumIsThree(){
            try {
                System.out.println("Data for all classes whose dept (when converted to all lowercase letters) is \"cos\" and whose coursenum begins with \"3\"\n"+
                        "_____________________________________________________________________________\n");
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            } catch (InstantiationException|IllegalAccessException|ClassNotFoundException e){
                System.err.println("Can’t load driver. Verify CLASSPATH");
                System.err.println(e.getMessage());
            }

            Connection conn = getConnection("mysql","Localhost","3306","school","root","123456");
            if (conn == null) return;
            Statement st = null;
            ResultSet rs = null;
            final String format = "%20s   %20s    %20s    %20s     %20s   %20s   %20s   %20s   %20s   %20s   %20s   %20s   %20s   %20s\n";
            try {
                st = conn.createStatement();
                rs = st.executeQuery("select * from courses join crosslistings ON \n" +
                        "(courses.courseid=crosslistings.courseid) join classes ON \n" +
                        "(courses.courseid=classes.courseid) where dept=\"cos\" and coursenum like '3%';\n");
                boolean hasResults = rs.next();
                if (hasResults) {
                    System.out.format(format, "courseid","area","title","descrip","prereqs","courseid","dept",
                            "coursenum","classid","courseid","days","starttime","endtime","roomnun");
                    do {
                        System.out.format(format, rs.getInt("courseid"),
                                rs.getString("area"),
                                rs.getString("title"),
                                rs.getString("descrip"),
                                rs.getString("prereqs"),
                                rs.getInt("courseid"),
                                rs.getString("dept"),
                                rs.getInt("coursenum"),
                                rs.getInt("classid"),
                                rs.getInt("courseid"),
                                rs.getString("days"),
                                rs.getString("starttime"),
                                rs.getString("endtime"),
                                rs.getString("roomnum")
                        );
                    }  while (rs.next());
                    System.out.println("_____________________________________________________________________________\n");
                } else {
                    System.out.println("No results");
                }
            } catch (SQLException e) {
                System.err.println("Cannot execute query: " + e.getMessage());
            } finally {
                if (rs != null) try { rs.close(); } catch (SQLException e) {  }
                if (st != null) try { st.close(); } catch (SQLException e) {  }
                try { conn.close(); } catch (SQLException e) { }
            }
        }

    /**
     * Is connecting to SQL server.
     */
    public static  Connection getConnection(String type, String host, String port, String dbName, String user, String pw) {

        DriverManager.setLoginTimeout(60);  // wait 1 min; optional: DB may be busy, good to set a higher timeout
        try {
            String url = new StringBuilder()
                    .append("jdbc:")
                    .append(type)
                    .append("://")
                    .append(host)
                    .append(":")
                    .append(port)
                    .append("/")
                    .append(dbName)
                    .append("?user=")
                    .append(user)
                    .append("&password=")
                    .append(pw).toString();
            return DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.err.println("Cannot connect to the database: " + e.getMessage());
        }
        return null;
    }
}
