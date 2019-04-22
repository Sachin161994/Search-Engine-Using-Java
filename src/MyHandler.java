import java.util.List;
    import java.applet.Applet;
    import java.awt.*;
    import java.awt.event.*;
    import java.util.ArrayList; 
	import org.jsoup.Jsoup;
	import org.jsoup.nodes.Document; 
	import org.jsoup.nodes.Element;
	import org.jsoup.select.Elements;
/* <applet code="MyApplet" width="300" height="220"> </applet> */
public class MyHandler implements ActionListener {
	public void actionPerformed(ActionEvent e) {
    	try {
			// TODO Auto-generated method stub
			List<String> links;
			String a;
			a=t1.getText();
			String site = a;
			links = Crawl.extractLinks(site);
			for(String link:links) {
		    	l2.setText("Sum is " + link);
  	  }	  
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 	     	   	  
     }

}
