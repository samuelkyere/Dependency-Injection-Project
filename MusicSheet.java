/*
 * Music Sheet Class
 */
package com.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/**
 * @author mac
 *
 */
@Component
@Scope(value="prototype")
public class MusicSheet {
	private String mname;
	private String mkey;
	private double mtimesig;
	private Part par;
	//Autowired
	@Autowired
	public void setPar (Part par){
		this.par=par;
		par.Clef();
	}
	public void Clef() {
		par.Clef();
	}
	
	
	public void show() {
		System.out.println("MusicSheet [mname=" + mname + ", mkey=" + mkey + ", mtimesig=" + mtimesig + "]");
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMkey() {
		return mkey;
	}
	public void setMkey(String mkey) {
		this.mkey = mkey;
	}
	public double getMtimesig() {
		return mtimesig;
	}
	public void setMtimesig(double mtimesig) {
		this.mtimesig = mtimesig;
	}
	
}
