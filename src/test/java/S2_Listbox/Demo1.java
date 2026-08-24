package S2_Listbox;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Demo1
{
    public static void main(String[] args)
    {

        List<String> al=new ArrayList<String>();
        al.add("ganesh");
        al.add("mahesh");
        al.add("suresh");

        for(String s1:al)
        {
            System.out.println(s1.toUpperCase());
        }

        System.out.println(al.size());


    }
}
