package hooks;

import Page.QueryCardPage;
import com.github.javafaker.Faker;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.sql.*;
import java.util.Random;

public abstract class Base {
    public static String email, password, name;
    public static int id;
    public static double sub_total;
    public static Date date;
    public static Random random;
    public static Faker faker;
    public static DesiredCapabilities desiredCapabilities;
    public static QueryCardPage queryCardPage;

    public static void initialize(){
        faker = new Faker();
        random = new Random();
        queryCardPage = new QueryCardPage();
        desiredCapabilities = new DesiredCapabilities();
    }
}