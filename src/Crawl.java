	import java.util.List;
    import java.applet.Applet;
    import java.awt.*;
    import java.awt.event.*;
    import java.util.ArrayList; 
	import org.jsoup.Jsoup;
	import org.jsoup.nodes.Document; 
	import org.jsoup.nodes.Element;
	import org.jsoup.select.Elements;
/* <applet code="MyApplet" width="5000" height="1000"> 
  
  </applet> */
    public class Crawl extends Applet implements ItemListener{
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    Image img;  
	java.awt.List ls;
	Label l1;
     TextField t1;
     Button b1;
     public void init() {
    	 
    	img=getImage(getCodeBase(),"Pictures/Image1.png");
    	ls= new java.awt.List(5,true);
    	l1=new Label("Enter the url");
    	//l2= new Label();
    	t1= new TextField();
    	b1=new Button("Search");
    	setLayout(null);
    	l1.setBounds(30, 50, 100, 20);
    	t1.setBounds(150,50,100,20);
    	b1.setBounds(100,150,80,20);
     	
    	
    	add(ls);
    //	add(l2);
    	add(t1);
    	add(l1);
    	add(b1);
    	
    	b1.addActionListener(new MyHandler());
     }
    

	public static List<String>extractLinks(String url) throws Exception
	 { 
	 final ArrayList<String> result = new ArrayList<String>(); 
	 Document doc = Jsoup.connect(url).get();
	 Elements links = doc.select("a[href]"); 
	 for (Element link : links)
	 { result.add(link.attr("abs:href")); } return result; }
	 // --New --Inner --Class
 public class MyHandler implements ActionListener {
			public void actionPerformed(ActionEvent e) {
		    	try {
		    		if( e.getSource()==b1){
		    			System.out.println("Yep");
		    		}
		    		
					// TODO Auto-generated method stub
					List<String> links;
					String a;
					
					/*g.drawString("Test",25,50);*/
					a=t1.getText();
					String site = a;
					links = Crawl.extractLinks(site);
					//String new_link="Hello";
					int x=0;
					int bla=0;
					Label[] label1 = new Label[ links.size() ];
					for(String link:links) {
						System.out.println(link);
						  // creates the array
						//for( int x = 0; x <= links.size(); x++ ) 
						//{
						    label1[ x ] = new Label();  // creates the current label
						    label1[ x ].setText( link);
						    add(label1[x]);
						    label1[x].setBounds(30, 180+bla, 500, 50);
						    
						    x++;
						    bla+=55;
						//
						/*System.out.println(link);
						Label l2= new Label("");
						add(l2);
						l2.setText(link);
						l2.setBounds(30+bla,180+bla,1000+bla,200+bla);
						bla+=5;*/
				    		  }	
				     
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 	     	   	  
		     }
			

		}

		
	
 public void paint(Graphics g)
 {
	 g.drawString ("SACHIN'S-SEARCH-ENGINE", 25, 45);
	 g.drawImage(img, 0, 0, this);
 }
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
}
	/*public static void main(String[] args) throws Exception {
	  // TODO Auto-generated method stub
	  String site = ""; 
	  List<String> links = Crawl.extractLinks(site);
	  //public void printlinks() {
	  for (String link : links) { System.out.println(link); }

	  
 //}

	 }
*/
