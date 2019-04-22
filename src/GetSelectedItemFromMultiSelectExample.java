import java.applet.Applet;
import java.awt.Graphics;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
 
/*
<applet code="GetSelectedItemFromMultiSelectExample" width=200 height=200>
</applet>
*/
 
public class GetSelectedItemFromMultiSelectExample extends Applet implements ItemListener{
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List list = null;
	
	public void init(){
		
		//create a multi select list
		list = new List(5, true);
		
		//add items to a list	
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		list.add("Six");
		list.add("Seven");
		
		//add list
		add(list);
		
		//add listener
		list.addItemListener(this);
		
	}
	
	public void paint(Graphics g){
		/*
		 * To get selected items from a multi select list, use
		 * String[] getSelectedItems()
		 * method of AWT List class.
		 * 
		 * NOTE : getSelectedItems returns array of zero length if no
		 * items were selected.
		 */
		
		String[] items = list.getSelectedItems();
		String msg = "";
		
		for(int i=0; i < items.length; i++){
			msg = items[i] + " " + msg;
		}
		
		g.drawString("Selected Items: "+ msg, 10, 120);
	}
 
	public void itemStateChanged(ItemEvent ie) {
		repaint();	
	}
 
}