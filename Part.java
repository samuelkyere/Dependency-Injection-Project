/**
 * 
 */
package com.injection;
import org.springframework.stereotype.Component;
@Component
/**
 * @author mac
 *
 */
public class Part {
	static boolean isBass=true , isTenor=true ;
	private String name;
	private int singers;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSingers() {
		return singers;
	}
	public void setSingers(int singers) {
		this.singers = singers;
	}
	public void Clef() {
	
			if((isBass) || (isTenor)) {
			System.out.println("It is bass clef");	
			}
			else {
				System.out.println("It is treble clef");
			}
			
	}

	public void show() {
		System.out.println("Part [name=" + name + ", singers=" + singers + "]");
	}
}

