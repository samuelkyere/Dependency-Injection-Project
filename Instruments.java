/**
 * 
 */
package com.injection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @author mac
 *
 */
@Component
public class Instruments {
  private String typeOfInstr;
  private String matOfInstr;
  private double priceOfInstr;
//  private MusicSheet mucsh;
  @Autowired
  public MusicSheet  muscsh; 
public String getTypeOfInstr() {
	return typeOfInstr;
}
public void setTypeOfInstr(String typeOfInstr) {
	this.typeOfInstr = typeOfInstr;
}
public String getMatOfInstr() {
	return matOfInstr;
}
public void setMatOfInstr(String matOfInstr) {
	this.matOfInstr = matOfInstr;
}
public double getPriceOfInstr() {
	return priceOfInstr;
}
public void setPriceOfInstr(double priceOfInstr) {
	this.priceOfInstr = priceOfInstr;
}
    public void qualityOfInstru() {
    	System.out.println("This instrument plays quality music!");
    }
    public void Orchestra() {
    	muscsh.setMkey("B♭");
    	muscsh.setMname("Showers of Blessings");
    	muscsh.setMtimesig(3.4);
    	muscsh.show();
    }
	
	public void show() {
		System.out.println("Instruments [typeOfInstr=" + typeOfInstr + ", matOfInstr=" + matOfInstr + ", priceOfInstr="
				+ priceOfInstr + "]");
	}
    
}
